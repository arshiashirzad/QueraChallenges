using System;

namespace Tanos
{   
    using System.Collections.Generic;
    internal class Tanos
    {
        public static void Main(string[] args)
        {
            Dictionary<string, string> rocks = new Dictionary<string, string>()
            {
                {"space","blue"},
                {"time","green"},
                {"mind","yellow"},
                {"reality","red"}, 
                {"power","purple"},
                {"soul","orange"}
            };
            string rock= Console.ReadLine();
            Console.WriteLine(rocks[rock]);
        }
    }
}