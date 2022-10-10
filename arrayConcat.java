public class arrayConcat{
  public static int[] returnCopy(int[]ary){
    int[] ans = new int[ary.length];
    for(int i = 0; i < ary.length; i++){
      ans[i] = ary[i];
    }
    return ans;
  }
  public static void main(String[] args){
    int[] ary= {1,2,3};
    int[] ans= returnCopy(ary);
    System.out.println(ary!=ans);
    for (int i= 0; i < ary.length; i++){
      System.out.println(ary[i]==ans[i]);
    }
  }
}
