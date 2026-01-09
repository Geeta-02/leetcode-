class Solution {
    public String reverseOnlyLetters(String s) {
       char[] arr=s.toCharArray();
        int i=0,j=arr.length-1;
        while(i<j){
            if(!Character.isLetter(arr[i])){
                i++;
            }else if(!Character.isLetter(arr[j])){
                j--;
            }else{
                char ch=arr[i];
                arr[i]=arr[j];
                arr[j]=ch;
                i++;
                j--;
            }
        }
        return new String(arr); 
    }
}