package MainPackage.JavaBasics.loop;

/*NESTED FOR LOOP
 WHEN WE HAVE A LOT OF ITERATIONS OF SAME CODE THEN WE WILL GO FOR LOOP*/
public class NestedForLoop {
    public static void main(String[] args){
        for (int A=0; A<=3; A++)
            for (int B = 0; B <= 2; B++) {

                System.out.println(A + " " + B);
            }
    }
}

