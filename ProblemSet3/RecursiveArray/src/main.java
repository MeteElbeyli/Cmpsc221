public class main
{
    public static void main(String[] args)
    {
      String[][] data = {{"A", "B"},  {"1", "2"},  {"XX", "YY", "ZZ"}};

      String[] oneline = new String[data.length];
      math(data, oneline, 0);
    }

    private static void math(String[][] data, String[] oneline, int group)
    {
        if (group >= data.length)
            return;
        for (int i = 0; i < data[group].length; i++)
        {
            oneline[group] = data[group][i];
            math(data, oneline, group+1);
            if (group == data.length -1)
                printItem(oneline);
        }

    }

    public static void printItem(String[] oneline)
    {
        for (int i = 0; i < oneline.length; i++)
            System.out.println(oneline[i] + "    ");
           System.out.println();
           //need this to space out my code
    }

}
