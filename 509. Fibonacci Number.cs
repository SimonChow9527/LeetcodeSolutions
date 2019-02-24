  class Solution
    {

       
            public int Fib(int N)
            {
                if (N == 1)
                {
                    return 1;
                }
                else if (N == 0)
                {

                    return 0;
                }
                else
                {
                    return Fib(N - 2) + Fib(N - 1);
                }
            }
        
    }
