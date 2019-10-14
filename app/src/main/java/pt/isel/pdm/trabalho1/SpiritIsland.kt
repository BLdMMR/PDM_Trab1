package pt.isel.pdm.trabalho1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class SpiritIsland : AppCompatActivity() {

    var imgsrs = arrayOf(R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4)
    var indicator = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.spirit_island)
//        onRestoreInstanceState(savedInstanceState)
//        val sa = SearchActivity()




        bt1OnClick()
        bt2OnClick()
        ruleOnClick()
    }
//
//    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
//        super.onSaveInstanceState(outState, outPersistentState)
//
//    }

//    fun sendMessage(view: View) {
//        val intent = Intent(this, Main2Activity::class.java)
//        startActivity(intent)
//
//    }

    fun ruleOnClick(){
        val rulebtn = findViewById<Button>(R.id.RulesButton)
        rulebtn.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {

                val url = "https://tesera.ru/images/items/1225847/Spirit%20Island%20rulebook%20low-res.pdf"
                var intent = Intent(Intent.ACTION_VIEW)
                intent.data = Uri.parse(url)
                startActivity(intent)

            }
        })
    }


    fun bt1OnClick() {

        var iv = findViewById<ImageView>(R.id.img)
        var bt1 = findViewById<Button>(R.id.prevImg)

        bt1.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {
                if (indicator != 0) --indicator
                iv.setImageResource(imgsrs.get(indicator))
            }
        })
    }


    fun bt2OnClick() {

        var iv = findViewById<ImageView>(R.id.img)
        var bt1 = findViewById<Button>(R.id.nxtImage)

        bt1.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {
                if (indicator < imgsrs.size-1) ++indicator
                iv.setImageResource(imgsrs.get(indicator))
            }
        })
    }



}
