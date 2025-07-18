package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oca {
    private static oca b;
    private static final ocb c = new ocb(0, false, false, 0, 0);
    public ocb a;

    private oca() {
    }

    public static synchronized oca a() {
        if (b == null) {
            b = new oca();
        }
        return b;
    }

    public final synchronized void b(ocb ocbVar) {
        if (ocbVar == null) {
            this.a = c;
            return;
        }
        ocb ocbVar2 = this.a;
        if (ocbVar2 != null) {
            if (ocbVar2.a >= ocbVar.a) {
                return;
            }
        }
        this.a = ocbVar;
    }
}
