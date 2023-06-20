public class CheckThreads implements Channel{
    public static int checking(String StationName)
    {   int stat;
        switch (StationName)
        {
            case("Estacao 1") : stat = 1;
                break;
            case ("Estacao 2") : stat = 2;
                break;
            case("Estacao 3") : stat = 3;
                break;
            case ("Estacao 4") : stat = 4;
                break;
            default : stat = 0;

        }
        return(stat);
    }
}