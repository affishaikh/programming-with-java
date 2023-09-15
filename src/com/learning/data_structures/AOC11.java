package com.learning.data_structures;

interface Operation {
    Integer perform(Integer old);
}

interface Test {
    boolean test(Integer worryLevel);
}

class Monkey {
    private final Queue2 worryLevels = new Queue2();
    private final Operation operation;
    private Integer itemsProcessed = 0;
    private final Test test;
    private Monkey testPassMonkey;
    private Monkey testFailedMonkey;

    public Monkey(Integer[] worryLevels, Operation op, Test test) {
        for (Integer worryLevel : worryLevels) {
            this.worryLevels.add(worryLevel);
        }
        this.operation = op;
        this.test = test;
    }

    public Monkey setTestPassMonkey(Monkey testPassMonkey) {
        this.testPassMonkey = testPassMonkey;
        return this;
    }

    public Monkey setTestFailedMonkey(Monkey testFailedMonkey) {
        this.testFailedMonkey = testFailedMonkey;
        return this;
    }

    public Monkey addItem(Integer item) {
        this.worryLevels.add(item);
        return this;
    }

    public void start() {
        Integer worryLevel = worryLevels.remove();
        while (worryLevel != null) {
            Integer newWorryLevel = this.operation.perform(worryLevel);
            if (test.test(newWorryLevel)) {
                this.testPassMonkey.addItem(newWorryLevel);
            } else {
                this.testFailedMonkey.addItem(newWorryLevel);
            }
            worryLevel = worryLevels.remove();
            this.itemsProcessed++;
        }
    }

    public Integer getItemsProcessed() {
        return this.itemsProcessed;
    }
}

public class AOC11 {

    public static void main(String[] args) {
        Monkey monkey0 = new Monkey(
                new Integer[]{79, 98},
                (Integer worryLevel) -> worryLevel * 19,
                (Integer worryLevel) -> (worryLevel % 23) == 0
        );

        Monkey monkey1 = new Monkey(
                new Integer[]{54, 65, 75, 74},
                (Integer worryLevel) -> worryLevel + 6,
                (Integer worryLevel) -> (worryLevel % 19) == 0
        );

        Monkey monkey2 = new Monkey(
                new Integer[]{79, 60, 97},
                (Integer worryLevel) -> worryLevel * worryLevel,
                (Integer worryLevel) -> (worryLevel % 13) == 0
        );

        Monkey monkey3 = new Monkey(
                new Integer[]{74},
                (Integer worryLevel) -> worryLevel + 3,
                (Integer worryLevel) -> (worryLevel % 17) == 0
        );

        monkey0.setTestPassMonkey(monkey2).setTestFailedMonkey(monkey3);
        monkey1.setTestPassMonkey(monkey2).setTestFailedMonkey(monkey0);
        monkey2.setTestPassMonkey(monkey1).setTestFailedMonkey(monkey3);
        monkey3.setTestPassMonkey(monkey0).setTestFailedMonkey(monkey1);

        Monkey[] allMonkeys = new Monkey[]{monkey0, monkey1, monkey2, monkey3};

        for (int i = 1; i <= 20; i++) {
            for (Monkey monkey : allMonkeys) {
                monkey.start();
            }
        }

        for (Monkey monkey : allMonkeys) {
            System.out.println(monkey.getItemsProcessed());
        }
    }
}
