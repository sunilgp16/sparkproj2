package com.myscala.scala

import org.apache.spark.{SparkConf, SparkContext}

object HelloW {

  def main(args: Array[String]): Unit = {
    println("hello vicky")
    val conf = new SparkConf()
    conf.setMaster("local")
    conf.setAppName("FirstApp")
    val sc = new SparkContext(conf)

    var data = sc.makeRDD(Array(1,2,7,8,9))
    data.collect().foreach(println)
  }


}
