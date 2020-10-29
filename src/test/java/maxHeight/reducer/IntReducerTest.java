package maxHeight.reducer;

import org.apache.hadoop.io.FloatWritable;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import maxHeight.reducer.IntReducer;

import java.io.IOException;
import java.util.Arrays;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class IntReducerTest {
    @Mock
    private Reducer.Context context;
    private maxHeight.reducer.IntReducer intReducer;

    @Before
    public void setup() {
        this.intReducer = new IntReducer();
    }

    @Test
    public void testReduce() throws IOException, InterruptedException {
        String key = "key";
        FloatWritable value = new FloatWritable((float)15.0);
        Iterable<FloatWritable> values = Arrays.asList(value, value, value);
        this.intReducer.reduce(new Text(key), values, this.context);
        verify(this.context).write(new Text(key), new FloatWritable((float)15.0));
    }
}
