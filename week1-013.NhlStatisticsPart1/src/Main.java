

import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) throws Exception {

        //System.out.println("Top ten by points");
        //NHLStatistics.sortByPoints();
        //NHLStatistics.top(10);

        System.out.println("Top ten by goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);

        System.out.println("Top 25 by penalties");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);

        System.out.println("Statistics for Sidney Crosby:");
        NHLStatistics.searchByPlayer("Sidney Crosby");

        System.out.println("Team statistics for Philadelphia Flyers:");
        NHLStatistics.teamStatistics("PHI");
        NHLStatistics.sortByPoints();

        System.out.println("The players in Anaheim Ducks:");
        NHLStatistics.teamStatistics("ANA");
    }
}
