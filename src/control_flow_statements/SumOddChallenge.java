package control_flow_statements;
public class SumOddChallenge
{
  public static void main(String[] args)
  {
    System.out.println(isOdd(4));
    System.out.println(sumOdd(1,11));
  }
  public static boolean isOdd(int number)
  {
    return (number > 0) && (number % 2 != 0);
  }

  public static int sumOdd(int start, int end)
  {
    int tally = 0;
    if (end < start || start < 0)
    {
      return -1;
    }
    else
      {
        for (int i = start; i <= end; i++)
        {
              if(isOdd(i))
              {
                tally += i;
              }
        }
      }
      return tally;
  }
}
