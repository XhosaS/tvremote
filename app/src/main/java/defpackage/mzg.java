package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
class mzg implements Drawable.Callback {
    final /* synthetic */ mxx a;
    final /* synthetic */ CharSequence b;
    final /* synthetic */ CharSequence c;
    final /* synthetic */ nmt d;

    public mzg(mxx mxxVar, CharSequence charSequence, CharSequence charSequence2, nmt nmtVar) {
        this.a = mxxVar;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = nmtVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        drawable.setCallback(null);
        mxx mxxVar = this.a;
        CharSequence charSequence = this.b;
        mxxVar.setText(charSequence);
        mxxVar.b(charSequence, this.c, this.d.h());
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }
}
