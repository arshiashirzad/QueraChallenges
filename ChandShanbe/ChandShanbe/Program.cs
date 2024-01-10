using System;
using System.Collections.Generic;

class Program
{
    static void Main()
    {
        Dictionary<string, int> dates = new Dictionary<string, int>
        {
            {"Farvardin", 31},
            {"Ordibehesht", 31},
            {"Khordad", 31},
            {"Tir", 31},
            {"Mordad", 31},
            {"Shahrivar", 31},
            {"Mehr", 30},
            {"Aban", 30},
            {"Azar", 30},
            {"Dey", 30},
            {"Bahman", 30},
            {"Esfand", 29}
        };

        string[] days = {"shanbe", "1shanbe", "2shanbe", "3shanbe", "4shanbe", "5shanbe", "jome"};
        string[] dateKeys = {"Farvardin", "Ordibehesht", "Khordad", "Tir", "Mordad", "Shahrivar", "Mehr", "Aban", "Azar", "Dey", "Bahman", "Esfand"};

        int testCases = int.Parse(Console.ReadLine());

        for (int i = 0; i < testCases; i++)
        {
            string[] today = Console.ReadLine().Split();
            string[] goal = Console.ReadLine().Split();

            if (Array.IndexOf(dateKeys, today[1]) == Array.IndexOf(dateKeys, goal[1]))
            {
                if (int.Parse(today[0]) - int.Parse(goal[0]) >= 0)
                {
                    Console.WriteLine(days[(Array.IndexOf(days, today[2]) - ((int.Parse(today[0]) - int.Parse(goal[0])) % 7) + 7) % 7]);
                }
                else
                {
                    Console.WriteLine(days[(Array.IndexOf(days, today[2]) + ((int.Parse(goal[0]) - int.Parse(today[0])) % 7) + 7) % 7]);
                }
            }
            else if (Array.IndexOf(dateKeys, today[1]) > Array.IndexOf(dateKeys, goal[1]))
            {
                int step = int.Parse(today[0]);
                int temp = Array.IndexOf(dateKeys, today[1]) - 1;
                int goalTemp = Array.IndexOf(dateKeys, goal[1]);

                while (temp != goalTemp)
                {
                    step += dates[dateKeys[temp]];
                    temp--;
                }

                Console.WriteLine(days[(Array.IndexOf(days, today[2]) - ((step + dates[goal[1]] - int.Parse(goal[0])) % 7) + 7) % 7]);
            }
            else
            {
                int temp = Array.IndexOf(dateKeys, today[1]) + 1;
                int goalTemp = Array.IndexOf(dateKeys, goal[1]);
                int step = dates[today[1]] - int.Parse(today[0]);

                while (temp != goalTemp)
                {
                    step += dates[dateKeys[temp]];
                    temp++;
                }

                Console.WriteLine(days[(Array.IndexOf(days, today[2]) + (step + int.Parse(goal[0])) % 7) % 7]);
            }
        }
    }
}
