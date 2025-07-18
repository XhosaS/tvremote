package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dlq extends dlp {
    private dlq(Drawable drawable) {
        super(drawable);
    }

    static ddp g(Drawable drawable) {
        if (drawable != null) {
            return new dlq(drawable);
        }
        return null;
    }

    @Override // defpackage.ddp
    public final int a() {
        Drawable drawable = this.a;
        return Math.max(1, drawable.getIntrinsicWidth() * drawable.getIntrinsicHeight() * 4);
    }

    @Override // defpackage.ddp
    public final Class b() {
        return this.a.getClass();
    }

    @Override // defpackage.ddp
    public final void e() {
    }
}
