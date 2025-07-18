package defpackage;

import com.google.common.collect.ImmutableMap;
import j$.time.Instant;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uqz implements utj {
    public static final xpx a = new xpx("com.google.frameworks.client.data.android.auth.AuthContextInterceptor", false);
    private static final xsj b;
    private static final xsj c;
    private final ImmutableMap d;
    private uhp e;

    static {
        xse xseVar = xsm.c;
        int i = xsj.c;
        b = new xsd("Authorization", xseVar);
        c = new xsd("X-Auth-Time", xsm.c);
    }

    public uqz(ImmutableMap immutableMap) {
        this.d = immutableMap;
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
            aafi aafiVar = (aafi) sfy.J(this.e);
            Object obj = vvdVar.b;
            xsj xsjVar = b;
            sij.x(!((xsm) obj).i(xsjVar), "Already attached auth token");
            ((xsm) obj).h(xsjVar, a.cr((String) aafiVar.a, "Bearer "));
            ((xsm) obj).h(c, Long.toString(((Instant) aafiVar.c).toEpochMilli()));
            return utv.a;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (!(cause instanceof urb)) {
                return utv.b(xtk.c(cause), new xsm());
            }
            xth xthVar = xth.UNAUTHENTICATED;
            List list = xtk.a;
            return utv.b(xthVar.a().d(cause.getCause()), new xsm());
        }
    }

    @Override // defpackage.utj
    public final utv h(vvd vvdVar) {
        xpx xpxVar = uqx.a;
        Object obj = vvdVar.d;
        xpy xpyVar = (xpy) obj;
        uqx uqxVar = (uqx) xpyVar.g(xpxVar);
        uqxVar.getClass();
        String str = uqxVar.c;
        ImmutableMap immutableMap = this.d;
        if (immutableMap.containsKey(str)) {
            Object obj2 = ((upo) immutableMap.get(uqxVar.c)).a;
            throw null;
        }
        boolean z = false;
        if (!str.equals("incognito") && !str.equals("pseudonymous")) {
            z = true;
        }
        sij.x(z, "Used non-google account without enabling API Key fallback");
        xpx xpxVar2 = uqi.a;
        ura uraVar = ((uqh) xpyVar.g(xpxVar2)).f;
        Set setC = ((uqr) xpyVar.g(uqr.a)).c();
        tql tqlVarQ = szg.q("AuthContextInterceptor#tokenFuture");
        try {
            uhq uhqVar = new uhq(trc.g(new uqy(vvdVar, uraVar, uqxVar, setC, 0)));
            tqlVarQ.a(uhqVar);
            ((uqh) ((xpy) obj).g(xpxVar2)).e.execute(uhqVar);
            this.e = uhqVar;
            utv utvVarC = utv.c(uhqVar);
            tqlVarQ.close();
            return utvVarC;
        } finally {
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
