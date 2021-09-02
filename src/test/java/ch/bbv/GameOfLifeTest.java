package ch.bbv;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class GameOfLifeTest {

  @Test
  public void dummyExample(){
    var gameOfLife = new GameOfLife();

    assertThat(gameOfLife, notNullValue());
  }

}