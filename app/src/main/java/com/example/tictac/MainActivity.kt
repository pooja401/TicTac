package com.example.tictac

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.tictac.R.id.b7
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    protected fun buclick(view:View)
    {
      val buselected=view as Button

        var cellid=0
        when(buselected.id)
        {
            R.id.b3->cellid=1
            R.id.b2->cellid=2
            R.id.b1->cellid=3
            R.id.b6->cellid=4
            R.id.b5->cellid=5
            R.id.b4->cellid=6
            R.id.b9->cellid=7
            R.id.b8->cellid=8
            R.id.b7 ->cellid=9
        }
        Toast.makeText(this,"ID:"+cellid, Toast.LENGTH_LONG).show()
    playgame(cellid,buselected)

    }

    var player1=ArrayList<Int>()
    var player2=ArrayList<Int>()
     var activeplayer=1

    fun playgame(cellid:Int,buselected:Button)
    {
     if(activeplayer==1)
     {
         buselected.text="X"
         buselected.setBackgroundColor(Color.CYAN)
         player1.add(cellid)
         activeplayer=2

     }
        else{
         buselected.text="O"
         buselected.setBackgroundColor(Color.DKGRAY)
         player2.add(cellid)
         activeplayer=1
     }

     checkwinner()
    }

    fun checkwinner()
    {
        var winner=-1
        if(player1.contains(1)&&player1.contains(4)&&player1.contains(7))
        {
            winner=1
        }
        if(player1.contains(2)&&player1.contains(5)&&player1.contains(8))
        {
            winner=1
        }
        if(player1.contains(3)&&player1.contains(6)&&player1.contains(9))
        {
            winner=1
        }

        if(player1.contains(1)&&player1.contains(2)&&player1.contains(3))
        {
            winner=1
        }
        if(player1.contains(4)&&player1.contains(5)&&player1.contains(6))
        {
            winner=1
        }
        if(player1.contains(7)&&player1.contains(8)&&player1.contains(9))
        {
            winner=1
        }
        if(player1.contains(3)&&player1.contains(5)&&player1.contains(7))
        {
            winner=1
        }
        if(player1.contains(1)&&player1.contains(5)&&player1.contains(9))
        {
            winner=1
        }
        if(player2.contains(1)&&player2.contains(2)&&player2.contains(3))
        {
            winner=2
        }
        if(player2.contains(4)&&player2.contains(5)&&player2.contains(6))
        {
            winner=2
        }
        if(player2.contains(7)&&player2.contains(8)&&player2.contains(9))
        {
            winner=2
        }
        if(player2.contains(3)&&player2.contains(5)&&player2.contains(7))
        {
            winner=2
        }
        if(player2.contains(1)&&player2.contains(5)&&player2.contains(9))
        {
            winner=2
        }
        if(player2.contains(1)&&player2.contains(4)&&player2.contains(7))
        {
            winner=2
        }
        if(player2.contains(2)&&player2.contains(5)&&player2.contains(8))
        {
            winner=2
        }
        if(player2.contains(3)&&player2.contains(6)&&player2.contains(9))
        {
            winner=2
        }



        if(winner==1)
        {
            Toast.makeText(this, "player 1 has won",Toast.LENGTH_LONG).show()
        }
        if(winner==2)
        {
            Toast.makeText(this,"player2 has won", Toast.LENGTH_LONG).show()
        }
    }


    fun Autoplay()
    {
        var emptycells=ArrayList<Int>()
        for(cellid in 1..9)
        {
            if(!(player1.contains(cellid)||player2.contains(cellid)))
            {
                emptycells.add(cellid)
            }
        }

     /* val r= Random()
        val randomIndex=r.nextInt(emptycells.size-0)+0
        val cellid =emptycells[randomIndex]*/
        val cellid= emptycells[0]
        var buselect:Button?
        when(cellid)
        {
            1-> buselect=b1
            2-> buselect=b2
            3-> buselect=b3
            4-> buselect=b4
            5-> buselect=b5
            6-> buselect=b6
            7-> buselect=b7
            8-> buselect=b8
            9-> buselect=b9
            else->buselect=b1

        }
        playgame(cellid,buselect)


    }

}
