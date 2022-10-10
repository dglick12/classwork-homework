public class arrayConcat{
  public static int[] returnCopy(int[]ary){
    int[] ans = new int[ary.length];
    for(int i = 0; i < ary.length; i++){
      ans[i] = ary[i];
    }
    return ans;
  }
}
