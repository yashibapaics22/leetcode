class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    Arrays.sort(candidates);
    List<List<Integer>> ans= new ArrayList <>();
    findcombinations(0,candidates,target,ans,new ArrayList<>());
    return ans;
    }
    public static void findcombinations(int index,int [] arr,int target,List<List<Integer>> ans,List<Integer> ll){
        //base case
        if (target==0){
            ans.add(new ArrayList<>(ll));
            return;
        }
        for (int i=index;i<arr.length;i++){
            //checking duplicacy
            if (i>index && arr[i]==arr[i-1])
            continue;
            if (arr[i]>target)
            break;
            ll.add(arr[i]);
            findcombinations(i+1,arr,target-arr[i],ans,ll);
            //removing element after an iteration
            ll.remove(ll.size()-1);
        } 
    }
}