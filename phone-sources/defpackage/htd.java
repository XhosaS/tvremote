package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class htd extends htb {
    private htd(Drawable drawable) {
        super(drawable);
    }

    static hnv g(Drawable drawable) {
        if (drawable != null) {
            return new htd(drawable);
        }
        return null;
    }

    @Override // defpackage.hnv
    public final int a() {
        Drawable drawable = this.a;
        return Math.max(1, drawable.getIntrinsicWidth() * drawable.getIntrinsicHeight() * 4);
    }

    @Override // defpackage.hnv
    public final Class b() {
        return this.a.getClass();
    }

    @Override // defpackage.hnv
    public final void e() {
    }
}
