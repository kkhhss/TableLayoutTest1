package kr.hs.emirim.kkhhss.tablelayouttest1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    lateinit internal var Edit_t1 : EditText
    lateinit internal var Edit_t2 : EditText
    lateinit internal var btnPlus : Button
    lateinit internal var btnMinus : Button
    lateinit internal var btnMultiply : Button
    lateinit internal var btnDivide : Button
    lateinit internal var textresult : TextView
    lateinit internal var num1 : String
    lateinit internal var num2 : String
    internal var result : Int? = null
    internal var btns = ArrayList<Button>(10)
    internal var btnIds = arrayOf(R.id.btn1, R.id.btn2, R.id.btn3, R.id.btn4, R.id.btn5, R.id.btn6, R.id.btn7, R.id.btn8, R.id.btn9, R.id.btn0)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ex5_2)
        Edit_t1 = findViewById(R.id.Edit_t1)
        Edit_t2 = findViewById(R.id.Edit_t2)
        btnPlus = findViewById(R.id.btnPlus)
        btnMinus = findViewById(R.id.btnMinus)
        btnMultiply = findViewById(R.id.btnMultiply)
        btnDivide = findViewById(R.id.btnDivide)
        textresult = findViewById(R.id.textresult)
    }
}