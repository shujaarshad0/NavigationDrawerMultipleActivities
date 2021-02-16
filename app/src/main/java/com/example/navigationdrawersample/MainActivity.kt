package com.example.navigationdrawersample

import androidx.navigation.NavController
import androidx.navigation.findNavController

class MainActivity : DrawerActivity() {

    override fun setActivityLayout(): Int {
        return R.layout.activity_main
    }

    override fun setNavigationControllerDrawer(): NavController {
        return findNavController(R.id.nav_host_fragment)
    }

}