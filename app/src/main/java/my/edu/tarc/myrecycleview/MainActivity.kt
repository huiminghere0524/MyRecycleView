package my.edu.tarc.myrecycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import my.edu.tarc.myrecycleview.data.MyAdapter
import my.edu.tarc.myrecycleview.data.Product

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val productList: List<Product> = listOf(
            Product("Apple", 2.50, R.drawable.ic_baseline_ac_unit_24),
            Product("Orange", 3.50,R.drawable.ic_baseline_adb_24),
            Product("Mango", 12.00,R.drawable.ic_baseline_anchor_24),
            Product("Phone", 3500.00,R.drawable.ic_baseline_ac_unit_24),
            Product("Computer", 2500.00,R.drawable.ic_baseline_adb_24),
            Product("Keyboard", 28.00,R.drawable.ic_baseline_anchor_24),
            Product("Water", 2.50,R.drawable.ic_baseline_ac_unit_24),
            Product("Guava", 3.50,R.drawable.ic_baseline_adb_24),
            Product("Strawberry", 12.00,R.drawable.ic_baseline_anchor_24),
            Product("Ipad", 3500.00,R.drawable.ic_baseline_ac_unit_24),
            Product("Air Fryer", 2500.00,R.drawable.ic_baseline_adb_24),
            Product("Mouse", 28.00,R.drawable.ic_baseline_anchor_24),

        )
        val productAdapter = MyAdapter(productList)
        val recyclerView:RecyclerView = findViewById(R.id.productRecycleView)
        recyclerView.adapter = productAdapter
        recyclerView.setHasFixedSize(true)
    }
}