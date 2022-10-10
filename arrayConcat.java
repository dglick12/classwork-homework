public class arrayConcat{
  public static int[] returnCopy(int[]ary){
    int[] ans = new int[ary.length];
    for(int i = 0; i < ary.length; i++){
      ans[i] = ary[i];
    }
    return ans;
  }
  public static int[] concatArray(int[]ary1,int[]ary2){
    int[] ans = new int[ary1.length+ary2.length];
    for(int i = 0; i < ary1.length;i++){
      ans[i]=ary1[i];
    }
    for(int i = ary1.length; i < ary1.length+ary2.length;i++){
      ans[i]= ary2[i-ary1.length];
    }
    return ans;
  }
}
