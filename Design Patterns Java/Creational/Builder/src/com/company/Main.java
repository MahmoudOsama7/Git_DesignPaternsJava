package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //here i'm creating object of userBuilderImp that contain creating new instance of userAccount
        //UserBuilderImp builder=new UserBuilderImp();
        //it's better to say this
        UserBuilder builder=UserAccount.getTheBuilderObject();
        //now i'm creating class of type UserBuilder of type UserAccount.getTheBuilderObject
        // type UserAccount.getTheBuilderObject will return (new UserBuilderImpl) and as we know since it
        //implements the interface UserBuilder so it's type of it so can use it here normally
        //this is more generic than the first one

        builder.setFirstName("Mahmoud").setLastName("Osama");
        //when creating new object of UserBuilderImp i will use it at first time to set first name
        //after doing this , the method in the class will return (this) indicating return the current object of class
        //that is UserBuilderImp class
        //so it will be returned here
        //builder.setFirstName("Mahmoud")(here)
        //it's the same as builder.setFirstName("Mahmoud")(builder)
        //so now i can use it again like this
        //builder.setFirstName("Mahmoud")(builder).(call the next method as setLastName)
        //if we say in the UserBuilderImp return this it means return current same object fo the class implementing the interface
        //but if we say return new instance , it will be new object with new data to set different from the first one
        //so the next step is true in case of return this in methods of class UserBuilderImp as return SAME object
        //and false if we say return new instance
        System.out.println(builder.setFirstName("Mahmoud")==builder.setLastName("Osama"));
        System.out.println();

    }
}
