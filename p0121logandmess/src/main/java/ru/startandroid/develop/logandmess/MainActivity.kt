
import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import ru.startandroid.develop.logandmess.R


class MainActivity : Activity(), View.OnClickListener {
    var tvOut: TextView? = null
    var btnOk: Button? = null
    var btnCancel: Button? = null

    /** Called when the activity is first created.  */
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // найдем View-элементы
        tvOut = findViewById<View>(R.id.tvOut) as TextView
        btnOk = findViewById<View>(R.id.btnOk) as Button
        btnCancel = findViewById<View>(R.id.btnCancel) as Button

        // присваиваем обработчик кнопкам
        btnOk?.setOnClickListener(this)
        btnCancel?.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        // по id определяем кнопку, вызвавшую этот обработчик
        when (v.id) {
            R.id.btnOk ->       // кнопка ОК
                tvOut!!.text = "Нажата кнопка ОК"
            R.id.btnCancel ->       // кнопка Cancel
                tvOut!!.text = "Нажата кнопка Cancel"
        }
    }
}