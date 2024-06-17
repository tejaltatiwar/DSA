// (Array element from 1 to 100)
// Count of distinct element

class CountOfDistinctEle{
    public static void main(String[] args){
        int arr[]={1,2,3,1,2,1,4};
        int disCount=0;
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
                disCount++;
            }
        }System.out.println("Distinct count is "+ disCount);
    }
}