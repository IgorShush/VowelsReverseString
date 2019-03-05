public class Main {
    public static void main(String[] args) {
    
        String str = "palindrome";
        String vowels = "aeioyu";
        String strArray[] = str.split("");
        String c;
        int i = 0;
        int j = strArray.length - 1;

        while (i < str.length() && i != j){
            if (vowels.contains(strArray[i])){
                while (j > 0 && j != i){
                    if (vowels.contains(strArray[j])){
                        c = strArray[i];
                        strArray[i] = strArray[j];
                        strArray[j] = c;
                        j--;
                        break;
                    }
                    j--;
                }
            }
            i++;
        }

        for (int x = 0; x < strArray.length; x++)
            System.out.print(strArray[x]);
    }
}
