package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bfp {
    public final int b;
    public final int c;

    public bfp(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    protected abstract void a(bfs bfsVar, bad badVar, bdj bdjVar, bhx bhxVar, bfq bfqVar);

    protected bac b(bfs bfsVar) {
        return null;
    }

    public final String toString() {
        int i = ylg.a;
        String strC = new ykl(getClass()).c();
        return strC == null ? "" : strC;
    }

    public /* synthetic */ bfp(int i, int i2, int i3) {
        this(1 == (i3 & 1) ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
