package defpackage;

import android.animation.ObjectAnimator;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rah {
    public final ImageView a;
    public final TextView b;
    public int c;
    public final Object d;
    public final View e;
    public final Object f;

    public rah(rbd rbdVar, RecyclerView recyclerView, ImageView imageView, ObjectAnimator objectAnimator, TextView textView) {
        this.d = rbdVar;
        this.e = recyclerView;
        this.a = imageView;
        this.f = objectAnimator;
        this.b = textView;
        this.c = 1;
    }

    public final void a(boolean z) {
        this.e.setVisibility(true != z ? 8 : 0);
    }

    public final void b() {
        TextView textView = this.b;
        int i = this.c;
        if (textView != null) {
            Object obj = this.d;
            krf.b();
            String strC = ((mkc) obj).b.c();
            if (strC == null) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(strC);
            }
        }
        this.e.setKeepScreenOn(i == 1);
    }

    public rah(View view, Uri uri, mkc mkcVar, int i) {
        view.getClass();
        this.e = view;
        ImageView imageView = (ImageView) view.findViewById(i);
        this.a = imageView;
        imageView.setVisibility(0);
        this.b = (TextView) view.findViewById(R.id.status);
        this.c = 0;
        this.f = uri;
        this.d = mkcVar;
        b();
        hjr.c(imageView.getContext()).e(uri).h(hvc.d(R.drawable.eastwood_poster_background)).k(imageView);
    }
}
