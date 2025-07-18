package com.google.android.play.search;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.play.image.FifeImageView;
import com.google.android.videos.R;
import defpackage.tga;
import defpackage.tha;
import defpackage.ulp;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PlaySearchOneSuggestion extends RelativeLayout {
    private FifeImageView a;
    private TextView b;
    private TextView c;
    private Drawable d;
    private final ulp e;

    public PlaySearchOneSuggestion(Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected static final void b(tha thaVar, FifeImageView fifeImageView, Drawable drawable) {
        Object obj = thaVar.f;
        if (obj != 0) {
            drawable = obj;
        }
        tga tgaVar = (tga) fifeImageView.getTag();
        if (tgaVar != null) {
            tgaVar.d();
            fifeImageView.setTag(null);
        }
        fifeImageView.setImageBitmap(null);
        fifeImageView.a();
        fifeImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        fifeImageView.setBackgroundDrawable(null);
        String str = thaVar.a;
        fifeImageView.c = null;
        fifeImageView.setImageDrawable(drawable);
    }

    public void a(tha thaVar, String str) {
        this.b.setText(this.e.aB(str, (String) thaVar.c, R.style.PlaySearchSuggestionText_Query, R.style.PlaySearchSuggestionText_Suggested));
        Object obj = thaVar.d;
        if (TextUtils.isEmpty(null)) {
            this.c.setVisibility(8);
        } else {
            this.c.setVisibility(0);
            this.c.setText((CharSequence) null);
        }
        b(thaVar, this.a, this.d);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.a = (FifeImageView) findViewById(R.id.icon);
        this.b = (TextView) findViewById(R.id.suggest_text);
        this.c = (TextView) findViewById(R.id.suggest_subtext);
        this.d = getContext().getResources().getDrawable(2131231878);
    }

    public PlaySearchOneSuggestion(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlaySearchOneSuggestion(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new ulp((Object) context, (byte[]) null);
    }
}
