public class Driver{
  public static void main(String[] args){
    int[] ary= {1,2,3};
    int[] ans= arrayConcat.returnCopy(ary);
    System.out.println(ary!=ans);
    for (int i= 0; i < ary.length; i++){
      System.out.println(ary[i]==ans[i]);
    }
  }
}
