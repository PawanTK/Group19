import java.util.Scanner;

public class Carparking {
    public static void main(String argu[])
    {
        Scanner sc=new Scanner(System.in);
        Parking pa=new Parking();
        int choice;
        int car=0,bike=0,van=0,other=0;
        while (true)
        {
            System.out.println("Press 1 to enter car");
            System.out.println("Press 2 to enter bike");
            System.out.println("Press 3 to enter Van");
            System.out.println("Press 4 to enter other");
            System.out.println("Press 5 to view data");
            System.out.println("Press 6 to delete data");
            System.out.println("Press 7 to exit");
            choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                    car++;
                    pa.setCar(car);
                    System.out.println(car+" cars is added");
                    break;
                case 2:
                    bike++;
                    pa.setBike(bike);
                    System.out.println(bike+" bikes is added");
                    break;
                case 3:
                    van++;
                    pa.setvan(van);
                    System.out.println(van+" van is added");
                    break;
                case 4:
                    other++;
                    pa.setother(other);
                    System.out.println(other+" other is added");
                    break;
                case 5:
                    System.out.println("Cars: "+pa.getCar());
                    System.out.println("Bikes: "+pa.getBike());
                    System.out.println("van: "+pa.getvan());
                    System.out.println("other: "+pa.getother());
                    break;
                case 6:
                    pa.delete();
                    System.out.println("All record is deleted");
                    break;
                case 7:
                    System.exit(0);
                    break;

            }

        }
    }
}


