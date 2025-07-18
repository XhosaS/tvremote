package defpackage;

import android.content.Context;
import j$.util.Optional;
import java.io.IOException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jdr {
    public static final tui a = tui.l("com/google/android/apps/googletv/app/player/offline/OfflineControllerImpl");
    public final yow b;
    public final yfo c;
    public final ouy d;
    public final jec e;
    public final kuw f;
    private final lfn g;
    private final euc h;
    private final Optional i;
    private final ikf j;
    private final yft k;
    private final iyz l;
    private final lhr m;

    public jdr(lfn lfnVar, yow yowVar, euc eucVar, ouy ouyVar, oum oumVar, yfo yfoVar, Optional optional, nuh nuhVar, lhr lhrVar, jec jecVar, kuw kuwVar, isf isfVar, ikf ikfVar, iyz iyzVar, iea ieaVar) {
        lfnVar.getClass();
        eucVar.getClass();
        ouyVar.getClass();
        oumVar.getClass();
        yfoVar.getClass();
        nuhVar.getClass();
        lhrVar.getClass();
        kuwVar.getClass();
        isfVar.getClass();
        ikfVar.getClass();
        iyzVar.getClass();
        this.g = lfnVar;
        this.b = yowVar;
        this.h = eucVar;
        this.d = ouyVar;
        this.c = yfoVar;
        this.i = optional;
        this.m = lhrVar;
        this.e = jecVar;
        this.f = kuwVar;
        this.j = ikfVar;
        this.l = iyzVar;
        this.k = new yga(new izc(ieaVar, 9));
    }

    private final String e() {
        Object objA = this.k.a();
        objA.getClass();
        return (String) objA;
    }

    public final etn a(ksy ksyVar) {
        ksyVar.getClass();
        return this.h.c.a(ksyVar.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(android.content.Context r7, defpackage.ksy r8, defpackage.yih r9) throws java.io.IOException {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.jdp
            if (r0 == 0) goto L13
            r0 = r9
            jdp r0 = (defpackage.jdp) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            jdp r0 = new jdp
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.b
            yio r1 = defpackage.yio.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r8 = r0.a
            defpackage.ybn.f(r9)     // Catch: java.lang.Exception -> L29
            goto L70
        L29:
            r7 = move-exception
            goto L83
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            defpackage.ybn.f(r9)
            ouy r9 = r6.d     // Catch: java.lang.Exception -> L29
            java.lang.String r2 = r6.e()     // Catch: java.lang.Exception -> L29
            lfn r4 = r6.g     // Catch: java.lang.Exception -> L29
            java.lang.String r4 = r4.bo()     // Catch: java.lang.Exception -> L29
            j$.util.Optional r5 = r6.i     // Catch: java.lang.Exception -> L29
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Exception -> L29
            ouc r5 = (defpackage.ouc) r5     // Catch: java.lang.Exception -> L29
            r9.c(r7, r2, r4, r5)     // Catch: java.lang.Exception -> L29
            our r7 = new our     // Catch: java.lang.Exception -> L29
            java.lang.String r2 = r8.b     // Catch: java.lang.Exception -> L29
            wni r4 = defpackage.hju.t(r8)     // Catch: java.lang.Exception -> L29
            int r4 = r4.c     // Catch: java.lang.Exception -> L29
            int r4 = defpackage.a.aU(r4)     // Catch: java.lang.Exception -> L29
            if (r4 != 0) goto L5e
            r4 = r3
        L5e:
            ouq r4 = defpackage.qtl.au(r4)     // Catch: java.lang.Exception -> L29
            r7.<init>(r2, r4)     // Catch: java.lang.Exception -> L29
            r0.a = r8     // Catch: java.lang.Exception -> L29
            r0.d = r3     // Catch: java.lang.Exception -> L29
            java.lang.Object r9 = r9.b(r7, r0)     // Catch: java.lang.Exception -> L29
            if (r9 != r1) goto L70
            return r1
        L70:
            vfg r9 = (defpackage.vfg) r9     // Catch: java.lang.Exception -> L29
            if (r9 == 0) goto L7b
            kuw r7 = r6.f     // Catch: java.lang.Exception -> L29
            enr r7 = r7.u(r9)     // Catch: java.lang.Exception -> L29
            return r7
        L7b:
            java.io.IOException r7 = new java.io.IOException     // Catch: java.lang.Exception -> L29
            java.lang.String r9 = "Manifest not found or invalid."
            r7.<init>(r9)     // Catch: java.lang.Exception -> L29
            throw r7     // Catch: java.lang.Exception -> L29
        L83:
            tui r9 = defpackage.jdr.a
            tuv r9 = r9.f()
            tug r9 = (defpackage.tug) r9
            tuv r9 = r9.i(r7)
            r0 = 105(0x69, float:1.47E-43)
            java.lang.String r1 = "OfflineControllerImpl.kt"
            java.lang.String r2 = "com/google/android/apps/googletv/app/player/offline/OfflineControllerImpl"
            java.lang.String r3 = "downloadManifest"
            tuv r9 = r9.j(r2, r3, r0, r1)
            tug r9 = (defpackage.tug) r9
            ksy r8 = (defpackage.ksy) r8
            java.lang.String r0 = "Failed to download manifest for assetId: %s"
            java.lang.String r8 = r8.b
            r9.v(r0, r8)
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r9 = r7.getMessage()
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r0 = "Network or manifest error: "
            java.lang.String r9 = r0.concat(r9)
            r8.<init>(r9, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jdr.b(android.content.Context, ksy, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.ksy r10, defpackage.yih r11) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jdr.c(ksy, yih):java.lang.Object");
    }

    public final Object d(Context context, ksy ksyVar, enr enrVar, ebf ebfVar) {
        etn etnVarA = a(ksyVar);
        if (etnVarA == null || etnVarA.b != 3) {
            try {
                jec jecVar = this.e;
                gsf gsfVarF = enrVar.f(0);
                gsfVarF.getClass();
                nuh nuhVar = jecVar.d;
                eqb eqbVarA = jecVar.a(ksyVar);
                nuhVar.m(-4000);
                try {
                    egc egcVarF = jecVar.c.f(ksyVar);
                    egg eggVar = new egg();
                    eggVar.a = egcVarF;
                    eggVar.d = lmx.b(jecVar.a, jecVar.b);
                    eggVar.e = nuhVar;
                    eggVar.e(new jdy(egcVarF));
                    eggVar.f();
                    eggVar.b = new eer() { // from class: jdz
                        @Override // defpackage.eer
                        public final ees a() {
                            return new efh();
                        }
                    };
                    dze dzeVarE = clw.E(eggVar.c(), gsfVarF);
                    byte[] bArrC = dzeVarE != null ? eqbVarA.c(dzeVarE) : null;
                    eqbVarA.a();
                    jecVar.d.p(-4000);
                    jeb jebVar = new jeb(ksyVar, this, 1);
                    String str = ksyVar.b;
                    int iAU = a.aU(hju.t(ksyVar).c);
                    if (iAU == 0) {
                        iAU = 1;
                    }
                    our ourVar = new our(str, qtl.au(iAU));
                    ouy ouyVar = this.d;
                    yfo yfoVar = this.c;
                    ove oveVar = new ove(jebVar, new ovi(ourVar, ouyVar, yfoVar));
                    dzl dzlVar = new dzl();
                    String str2 = ksyVar.c;
                    dzlVar.d(str2);
                    dzlVar.b(str2);
                    dzy dzyVarA = dzlVar.a();
                    ovm ovmVar = ovm.a;
                    lfn lfnVar = this.g;
                    etx etxVar = new etx(dzyVarA, ovm.a(context, enrVar, null, null, tst.h(Integer.valueOf(lfnVar.E())), tst.h(Boolean.valueOf(lfnVar.cs())), yfoVar, oveVar, this.m.f(ksyVar), bArrC), ebfVar, new dhq(new eig(context).a(edt.L(), new eie(), new eif(), new eyf() { // from class: eic
                        @Override // defpackage.eyf
                        public final void cK(ecb ecbVar) {
                        }

                        @Override // defpackage.eyf
                        public final /* synthetic */ void cL(List list) {
                        }
                    }, new etj() { // from class: eid
                        @Override // defpackage.etj
                        public final void cN(ead eadVar) {
                        }
                    })));
                    jdq jdqVar = new jdq(this, enrVar, bArrC, ksyVar, context);
                    a.ab(etxVar.m == null);
                    etxVar.m = jdqVar;
                    etxVar.i = new etw(etxVar.c, etxVar);
                } catch (Throwable th) {
                    eqbVarA.a();
                    jecVar.d.p(-4000);
                    throw th;
                }
            } catch (eow e) {
                throw new IOException("Failed to get DRM license: No network or DRM server issue.", e);
            } catch (Exception e2) {
                throw new IOException("Failed to start download due to unexpected error.", e2);
            }
        }
        return ygi.a;
    }
}
