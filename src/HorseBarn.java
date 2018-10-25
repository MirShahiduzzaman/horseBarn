public class HorseBarn extends Horse
{
    private Horse[] spaces;

    public int findHorseSpace(String name)
    {
        for(int i = 0;i<spaces.length;i++)
        {
            if(this.spaces[i]!=null && name.equals(this.spaces[i].getName))
            {
                return(i);
            }
        }
        return(-1);
    }

    public void consolidate()
    {

    }
}
