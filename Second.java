package day3;

public class Second {

    public static int[] getPositiveNegativeArray(int []ar){
        int pIndex=0;
        int nIndex=1;
        int []newAr=new int[ar.length];

        for(int i=0;i<ar.length;i++){

            if(ar[i]<0){
                newAr[nIndex]=ar[i];
                nIndex=nIndex+2;
            }else {
                newAr[pIndex]=ar[i];
                pIndex=pIndex+2;
            }
        }
        return newAr;
    }

    public static void printArray(int []arr){
        System.out.print("{ ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.print("}");
    }

    public static void main(String[] args) {
        int []ar={3,1,-2,-5,2,-4};
        printArray(getPositiveNegativeArray(ar));
    }
}
