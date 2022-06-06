package com.example.mystore

import android.os.Bundle
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.ViewCompositionStrategy
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.mystore.base.BaseActivity
import com.example.mystore.databinding.MainContentBinding
import com.example.mystore.ui.theme.MyStoreTheme

class MainActivity : BaseActivity() {

    private lateinit var binding: MainContentBinding
    private lateinit var navController: NavController
    private lateinit var navHostFragment: NavHostFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = MainContentBinding.inflate(layoutInflater)

        navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController

        binding.composeView.apply {
            setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed)
        }

        setContentView(binding.root)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyStoreTheme {
    }
}