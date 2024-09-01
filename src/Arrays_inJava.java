public class Arrays_inJava {
    public static void main(String[] args) {
        //One Dimension Array
        int num[]={8,9,7,6,8};
        System.out.println("using method 1: " + num[1]);

        int nums[]=new int[6];
        nums[0]=8;
        nums[1]=9;
        nums[2]=78;
        nums[3]=7;
        System.out.print("using method 2:");
        for(int i=0; i<6; i++ ){

            System.out.print(" "+nums[i]);
        }

        //Two Dimensional Array
        System.out.println();
        System.out.println("Using 2D Array");
        int array[][]=new int[3][4];
        for(int n=0; n<3; n++){
            for(int m=0; m<4; m++){
                array[n][m]=(int)(Math.random()*100);/*using(int)() because it
                 Math.random usally returns double value and  the *100 is because
                 it returns range from 0 to less then 1*/
                System.out.print(array[n][m]+" ");
            }
            System.out.println();

            //Jagged array
            System.out.println();
            System.out.println("Jagged array");
            int a[][]=new int[3][];
            a[0]=new int[4];
            a[1]=new int[2];
            a[2]=new int[3];
            for(int o=0; o<a.length;o++){
                for(int p=0; p<a[o].length;p++){
                    a[o][p]=(int)(Math.random()*10);
                    System.out.print(a[o][p]+" ");
                }
                System.out.println();
            }
            //Enhanced for loop
            System.out.println();
            System.out.println("Enhanced for loop ");
            int[] no={2,3,4,5,6};
            for(int h: no){
                System.out.println(h);
            }
        }
    }
}
