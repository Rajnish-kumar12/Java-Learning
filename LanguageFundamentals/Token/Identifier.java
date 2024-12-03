/*Identifiers is a name assigned to the programming elements like variables, methods, classes, interfaces, packages and so on,
  in order to recognize the elements individually
  for example
  int i=10;
  where int = data-type
      i = Identifier
      = = operator
      10 = literal
      ; = terminator

To use Identifiers in java application we have to use set of rules and regulations.
*/

/*
1) Identifiers must not be started with number, it may start with an alphabet, _, $, but the subsequent symbol may
be a number, an alphabet, _, $.`
*/
public class Identifier
{
      int eno = 11; //valid
      int 9x = 10; //invalid
      int #x = 20; //invalid
      String _ename = "Rajnish"; //valid
      String $esal = "1000"; //valid
      String emp9Id = "ED-1"; //valid
      String emp_Name = "Rajnish"; //valid
      float empSalIn$ = 25000.30f; //valid
}

/*
2) Identifiers are not allowing all the operators and all the special symbols except _ symbol and $ symbol.
 */
class CheckOperator
{
      int eno =10; //valid
      String emp.name = "Rajnish";  //Invalid
      String emp#name = "kumar"; //Invalid
      float emp+sal = 25000.0f; //Invalid
      String #eaddr = "Pat"; //Invalid
      String emp@Hyd = "Rajnish"; //Invalid
      String emp-Addr = "Rajnish"; //Invalid
      String emp_name = "Rajnish"; //Valid
}

/* 
3) All java identifier are not allowing spaces in middle.
*/
class spaces
{
      for name(); //Invalid
      forName(); //Valid
      inputStreamReader(); //Valid
      getInputStream(); //Valid
}

/* 
4) Identifier must not be duplicated in the same scope but may be duplicated in different scopes.
*/
class Scope
{
      int i = 10; //--> class level variable
      long i = 20; //Invalid
      void m1()
      {
            long i= 20; //no error
            float f = 22.22f;
            double f = 33.33; //error
      }
}

/* 
5) In Java applications we are able to use all predefined classes names, interfaces name as identifier.
*/
class Test
{
      public static void main(String[] args)
      {
            int a=10;
            System.out.println(a);
            int Exception = 20;
            System.out.println(Exception);
            //here is the condition if we use Exeception used as variable then Exeception is not used as class in anywhere in the same file.
      }
}

/* 
6) In Java applications it is not possible to use all keywords as identifiers.
*/
class Test
{
      int for = 10; //error
}

/* 
Along with rules and regulations for identifiers, we have to follow the following suggestion to pepare identifiers.

1) In java application, it is suggestable to provide all the identifiers with a particular meaning
*/
String xxx = "abc123"; //not suggestable
String accNo = "abc123"; //suggestable

/*
2) In Java, no length restriction for the identifiers, we can provide identifiers with any length, but, it is suggestable to provide length of the 
identifier upto 10 symbols.
*/
String temporaryemployeeaddress = "Pat"; //not suggestable
String tempAddr = "Pat"; //suggestable

/*
3)  If we have multiple words in single identifiers it is suggestable to seperate multiple words with special notations like _ symbol
*/
String tempEmpAddr = "Pat"; //not suggestable
String temp_emp_addr = "Pat"; //suggestable