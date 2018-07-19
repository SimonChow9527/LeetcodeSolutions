==============================================================my crap===================================================================
class Solution {
    public int islandPerimeter(int[][] grid) {
			int ans = 0;
			if(grid[0][0]==1)
			{ans+=2;}
	        if((grid[0][0]==1)&&(grid[0][1]==0))
	        {ans+=1;}
	        if((grid[0][0]==1)&&(grid[1][0]==0))
	        {ans+=1;}
			if(grid[0][grid[0].length-1]==1)
			{ans+=2;}
	        if((grid[0][grid[0].length-1]==1)&&(grid[0][grid[0].length-2]==0))
	        {ans+=1;}
	        if((grid[0][grid[0].length-1]==1)&&(grid[1][grid[0].length-1]==0) ) 
	        {ans+=1;}
			if(grid[grid.length-1][0]==1)
			{ans+=2;}	
	        if((grid[grid.length-1][0]==1)&&(grid[grid.length-2][0]==0))  
	        {ans+=1;}                                     
	        if((grid[grid.length-1][0]==1)&&(grid[grid.length-1][1]==0))   
	        {ans+=1;}                                     
			if(grid[grid.length-1][grid[0].length-1]==1)
			{ans+=2;}
	        if((grid[grid.length-1][grid[0].length-1]==1)&&(grid[grid.length-2][grid[0].length-1]==0)) 
	        {ans+=1;}   
	        if((grid[grid.length-1][grid[0].length-1]==1)&&(grid[grid.length-1][grid[0].length-2]==0)) 
	        {ans+=1;}                                   
			for(int i=1;i<grid[0].length-2;i++)
			{
	            if(grid[0][i]==1)
	                {ans+=1;}
	            if(grid[grid.length-1][i]==1)
	                {ans+=1;}
				if((grid[0][i]==1)&&(grid[0][i-1]==0))
				{ans+=1;}
				if((grid[0][i]==1)&&(grid[0][i+1]==0))                    
				{ans+=1;}
                if((grid[0][i]==1)&&(grid[1][i]==0))                    
				{ans+=1;}
				if((grid[grid.length-1][i]==1)&&(grid[grid.length-1][i-1]==0))
				{ans+=1;}
				if((grid[grid.length-1][i]==1)&&(grid[grid.length-1][i+1]==0))
				{ans+=1;}
                if((grid[grid.length-1][i]==1)&&(grid[grid.length-2][i]==0))
				{ans+=1;}
			}
			for(int i=1;i<grid.length-2;i++)        
			{
				if(grid[i][0]==1)
	                {ans+=1;}
	            if(grid[i][grid[0].length-1]==1)
	                {ans+=1;}
	            if((grid[i][0]==1)&&(grid[i-1][0]==0))
				{ans+=1;}
				if((grid[i][0]==1)&&(grid[i+1][0]==0))
				{ans+=1;}
                if((grid[i][0]==1)&&(grid[i][1]==0))
				{ans+=1;}
				if((grid[i][grid[0].length-1]==1)&&(grid[i-1][grid[0].length-1]==0))
				{ans+=1;}
				if((grid[i][grid[0].length-1]==1)&&(grid[i+1][grid[0].length-1]==0))
				{ans+=1;}
                if((grid[i][grid[0].length-1]==1)&&(grid[i][grid[0].length-2]==0))
				{ans+=1;}
			}
			for (int i = 1; i < grid.length-2; i++)
				for (int j = 1; j < grid[0].length-2; j++) {
					if (grid[i][j] == 1) {

						if(grid[i-1][j]==0)
						{ans+=1;}
						if(grid[i+1][j]==0)
						{ans+=1;}	
						if(grid[i][j-1]==0)
						{ans+=1;}
						if(grid[i][j+1]==0)
						{ans+=1;}
						}
					}
			return ans;	}

}
========================================================================================================================================

=======================================================a good solution================================================================
public class Solution {
    public int islandPerimeter(int[][] grid) {
        int islands = 0, neighbours = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    islands++; // count islands
                    if (i < grid.length - 1 && grid[i + 1][j] == 1) neighbours++; // count down neighbours
                    if (j < grid[i].length - 1 && grid[i][j + 1] == 1) neighbours++; // count right neighbours
                }
            }
        }

        return islands * 4 - neighbours * 2;
    }
}
========================================================================================================================================

I need to get some IQ pills
