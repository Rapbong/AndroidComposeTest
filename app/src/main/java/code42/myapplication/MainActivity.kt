package code42.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.Composable
import androidx.ui.core.ContentScale
import androidx.ui.core.Modifier
import androidx.ui.core.clip
import androidx.ui.core.setContent
import androidx.ui.foundation.Image
import androidx.ui.foundation.Text
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.layout.*
import androidx.ui.material.MaterialTheme
import androidx.ui.res.imageResource
import androidx.ui.text.style.TextOverflow
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewsStory()
        }
    }

    @Composable
    fun NewsStory() {
        val image = imageResource(R.drawable.header)
        MaterialTheme {
            val typography = MaterialTheme.typography
            Column(
                modifier = Modifier.padding(10.dp)
            ) {
                val imageModifier = Modifier
                    .preferredHeightIn(maxHeight = 180.dp)
                    .fillMaxWidth()
                    .clip(shape = RoundedCornerShape(4.dp))

                Image(image, modifier = imageModifier,
                    contentScale = ContentScale.Crop)
                Spacer(Modifier.preferredHeight(16.dp))

                Text("A day wandering through the sandhils " +
                        "in Shark Fin Cove, and a few of the " +
                        "sights I saw",
                    style = typography.h6,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis)
                Text("Davenport, California",
                    style = typography.body2)
                Text("December 2o18",
                    style = typography.body2)
            }
        }
    }

    @Preview
    @Composable
    fun DefaultPreview() {
        NewsStory()
    }
}