package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qux {
    public final quu a;
    public final agow b;
    public final rdc c;
    public final agow d;
    public final aehf e;
    private final qpv f;
    private final Executor g;

    public qux(quu quuVar, agow agowVar, qpv qpvVar, rdd rddVar, agow agowVar2, Executor executor, aehf aehfVar, agow agowVar3) {
        this.a = quuVar;
        this.f = qpvVar;
        this.b = agowVar;
        this.g = executor;
        this.d = new quv(agowVar2);
        Context context = (Context) rddVar.a.a();
        context.getClass();
        Executor executor2 = (Executor) rddVar.b.a();
        executor2.getClass();
        rdg rdgVar = (rdg) rddVar.c.a();
        rdgVar.getClass();
        Boolean bool = (Boolean) rddVar.d.a();
        bool.getClass();
        boolean zBooleanValue = bool.booleanValue();
        yqt yqtVar = (yqt) ((aejh) rddVar.e).b;
        yqtVar.getClass();
        rcy rcyVar = (rcy) rddVar.f.a();
        rcyVar.getClass();
        this.c = new rdc(context, executor2, rdgVar, aehfVar, zBooleanValue, yqtVar, agowVar3, rcyVar);
        this.e = aehfVar;
    }

    static /* synthetic */ void e(agow agowVar) {
        if (((yqt) agowVar.a()).g()) {
        }
    }

    public final long a(String str) {
        if (!this.f.a) {
            rdc rdcVar = this.c;
            if (rdcVar.c.b()) {
                return -1L;
            }
            boolean z = rdcVar.b;
            rdh rdhVar = rdcVar.a;
            if (z) {
                return rdhVar.a(str);
            }
        }
        return -1L;
    }

    public final zyd b(final quq quqVar) {
        return this.f.a ? zxn.f() : zxn.l(new zvh() { // from class: quw
            /* JADX WARN: Removed duplicated region for block: B:148:0x0348 A[LOOP:1: B:146:0x0345->B:148:0x0348, LOOP_END] */
            @Override // defpackage.zvh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final defpackage.zyd a() throws java.security.NoSuchAlgorithmException {
                /*
                    Method dump skipped, instructions count: 2031
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.quw.a():zyd");
            }
        }, this.g);
    }

    public final boolean c(String str) {
        return a(str) != -1;
    }

    public final boolean d() {
        rdc rdcVar = this.c;
        return rdcVar.b && rdcVar.a.d();
    }
}
