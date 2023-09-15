//package com.learning;
//
//import java.util.Date;
//
//public final class SampleSingleton {
//
//    private static SampleSingleton sampleSingleton;
//    private final ImmutableDate date;
//    private final Integer val;
//
//    private SampleSingleton(ImmutableDate emp, Integer val) {
//        this.date = emp;
//        this.val = val;
//    }
//
//    public static SampleSingleton create(Integer val) {
//        synchronized (sampleSingleton) {
//            if (sampleSingleton == null) {
//                sampleSingleton = new SampleSingleton(new ImmutableDate(), val);
//            }
//        }
//
//        return sampleSingleton;
//    }
//
//    public static void main(String[] args) {
//        SampleSingleton sampleSingleton1 = SampleSingleton.create(12);
//        SampleSingleton sampleSingleton2 = SampleSingleton.create(14);
//
//        sampleSingleton1.date.setDate(new Date());
////        System.out.println(sampleSingleton1 == sampleSingleton2);
//    }
//}
