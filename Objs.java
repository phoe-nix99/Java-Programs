import java.util.*;

class Emp{

        private int eid;
        private String ename;
        private String dept;
        private int salary;

     Emp(int ac, String str, String de, int sal){
        
        eid = ac;
        ename = str;
        dept = de;
        salary = sal;
        System.out.println("\nAccount Initialized ");

    }

    void show_data(){

        System.out.println("\nEmployee_ID: "+eid);
        System.out.println("\nEmployee_Name: "+ename);
        System.out.println("\nDepartment: " +dept);
        System.out.println("\nSalary: "+salary);

    }


    int get_id(){

        return eid;
    }

}





public class Objs {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        Emp obj[] = new Emp[10]; // array of objects declaration
        int i = 0;
    while(true){

        System.out.println("\n1. Create Account\n2. Show Detalis\n3. Search Employee\n4. Exit");
        System.out.println("\nEnter your choice: ");
        int z = sc.nextInt();
        switch(z){

            case 1:
            if(i<10){

                System.out.println("Enter Employee_ID: ");
                int a = sc.nextInt();
                sc.nextLine();
                System.out.println("\nEnter Employee_Name: ");
                String h = sc.nextLine();
                System.out.println("\nEnter Department: ");
                String k = sc.nextLine();
                System.out.println("\nEnter Salary: ");
                int l = sc.nextInt();
                Emp ob = new Emp(a, h, k, l); // constructor initialization
                obj[i++] = ob; // ob object pushed to the index denoted by i
            } 
            else{
                System.out.println("Account cannot be created!");
            }
            break;

            case 2:
            System.out.println("Enter the employee id: ");
            int o = sc.nextInt();
            int f=0;
            for (int j=0;j<i;j++){

                if(obj[j].get_id()==o){

                    f=1;
                    obj[j].show_data();
                    break;

                }
            }
            if (f==0){
                System.out.println("Account Not Found!");
            }
            break;

            case 3:

            System.out.println("Enter the ID to search: ");
            int op = sc.nextInt();
            f=0;
            for (int j=0;j<i;j++){

                if(obj[j].get_id()==op){

                    f=1;
                    System.out.println("Account " +op+ " Found!");
                    obj[j].show_data();
                    break;

                }
            }
            if(f==0){
                System.out.println("Account Not Found!");
            }
            break;

            case 4:
            System.exit(0);

            default:
            System.out.println("Enter a valid choice");
        }

    }

    }   
}
