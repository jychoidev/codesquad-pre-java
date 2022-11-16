package week3_mission1.question2;

public class CoffeeTest {

    public static void main(String[] args) {

        Coffee etiopiaAmericano = new EtiopiaAmericano();
        etiopiaAmericano.brewing(); //EtiopiaAmericano
        System.out.println();

        Coffee kenyaAmericano = new KenyaAmericano();
        kenyaAmericano.brewing(); //KenyaAmericano
        System.out.println();

        Coffee kenyaLatte = new Latte(kenyaAmericano);
        kenyaLatte.brewing(); //KenyaAmericano Adding milk
        System.out.println();

        Coffee brazilMocha = new Mocha(new Latte(new BrazilAmericano()));
        brazilMocha.brewing(); //BrazilAmericano Adding milk Adding Mocha Syrup
        System.out.println();

        Coffee hawaiiWhippedMocha = new WhippedCream(new Mocha(new Latte(new HawaiiAmericano())));
        hawaiiWhippedMocha.brewing(); //HawaiiAmericano Adding milk Adding Mocha Syrup Adding WhippedCream
        System.out.println();

    }
}