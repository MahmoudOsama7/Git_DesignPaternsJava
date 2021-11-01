package com.company;

public class PizzaPrimos {
    private IPizza iPizza;

    public PizzaPrimos(IPizza iPizza) {
        this.iPizza = iPizza;
        System.out.println(iPizza.x);
        System.out.println("This Is Primos Pizza");
        iPizza.getPizza();
    }

}
