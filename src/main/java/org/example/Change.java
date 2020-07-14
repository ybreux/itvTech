package org.example;

public class Change {

    private long bill10;
    private long bill5;
    private long coin2;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Change change = (Change) o;

        return new org.apache.commons.lang3.builder.EqualsBuilder()
                .append(bill10, change.bill10)
                .append(bill5, change.bill5)
                .append(coin2, change.coin2)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new org.apache.commons.lang3.builder.HashCodeBuilder(17, 37)
                .append(bill10)
                .append(bill5)
                .append(coin2)
                .toHashCode();
    }

    public long getBill10() {
        return bill10;
    }

    public void setBill10(long bill10) {
        this.bill10 = bill10;
    }

    public long getBill5() {
        return bill5;
    }

    public void setBill5(long bill5) {
        this.bill5 = bill5;
    }

    public long getCoin2() {
        return coin2;
    }

    public void setCoin2(long coin2) {
        this.coin2 = coin2;
    }
}
