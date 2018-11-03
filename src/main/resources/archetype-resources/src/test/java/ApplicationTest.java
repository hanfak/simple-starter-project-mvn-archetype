package $package;

import org.junit.Test;
import org.assertj.core.api.WithAssertions;

public class ApplicationTest implements WithAssertions {

    @Test
    public void blah() throws Exception {
        assertThat(1 == 1).isTrue();
    }
}
