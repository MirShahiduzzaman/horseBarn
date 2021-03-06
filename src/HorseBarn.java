public class HorseBarn
{
    private Horse[] spaces;

    public HorseBarn(Horse[] arr)
    {
        this.spaces = arr;
    }

    public int findHorseSpace(String name)
    {
        for(int i = 0;i<spaces.length;i++)
        {
            if(this.spaces[i]!=null && name.equals(this.spaces[i].getName()))
            {
                return(i+1);
            }
        }
        return(-1);
    }

    public void consolidate()
    {
        for(int i = 0;i<this.spaces.length;i++)
        {
            if(this.spaces[i] == null)
            {
                for(int a = i+1;a<this.spaces.length;a++)
                {
                    if(this.spaces[a]!=null)
                    {
                        this.spaces[i] = this.spaces[a];
                        this.spaces[a] = null;
                        a = this.spaces.length;
                    }
                }
            }
        }
    }

    public String toString()
    {
        String arr = "";
        for(int i = 0;i<this.spaces.length;i++)
        {
            arr += this.spaces[i];
        }
        return(arr);
    }
}
