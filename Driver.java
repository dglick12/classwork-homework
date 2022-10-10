public class Driver{
  public static void main(String[] args){
    int[] ary= {1,2,3};
    int[] ans= arrayConcat.returnCopy(ary);
    System.out.println(ary!=ans);
    for (int i= 0; i < ary.length; i++){
      System.out.println(ary[i]==ans[i]);
    }
    System.out.println("concatArray");
    int[] ary1 = {1,2,3};
    int[] ary2 = {4,5,6};
    int[] shouldAns = {1,2,3,4,5,6};
    int[] ans1 = arrayConcat.concatArray(ary1,ary2);
    System.out.println(shouldAns!= ans1);
    for (int i= 0; i < ary.length; i++){
      System.out.println(shouldAns[i]==ans1[i]);
    }
  }
}
