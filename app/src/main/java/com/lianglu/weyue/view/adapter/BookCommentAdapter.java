package com.lianglu.weyue.view.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.lianglu.weyue.R;
import com.lianglu.weyue.model.BookCommentBean;

import java.util.List;

/**
 * @author 17173
 * @what
 * @date 2019/3/29
 */
public class BookCommentAdapter extends BaseQuickAdapter<BookCommentBean, BaseViewHolder> {


    public BookCommentAdapter(@Nullable List<BookCommentBean> data) {
        super( R.layout.item_book_shelf, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, BookCommentBean item) {

    }
}
