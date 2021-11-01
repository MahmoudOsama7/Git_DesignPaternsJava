package com.company;

public class SingleClass {

    //static : as to depends on the class not the object of class
    // as to be used inside the static method public singleClass getInstance as the method is static
    //so all the values inside must be static that is why it's static
    //private as to be not accessed directly , but we return it normally from the method after accessing the method
    //like getter method
    //also to store the value in the memory to be the same value each time and not to be deleted by ending method calling
    //static make sure that method , parameter value is never deleted
    //in threading concept if two threads are using singleton concept , we need to make sure that only one instance created
    //the time for one thread to create new instance and go to memory to update it may cost the other thread read from
    // main memory found that still null so it will enter to create new instance also create
    //so now maybe more than one instance is created
    //to make sure thread safe we can force that once entering class new instance created
    //instead of private static SingleClass singleInstance; will do as follows
    //private static SingleClass singleInstance=new SingleInstance now i'm 100% object already created so when two threads enter
    //they both found already one instance created already and use it
    //however there is between way as to make sure to somehow control this threading concept
    //i can make like this
    //private volatile static SingleClass singleInstance; : volatile means that once value has change it will directly
    //instead that it will first applied to cache then memory , it will be in memory directly as thread use cache first
    //occurs in the main Memory
    //so once 1st thread enter and found value = null , will create new instance , the new instance directly updated in Main Memory
    //so other thread will ready and know that new instance created and will use it because will found that instance is not null
    //static : means value belongs to method , i can access it directly without creating object , also the value never deleted from
    //Memory , also static values is not used in non static methods or places and vice versa
    //but if the two threads entered exactly the same time so two instances also created , so will use the synchronized concept
    //to make sure when one thread enter and finish the second thread can enter
    //before volatile and synchronous the singleInstance is not thread safe as can create many objects
    private static SingleClass singleInstance;
    public int id;

    private SingleClass() {

    }
    //method to either create new instance or use the copy already created
    //the method itself is public and static as to belong to class itself not object of class
    public static SingleClass getInstance()
    {
        //if the singleInstance created of type SingleInstance upward and private and static is = null
        //create new object of singleClass like this  singleInstance= new SingleClass
        //and if not null so return normally the same singleInstance value used
        //the similar as we do in constructor : Class class = new Class()
        //but we create it inside the class itself and return it to the function using it which in this case the function getInstance()
        //the return type is SingleClass which is the type of class so we return new singleClass , similar as if we return int
        //but the return type here is new singleClass as we returning new object of this class

        if(singleInstance==null)
        {
            //to make sure when one thread enter and finish the second thread can enter
            //first will check if null or not and if null the 1st one will enter to use the code
            //and the second one will wait until first one is done then it enters to do the job
            synchronized (SingleClass.class)
            {
                singleInstance = new SingleClass();
            }
        }
        return singleInstance;
    }
    //eventually now only the same object with the same reference and same value and no other new objects are created
}
