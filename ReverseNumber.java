class ReverseNumber
{
    public static void main(String args[])
    {
        int num=Integer.parseInt(args[0]);
        /*int reverse=0;
        int temp=num;
        int remainder=0;
        */
        String ANSI_PURPLE="\u001B[35m";
        String ANSI_RED = "\u001B[31m";
        String ANSI_RESET = "\u001B[0m";
        //public static final String ANSI_RESET = "\u001B[0m";
        /*public static final String ANSI_BLACK = "\u001B[30m";
        public static final String ANSI_RED = "\u001B[31m";
        public static final String ANSI_GREEN = "\u001B[32m";
        public static final String ANSI_YELLOW = "\u001B[33m";
        public static final String ANSI_BLUE = "\u001B[34m";
        public static final String ANSI_PURPLE = "\u001B[35m";
        public static final String ANSI_CYAN = "\u001B[36m";
        public static final String ANSI_WHITE = "\u001B[37m";
         */
        int reverse=0,temp=num,remainder=0;
        while(temp>0)
        {
            remainder=temp%10;
            reverse=reverse*10 +remainder;
            temp/=10;
        }
        
        System.out.println(ANSI_RED+"input number : "+ANSI_RESET+" "+num+" "+ANSI_PURPLE+" reverse number:  "+ANSI_RESET+reverse);
    }
}

