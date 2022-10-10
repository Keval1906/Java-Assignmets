//Created by Keval Hadiyal 21ce038
class pr7_class3 {
    int age;
    double netincome;
    int exp;
    String citizenship;
    pr7_class3(int age, double netincome, int exp, String citizenship) {
        this.age = age;
        this.netincome = netincome;
        this.exp = exp;
        this.citizenship = citizenship;
    }public String eligibility() {
        if (age >= 21 && age <= 60 && netincome >= 15000 && exp >=
                1 && citizenship.equals("Indian")) {
            return "Eligible";
        } else {
            return "Not Eligible";
        }
    }
}
