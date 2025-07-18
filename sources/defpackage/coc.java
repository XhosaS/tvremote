package defpackage;

import sun.misc.Unsafe;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class coc {
    final Unsafe a;

    public coc(Unsafe unsafe) {
        this.a = unsafe;
    }

    public abstract double a(Object obj, long j);

    public abstract float b(Object obj, long j);

    public abstract void c(Object obj, long j, boolean z);

    public abstract void d(Object obj, long j, byte b);

    public abstract void e(Object obj, long j, double d);

    public abstract void f(Object obj, long j, float f);

    public abstract boolean g(Object obj, long j);

    public final int h(Object obj, long j) {
        return this.a.getInt(obj, j);
    }

    public final long i(Object obj, long j) {
        return this.a.getLong(obj, j);
    }

    public final void j(Object obj, long j, int i) {
        this.a.putInt(obj, j, i);
    }

    public final void k(Object obj, long j, long j2) {
        this.a.putLong(obj, j, j2);
    }
}
