
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        return new Money(this.euros + addition.euros, this.cents + addition.cents);
    }
    
    public boolean lessThan(Money compared)  {
        if (this.euros < compared.euros) {
            return true;
        } else if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        } else {
            return false;
        }
    }
    
    public Money minus(Money decreaser) {
        if (this.lessThan(decreaser)) {
            return new Money(0, 0);
        } else {
            int totalPreviousCents = (100 * this.euros) + this.cents;
            int totalDecreaserCents = (100 * decreaser.euros) + decreaser.cents;
            int newTotalInCents = totalPreviousCents - totalDecreaserCents;
            return new Money(newTotalInCents / 100, newTotalInCents % 100);
        }
    }
    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
