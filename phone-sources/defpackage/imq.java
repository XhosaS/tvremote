package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class imq implements utj, yow {
    public static final /* synthetic */ int b = 0;
    private static final xsj c;
    public final hfx a;
    private final /* synthetic */ yow d;
    private final lfn e;
    private final xms f;
    private final Map g;
    private final kdj h;

    static {
        wkb wkbVar = wkb.a;
        vtp vtpVar = yer.a;
        yeq yeqVar = new yeq(wkbVar);
        int i = xsj.c;
        c = new xsf("x-goog-ext-361235433-bin", yeqVar);
    }

    public imq(kdj kdjVar, lfn lfnVar, xms xmsVar) {
        kdjVar.getClass();
        lfnVar.getClass();
        yot yotVar = ypk.a;
        this.d = yoz.l(yya.a);
        this.h = kdjVar;
        this.e = lfnVar;
        this.f = xmsVar;
        this.g = new LinkedHashMap();
        this.a = ihz.aa(ihz.ab(new gew((Object) this, 4, (int[]) null))).i();
    }

    private final synchronized String j(String str) {
        if (str != null) {
            if (str.length() != 0) {
                return (String) this.g.get(str);
            }
        }
        return null;
    }

    private final synchronized void k(String str, String str2) {
        this.g.put(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r5, defpackage.yih r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.imp
            if (r0 == 0) goto L13
            r0 = r6
            imp r0 = (defpackage.imp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            imp r0 = new imp
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.d
            defpackage.ybn.f(r6)     // Catch: java.lang.Exception -> L4e
            goto L48
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ybn.f(r6)
            if (r5 == 0) goto L79
            kdj r6 = r4.h     // Catch: java.lang.Exception -> L4e
            wwi r2 = defpackage.wwi.a     // Catch: java.lang.Exception -> L4e
            r2.getClass()     // Catch: java.lang.Exception -> L4e
            r0.d = r5     // Catch: java.lang.Exception -> L4e
            r0.c = r3     // Catch: java.lang.Exception -> L4e
            java.lang.Object r6 = defpackage.kdj.l(r6, r2, r5, r0)     // Catch: java.lang.Exception -> L4e
            if (r6 != r1) goto L48
            return r1
        L48:
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L4e
            r4.k(r5, r6)     // Catch: java.lang.Exception -> L4e
            return r6
        L4e:
            xms r6 = r4.f
            ryv r0 = defpackage.xmt.a
            r1 = 0
            java.lang.String r2 = "UmpMigrationFeature__fallback_to_device_coutry_on_first_failure"
            ryn r0 = r0.e(r3, r2, r1)
            xmt r6 = (defpackage.xmt) r6
            android.content.Context r6 = r6.b
            java.lang.Object r6 = r0.et(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L76
            lfn r6 = r4.e
            java.lang.String r6 = r6.bh()
            r6.getClass()
            r4.k(r5, r6)
            return r6
        L76:
            java.lang.String r5 = ""
            return r5
        L79:
            lfn r5 = r4.e
            java.lang.String r5 = r5.bh()
            r5.getClass()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.imq.a(java.lang.String, yih):java.lang.Object");
    }

    @Override // defpackage.utj
    public final /* synthetic */ utv b() {
        return utv.a;
    }

    @Override // defpackage.yow
    public final yil c() {
        return ((ywq) this.d).a;
    }

    @Override // defpackage.utj
    public final /* synthetic */ utv f(upq upqVar) {
        return utv.a;
    }

    @Override // defpackage.utj
    public final utv g(vvd vvdVar) {
        String strJ = j(((uqx) ((xpy) vvdVar.d).g(uqx.a)).b);
        if (strJ == null) {
            strJ = this.e.bh();
        }
        Object obj = vvdVar.b;
        xsj xsjVar = c;
        vtw vtwVarM = wkb.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        wkb wkbVar = (wkb) vtwVarM.b;
        strJ.getClass();
        wkbVar.b |= 1;
        wkbVar.c = strJ;
        ((xsm) obj).h(xsjVar, vtwVarM.r());
        return utv.a;
    }

    @Override // defpackage.utj
    public final utv h(vvd vvdVar) {
        uhp uhpVar;
        String str = ((uqx) ((xpy) vvdVar.d).g(uqx.a)).b;
        if (str == null || str.length() == 0) {
            uhpVar = uhl.a;
        } else {
            final ypc ypcVarO = ykr.o(this, null, new imw(this, str, (yih) null, 1), 3);
            final ywi ywiVar = new ywi(ypcVarO);
            ypcVarO.r(new yjv() { // from class: ywk
                @Override // defpackage.yjv
                public final Object a(Object obj) {
                    ywi ywiVar2 = ywiVar;
                    Throwable th = (Throwable) obj;
                    if (th == null) {
                        ywiVar2.a(ypcVarO.o());
                    } else {
                        ywiVar2.b(th);
                    }
                    return ygi.a;
                }
            });
            uhpVar = ywiVar;
        }
        return utv.c(uhpVar);
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
