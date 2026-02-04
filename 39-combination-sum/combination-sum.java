class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        t(0,target,candidates,ds,ans);
        return ans;
    }

  void t(int index, int target, int[] candidates,List<Integer> ds, List<List<Integer>> ans){
    if(target == 0){
        ans.add(new ArrayList<>(ds));
        return;
    }
    if(index==candidates.length||target<0){ return;}
    ds.add(candidates[index]);
    t(index,target-candidates[index],candidates,ds,ans);
    ds.remove(ds.size()-1);
    t(index+1,target,candidates,ds,ans);
    }
}