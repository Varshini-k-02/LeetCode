class Solution {
    public int maxPoints(int[][] points) 
    {
        int max = 0;
        for(int[] point_1 : points)
        {
            Map<Double,Integer> map= new HashMap<>();
            for(int[] point_2 : points)
            {
                if(point_1 == point_2) continue;
                
                double slope=0;
                // if x2 - x1 are equal then line is vertical
                if(point_2[0] == point_1[0])
                   slope=Double.POSITIVE_INFINITY; 
                else
                {
                    // slope (m) = (y2 - y1) / (x2 - x1) 
                    slope = (point_2[1] - point_1[1]) / (double)(point_2[0] - point_1[0]);
                }
                map.put( slope , map.getOrDefault(slope,0)+1 );
                if(map.get(slope)>max)
                    max=map.get(slope);
            }
        }
        return max+1;
    }
}
