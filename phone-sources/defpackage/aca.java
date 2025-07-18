package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aca {
    public boolean a;
    public long b;

    public final long a() {
        if (this.a) {
            return Long.MAX_VALUE;
        }
        return Math.max(0L, this.b - System.nanoTime());
    }
}
