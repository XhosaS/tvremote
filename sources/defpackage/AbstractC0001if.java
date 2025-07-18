package defpackage;

import android.graphics.Rect;
import android.view.View;

/* compiled from: PG */
/* renamed from: if, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0001if {
    protected final in a;
    public int b = Integer.MIN_VALUE;
    final Rect c = new Rect();

    public AbstractC0001if(in inVar) {
        this.a = inVar;
    }

    public static AbstractC0001if p(in inVar, int i) {
        return i != 0 ? new ie(inVar) : new id(inVar);
    }

    public abstract int a(View view);

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l(View view);

    public abstract int m(View view);

    public abstract void n(int i);

    public final int o() {
        if (this.b == Integer.MIN_VALUE) {
            return 0;
        }
        return k() - this.b;
    }
}
