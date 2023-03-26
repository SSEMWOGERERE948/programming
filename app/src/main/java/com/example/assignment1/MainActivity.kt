package com.example.assignment1

import BottomBarScreen
import android.annotation.SuppressLint
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.Navigation
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.assignment1.screens.FavouritesScreen
import com.example.assignment1.screens.ThingsScreen
import com.example.assignment1.ui.theme.Assignment1Theme
class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           Assignment1Theme {
               val navController = rememberNavController()
               //allows you to pass all the typical material designs such as toolbars etc
               Scaffold(
                   content = {
                       NavHost(navController, startDestination = "favourites") {
                           composable("favourites") { FavouritesScreen() }
                           composable("things") { ThingsScreen() }
                           composable("routines") { BottomBarScreen.Routines }
                           composable("ideas") { BottomBarScreen.Ideas }
                           composable("settings") { BottomBarScreen.Settings}
                       }
                   },
                   bottomBar = {
                       BottomNavigationBar(items = listOf(
                           BottomNavItem(
                               name = "Favourites",
                               route = "favourites",
                               icon = painterResource(id = R.drawable.star)
                           ),
                           BottomNavItem(
                               name = "Things",
                               route = "things",
                               icon = painterResource(id = R.drawable.line)
                           ),
                           BottomNavItem(
                               name = "routines",
                               route = "routines",
                               icon = painterResource(id = R.drawable.routine)
                           ),
                           BottomNavItem(
                               name = "Ideas",
                               route = "ideas",
                               icon = painterResource(id = R.drawable.baseline_lightbulb_24)
                           ),
                           BottomNavItem(
                               name = "Settings",
                               route = "settings",
                               icon = painterResource(id = R.drawable.settings)
                           )

                       ), navController = navController,
                           onItemClick = {
                               navController.navigate(it.route)
                           }
                       )
                   }
               )
           /*{
                   Navigation(navController=navController)
               }*/
            }
        }
    }
}

/*@Composable
fun Navigation(navController:NavHostController) {
    NavHost(navController = navController, startDestination = "Things") {
        composable(route="things"){
         BottomBarScreen.Things
    }
        composable(route="favourites"){
        BottomBarScreen.Favourites
    }
        composable(route="routines"){
            BottomBarScreen.Routines
        }
        composable(route="ideas"){
            BottomBarScreen.Ideas
        }
        composable(route="Settings"){
            BottomBarScreen.Settings
        }
    }

}*/
//passing a list of items
@Composable
fun BottomNavigationBar(
    items: List<BottomNavItem>,
    navController: NavHostController,
    modifier: Modifier =Modifier,
    onItemClick:(BottomNavItem) -> Unit
) {
    //we can get access to the current route
    val backStackEntry = navController.currentBackStackEntryAsState()
    BottomNavigation(
        modifier = modifier,
        backgroundColor = Color.Black,
        elevation = 5.dp
    ) {
        items.forEach{item ->
            //so here the state will be updated whenever the route changes
            val selected = item.route == backStackEntry.value?.destination?.route
            BottomNavigationItem(
                //selected if the route is the same as the nav controller current destination
                //is the route of the current destination same as the route of the item selected but this function does not recompose our state,
                //so the backstackentry above function will help us on that
                // selected = item.route == navController.currentDestination?.route,
                selected =selected,
                selectedContentColor = Color.Yellow,
                unselectedContentColor = Color.White,
                onClick = {onItemClick(item)},
                icon = {
                    Column(horizontalAlignment = CenterHorizontally) {
                        BadgeBox(
                            badgeCount = if(item.badgeCount > 0){
                                {
                                    Text(text = item.badgeCount.toString())
                                }


                                 } else null
                        ){
                            Icon(
                                painter = item.icon,
                                contentDescription = item.name)

                        }
                        if(selected){
                            Text(
                                 text = item.name,
                                textAlign = TextAlign.Center,
                                fontSize = 10.sp
                            )
                        }
                    }
                }
            )
        }
    }
}

@Composable
fun BadgeBox(badgeCount: @Composable (() -> Unit)?, content: @Composable () -> Unit) {
    Box(contentAlignment = Alignment.TopEnd) {
        content()
        if (badgeCount != null) {

                badgeCount()
        }
    }
}
