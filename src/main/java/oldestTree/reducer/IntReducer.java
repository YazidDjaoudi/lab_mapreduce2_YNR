package oldestTree.reducer;

import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.Reducer;
import java.io.IOException;



public class IntReducer extends Reducer<Text, MapWritable, Text, MapWritable> {
    MapWritable mw = new MapWritable();

    public void reduce(Text key, Iterable<MapWritable> values, Context context)
            throws IOException, InterruptedException {
        MapWritable max_value = new MapWritable(values.iterator().next());

        for (MapWritable val : values) {

            if(Integer.parseInt(((max_value.values().toArray())[0]).toString()) >= Integer.parseInt(((val.values().toArray())[0]).toString())){
                max_value = val;
            }

        }
        System.out.println(key + " " + max_value);

        context.write(key, max_value);
    }
}