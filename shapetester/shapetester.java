import java.util.Scanner;

public class shapetester {
    

    public static void main(String []args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Which shape would you like to compute?");
        System.out.println("Enter 1 for a Cuboid");
        System.out.println("Enter 2 for a Prism");
        System.out.println("Enter 3 for a Torus");
        int form = sc.nextInt();
        Cuboid SANDERSON = new Cuboid();
        if(form == 1) {
            System.out.println("Length: ");
            double dim1 = sc.nextDouble();
            System.out.println("Width: ");
            double dim2 = sc.nextDouble();
            System.out.println("Height: ");
            double dim3 = sc.nextDouble();
            SANDERSON.setDims(dim1, dim2, dim3);
            System.out.println("Enter 1 to find the Volume");
            System.out.println("Enter 2 to find the SurfaceArea");
            int calc = sc.nextInt();
            if (calc == 1) {
                
                System.out.println("The Volume of your Cuboid is: ");
                System.out.println(SANDERSON.getVolume());
            }
        }
    }

    
}