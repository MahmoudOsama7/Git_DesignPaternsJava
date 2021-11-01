package com.company;

//the main class here is acting like PizzaCompany HeadQuarter that has reference two the companies
//PizzaPrimos and PizzaSeaRanch
public class Main {

    public static void main(String[] args) {

        //interface IPizza is implemented by the two classes PaPaJones and Primos
        //so we can create interface of type any one of them
        //the object of PizzaPaPaJones will include parameter which pizza the customer is asking about
//
//        IPizzaFactory iPizzaFactory=new PizzaPaPaJones(new PizzaSeaRanch());
//        iPizzaFactory.getPizza();
//        System.out.println(iPizzaFactory);//here the object is object of PizzaFactory that is in this case PizzaPaPaJones
//        System.out.println(iPizzaFactory.getPizza());//here the object is object of PizzaFactory.getPizza return in this case object
//        //of class PizzaSeaRanch
//        System.out.println(iPizzaFactory.getPizza().preparePizza());
//        //here the object is object of PizzaFactory.getPizza return in this case object
//        //of class PizzaSeaRanch also because the method preparePizza return object so the same object of PizzaSeaRanch
//        //that is why i can say this
//        iPizzaFactory.getPizza().preparePizza().preparePizza().preparePizza().preparePizza().preparePizza();
//        //because in each implementation i'm returning an object
//        //however if i'm returning in the method preparePizza () new instance so it will be new instance each time
//        //but if i'm returning this in the method , it will be indicating current object so same object
//        IPizzaFactory iPizzaFactory1=new PizzaPaPaJones(new PizzaChicken());
//        iPizzaFactory1.getPizza(); however this method ie better to be called from outside
//        to leave everything for the main to just create new object and don't care to call certain method

        //next version is the best code , i'm just creating object here and passing the pizza i need
        //anything else i don't care to call, it will happen inside

        //_____________________________PizzaSeaRanch_______________________________________________
        System.out.println("________________________________________________________");
        IPizzaFactory iPizzaFactory3=new PizzaPrimos(new PizzaSeaRanch());
        System.out.println(iPizzaFactory3);
        //iPizzaFactory3.getPizza();
        System.out.println("________________________________________________________");
        IPizzaFactory iPizzaFactory2=new PizzaHamza(new PizzaSeaRanch());
        //iPizzaFactory2.getPizza();
        System.out.println(iPizzaFactory2);
        System.out.println("________________________________________________________");
        IPizzaFactory iPizzaFactory=new PizzaPaPaJones(new PizzaSeaRanch());
        //iPizzaFactory.getPizza();
        System.out.println(iPizzaFactory);
        //______________________________________________________________________________________________________________
        //_____________________________PizzaChicken_______________________________________________

        System.out.println("________________________________________________________");
        IPizzaFactory iPizzaFactory4=new PizzaPrimos(new PizzaChicken());
        System.out.println(iPizzaFactory4);
        //iPizzaFactory3.getPizza();
        System.out.println("________________________________________________________");
        IPizzaFactory iPizzaFactory5=new PizzaHamza(new PizzaChicken());
        //iPizzaFactory2.getPizza();
        System.out.println(iPizzaFactory5);
        System.out.println("________________________________________________________");
        IPizzaFactory iPizzaFactor6=new PizzaPaPaJones(new PizzaChicken());
        //iPizzaFactory.getPizza();
        System.out.println(iPizzaFactor6);
    }
}
