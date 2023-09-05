import java.util.Scanner;

public class shapetester {
    

    public static void main(String []args) {
        Scanner sc = new Scanner (System.in);
        int form = 0;
        int calc = 0;
        double dim1 = 0.0;
        double dim2 = 0.0;
        double dim3 = 0.0;
        System.out.println("Which shape would you like to compute?");
        System.out.println("Enter 1 for a Cuboid");
        System.out.println("Enter 2 for a Prism");
        System.out.println("Enter 3 for a Torus");
        form = sc.nextInt();
        
        if(form == 1) {
            Cuboid cuboid = new Cuboid();
            System.out.println("Length: ");
            dim1 = sc.nextDouble();
            System.out.println("Width: ");
            dim2 = sc.nextDouble();
            System.out.println("Height: ");
            dim3 = sc.nextDouble();
            cuboid.setDims(dim1, dim2, dim3);
            System.out.println("Enter 1 to find the Volume");
            System.out.println("Enter 2 to find the SurfaceArea");
            calc = sc.nextInt();
            if (calc == 1) {
                System.out.println("The Volume of your Cuboid is: ");
                System.out.println(cuboid.getVolume());
            } else if (calc == 2) {
                System.out.println("The SurfaceArea of your Cuboid is: ");
                System.out.println(cuboid.getSurfaceArea());
            } else {
                System.out.println("That wasn't a 1 or a 2");
                System.out.println("It's almost trivial to extend from the surface area and volume of a cuboid to their higher-dimensional analogs for a tesseract.");
                System.out.println("Alas, the assignment requires the objects to be 3d.");
                System.out.println("Ah well.");
                System.out.println("Life before death");
            }
        } else if (form == 2) {
            Prism prism = new Prism();
            System.out.println("Length: ");
            dim1 = sc.nextDouble();
            System.out.println("Width: ");
            dim2 = sc.nextDouble();
            System.out.println("Height: ");
            dim2 = sc.nextDouble();
            prism.setDims(dim1, dim2, dim3);
            System.out.println("Enter 1 to find the Volume");
            System.out.println("Enter 2 to find the SurfaceArea");
            calc = sc.nextInt();
            if (calc == 1) {
                System.out.println("The Volume of your Prism is: ");
                System.out.println(prism.getVolume());
            } else if (calc == 2) {
                System.out.println("The SurfaceArea of your Prism is: ");
                System.out.println(prism.getSurfaceArea());
            } else {
                System.out.println("That wasn't a 1 or a 2");
                System.out.println("Sir Isaac Newton made major contributions to the field of optics by playing around with glass prisms.");
                System.out.println("Strength before weakness");
            }
        } else if (form == 3) {
            Torus torus = new Torus();
            System.out.println("MajorRadius: ");
            dim1 = sc.nextDouble();
            System.out.println("MinorRadius: ");
            dim2 = sc.nextDouble();
            torus.setDims(dim1, dim2);
            System.out.println("Enter 1 to find the Volume");
            System.out.println("Enter 2 to find the SurfaceArea");
            calc = sc.nextInt();
            if (calc == 1) {
                System.out.println("The Volume or your Torus is: ");
                System.out.println(torus.getVolume());
            } else if (calc == 2) {
                System.out.println("The SurfaceArea of your Torus is: ");
                System.out.println(torus.getSurfaceArea());
            } else {
                System.out.println("That wasn't a 1 or a 2");
                System.out.println("Our universe may be finite.");
                System.out.println("While the typical example of a 3-d finite unbounded manifold is a 3-sphere (with constant positive curvature throughout), ");
                System.out.println("It turns out that our universe may be finite even if it is flat (uncurved) after all.");
                System.out.println("The simplest example of a finite and unbounded yet flat 3-d surface is ... (drumroll please) ... ");
                System.out.println("A 3-torus!");
                System.out.println("So even if the 3-d space of our universe is flat, it still may be finite if it is shaped like a higher-dimensional version of a torus.");
                System.out.println("And remember: ");
                System.out.println("Journey before destination");
            }
        } else {
            System.out.println("Ooh, you found an easter egg!!");
            System.out.println("Read the books by Brandon Sanderson");
            System.out.println("They're actually so good");
            System.out.println("The series The Stormlight Archive is the best");
            System.out.println("Also, that wasn't a 1 or a 2 or a 3, try again");
        }
    }
}
