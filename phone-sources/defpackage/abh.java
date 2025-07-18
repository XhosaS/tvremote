package defpackage;

import android.os.Build;
import android.os.Trace;
import android.view.View;
import java.lang.reflect.Method;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class abh implements yjv {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ abh(bcb bcbVar, List list, List list2, boolean z, int i) {
        this.e = i;
        this.b = bcbVar;
        this.c = list;
        this.d = list2;
        this.a = z;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r11v2, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v5, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.yjv
    public final Object a(Object obj) throws Throwable {
        Object obj2;
        int i = this.e;
        int i2 = 0;
        if (i == 0) {
            ((bwi) obj).v(new abi((List) this.c, this.d, this.a, i2));
            adr.a(this.b);
            return ygi.a;
        }
        int i3 = 1;
        if (i == 1) {
            ((bwi) obj).v(new abi((List) this.c, this.d, this.a, i3));
            adr.a(this.b);
            return ygi.a;
        }
        if (i == 2) {
            byu byuVar = (byu) obj;
            byuVar.r();
            if (((Boolean) this.d.a()).booleanValue()) {
                Object obj3 = this.c;
                Object obj4 = this.b;
                if (this.a) {
                    long jM = byuVar.m();
                    bpn bpnVarP = byuVar.p();
                    long jA = bpnVarP.a();
                    bpnVarP.b().g();
                    try {
                        bpnVarP.c.x(-1.0f, 1.0f, jM);
                        brx.p(byuVar, (bng) obj4, (bnr) obj3);
                    } finally {
                        bpnVarP.b().e();
                        bpnVarP.h(jA);
                    }
                } else {
                    brx.p(byuVar, (bng) obj4, (bnr) obj3);
                }
            }
            return ygi.a;
        }
        if (i != 3) {
            ((View) obj).getClass();
            qva qvaVar = (qva) this.b;
            uzl uzlVarS = quy.s(qvaVar, this.a);
            uzlVarS.getClass();
            qza qzaVar = (qza) this.d;
            tst tstVarB = ((xwk) qzaVar.f).g().b(new pgc(qyz.a, 8));
            String str = qvaVar.a;
            ((xzg) qzaVar.d).g(rrx.an(str, uzlVarS, ((qyn) this.c).j, tstVarB), new qxm(new qxt(str), vrr.a));
            return vrr.b;
        }
        Throwable th = (Throwable) obj;
        if (th instanceof gru) {
            ((gpm) this.b).j(((gru) th).a);
        }
        if (this.a && (obj2 = this.d) != null) {
            int iHashCode = ((gsb) this.c).a.hashCode();
            if (Build.VERSION.SDK_INT >= 29) {
                Trace.endAsyncSection(gli.q((String) obj2), iHashCode);
            } else {
                String strQ = gli.q((String) obj2);
                try {
                    if (gli.s == null) {
                        gli.s = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                    }
                    Method method = gli.s;
                    if (method == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    method.invoke(null, Long.valueOf(gli.q), strQ, Integer.valueOf(iHashCode));
                } catch (Exception e) {
                    gli.p(e);
                }
            }
        }
        return ygi.a;
    }

    public /* synthetic */ abh(gpm gpmVar, boolean z, String str, gsb gsbVar, int i) {
        this.e = i;
        this.b = gpmVar;
        this.a = z;
        this.d = str;
        this.c = gsbVar;
    }

    public /* synthetic */ abh(qza qzaVar, qva qvaVar, boolean z, qyn qynVar, int i) {
        this.e = i;
        this.d = qzaVar;
        this.b = qvaVar;
        this.a = z;
        this.c = qynVar;
    }

    public /* synthetic */ abh(yjk yjkVar, boolean z, bng bngVar, bnr bnrVar, int i) {
        this.e = i;
        this.d = yjkVar;
        this.a = z;
        this.b = bngVar;
        this.c = bnrVar;
    }
}
