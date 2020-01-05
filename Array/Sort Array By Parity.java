class Solution {
    public int[] sortArrayByParity(int[] A) {
        
        int temp=0,j=0,k=0;
       for(int i=0;i<A.length;i++){
           if(A[k] % 2 == 0){
               temp=A[j];
               A[j]=A[k];
               A[k]=temp;
               j++;
           }k++;
       }
        return A;
    }
}
