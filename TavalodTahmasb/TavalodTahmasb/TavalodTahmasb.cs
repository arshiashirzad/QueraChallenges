using System;
using System.Linq;

namespace TavalodTahmasb
{
    internal class TavalodTahmasb
    {
        public static void Main(string[] args)
        {
            int people = Convert.ToInt32(Console.ReadLine());
            string[] degreeS = Console.ReadLine().Split(' ');
            double[] myDegrees = Array.ConvertAll(degreeS, s => double.Parse(s));
            Array.Sort(myDegrees);
            double[] vals = new double[people];
            for (int i = 0; i < myDegrees.Length; i++)
            {
                if (i + 1 == myDegrees.Length)
                {
                    vals[i] = (360-myDegrees[i]) + myDegrees[0];
                }
                else
                {
                    vals[i] = myDegrees[i + 1] - myDegrees[i];
                }
            }

            
            Console.WriteLine((vals.Max()/360)*100);
        }
    }
}