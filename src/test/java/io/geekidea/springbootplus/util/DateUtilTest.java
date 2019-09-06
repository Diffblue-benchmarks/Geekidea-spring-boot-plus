package io.geekidea.springbootplus.util;

import io.geekidea.springbootplus.util.DateUtil;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class DateUtilTest {

  @Rule public final ExpectedException thrown = ExpectedException.none();

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void getYYYYMMDDHHMMSSInputNullOutputNull() {

    // Act and Assert result
    Assert.assertNull(DateUtil.getYYYYMMDDHHMMSS(null));
  }
}
