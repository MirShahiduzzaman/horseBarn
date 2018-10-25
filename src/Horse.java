public class Horse
{
    int weight;
    String name;

    public Horse(String name, int weight)
    {
        this.name = name;
        this.weight = weight;
    }

    static String getName(String name)
    {
        return(this.name);
    }

    static int getWeight(int weight)
    {
        return(this.name);
    }

    public interface Horse
    {
        /** @ return the horse's name */
        String getName();

        /** @return the horse's weight */
        int getWeight();
    }
}
