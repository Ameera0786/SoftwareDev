package syeda;

public class Fraction {
    private int numerator;
    private int denominator;


    public Fraction(){
        numerator = 0;
        denominator = 1;
    }

    public Fraction(int num){
        numerator = num;
        denominator = 1;
    }
    public Fraction(int num, int den) {
        numerator = num;
        denominator = den;
    }
    public String toString(){
        return numerator + "/" + denominator;
    }

    public Fraction plus(Fraction addend){
        int numerator1 = addend.denominator * this.numerator;
        int numerator2 = this.denominator * addend.numerator;
        int denominator = this.denominator * addend.denominator;
        return new Fraction(numerator1 + numerator2, denominator);
    }
    public Fraction minus(Fraction addend){
        int numerator1 = addend.denominator * this.numerator;
        int numerator2 = this.denominator * addend.numerator;
        int denominator = this.denominator * addend.denominator;
        return new Fraction(numerator1 - numerator2, denominator);
    }
    public boolean equals(Fraction that){
        return numerator == that.numerator && denominator == that.denominator;
    }
    public double getValue(){
        return numerator/denominator;
    }
    public Fraction times(Fraction multiplicand){
        int numerator = this.numerator * multiplicand.numerator;
        int denominator = this.denominator * multiplicand.denominator;
        return new Fraction(numerator, denominator);
    }
    public Fraction dividedBy(Fraction divsor){
        int numerator = this.numerator * divsor.denominator;
        int denominator = this.denominator * divsor.numerator;
        return new Fraction(numerator, denominator);
    }


}
