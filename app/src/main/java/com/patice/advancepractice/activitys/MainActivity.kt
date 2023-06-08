package com.patice.advancepractice.activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView
import com.patice.advancepractice.R

class MainActivity : AppCompatActivity() {

    //สร้างตัวแปรสำหรับกำหนด view binding
    lateinit var navController: NavController // ควบคุม controlNavigation
    lateinit var appBarConfiguration: AppBarConfiguration // อ่านค่า UI Navigation Component
    lateinit var navHostFragment: NavHostFragment // จัดการ Host fragment
    lateinit var mainDrawerLayout : DrawerLayout // จัดการ Drawer menu
    lateinit var mainToolbar : Toolbar //จัดการ toolbar
    lateinit var mainNavigationView : NavigationView // จัดการ Navigation View
    lateinit var mainBottomNavigationView :BottomNavigationView // จัดการ BottomView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ทำการ find View
        mainToolbar = findViewById(R.id.toolbar)
        mainDrawerLayout = findViewById(R.id.drawerLayout)

        //กำหนดค่าเริ่มต้นให้กำ NavController
        navHostFragment = supportFragmentManager.findFragmentById(R.id.main_nav_host) as NavHostFragment
        navController = navHostFragment.navController

        // กำหนดการ appBarConfiguration initial
        appBarConfiguration  = AppBarConfiguration.Builder(
            ).setOpenableLayout(mainDrawerLayout).build()

        // กำหนด ToolBar ให้แสดง Icon Menu
        setupActionBarWithNavController(navController,appBarConfiguration)







    }
}