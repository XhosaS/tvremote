package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ahlw {
    private final agzy a = new agzy(new ahly(8, false), agzz.a);

    public final int a() {
        long j = ((ahly) this.a.a).b.c;
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    public final Object b() {
        while (true) {
            agzy agzyVar = this.a;
            ahly ahlyVar = (ahly) agzyVar.a;
            Object objC = ahlyVar.c();
            if (objC != ahly.a) {
                return objC;
            }
            agzyVar.d(ahlyVar, ahlyVar.d(ahlyVar.b()));
        }
    }

    public final void c() {
        while (true) {
            agzy agzyVar = this.a;
            ahly ahlyVar = (ahly) agzyVar.a;
            if (ahlyVar.e()) {
                return;
            } else {
                agzyVar.d(ahlyVar, ahlyVar.d(ahlyVar.b()));
            }
        }
    }

    public final boolean d(Object obj) {
        while (true) {
            agzy agzyVar = this.a;
            ahly ahlyVar = (ahly) agzyVar.a;
            int iA = ahlyVar.a(obj);
            if (iA == 0) {
                return true;
            }
            if (iA != 1) {
                return false;
            }
            agzyVar.d(ahlyVar, ahlyVar.d(ahlyVar.b()));
        }
    }
}
