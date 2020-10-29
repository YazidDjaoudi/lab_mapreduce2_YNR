package maxHeight.reducer;

import org.apache.hadoop.io.FloatWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;

public class IntReducer extends Reducer<Text, FloatWritable, Text, FloatWritable> {
    private FloatWritable result = new FloatWritable();

    public void reduce(Text key, Iterable<FloatWritable> values, Context context)
            throws IOException, InterruptedException {
        FloatWritable max_value = new FloatWritable(values.iterator().next().get());

        for(FloatWritable value : values){
            if(value.get() > max_value.get()){
                max_value.set(value.get());
            }
        }
        context.write(key, max_value);
    }
}
