package day3;

import java.util.ArrayList;

public class First {

    public static ArrayList<Integer> getTargetSumIndex(int []arr,int target){
        ArrayList<Integer> al=new ArrayList<>();
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++)
                if(arr[i]+arr[j]==target){
                    al.add(i);
                    al.add(j);
                    return al;
                }
        }
        return al;
    }
    public static void main(String[] args) {
        int array[]={2,7,11,15};
        System.out.println(getTargetSumIndex(array,22));
    }
}
