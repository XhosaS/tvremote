package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class duz implements Cloneable {
    public final dww a;
    public final dzj b;
    public final drq c;
    public final int d;
    public final int e;
    public final int f;

    public duz(drq drqVar, dww dwwVar, dzj dzjVar, int i, int i2, int i3) {
        this.a = dwwVar;
        this.b = dzjVar;
        this.c = drqVar;
        this.d = i;
        this.e = i2 == 8 ? 1 : i2;
        this.f = i3;
    }

    public static boolean b(int i) {
        return (i & 1) == 1;
    }

    public final boolean a() {
        if (this.e == 2) {
            return false;
        }
        dww dwwVar = this.a;
        return (dwwVar != null && dwwVar.Q()) || this.c.V();
    }
}
