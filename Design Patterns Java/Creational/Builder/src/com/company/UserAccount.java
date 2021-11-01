package com.company;

//in this example for e-commerce application , any account have these properties as max properties
//some of them may be null for some accounts
//will make sure whatever happens only this class with only one constructor is used to create this object
//

//the concrete builder
public class UserAccount {
    String firstName;
    String lastName;
    String middleName;
    String title;
    String dateOfBirth;
    String creditCardNumber;
    String address;
    String accessCode;
    String emailAddress;
    String alternativeEmailAddress;
    String phoneNumber;
    boolean weekendDelivery;

    //method will use to return new object of UserBuilder
    //as we know i can say the return type is UserBuilderImp or UserBuilder as both are the same type
    //since UserBuilderImp implements the interface UserBuilder
    //also note that classes normally can call each other as we know due to oop concept
    //static as to call it directly without creating new object of UserAccount as it belongs to the class not the object
    static UserBuilder getTheBuilderObject()
    {
        return new UserBuilderImp();//cannot say return this because this here means return object current object of the class i'm
        //within , the class i'm within is UserAccount which is false , i want UserBuilderImp object not USerAccount object
    }
}
//the builder
//the builder interface have all the methods that describes the class UserAccount properties
//as to be implemented in another class and describe the object behaviour

interface UserBuilder
{

    //the return type of interface because i want to return object of type of on classes that implementing the interface
    //in such case i've only one class that is UserBuilderImp
    //so when calling the UserBuilderImp object to set a method after that it will return the object that was used to set
    //the object so that i will use it set another data again and so on
    //until i can say .build , in such case it will return object of that i was setting it's values which is userAccount
    //so now userAccount object was return after all needed values was set like firstname , last name , and so on



    UserAccount build(); //this return the creation of the product which is the object of type UserAccount to be used
    //the rest each one describe a certain behaviour
    UserBuilder setFirstName(String firstName);
    UserBuilder setLastName(String lastName);
    UserBuilder setMiddleName(String middleName);
    UserBuilder setTitle(String title);
    UserBuilder setDateOfBirth(String dateOfBirth);
    UserBuilder setCreditCardNumber(String creditCardNumber);
    UserBuilder setAddress(String address);
    UserBuilder setAccessCode(String accessCode);
    UserBuilder setEmailAddress(String emailAddress);
    UserBuilder setAlternativeEmailAddress(String alternativeEmailAddress);
    UserBuilder setPhoneNumber(String phoneNumber);
    UserBuilder setWeekendDelivery(Boolean weekendDelivery);
}

//here the userBuilderImp is the concrete builder that will use the abstract methods of the builder to describe the object
//note that if some methods are not called to set certain parameters so the parameters will have the initial value
//that is either null in this case as we are using strings
class UserBuilderImp implements UserBuilder
{
    private UserAccount userAccount;

    //constructor to be called once creating object of class UserBuildImp
    //this constructor once called will create new object of userAccount
    public UserBuilderImp()
    {
        userAccount=new UserAccount();
    }

    @Override
    public UserAccount build() {
        return userAccount;//return the userAccount after setting the needed data to the object userAccount
    }


    //all the methods here is using the object userAccount that is of type class UserAccount nad have all ot's properties
    //so it's one object and each method uses it to set certain data
    //meaning of return type interface is return type of one of classes implementing it
    //all classes (in case of many) must all have the same methods
    //in our example only one implementing it which is userBuilderImp
    //so the return type is userBuilderImp object
    @Override
    public UserBuilder setFirstName(String firstName) {
        userAccount.firstName=firstName;
        //return this means return this object which is userBuilderImp
        //so it return new object of userBuilderImp class
        //this time the userBuilderImp object is userAccount.firstName
        //note that we say return this which means return the current object of interface but interface has no object
        //so it means return current object of class implementing it which is UserBuilderImp
        //return the current(same object)as will use it to call again in main to set another method for the same
        //UserAccount object i created here , because if i say return new instance it will be another object with another
        //data
        //so if we say like we are saying in next step
        System.out.println(this);
        //it means new instance , if we compared it in the main , will find two different object which states false
        return this;
    }

    @Override
    public UserBuilder setLastName(String lastName) {
        userAccount.lastName=lastName;
        //return this means return this object which is userBuilderImp
        //so it return new object of userBuilderImp class
        //this time the userBuilderImp object is userAccount.lastName
        System.out.println(this); //print the the reference of object which is this so means print reference of CURRENT
        //object
        return this;
    }

    @Override
    public UserBuilder setMiddleName(String middleName) {
        userAccount.middleName=middleName;
        //return this means return this object which is userBuilderImp
        //so it return new object of userBuilderImp class
        //this time the userBuilderImp object is userAccount.middleName
        return this;
    }

    @Override
    public UserBuilder setTitle(String title) {
        userAccount.title=title;
        //return this means return this object which is userBuilderImp
        //so it return new object of userBuilderImp class
        //this time the userBuilderImp object is userAccount.title
        return this;
    }

    @Override
    public UserBuilder setDateOfBirth(String dateOfBirth) {
        userAccount.dateOfBirth=dateOfBirth;
        //return this means return this object which is userBuilderImp
        //so it return new object of userBuilderImp class
        //this time the userBuilderImp object is userAccount.dateOfBirth
        return this;
    }

    @Override
    public UserBuilder setCreditCardNumber(String creditCardNumber) {

        userAccount.creditCardNumber=creditCardNumber;
        //return this means return this object which is userBuilderImp
        //so it return new object of userBuilderImp class
        //this time the userBuilderImp object is userAccount.creditCardNumber
        return this;
    }

    @Override
    public UserBuilder setAddress(String address) {

        userAccount.address=address;
        //return this means return this object which is userBuilderImp
        //so it return new object of userBuilderImp class
        //this time the userBuilderImp object is userAccount.address
        return this;
    }

    @Override
    public UserBuilder setAccessCode(String accessCode) {

        userAccount.accessCode=accessCode;
        //return this means return this object which is userBuilderImp
        //so it return new object of userBuilderImp class
        //this time the userBuilderImp object is userAccount.accessCode
        return this;
    }

    @Override
    public UserBuilder setEmailAddress(String emailAddress) {

        userAccount.emailAddress=emailAddress;
        //return this means return this object which is userBuilderImp
        //so it return new object of userBuilderImp class
        //this time the userBuilderImp object is userAccount.emailAddress
        return this;
    }

    @Override
    public UserBuilder setAlternativeEmailAddress(String alternativeEmailAddress) {
        userAccount.alternativeEmailAddress=alternativeEmailAddress;
        //return this means return this object which is userBuilderImp
        //so it return new object of userBuilderImp class
        //this time the userBuilderImp object is userAccount.alternativeEmailAddress
        return this;
    }

    @Override
    public UserBuilder setPhoneNumber(String phoneNumber) {

        userAccount.phoneNumber=phoneNumber;
        //return this means return this object which is userBuilderImp
        //so it return new object of userBuilderImp class
        //this time the userBuilderImp object is userAccount.PhoneNumber
        return this;
    }

    @Override
    public UserBuilder setWeekendDelivery(Boolean weekendDelivery) {

        userAccount.weekendDelivery=weekendDelivery;
        //return this means return this object which is userBuilderImp
        //so it return new object of userBuilderImp class
        //this time the userBuilderImp object is userAccount.weekendDelivery
        return this;
    }
}

// so eventually i'm having class UserAccount to set it's data
//i have interface UserBuilder that contain all abstract methods that will be used to set UserAccount object data
//i've class userBuilderImp that will imp UserBuilder interface to implement all it's methods to set behaviour for the methods
//i have the userBuilderImp that contain constructor that when we create object of UserBuilderImp it will create object
//of UserAccount class so now we have an object for UserAccount
//after that i have methods each one set a certain parameter like name and so on and after setting the parameter
//it will return this which mean it will return the same reference of current object
//but the return type is interface , no it's not , the return type is type of object of one of classes that implementing this
//interface which is UserBuilderImp so the return type is current object of class UserBuilderImp
//the current object which means not new object as after returning the object to the main it will be used again to call
//another method like setLastName , and so on , same object because if different object , it will create new object of UserAccount
//so will initialize new data to another object of UserAccount , so not the data of the same UserAccount
//so the object will be returned until i call the method build by the object also
//after that the method build will return the object of USerAccount itself , not the object of UserBuilderImp
//so now i set the data of userAccount object by object of UserBuilderImp step by step until returning the object of
//UserAccount itself to the main after setting all it's parameters like firstname and so on
//now the object UserAccount is with me to use in the main and i'm sure of all it's parameters
//and i'm using only one constructor
