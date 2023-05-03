import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Dictonary
{
    public static void main(String[] args)
    {
        Scanner inputStream = null;
        PrintWriter outputStream = null;
        int numWords = 0;
        String wordRead = "";
        String[] wordLibrary;
        String startWord, endWord;
        Scanner keyboard = new Scanner(System.in);
        int i;


        try {
            outputStream = new PrintWriter(new FileOutputStream("FourLetterWords.txt"));
        }

        catch(FileNotFoundException e) {
            System.out.println("File not found, program will close.");
            System.exit(0);
        }



        try {
            inputStream = new Scanner(new FileReader("words.txt"));

        }

        catch(FileNotFoundException e) {
            System.out.println("File not found, program will close.");
            System.exit(0);
        }

        while(inputStream.hasNextLine())
        {
            wordRead = inputStream.nextLine();
            if(wordRead.length() == 4)
            {
                wordRead = wordRead.toLowerCase();
                outputStream.println(wordRead);
            }
        }

        inputStream.close();
        outputStream.close();


        try {
            inputStream = new Scanner(new FileReader("FourLetterWords.txt"));

        }

        catch(FileNotFoundException e) {
            System.out.println("File not found, program will close.");
            System.exit(0);
        }

        while(inputStream.hasNextLine())
        {
            inputStream.nextLine();
            ++numWords;
        }

        inputStream.close();


        wordLibrary = new String[numWords];


        try {
            inputStream = new Scanner(new FileReader("FourLetterWords.txt"));

        }

        catch(FileNotFoundException e)
        {
            System.out.println("File not found, program will close.");
            System.exit(0);
        }

        i = 0;
        while(inputStream.hasNextLine())
        {
            wordLibrary[i] = inputStream.nextLine();
            ++i;
        }

        inputStream.close();


// where the user inputs the start and end
        do
        {
            System.out.println("Enter your four letter starting word: ");
            startWord = keyboard.nextLine();
        }while(startWord.length() != 4);   // * note to self this was a huge problem my brain couldnt figure out
        startWord = startWord.toLowerCase();

        do
        {
            System.out.println("Enter your four letter end word: ");
            endWord = keyboard.nextLine();
        }while(endWord.length() != 4);
        endWord = endWord.toLowerCase();

        findTheWord(startWord, endWord, wordLibrary);

    }

    public static boolean findTheWord(String startWordPassed, String endWordPassed, String[] libraryPassed)
    {
        String currentWord = "";

        if(endWordPassed.equals(startWordPassed))
        {
            System.out.println("Word found: " + endWordPassed);
            return true;
        }
        /*  Code to determine whether no word ladder exists -> if statement 

         if (!findTheWord(startWordPassed, endWordPassed, libraryPassed)) {
        System.out.println("This ladder does not exists");
    }

    */
        else
        {
            for(int i = 0; i < libraryPassed.length; ++ i)
            {
                currentWord = libraryPassed[i];
                int count = 0;
                for(int j = 0; j < startWordPassed.length(); ++ j)
                {
                    if(startWordPassed.charAt(j) == currentWord.charAt(j))
                        ++count;
                }
                if(count == 3) {
                    libraryPassed[i] = "    ";
                    System.out.println(currentWord);
                    startWordPassed = currentWord;
                    //recursive call
                    if (findTheWord(startWordPassed, endWordPassed, libraryPassed)) {
                        return true;

                    }
                }
            }
        }

        return false;
    }

}
