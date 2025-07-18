package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
class mzf implements Drawable.Callback {
    final /* synthetic */ mxx a;
    final /* synthetic */ CharSequence b;

    public mzf(mxx mxxVar, CharSequence charSequence) {
        this.a = mxxVar;
        this.b = charSequence;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        drawable.setCallback(null);
        this.a.setText(this.b);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }
}
