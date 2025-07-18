package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ahkx {
    public final agzy b;
    public final agzy c;

    public ahkx(ahkx ahkxVar) {
        agzz agzzVar = agzz.a;
        this.b = new agzy(null, agzzVar);
        this.c = new agzy(ahkxVar, agzzVar);
    }

    public final ahkx j() {
        Object obj = this.b.a;
        if (obj == ahkw.a) {
            return null;
        }
        return (ahkx) obj;
    }

    public final ahkx k() {
        return (ahkx) this.c.a;
    }

    public final void l() {
        Object obj;
        ahkx ahkxVarJ;
        boolean z = ahbx.a;
        if (n()) {
            return;
        }
        while (true) {
            ahkx ahkxVarK = k();
            while (ahkxVarK != null && ahkxVarK.m()) {
                ahkxVarK = (ahkx) ahkxVarK.c.a;
            }
            ahkx ahkxVarJ2 = j();
            ahkxVarJ2.getClass();
            while (ahkxVarJ2.m() && (ahkxVarJ = ahkxVarJ2.j()) != null) {
                ahkxVarJ2 = ahkxVarJ;
            }
            agzy agzyVar = ahkxVarJ2.c;
            do {
                obj = agzyVar.a;
            } while (!agzyVar.d(obj, ((ahkx) obj) == null ? null : ahkxVarK));
            if (ahkxVarK != null) {
                ahkxVarK.b.c(ahkxVarJ2);
            }
            if (!ahkxVarJ2.m() || ahkxVarJ2.n()) {
                if (ahkxVarK == null || !ahkxVarK.m()) {
                    return;
                }
            }
        }
    }

    public abstract boolean m();

    public final boolean n() {
        return j() == null;
    }
}
