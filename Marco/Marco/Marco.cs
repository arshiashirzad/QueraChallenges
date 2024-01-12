using System;
namespace Marco
{
    internal class Marco
    {
        public static void Main(string[] args)
        {
            int trips = Convert.ToInt32(Console.ReadLine());
            
            for (int i = 1; i <= trips; i++)
            {
                int choices = Convert.ToInt32(Console.ReadLine());
                int res=0;
                for (int j = 1; j <= choices; j++)
                { 
                    string[] choice = Console.ReadLine().Split(' ');
                    if (res == 0)
                    {
                        if (choice[0] == choice[1])
                        {
                            if (choice[0] == "buy_one")
                            {
                                res += 1;
                            }
                        }else {
                            res += 1;
                        }
                    }else
                    {
                        if (choice[0] != choice[1])
                        {
                            res *=2;
                        }
                        else {
                            if (choice[0] == "buy_one")
                            {
                                res += 1;
                            }
                            else
                            {
                                res *= 2;
                            }
                        }
                    }

                }
                
                Console.WriteLine(res);
            }
        }
    }
}