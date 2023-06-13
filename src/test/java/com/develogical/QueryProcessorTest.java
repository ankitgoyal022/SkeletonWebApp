package com.develogical;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertThat;

import org.hamcrest.Matcher;
import org.junit.Test;

public class QueryProcessorTest {

  QueryProcessor queryProcessor = new QueryProcessor();

  @Test
  public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
    assertThat(queryProcessor.process("test"), is(""));
  }

  
  // public void knowsAboutShakespeare() throws Exception {
  //   assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
  // }

    @Test
  public void knowsName() throws Exception {
    assertThat(queryProcessor.process("What is 69 minus 55?"), containsStringLong(14L));
  }


    private Matcher containsStringLong(long l) {
      return null;
    }


    private Matcher containsString(long l) {
      return null;
    }
}
