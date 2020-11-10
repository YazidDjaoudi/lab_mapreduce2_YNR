package oldestTree.reducer;

import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.Reducer;
import java.io.IOException;



public class IntReducer extends Reducer<Text, MapWritable, Text, MapWritable> {
    MapWritable mw = new MapWritable();

    public void reduce(Text key, Iterable<MapWritable> values, Context context)
            throws IOException, InterruptedException {
        MapWritable min_value = new MapWritable(values.iterator().next()); //Keep the first value to compare to the next one

        for (MapWritable val : values) {

            if(Integer.parseInt(((min_value.values().toArray())[0]).toString()) >= Integer.parseInt(((val.values().toArray())[0]).toString())){//If the year is lower min_value is updated with the new one
                min_value = val;
            }

        }
        System.out.println(key + " " + min_value);

        context.write(key, min_value);
    }
}