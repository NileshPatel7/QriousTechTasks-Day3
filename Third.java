package day3;

public class Third {
    public static boolean ifAllPositive(int []arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]<1)
                return false;
        }
        return true;
    }
    public static boolean jumpGame(int []arr){
        int jumpIndex=1;
        if(arr[0]==0)
            return false;
        else if(ifAllPositive(arr))
            return true;
       else
           for(int i=arr.length-1;i>=0;i--){
               if(arr[i]==0){
                   int j=0;
                   for(j=i-1;j>=0;j--){
                       if(arr[j]+j>=i+1){
                           break;
                       }
                   }
                   if(j==-1)
                       return false;
               }
           }

        return true;
    }
    public static void main(String[] args) {
        int []arr={3,1,0,2,0,4};
        System.out.println(jumpGame(arr));
    }
}
