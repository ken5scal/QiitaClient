package sample.qiitaclient.view

import android.content.Context
import android.databinding.DataBindingUtil
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import sample.qiitaclient.R
import sample.qiitaclient.databinding.ViewArticleBinding
import sample.qiitaclient.model.Article

class ArticleView : FrameLayout {
    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)
    constructor(context: Context?,
                attrs: AttributeSet?,
                defStyleAttr: Int,
                defstyleRes: Int) : super(context, attrs, defStyleAttr, defstyleRes)

    val binding: ViewArticleBinding

    init {
        binding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.view_article, this, true)
    }

    fun setArticle(article: Article) {
        binding.article = article
    }

}

