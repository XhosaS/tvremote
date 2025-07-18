package com.google.android.apps.play.movies.mobile.usecase.downloads;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.format.Formatter;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.play.movies.mobileux.component.downloadanimation.DownloadAnimationView;
import com.google.android.apps.play.movies.mobileux.component.downloadanimation.PreplayDownloadAnimationView;
import com.google.android.videos.R;
import defpackage.hjr;
import defpackage.htc;
import defpackage.mex;
import defpackage.muf;
import java.text.NumberFormat;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DownloadItemView extends muf {
    public PreplayDownloadAnimationView a;
    public DownloadAnimationView b;
    public TextView c;
    private View d;
    private TextView k;
    private TextView l;
    private NumberFormat m;
    private View[] n;
    private LinearLayout o;

    public DownloadItemView(Context context) {
        super(context);
    }

    public final void f(Uri uri) {
        hjr.c(getContext()).e(uri).g(htc.b()).k(this.f);
    }

    public final void g(String str) {
        this.k.setText(str);
    }

    public final void h(boolean z, long j, float f, long j2) {
        this.l.setVisibility(j > 0 ? 0 : 8);
        Context context = getContext();
        Resources resources = getResources();
        if (z) {
            this.l.setText(resources.getString(R.string.download_complete, Formatter.formatShortFileSize(context, j)));
            return;
        }
        this.l.setText(resources.getString(R.string.download_progress_text, this.m.format(f), Formatter.formatShortFileSize(context, j2), Formatter.formatShortFileSize(context, j)));
    }

    public final void i(View.OnClickListener onClickListener, Object obj) {
        View[] viewArr = this.n;
        int length = viewArr.length;
        for (int i = 0; i < 2; i++) {
            View view = viewArr[i];
            view.setOnClickListener(onClickListener);
            view.setTag(R.id.video_list_item_position_tag, obj);
        }
    }

    public final void j() {
        this.a.setVisibility(8);
        this.b.setVisibility(0);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.o.getLayoutParams();
        layoutParams.addRule(16, this.d.getId());
        this.o.setLayoutParams(layoutParams);
        this.o.requestLayout();
    }

    @Override // defpackage.muf, android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (PreplayDownloadAnimationView) findViewById(R.id.pin);
        this.b = (DownloadAnimationView) findViewById(R.id.pin_download_animation);
        this.d = findViewById(R.id.pin_download_animation_wrapper);
        this.k = (TextView) findViewById(R.id.title);
        this.c = (TextView) findViewById(R.id.episode_info);
        this.l = (TextView) findViewById(R.id.download_progress);
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        this.m = percentInstance;
        percentInstance.setMaximumFractionDigits(0);
        mex.a(this.f);
        mex.a(this.a);
        this.n = new View[]{this, this.a};
        this.o = (LinearLayout) findViewById(R.id.manage_downloads_list_item);
    }

    public DownloadItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DownloadItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
