public class SelectionSort{
    public static void main(String[]args) {
        int []a={4,9,-1,0,4};
        int n=a.length;
        for(int i=0;i<=n-1;i++){
            int minElement=i;
            for(int j=i;j<n;j++){
                if(a[j]<a[minElement]){
                    minElement=j;
                }


            }
            int temp=a[j];
            a[j]=a[minElement];
            a[minElement]=temp;
        }
        for(int element:a){
            System.out.print(a+" ");
        }
        
    }
}