package oldestTree.reducer;

import org.apache.hadoop.io.FloatWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.MapWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import oldestTree.reducer.IntReducer;


import java.io.IOException;
import java.util.Arrays;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class IntReducerTest {
    @Mock
    private Reducer.Context context;
    private oldestTree.reducer.IntReducer intReducer;

    @Before
    public void setup() {
        this.intReducer = new IntReducer();
    }

    @Test
    public void testReduce() throws IOException, InterruptedException {
        String key = "8";

        MapWritable newpair = new MapWritable();

        MapWritable newpair1 = new MapWritable();
        MapWritable newpair2 = new MapWritable();
        MapWritable newpair3 = new MapWritable();

        newpair2.put(new IntWritable(5),new IntWritable(1935));
        newpair1.put(new IntWritable(2),new IntWritable(1854));
        newpair3.put(new IntWritable(7),new IntWritable(2002));

        newpair.put(new IntWritable(2),new IntWritable(1854));

        Iterable<MapWritable> values = Arrays.asList(newpair1,newpair2,newpair3);
        this.intReducer.reduce(new Text("District"), values, this.context);
        verify(this.context).write(new Text("District"), newpair);
    }
}
