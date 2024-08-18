package Concepts;

public class ChildClassMethodOverriding extends InheritanceConcept {
    String s="Child";
    //We cannot decrease the scope, i.e., method1 is public in parent as we cannot decrease the scope so pvt, protected etc., are not valid.
        public void method1(){

            System.out.println("This is child method-1, overridden by parent class method");
        }
        public Float method3(int x, float y){
            float result=x-y;
            System.out.println(result);
             return result;
        }
        public void pvtmethod(){
            System.out.println("This method is from child class , not over ridden from parent class as it is private and child class cannot have access");
        }
        //Scope Access: Public>protected>default>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             private
    protected void increaseScope(){
        System.out.println("This method is from child class ,Scope increased from default to protected");
    }

    //methodHiding method in Parent class is Static so child class must be static
    public static void methodHiding(){
        System.out.println("As Compiler is taking care of Method Signature, when uses parent class reference on child object this method is hidden");

    }


    /*       Final Method cannot be overridden in child class
   public final void fnlmethod(){
       System.out.println("This is final method cannot be overridden in the child class");

  }*/
        public static void main(String[] args){
            InheritanceConcept Iobj=new InheritanceConcept();
            ChildClassMethodOverriding Cobj=new ChildClassMethodOverriding();
            Iobj.method1();
            Cobj.method1();
            //Method Overloading, Runtime Polymorphism
            InheritanceConcept obj=new ChildClassMethodOverriding();//Usually this has to call method-1 from the parent class but it is overridden by the child class method-1
            obj.method1();
            Cobj.method3(10,15f);
            Cobj.fnlmethod();//This is method from parent class we cannot have method name with fnlmethod with same argument type.
            Cobj.pvtmethod();
            Cobj.increaseScope();
            obj.methodHiding();// As it is static method, child class method is hidden .

            // Variable Hiding or Shadowing, over riding is applicable for methods but not for the variable. So compiler will call based on the refernce type
            //  Doesnot matter variables are static or not
            System.out.println(Iobj.s);
            System.out.println(Cobj.s);
            System.out.println(obj.s);

        }

    }


