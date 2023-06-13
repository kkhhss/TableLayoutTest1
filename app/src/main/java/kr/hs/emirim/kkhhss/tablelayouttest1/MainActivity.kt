package kr.hs.emirim.kkhhss.tablelayouttest1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit internal var edit_t1 : EditText
    lateinit internal var edit_t2 : EditText
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
        edit_t1 = findViewById(R.id.edit_t1)
        edit_t2 = findViewById(R.id.edit_t2)
        btnPlus = findViewById(R.id.btnPlus)
        btnMinus = findViewById(R.id.btnMinus)
        btnMultiply = findViewById(R.id.btnMultiply)
        btnDivide = findViewById(R.id.btnDivide)
        textresult = findViewById(R.id.textresult)
        btnPlus.setOnClickListener(btnListener)
        btnMinus.setOnClickListener(btnListener)
        btnMultiply.setOnClickListener(btnListener)
        btnDivide.setOnClickListener(btnListener)

        for (i in 0 .. btnIds.size-1 step 1){
            btns.add(findViewById(btnIds[i]))
        }

        for(i in 0 .. btnIds.size-1 step 1){
            btns[i].setOnClickListener{
                if(edit_t1.isFocused){
                    num1 = edit_t1.text.toString() + btns[i].text.toString()
                    edit_t1.setText(num1)
                }else if(edit_t2.isFocused){
                    num2 = edit_t2.text.toString() + btns[i].text.toString()
                    edit_t2.setText(num2)
                }else{
                    Toast.makeText(applicationContext, "먼저 입력할 곳에 포커스를 주세요.", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    var btnListener = OnClickListener{
        num1 = edit_t1.text.toString()
        num2 = edit_t2.text.toString()

        when (it.id) {
            R.id.btnPlus -> result = num1.toInt() + num2.toInt()
            R.id.btnMinus -> result = num1.toInt() - num2.toInt()
            R.id.btnMultiply -> result = num1.toInt() * num2.toInt()
            R.id.btnDivide -> result = num1.toInt() / num2.toInt()
        }
        textresult.setText(R.string.text_result)
        textresult.append(result.toString())
    }


    }