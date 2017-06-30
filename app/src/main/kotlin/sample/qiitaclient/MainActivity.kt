package sample.qiitaclient

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import sample.qiitaclient.model.Article
import sample.qiitaclient.model.User
import sample.qiitaclient.view.ArticleView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        var articleView = ArticleView(applicationContext)
        articleView.setArticle(
                Article(
                        id = "124",
                        title = "Intro to Kotlin",
                        url = "",
                        user = User(id = "123", name = "kengo", profileImageUrl = "")
                )
        )
        setContentView(articleView)
    }

}
