import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import com.example.assignment1.R

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object Favourites : BottomBarScreen(
        route = "favourites",
        title = "Favourites",
        icon = Icons.Default.Favorite
    )
    object Things : BottomBarScreen(
        route = "things",
        title = "Things",
        icon = Icons.Default.Favorite
    )
    object Routines : BottomBarScreen(
        route = "routines",
        title = "Routines",
        icon = Icons.Default.Favorite
    )
    object Ideas : BottomBarScreen(
        route = "ideas",
        title = "Ideas",
        icon =Icons.Default.Favorite
    )
    object Settings: BottomBarScreen(
        route = "Settings",
        title = "settings",
        icon =Icons.Default.Favorite
    )
}
