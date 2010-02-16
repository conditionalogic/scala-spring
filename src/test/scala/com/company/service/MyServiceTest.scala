package com.company.service

import org.junit.Assert._
import org.junit._
import com.company.model.{User, IOU}

@Test
class MyServiceTest {
  @Test
  def addNewIOU {

    val myService = new MyService

    val phil = User("phil")
    val warren = User("warren")

    var ious = myService.addNewIOU("phil","warren",10)
    assertEquals(1, ious.length)

    ious = myService.addNewIOU("phil","ed",10)
    assertEquals(2, ious.length)

    ious = myService.addNewIOU("phil","warren",20)
    assertEquals(2, ious.length)


  }

}