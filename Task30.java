import java.util.InputMismatchException;
import java.util.Scanner;

class Task30 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
    System.out.println("Calculator:\n");
    Task30_Impl t30 = new Task30_Impl();
    t30.mainMenu();
        
    }
    
}


class Task30_Impl{
    float a; float b;




    Scanner s = new Scanner(System.in);



    void mainMenu(){
        int m =0;

        try{
            do{
        System.out.println("Enter the operation you wish to perform : ");
        System.out.println("1. Mathematical Calculation\n2. Scientific Calculation\n3. Exit\n");
        m = s.nextInt();
        switch (m) {
            case 1: mathCalc();
                break;

            case 2: scienCalc();
                break;
            case 3: System.exit(0);
        
            default: System.out.println("Invalid");
                break;
        }}while(m!=3);

        }catch (InputMismatchException im){
            System.out.println("Enter valid input");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            mainMenu();
        }
    }

    private void scienCalc() {
        int sc =0;

        try{
            do{
        System.out.println("Select a scientific operation : \n1. Ceil \n2. Floor \n3. Square Root \n4. Power Of \n5. Back to Main Menu");
        sc = s.nextInt();

        switch(sc){
            case 1: ceil();
            break;
            case 2: floor();
            break;
            case 3: sroot();
            break;
            case 4: powerof();
            break;
            case 5: mainMenu();
            break;

            default: System.out.println("Invalid");
            break;
        }
        }while(sc!=5);
        }catch(InputMismatchException im ){
            System.out.println("enter valid input");
            scienCalc();
        }

    }

    private void powerof() {int x=0;
        do{
        try{
            System.out.println("Enter number to do power of");
            float a = s.nextFloat();
            float res = (float) Math.exp(a);
    
            System.out.println("power value is "+res);x=1;
            }catch(InputMismatchException im){
                System.out.println("Enter valid input");
                // powerof();
            }catch(Exception e){
                System.out.println(e.getMessage());
                // powerof();
            }
        }while(x==0);
    }

    private void sroot() {int x=0;
        do{
        try{
            System.out.println("Enter number to sqaure root");
            float c = s.nextFloat();
            float res = (float) Math.sqrt(c);
    
            System.out.println("sqaure root value is "+res);
            x=1;
            }catch(InputMismatchException im){
                System.out.println("Enter valid input");
                // sroot();
            }catch(Exception e){
                System.out.println(e.getMessage());
                // sroot();
            }
        }while(x==0);
    }

    private void floor() {int x=0;
        do{
        try{
            System.out.println("Enter number to floor");
            float c = s.nextFloat();
            float res = (float) Math.floor(c);
    
            System.out.println("floor value is "+res);x=1;
            }catch(InputMismatchException im){
                System.out.println("Enter valid input");
                // floor();
            }catch(Exception e){
                System.out.println(e.getMessage());
                // floor();
            }
        }while(x==0);
    }

    private void ceil() {int x=0;
        do{

        try{
        System.out.println("Enter number to ceil");
        float c = s.nextFloat();
        float res = (float) Math.ceil(c);

        System.out.println("ceil value is "+res);x=1;
        }catch(InputMismatchException im){
            System.out.println("Enter valid input");
            // ceil();
        }catch(Exception e){
            System.out.println(e.getMessage());
            // ceil();
        }
    }while(x==0);




    }

    private void mathCalc() {
        int math =0;
        try{
        do{
        System.out.println("Select an arithmetic operation : \n1. Add \n2. Subtract \n3. Multiply \n4. Divide \n5. Modulo \n6. Back to Main Menu\n");
        math = s.nextInt();

        switch (math) {
            case 1: addition();    
            break;
            case 2: subtract();
            break;
            case 3: multiply();
            break;
            case 4: divide();
            break;
            case 5: modulo();
            break;
            case 6: mainMenu();
            break;
        
            default: System.out.println("Invalid");
                break;
        }
    }while(math!=6);

    }catch(InputMismatchException im){
        System.out.println("Enter valid input");
        mathCalc();
    }
    catch(Exception e){
        System.out.println(e.getMessage());
        mathCalc();
    }

    }

    private void modulo() {int x=0;
        do{
        try{
            System.out.println("Enter numbers a and b to modulo");
            int a = s.nextInt();
            int b = s.nextInt();
    
            System.out.println("sum of "+a+" and "+b+" is "+(a%b));x=1;
            }catch(InputMismatchException im ){
                s.nextLine();
                System.out.println("Enter valid numbers");
                // modulo();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                // modulo();
            }
        }while(x==0)
;    }

    private void divide() {int x=0;
        do{
        try{
            System.out.println("Enter numbers a and b to divide");
            int a = s.nextInt();
            int b = s.nextInt();
    
            System.out.println("sum of "+a+" and "+b+" is "+(float)(a/b));x=1;
            }catch(InputMismatchException im ){
                s.nextLine();
                System.out.println("Enter valid numbers");
                // divide();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                // divide();
            }
        }while(x==0);
    }

    private void multiply() {int x=0;
        do{
        try{
            System.out.println("Enter numbers a and b to multiply");
            int a = s.nextInt();
            int b = s.nextInt();
    
            System.out.println("sum of "+a+" and "+b+" is "+(a*b));x=1;
            }catch(InputMismatchException im ){
                s.nextLine();
                System.out.println("Enter valid numbers");
                // multiply();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                // multiply();
            }
        }while(x==0);
    }

    private void subtract() {int x=0;
        do{
        try{
            System.out.println("\nEnter numbers a and b to subtract");
            int a = s.nextInt();
            int b = s.nextInt();
    
            System.out.println("sum of "+a+" and "+b+" is "+(a-b));x=1;
            }catch(InputMismatchException im ){
                s.nextLine();
                System.out.println("Enter valid numbers");
                // subtract();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                // subtract();
            }
        }while(x==0);
    }

    private void addition() {int x=0; 
        do{
        try{
            
        System.out.println("Enter numbers a and b to add");
        setA(s.nextFloat());
        setB(s.nextFloat());
        // a = s.nextFloat();
        // b= s.nextFloat();
        System.out.println("sum of "+a+" and "+b+" is "+(a+b));
        x=1;
        }catch(InputMismatchException im ){
            s.nextLine();

            System.out.println("Enter valid numbers");
            // addition();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            // addition();
        }
    }while(x==0);
    

    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }



    

}