package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class icq implements Drawable.Callback {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public icq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        if (this.b != 0) {
            ((gky) this.a).invalidateSelf();
            return;
        }
        drawable.getClass();
        icr icrVar = (icr) this.a;
        icrVar.b.b(Integer.valueOf(icrVar.g() + 1));
        icrVar.c.b(new bna(ics.a(icrVar.a)));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (this.b != 0) {
            ((gky) this.a).scheduleSelf(runnable, j);
            return;
        }
        drawable.getClass();
        runnable.getClass();
        ics.b().postAtTime(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (this.b != 0) {
            ((gky) this.a).unscheduleSelf(runnable);
            return;
        }
        drawable.getClass();
        runnable.getClass();
        ics.b().removeCallbacks(runnable);
    }
}
