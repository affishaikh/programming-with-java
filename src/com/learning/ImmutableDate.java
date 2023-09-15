package com.learning;

import java.util.Date;

public final class ImmutableDate {

    private final Date date;

    public ImmutableDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return new Date(this.date.getDate());
    }
}
