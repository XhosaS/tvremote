package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajc {
    private static ajc b;
    private static final ajd c = new ajd(0, false, false, 0, 0);
    public ajd a;

    private ajc() {
    }

    public static synchronized ajc a() {
        if (b == null) {
            b = new ajc();
        }
        return b;
    }

    public final synchronized void b(ajd ajdVar) {
        if (ajdVar == null) {
            this.a = c;
            return;
        }
        ajd ajdVar2 = this.a;
        if (ajdVar2 != null) {
            if (ajdVar2.a >= ajdVar.a) {
                return;
            }
        }
        this.a = ajdVar;
    }
}
