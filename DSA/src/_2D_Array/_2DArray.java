package _2D_Array;

public class _2DArray {
    static void main() {
        int[][] arr;
        arr=new int[3][4];

        int[][] brr={
                {1,2},
                {2,3,4},
                {3,4,5,6,7},
                {4, 5}
        };

//        System.out.println(brr[3][1]);
        int rowLength=brr.length;
//        int colLength=brr[0].length; // ise length coloum ke row sabi same hone chahiye

        for (int rowIndex=0; rowIndex<=rowLength-1; rowIndex++){
            //jaise me kisi new row pe aaya
            //same point pe maine uss row ki length find karni he
            //current row -> brr[rowIndex].length
            int colLength=brr[rowIndex].length;
            for (int colIndex=0; colIndex<=colLength-1; colIndex++){
                System.out.print(brr[rowIndex][colIndex]+" ");

            }
            System.out.println();
        }


    }
}
