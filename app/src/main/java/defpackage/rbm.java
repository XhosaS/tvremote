package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rbm {
    public static final rbm a = new rbm();
    public final qve b;
    public rbl c;
    boolean d;

    public rbm() {
        this.c = rbl.UNKNOWN;
        this.d = false;
        this.b = new qve();
    }

    public static boolean a(rbm rbmVar) {
        return rbmVar == null || rbmVar == a;
    }

    public rbm(long j, long j2, rbl rblVar) {
        this.c = rbl.UNKNOWN;
        this.d = false;
        if (j2 < j) {
            throw new IllegalArgumentException(yro.a("End time %s is before start time %s.", Long.valueOf(j2), Long.valueOf(j)));
        }
        this.b = new qve(new quj(j, j), new quj(j2, j2));
        this.c = rblVar;
    }
}
