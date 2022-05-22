package com.umutesen.kotlinoopproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.umutesen.kotlinoopproject.databinding.ActivityMainBinding
import java.net.URL

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        var myUser=User("James",50)
        myUser.age=25
        myUser.name="James"

        println(myUser.name)
        println(myUser.age.toString())
        println(myUser.information())

        //encapsulation

        var james=Musician("James","Guitar",55)
        println(james.age.toString())
        println(james.returnbandName("Atil"))
        println(james.returnbandName("Kirk"))

        //inheritance

        var lars =SuperMusician("Lars","Drum",68)
        println(lars.name)
        println(lars.returnbandName("Atil"))
        lars.sing()

        //polymorphism

        //static polymorphism

        var mathematics=Mathematics()
        println(mathematics.sum())
        println(mathematics.sum(3,4))
        println(mathematics.sum(3,4,5))

        //dynamic polymorphism

        val animal=Animal()
        animal.sing()

        val dog=Dog()
        dog.test()
        dog.sing()

        // abstract & interface

        // var myPeople= People()

        var myPiano= Piano()
        myPiano.brand="Suzuki"
        myPiano.digital=true
        println(myPiano.roomName)
        myPiano.info()

        //Lambda expressions

        fun printString(myString: String){
            println(myString)
        }

        printString("My Test String")

        val testString = {myString:String -> println(myString)}

        testString("My Lambda String")

        val multiplyLambda ={a:Int, b:Int -> a*b}
        println(multiplyLambda(6,7))

        val multiplyLambda2:(Int,Int) -> Int = {a,b -> a*b}
        println(multiplyLambda2(9,9))

        //asynchronous

        //cb function, listener function, completion func

        fun downloadMusicians(url:String,completion:(Musician)->Unit){
            val mikeShinoda=Musician("Mike","Piano",45)
            completion(mikeShinoda)
        }

        downloadMusicians("linkinPark.com",{ musician->
            println(musician.name)
        })


    }
}