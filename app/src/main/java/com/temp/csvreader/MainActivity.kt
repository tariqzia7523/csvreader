package com.temp.csvreader

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.cleveroad.adaptivetablelayout.AdaptiveTableLayout
import com.csv.reader.CsvFileDataSourceImpl
import com.csv.reader.SampleLinkedTableAdapter
import java.io.File

class MainActivity : AppCompatActivity() {

    var tableLayout : AdaptiveTableLayout? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tableLayout = findViewById(R.id.tableLayout)
        val mCsvFileDataSource = CsvFileDataSourceImpl(this, Uri.fromFile(File("path")))
        if(mCsvFileDataSource.rowsCount > 0){
            tableLayout!!.setAdapter(SampleLinkedTableAdapter(this, mCsvFileDataSource))
        }else {
            Toast.makeText(this@MainActivity, getString(R.string.unable_to_read_file), Toast.LENGTH_SHORT).show()

        }

    }
}