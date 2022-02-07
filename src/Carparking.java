import java.util.Scanner;

public class Carparking {
    public static void main(String argu[])
    {
        Scanner scobj =new Scanner(System.in);
        Parking paobj =new Parking();
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
            choice=scobj.nextInt();
            switch (choice)
            {
                case 1:
                    car++;
                    paobj.setCar(car);
                    System.out.println(car+" cars is added");
                    break;
                case 2:
                    bike++;
                    paobj.setBike(bike);
                    System.out.println(bike+" bikes is added");
                    break;
                case 3:
                    van++;
                    paobj.setvan(van);
                    System.out.println(van+" van is added");
                    break;
                case 4:
                    other++;
                    paobj.setother(other);
                    System.out.println(other+" other is added");
                    break;
                case 5:
                    System.out.println("Cars: "+paobj.getCar());
                    System.out.println("Bikes: "+paobj.getBike());
                    System.out.println("van: "+paobj.getvan());
                    System.out.println("other: "+paobj.getother());
                    break;
                case 6:
                    paobj.delete();
                    System.out.println("All record is deleted");
                    break;
                case 7:
                    System.exit(0);
                    break;

            }

        }
    }
}


