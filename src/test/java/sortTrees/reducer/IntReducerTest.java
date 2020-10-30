package sortTrees.reducer;

import org.apache.hadoop.io.FloatWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;


import java.io.IOException;
import java.util.Arrays;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class IntReducerTest {
    @Mock
    private Reducer.Context context;
    private sortTrees.reducer.IntReducer intReducer;

    @Before
    public void setup() {
        this.intReducer = new IntReducer();
    }

    @Test
    public void testReduce() throws IOException, InterruptedException {
        String key = "pomera";
        Iterable<FloatWritable> values = Arrays.asList(new FloatWritable((float)15.0), new FloatWritable((float)19.0), new FloatWritable((float)16.0));
        this.intReducer.reduce(new Text(key), values, this.context);
        verify(this.context).write(new Text(key), new FloatWritable((float)15.0));
    }
}