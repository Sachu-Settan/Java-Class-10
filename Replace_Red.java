// Consider the sentence as given below:
// Blue bottle is in Blue bag lying on Blue carpet
// Write a program to assign the given sentence to a string variable. Replace the word Blue with Red at all its occurrence. Display the new string as shown below:
// Red bottle is in Red bag lying on Red carpet

public class Replace_Red
{
    public static void main(String args[]) {
        String str = "Blue bottle is in Blue bag lying on Blue carpet";
        str += " ";
        String newStr = "";
        String word = "";
        String target = "Blue";
        String newWord = "Red";
        int len = str.length();
        
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                if (target.equals(word)) {
                    newStr = newStr + newWord + " ";
                }
                else {
                    newStr = newStr + word + " ";
                }
                word = "";
            }
            else {
                word += ch;
            }
            
        }
        
        System.out.println(newStr);
    }
}