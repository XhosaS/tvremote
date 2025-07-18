package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rmv {
    public final boolean a;
    public final String b;
    public final abvo c;
    public final yzq d;
    public final yyr e;
    public final rmu f;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public rmv(defpackage.rho r7, defpackage.rmu r8) {
        /*
            r6 = this;
            r6.<init>()
            rhk r0 = r7.b
            yzw r0 = r0.b
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto L35
            rhg r0 = defpackage.rhg.a
            rhg r2 = r7.c
            r3 = 1
            if (r0 != r2) goto L16
            goto L36
        L16:
            if (r2 != 0) goto L19
            goto L35
        L19:
            java.lang.Class r4 = r0.getClass()
            java.lang.Class r5 = r2.getClass()
            if (r4 == r5) goto L24
            goto L35
        L24:
            abza r4 = defpackage.abza.a
            java.lang.Class r5 = r0.getClass()
            abzj r4 = r4.a(r5)
            boolean r0 = r4.k(r0, r2)
            if (r0 == 0) goto L35
            goto L36
        L35:
            r3 = r1
        L36:
            r6.a = r3
            rhg r0 = r7.c
            java.lang.String r2 = r0.b
            r6.b = r2
            abvo r2 = r0.c
            r6.c = r2
            java.lang.String r2 = r0.d
            long r2 = r0.e
            java.util.Map r0 = r7.c()
            if (r0 == 0) goto L55
            java.util.Set r0 = r0.keySet()
            yzq r0 = defpackage.yzq.o(r0)
            goto L57
        L55:
            zcp r0 = defpackage.zcp.b
        L57:
            r6.d = r0
            rhk r0 = r7.a()
            yzw r0 = r0.b
            r2 = r0
            zcq r2 = (defpackage.zcq) r2
            yyk r2 = r2.e
            int r2 = r2.size()
            int r2 = r2 + 3
            yyn r2 = defpackage.yyr.h(r2)
            zdl r0 = r0.iterator()
        L72:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L8a
            java.lang.Object r3 = r0.next()
            rhj r3 = (defpackage.rhj) r3
            java.lang.String r4 = r3.c()
            java.lang.Object r3 = r3.b()
            r2.c(r4, r3)
            goto L72
        L8a:
            rhg r7 = r7.c
            java.lang.String r0 = r7.d
            java.lang.String r3 = "__phenotype_server_token"
            r2.c(r3, r0)
            java.lang.String r0 = r7.b
            java.lang.String r3 = "__phenotype_snapshot_token"
            r2.c(r3, r0)
            long r3 = r7.e
            java.lang.Long r7 = java.lang.Long.valueOf(r3)
            java.lang.String r0 = "__phenotype_configuration_version"
            r2.c(r0, r7)
            yyr r7 = r2.a(r1)
            r6.e = r7
            r6.f = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rmv.<init>(rho, rmu):void");
    }

    public rmv(rmy rmyVar, rmu rmuVar) {
        boolean zK;
        abvo abvoVar;
        String str;
        rmy rmyVar2 = rmy.a;
        if (rmyVar2 == rmyVar) {
            zK = true;
        } else {
            zK = (rmyVar != null && rmyVar2.getClass() == rmyVar.getClass()) ? abza.a.a(rmyVar2.getClass()).k(rmyVar2, rmyVar) : false;
        }
        this.a = zK;
        this.b = rmyVar.c;
        this.c = rmyVar.d;
        String str2 = rmyVar.e;
        long j = rmyVar.f;
        this.d = zcp.b;
        yyn yynVarH = yyr.h(rmyVar.g.size() + 3);
        for (rna rnaVar : rmyVar.g) {
            int i = rnaVar.c;
            int i2 = i != 0 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 6 ? 0 : 5 : 4 : 3 : 2 : 1 : 6;
            if (i2 == 0) {
                throw null;
            }
            int i3 = i2 - 1;
            if (i3 == 0) {
                yynVarH.c(rnaVar.e, Long.valueOf(i == 2 ? ((Long) rnaVar.d).longValue() : 0L));
            } else if (i3 == 1) {
                yynVarH.c(rnaVar.e, Boolean.valueOf(i == 3 ? ((Boolean) rnaVar.d).booleanValue() : false));
            } else if (i3 == 2) {
                yynVarH.c(rnaVar.e, Double.valueOf(i == 4 ? ((Double) rnaVar.d).doubleValue() : 0.0d));
            } else if (i3 == 3) {
                String str3 = rnaVar.e;
                if (i == 5) {
                    str = (String) rnaVar.d;
                } else {
                    str = "";
                }
                yynVarH.c(str3, str);
            } else if (i3 == 4) {
                String str4 = rnaVar.e;
                if (i == 6) {
                    abvoVar = (abvo) rnaVar.d;
                } else {
                    abvoVar = abvo.b;
                }
                yynVarH.c(str4, abvoVar.B());
            }
        }
        yynVarH.c("__phenotype_server_token", rmyVar.e);
        yynVarH.c("__phenotype_snapshot_token", rmyVar.c);
        yynVarH.c("__phenotype_configuration_version", Long.valueOf(rmyVar.f));
        this.e = yynVarH.a(false);
        this.f = rmuVar;
    }
}
