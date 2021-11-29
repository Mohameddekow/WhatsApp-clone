package com.example.whatsapp_clone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.appcompat.widget.Toolbar
import androidx.core.view.isVisible
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.whatsapp_clone.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //set up the toolbar
        val toolBar = binding.myToolbar
        setSupportActionBar(toolBar)

        //toolbar with nav controller
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        val navController = navHostFragment.navController
        val appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)



        //hiding the navController and the tabLayout in the splash
        navController.addOnDestinationChangedListener { controller, destination, arguments ->
            if (destination.id == R.id.splashFragment || destination.id == R.id.viewPager2Fragment) {
                supportActionBar?.hide()

            }
            else if (destination.id == R.id.homeFragment) {
                toolBar.navigationIcon = null //hiding the back button from home. login , registration screen
                supportActionBar?.hide()

            }
            else if (destination.id == R.id.loginFragment || destination.id == R.id.registerFragment) {
                toolBar.navigationIcon =
                    null //hiding the back button from home. login , registration screen
                supportActionBar?.show()
            } else {
                //toolBar.navigationIcon = null //hiding the back button from home. login , registration screen
                supportActionBar?.show()
            }
        }

    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.fragmentContainerView)
        return navController.navigateUp()
    }
}