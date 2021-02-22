import java.util.ArrayList;
import java.util.Arrays;

public class Problem {

    private final int[][] matrix;
    private ArrayList<Source> sources;
    private ArrayList<Destination> destinations;

    public Problem(int[][] costs , ArrayList<Source>sources , ArrayList<Destination> destionations) {
        matrix=costs;
        this.sources=sources;
        this.destinations=destionations;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public ArrayList<Source> getSources() {
        return sources;
    }

    public ArrayList<Destination> getDestinations() {
        return destinations;
    }

    public void setSources(ArrayList<Source> sources) {
        this.sources = sources;
    }

    public void setDestinations(ArrayList<Destination> destinations) {
        this.destinations = destinations;
    }


    /**
     * StringBuilder e o clasa ce permite folosind metoda append concatenerea de stringuri pentru a obtine formatul dorit
     *     se va face afisarea folosind metoda toString,care e suprascrisa
     */
    @Override
    public String toString() {
        StringBuilder result= new StringBuilder();

        result.append("Matrix:\n");

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix.length; j++)
                result.append(matrix[i][j]).append(" ");

            result.append('\n');
        }

        result.append("Supply:\n");

        for (Source source : sources) {
            result.append(source.getName()).append(" :type:")
            .append(source.getType()).append(":").append(source.getSupply()).append('\n');
        }

        result.append("Demands:\n");

        for (Destination e : destinations) {
            result.append(e.getName()).append(": ").append(e.getDemand()).append('\n');
        }

        return result.toString();
    }
}
