import java.util.Scanner;
public class CaesarCipher
{
    //Cipher(n) = Decipher(26-4)
    public static StringBuffer encrypt(String text, int s)
    {
        StringBuffer result = new StringBuffer();
        for(int i=0; i<text.length(); i++)
        {
            if(Character.isUpperCase(text.charAt(i)))
            {
                char ch = (char)(((int)text.charAt(i) + s - 65)% 26 + 65);
                result.append(ch);
            }
            else
            {
                char ch = (char)(((int)text.charAt(i) + s-97)%26 +97);
                result.append(ch);
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter text:");
        String text = scan.nextLine();
        System.out.print("Enter shift:");
        int shift = scan.nextInt();
        System.out.println("Cipher:" + encrypt(text,shift));
    }
}
