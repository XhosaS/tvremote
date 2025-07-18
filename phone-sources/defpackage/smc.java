package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class smc {
    public final String a;
    public final smd b;
    public final tpv c;
    public final Object d;
    public List e;
    private final uhp f;
    private final tpv g;
    private final unx h;

    public smc(smd smdVar, uhp uhpVar) {
        smb smbVar = new smb(this);
        ugk ugkVar = ugk.a;
        this.g = new tpv(smbVar, ugkVar);
        this.d = new Object();
        this.e = new ArrayList();
        this.b = smdVar;
        this.f = uhpVar;
        this.a = smdVar.f();
        this.c = new tpv(smdVar.a(), ugkVar);
        this.h = new unx();
        c(new sls(this, 7));
    }

    public final uhp a() {
        uhp uhpVarJ;
        ttl.c(trj.a);
        tpv tpvVar = this.g;
        if (tpvVar.c.isDone()) {
            uhpVarJ = this.b.i();
        } else {
            tql tqlVarJ = sss.j("Get ".concat(String.valueOf(this.a)));
            try {
                uhpVarJ = ufn.j(tpvVar.c(), trc.c(new sls(this, 8)), ugk.a);
                tqlVarJ.a(uhpVarJ);
                tqlVarJ.close();
            } catch (Throwable th) {
                try {
                    tqlVarJ.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        sfy.D(this.f);
        return sfy.D(uhpVarJ);
    }

    public final uhp b(tsl tslVar, Executor executor) {
        uhp uhpVarC;
        unx unxVar;
        ugk ugkVar;
        ufw ufwVarC = trc.c(new sls(tslVar, 6));
        ttl.c(trj.a);
        tql tqlVarJ = sss.j("Update ".concat(String.valueOf(this.a)));
        try {
            uhpVarC = this.g.c();
            unxVar = this.h;
            osv osvVar = new osv(uhpVarC, 15);
            ugkVar = ugk.a;
            unxVar.e(osvVar, ugkVar);
        } catch (Throwable th) {
            th = th;
        }
        try {
            uhp uhpVarE = unxVar.e(trc.b(new sla(this, uhpVarC, ufwVarC, executor, 3)), ugkVar);
            uhpVarE.getClass();
            if (!uhpVarC.isDone()) {
                if (uhpVarE.isDone()) {
                    sfy.L(uhpVarE, uhpVarC);
                } else {
                    uhc uhcVar = new uhc(uhpVarE, uhpVarC, 0);
                    uhpVarE.c(uhcVar, ugkVar);
                    uhpVarC.c(uhcVar, ugkVar);
                }
            }
            sfy.D(this.f);
            uhp uhpVarC2 = sil.c(uhpVarE);
            tqlVarJ.a(uhpVarC2);
            tqlVarJ.close();
            return uhpVarC2;
        } catch (Throwable th2) {
            th = th2;
            Throwable th3 = th;
            try {
                tqlVarJ.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public final void c(ufw ufwVar) {
        synchronized (this.d) {
            this.e.add(ufwVar);
        }
    }
}
