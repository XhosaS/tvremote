package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dvu extends emh {
    public final long a;
    public final duz b;
    protected final dru c;

    protected dvu(long j, duz duzVar, int i, dru druVar) {
        super(i);
        this.c = druVar;
        this.b = duzVar;
        this.a = j;
    }

    public static dru a(elv elvVar) {
        return ((dvu) elvVar.d.b).c;
    }

    public static boolean b(emh emhVar) {
        return emhVar.d == 2;
    }
}
