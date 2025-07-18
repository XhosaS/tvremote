package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
class hnq implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ GradientDrawable a;
    final /* synthetic */ View.OnFocusChangeListener b;
    final /* synthetic */ hns c;

    public hnq(hns hnsVar, GradientDrawable gradientDrawable, View.OnFocusChangeListener onFocusChangeListener) {
        this.a = gradientDrawable;
        this.b = onFocusChangeListener;
        this.c = hnsVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        hns hnsVar = this.c;
        View view = hnsVar.B;
        hnsVar.A.setTextColor(view.hasFocus() ? hnsVar.f : hnsVar.e);
        this.a.setColor(view.hasFocus() ? hnsVar.d : hnsVar.c);
        view.setOnFocusChangeListener(this.b);
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
