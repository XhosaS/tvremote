package defpackage;

import java.util.List;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class urf implements utj {
    private static final xsj a;
    private uhp b;
    private final zft c;

    static {
        xse xseVar = xsm.c;
        int i = xsj.c;
        a = new xsd("X-Goog-Spatula", xseVar);
    }

    public urf(zft zftVar) {
        this.c = zftVar;
    }

    @Override // defpackage.utj
    public final /* synthetic */ utv b() {
        return utv.a;
    }

    @Override // defpackage.utj
    public final /* synthetic */ utv f(upq upqVar) {
        return utv.a;
    }

    @Override // defpackage.utj
    public final utv g(vvd vvdVar) {
        try {
            ((xsm) vvdVar.b).h(a, (String) sfy.J(this.b));
            return utv.a;
        } catch (ExecutionException e) {
            xth xthVar = xth.UNAUTHENTICATED;
            List list = xtk.a;
            return utv.b(xthVar.a().d(e.getCause()).e("Could not retrieve spatula header"), new xsm());
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, yfo] */
    @Override // defpackage.utj
    public final utv h(vvd vvdVar) {
        tql tqlVarQ = szg.q("AsyncSpatulaInterceptor#headerFuture");
        try {
            nwq nwqVar = (nwq) this.c.a.b();
            oaf oafVar = new oaf();
            oafVar.a = new nku(1);
            oafVar.c = 1520;
            uhp uhpVarAH = qtl.aH(nwqVar.r(oafVar.a()));
            tqlVarQ.a(uhpVarAH);
            this.b = uhpVarAH;
            utv utvVarC = utv.c(uhpVarAH);
            tqlVarQ.close();
            return utvVarC;
        } catch (Throwable th) {
            try {
                tqlVarQ.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.utj
    public final /* synthetic */ void d(upo upoVar) {
    }

    @Override // defpackage.utj
    public final /* synthetic */ void e(upq upqVar) {
    }

    @Override // defpackage.utj
    public final /* synthetic */ void i(upo upoVar) {
    }
}
