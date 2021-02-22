import java.util.ArrayList;

public class Main {

    public static void main (String[] args){
        int[][] matrix = new int[][]{
                {2, 3, 1},
                {5, 4, 8},
                {5, 6, 8}
        };
        Source s1 = new Source("S1",10, Source.SourceType.FACTORY);
        Source s2 = new Source("S2",35, Source.SourceType.WAREHOUSE);
        Source s3 = new Source("S3",25, Source.SourceType.FACTORY);
        ArrayList<Source> sources = new ArrayList<>();
        sources.add(s1);
        sources.add(s2);
        sources.add(s3);
        Destination d1 = new Destination("D1", 20);
        Destination d2 = new Destination("D2", 25);
        Destination d3 = new Destination("D3", 25);
        ArrayList<Destination> destinations = new ArrayList<>();
        destinations.add(d1);
        destinations.add(d2);
        destinations.add(d3);
        Problem problem = new Problem(matrix,sources,destinations);
        System.out.println(problem.toString());
    }
}
