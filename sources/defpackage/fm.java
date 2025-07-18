package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fm {
    public static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    private static fm b;
    private jd c;

    public static synchronized PorterDuffColorFilter b(int i, PorterDuff.Mode mode) {
        return jd.b(i, mode);
    }

    public static synchronized fm d() {
        if (b == null) {
            f();
        }
        return b;
    }

    public static synchronized void f() {
        if (b == null) {
            fm fmVar = new fm();
            b = fmVar;
            fmVar.c = jd.e();
            b.c.h(new bfv());
        }
    }

    final synchronized ColorStateList a(Context context, int i) {
        return this.c.a(context, i);
    }

    public final synchronized Drawable c(Context context, int i) {
        return this.c.c(context, i);
    }

    public final synchronized void e(Context context) {
        this.c.f(context);
    }

    public final synchronized Drawable g(Context context, int i) {
        return this.c.d(context, i, true);
    }
}
