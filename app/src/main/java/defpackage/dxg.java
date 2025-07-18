package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dxg {
    public final int a;
    public final afh b;
    public int c = 0;

    public dxg(int i) {
        this.a = i;
        this.b = new afj(i);
    }

    public void b(Object obj) {
        synchronized (this) {
            this.b.b(obj);
            this.c = Math.min(this.a, this.c + 1);
        }
    }
}
