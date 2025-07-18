package defpackage;

import j$.util.Objects;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class evf implements ewg, eoz {
    final /* synthetic */ evg a;
    private final Object b;
    private eph c;
    private eph d;

    public evf(evg evgVar, Object obj) {
        this.a = evgVar;
        this.c = evgVar.E(null);
        this.d = evgVar.F(null);
        this.b = obj;
    }

    private final boolean m(evz evzVar) {
        evz evzVarD;
        if (evzVar != null) {
            evzVarD = this.a.d(this.b, evzVar);
            if (evzVarD == null) {
                return false;
            }
        } else {
            evzVarD = null;
        }
        evg evgVar = this.a;
        evgVar.h(this.b);
        eph ephVar = this.c;
        int i = ephVar.a;
        if (!Objects.equals(ephVar.c, evzVarD)) {
            this.c = evgVar.r.r(evzVarD);
        }
        eph ephVar2 = this.d;
        int i2 = ephVar2.a;
        if (Objects.equals(ephVar2.c, evzVarD)) {
            return true;
        }
        this.d = evgVar.s.z(evzVarD);
        return true;
    }

    private final void n(evv evvVar) {
        evg evgVar = this.a;
        Object obj = this.b;
        evgVar.k(obj);
        evgVar.k(obj);
    }

    @Override // defpackage.ewg
    public final void cX(int i, evz evzVar, evv evvVar) {
        if (m(evzVar)) {
            eph ephVar = this.c;
            n(evvVar);
            ephVar.b(evvVar);
        }
    }

    @Override // defpackage.eoz
    public final void cY(int i, evz evzVar) {
        if (m(evzVar)) {
            this.d.t();
        }
    }

    @Override // defpackage.eoz
    public final void cZ(int i, evz evzVar) {
        if (m(evzVar)) {
            this.d.u();
        }
    }

    @Override // defpackage.eoz
    public final void da(int i, evz evzVar) {
        if (m(evzVar)) {
            this.d.v();
        }
    }

    @Override // defpackage.eoz
    public final void db(int i, evz evzVar, int i2) {
        if (m(evzVar)) {
            this.d.w(i2);
        }
    }

    @Override // defpackage.ewg
    public final void di(int i, evz evzVar, evv evvVar) {
        if (m(evzVar)) {
            eph ephVar = this.c;
            n(evvVar);
            ephVar.k(evvVar);
        }
    }

    @Override // defpackage.eoz
    public final void f(int i, evz evzVar, Exception exc) {
        if (m(evzVar)) {
            this.d.x(exc);
        }
    }

    @Override // defpackage.eoz
    public final void g(int i, evz evzVar) {
        if (m(evzVar)) {
            this.d.y();
        }
    }

    @Override // defpackage.ewg
    public final void h(int i, evz evzVar, evq evqVar, evv evvVar) {
        if (m(evzVar)) {
            eph ephVar = this.c;
            n(evvVar);
            ephVar.d(evqVar, evvVar);
        }
    }

    @Override // defpackage.ewg
    public final void i(int i, evz evzVar, evq evqVar, evv evvVar) {
        if (m(evzVar)) {
            eph ephVar = this.c;
            n(evvVar);
            ephVar.f(evqVar, evvVar);
        }
    }

    @Override // defpackage.ewg
    public final void j(int i, evz evzVar, evq evqVar, evv evvVar, IOException iOException, boolean z) {
        if (m(evzVar)) {
            eph ephVar = this.c;
            n(evvVar);
            ephVar.h(evqVar, evvVar, iOException, z);
        }
    }

    @Override // defpackage.ewg
    public final void k(int i, evz evzVar, evq evqVar, evv evvVar, int i2) {
        if (m(evzVar)) {
            eph ephVar = this.c;
            n(evvVar);
            ephVar.j(evqVar, evvVar, i2);
        }
    }
}
