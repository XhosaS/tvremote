package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ll {
    public static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    private static ll b;
    private ra c;

    public static synchronized PorterDuffColorFilter b(int i, PorterDuff.Mode mode) {
        return ra.b(i, mode);
    }

    public static synchronized ll d() {
        if (b == null) {
            f();
        }
        return b;
    }

    public static synchronized void f() {
        if (b == null) {
            ll llVar = new ll();
            b = llVar;
            llVar.c = ra.e();
            b.c.g(new lk());
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

    final synchronized Drawable g(Context context, int i) {
        return this.c.d(context, i, true);
    }
}
