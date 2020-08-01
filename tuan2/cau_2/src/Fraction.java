public class Fraction {
    private int numerator;
    private int denominator;

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    public void setDenominator(int denominator){
        this.denominator = denominator;
    }

    public int getNumerator(){
        return numerator;
    }
    public int getDenominator() {
        return denominator;
    }

    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }
    // phương thức tối giản phân số
    public void Reduce(){
        int i = TimUCLN.timUCLN(numerator, denominator);
        this.setNumerator(this.getNumerator() / i);
        this.setDenominator(this.getDenominator() /i);
    }

    // cộng phân số
    public void add(Fraction ft){
        int ts = this.getNumerator()*ft.getDenominator() + ft.getNumerator()*this.getDenominator();
        int ms = this.getDenominator()*ft.getDenominator();
        Fraction pst = new Fraction(ts, ms);
        pst.Reduce();
        System.out.println(pst.numerator + "/" + pst.denominator);
    }

    //trừ phân số
    public void subtract(Fraction ft){
        int ts = this.getNumerator()*ft.getDenominator() - ft.getNumerator()*this.getDenominator();
        int ms = this.getDenominator()*ft.getDenominator();
        Fraction sbt = new Fraction(ts, ms);
        sbt.Reduce();
        System.out.println(sbt.numerator + "/" + sbt.denominator);
    }

    // nhân phân số
    public void multiply(Fraction ft){
        int ts = this.getNumerator()*ft.getNumerator();
        int ms = this.getDenominator()*ft.getDenominator();
        Fraction mtp = new Fraction(ts, ms);
        mtp.Reduce();
        System.out.println(mtp.numerator + "/" + mtp.denominator);
    }

    // chia phân số
    public void divide(Fraction ft){
        int ts = this.getNumerator()*ft.getDenominator();
        int ms = this.getDenominator()*ft.getNumerator();
        Fraction dvd = new Fraction(ts, ms);
        dvd.Reduce();
        System.out.println(dvd.numerator + "/" + dvd.denominator);
    }

    // phương thức so sánh 2 phân số
    public boolean equals(Fraction ft){
        if (this.getNumerator()*ft.getDenominator() > ft.getNumerator()*this.getDenominator()){
            return true;
        } else {
            return false;
        }
    }
}
