namespace HelloWorld
{
    class Program
    {
        static void Main(string[] args)
        {
            if (args.Length == 0)
            {
                System.Console.WriteLine("사용법: HelloWorld.exe <이름>");
            } else
            {
                Console.WriteLine("Hello, {0}!", args[0]);
            }
        }
    }
}