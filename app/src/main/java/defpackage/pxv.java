package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class pxv {
    public final Context a;
    public final pkn b;
    public final pxy c;
    public final qay d;
    public final ueg e;
    public final yqt f;
    public final yqt g;
    public final qbv h;
    public final phg i;
    public final yqt j;
    public final Executor k;

    public pxv(Context context, pkn pknVar, pxy pxyVar, ueg uegVar, qay qayVar, yqt yqtVar, yqt yqtVar2, qbv qbvVar, phg phgVar, yqt yqtVar3, Executor executor) {
        this.a = context;
        this.b = pknVar;
        this.c = pxyVar;
        this.e = uegVar;
        this.d = qayVar;
        this.f = yqtVar;
        this.g = yqtVar2;
        this.h = qbvVar;
        this.i = phgVar;
        this.j = yqtVar3;
        this.k = executor;
    }

    public final zyd a() {
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                Context context = this.a;
                int i = ueu.a;
                this.e.f(uet.a("*.lease", context.getPackageName(), 0L));
                this.h.k(1077);
            } catch (ufx unused) {
                int i2 = qce.a;
            } catch (IOException e) {
                qce.g(e, "%s: Failed to release the leases in the android shared storage", "SharedFileManager");
                this.h.k(1078);
            }
        }
        try {
            this.e.j(qdx.a(this.a, this.j));
        } catch (IOException unused2) {
            this.b.a();
        }
        return zxy.a;
    }

    public final zyd b(final pjf pjfVar, final String str, final int i, final long j, final String str2, final piy piyVar, final phu phuVar, final pie pieVar, final pim pimVar, final int i2, final List list, final abuy abuyVar) {
        return zuz.h(e(pjfVar), wyo.c(new zvi() { // from class: pwv
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                pjj pjjVar = (pjj) obj;
                piw piwVarB = piw.b(pjjVar.e);
                if (piwVarB == null) {
                    piwVarB = piw.NONE;
                }
                if (piwVarB == piw.DOWNLOAD_COMPLETE) {
                    return zxy.a;
                }
                final pjf pjfVar2 = pjfVar;
                final pji pjiVar = new pji();
                pjiVar.B(pjjVar);
                int iA = phy.a(pjfVar2.f);
                if (iA == 0) {
                    iA = 1;
                }
                final abuy abuyVar2 = abuyVar;
                final List list2 = list;
                final int i3 = i2;
                final pim pimVar2 = pimVar;
                final String str3 = str2;
                final long j2 = j;
                final int i4 = i;
                final piy piyVar2 = piyVar;
                final pie pieVar2 = pieVar;
                final phu phuVar2 = phuVar;
                String str4 = str;
                final pxv pxvVar = this.a;
                final zyd zydVarI = pxvVar.i(iA, str4, phuVar2.g);
                qfr qfrVarC = qfr.c(zydVarI);
                zvi zviVar = new zvi() { // from class: pxh
                    @Override // defpackage.zvi
                    public final zyd a(Object obj2) {
                        pji pjiVar2 = pjiVar;
                        piw piwVar = piw.DOWNLOAD_IN_PROGRESS;
                        if ((pjiVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            pjiVar2.y();
                        }
                        pjf pjfVar3 = pjfVar2;
                        pxv pxvVar2 = pxvVar;
                        pjj pjjVar2 = (pjj) pjiVar2.b;
                        pjj pjjVar3 = pjj.a;
                        pjjVar2.e = piwVar.h;
                        pjjVar2.c |= 2;
                        return pxvVar2.c.h(pjfVar3, (pjj) pjiVar2.v());
                    }
                };
                Executor executor = pxvVar.k;
                return qfrVarC.g(zviVar, executor).g(new zvi() { // from class: pxi
                    @Override // defpackage.zvi
                    public final zyd a(Object obj2) {
                        pie pieVar3;
                        Uri uri = (Uri) zxn.o(zydVarI);
                        pxv pxvVar2 = pxvVar;
                        piy piyVar3 = piyVar2;
                        int i5 = i4;
                        int i6 = i3;
                        long j3 = j2;
                        List list3 = list2;
                        phu phuVar3 = phuVar2;
                        pjf pjfVar3 = pjfVar2;
                        String str5 = str3;
                        pim pimVar3 = pimVar2;
                        abuy abuyVar3 = abuyVar2;
                        yqt yqtVar = pxvVar2.f;
                        if (!yqtVar.g() || (pieVar3 = pieVar2) == null) {
                            pxy pxyVar = pxvVar2.c;
                            ueg uegVar = pxvVar2.e;
                            int iA2 = phy.a(pjfVar3.f);
                            qal qalVar = new qal(pxyVar, uegVar, phuVar3, iA2 != 0 ? iA2 : 1, pxvVar2.h, piyVar3, i5, j3, str5, pxvVar2.i, pxvVar2.k);
                            pxvVar2.g(piyVar3, uri);
                            return pxvVar2.d.c(pjfVar3.e, piyVar3, i5, j3, str5, uri, phuVar3.d, phuVar3.e, pimVar3, qalVar, i6, list3, abuyVar3);
                        }
                        Context context = pxvVar2.a;
                        pxy pxyVar2 = pxvVar2.c;
                        ueg uegVar2 = pxvVar2.e;
                        pkn pknVar = pxvVar2.b;
                        int iA3 = phy.a(pjfVar3.f);
                        qae qaeVar = new qae(context, pxyVar2, uegVar2, pknVar, phuVar3, iA3 != 0 ? iA3 : 1, (pkx) yqtVar.c(), pieVar3, pxvVar2.h, piyVar3, i5, j3, str5, pxvVar2.j, pxvVar2.i, pxvVar2.k);
                        pxvVar2.g(piyVar3, uri);
                        return pxvVar2.d.c(pjfVar3.e, piyVar3, i5, j3, str5, uri, pieVar3.c, pieVar3.d, pimVar3, qaeVar, i6, list3, abuyVar3);
                    }
                }, executor);
            }
        }), this.k);
    }

    public final zyd c(final pjf pjfVar) {
        zyd zydVarD = d(new zdd(pjfVar));
        yqi yqiVar = new yqi() { // from class: pxj
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return (Uri) ((yyr) obj).get(pjfVar);
            }
        };
        return zuz.g(zydVarD, wyo.a(yqiVar), zwk.a);
    }

    final zyd d(final yzq yzqVar) {
        return qfr.c(this.c.f(yzqVar)).g(new zvi() { // from class: pxc
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                yyr yyrVar = (yyr) obj;
                yyn yynVar = new yyn(4);
                zdl it = yzqVar.iterator();
                while (it.hasNext()) {
                    pjf pjfVar = (pjf) it.next();
                    if (!yyrVar.containsKey(pjfVar)) {
                        qce.d("%s: getOnDeviceUris called on file that doesn't exist. Key = %s!", "SharedFileManager", pjfVar);
                        return zxn.g(new pxw());
                    }
                    pxv pxvVar = this.a;
                    pjj pjjVar = (pjj) yyrVar.get(pjfVar);
                    int iA = phy.a(pjfVar.f);
                    if (iA == 0) {
                        iA = 1;
                    }
                    Uri uriE = qdx.e(pxvVar.a, iA, pjjVar.d, pjjVar.h, pxvVar.b, pxvVar.j, pjjVar.f);
                    if (uriE != null) {
                        yynVar.c(pjfVar, uriE);
                    }
                }
                return zxn.h(yynVar.a(false));
            }
        }, this.k);
    }

    final zyd e(final pjf pjfVar) {
        return zuz.h(this.c.e(pjfVar), wyo.c(new zvi() { // from class: pwy
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                pjj pjjVar = (pjj) obj;
                if (pjjVar != null) {
                    return zxn.h(pjjVar);
                }
                qce.d("%s: getSharedFile called on file that doesn't exist! Key = %s", "SharedFileManager", pjfVar);
                return zxn.g(new pxw());
            }
        }), this.k);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final defpackage.zyd f(final defpackage.piy r20, final int r21, final long r22, final java.lang.String r24, final defpackage.phu r25, final defpackage.pjf r26, final defpackage.pim r27, final int r28, final java.util.List r29, final defpackage.abuy r30) {
        /*
            r19 = this;
            r1 = r19
            r6 = r25
            r8 = r26
            java.lang.String r0 = r6.d
            int r0 = defpackage.qce.a
            java.lang.String r0 = r6.d
            java.lang.String r2 = "inlinefile"
            boolean r0 = r0.startsWith(r2)
            if (r0 == 0) goto L29
            pha r0 = defpackage.phc.a()
            phb r2 = defpackage.phb.INVALID_INLINE_FILE_URL_SCHEME
            r0.a = r2
            java.lang.String r2 = "downloading a file with an inlinefile scheme is not supported, use importFiles instead."
            r0.b = r2
            phc r0 = r0.a()
            zyd r0 = defpackage.zxn.g(r0)
            return r0
        L29:
            zyd r2 = r1.e(r8)
            int r0 = r8.f
            int r0 = defpackage.phy.a(r0)
            r3 = 1
            if (r0 != 0) goto L37
            r0 = r3
        L37:
            android.content.Context r4 = r1.a
            pkn r5 = r1.b
            ptm r4 = defpackage.ptn.a(r4, r5)
            int r4 = r4.d
            ptm r5 = defpackage.ptm.USE_CHECKSUM_ONLY
            int r5 = r5.d
            r7 = 0
            if (r4 < r5) goto L5d
            yqt r4 = r1.f
            boolean r5 = r4.g()
            if (r5 == 0) goto L5d
            java.lang.Object r4 = r4.c()
            pkx r4 = (defpackage.pkx) r4
            abxs r4 = r6.l
            zyd r0 = r1.h(r4, r7, r0)
            goto L5f
        L5d:
            zyd r0 = defpackage.zxy.a
        L5f:
            r4 = 2
            zyd[] r5 = new defpackage.zyd[r4]
            r5[r7] = r2
            r5[r3] = r0
            qfs r5 = defpackage.qft.d(r5)
            pxk r9 = new pxk
            r9.<init>()
            zwk r10 = defpackage.zwk.a
            zyd r5 = r5.a(r9, r10)
            pxl r9 = new pxl
            r9.<init>()
            java.util.concurrent.Executor r11 = r1.k
            zvi r9 = defpackage.wyo.c(r9)
            zyd r9 = defpackage.zuz.h(r5, r9, r11)
            r12 = 4
            zyd[] r12 = new defpackage.zyd[r12]
            r12[r7] = r2
            r12[r3] = r0
            r12[r4] = r5
            r3 = 3
            r12[r3] = r9
            qfs r3 = defpackage.qft.d(r12)
            pxm r4 = new pxm
            r4.<init>()
            zyd r3 = r3.b(r4, r10)
            qfr r3 = defpackage.qfr.c(r3)
            r4 = r3
            r3 = r0
            pxn r0 = new pxn
            r7 = r20
            r12 = r24
            r13 = r27
            r14 = r28
            r15 = r29
            r16 = r30
            r18 = r4
            r4 = r5
            r5 = r9
            r17 = r11
            r9 = r21
            r10 = r22
            r0.<init>()
            r2 = r0
            r0 = r17
            r4 = r18
            qfr r2 = r4.g(r2, r0)
            pxo r3 = new pxo
            r3.<init>()
            java.lang.Class<pxw> r4 = defpackage.pxw.class
            qfr r0 = r2.b(r4, r3, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pxv.f(piy, int, long, java.lang.String, phu, pjf, pim, int, java.util.List, abuy):zyd");
    }

    public final void g(piy piyVar, Uri uri) {
        yqt yqtVar = this.g;
        if (yqtVar.g()) {
            try {
                long jA = this.e.a(uri);
                if (jA > 0) {
                    ((qfc) yqtVar.c()).g(piyVar.d, jA);
                }
            } catch (IOException unused) {
            }
        }
    }

    public final zyd h(final List list, final int i, final int i2) {
        if (i == list.size()) {
            return zxy.a;
        }
        final pie pieVar = (pie) list.get(i);
        int iA = pid.a(pieVar.f);
        if (iA == 0) {
            iA = 1;
        }
        if (iA != 2) {
            return h(list, i + 1, i2);
        }
        pjf pjfVar = pjf.a;
        pje pjeVar = new pje();
        phm phmVar = pieVar.g;
        if (phmVar == null) {
            phmVar = phm.a;
        }
        String str = phmVar.b;
        if ((pjeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            pjeVar.y();
        }
        pjf pjfVar2 = (pjf) pjeVar.b;
        str.getClass();
        pjfVar2.b |= 4;
        pjfVar2.e = str;
        if ((pjeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            pjeVar.y();
        }
        pjf pjfVar3 = (pjf) pjeVar.b;
        pjfVar3.f = i2 - 1;
        pjfVar3.b |= 8;
        final pjf pjfVar4 = (pjf) pjeVar.v();
        return zuz.h(this.c.e(pjfVar4), wyo.c(new zvi() { // from class: pxp
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                pxv pxvVar = this.a;
                pjj pjjVar = (pjj) obj;
                if (pjjVar != null) {
                    piw piwVarB = piw.b(pjjVar.e);
                    if (piwVarB == null) {
                        piwVarB = piw.NONE;
                    }
                    if (piwVarB == piw.DOWNLOAD_COMPLETE) {
                        pjf pjfVar5 = pjfVar4;
                        Context context = pxvVar.a;
                        int iA2 = phy.a(pjfVar5.f);
                        if (iA2 == 0) {
                            iA2 = 1;
                        }
                        if (qdx.e(context, iA2, pjjVar.d, pjfVar5.e, pxvVar.b, pxvVar.j, false) != null) {
                            return zxn.h(pieVar);
                        }
                    }
                }
                return pxvVar.h(list, i + 1, i2);
            }
        }), this.k);
    }

    public final zyd i(int i, String str, String str2) {
        Uri uriE = qdx.e(this.a, i, str, str2, this.b, this.j, false);
        if (uriE != null) {
            return zxn.h(uriE);
        }
        qce.c("%s: Failed to get file uri!", "SharedFileManager");
        pha phaVarA = phc.a();
        phaVarA.a = phb.UNABLE_TO_CREATE_FILE_URI_ERROR;
        return zxn.g(phaVarA.a());
    }
}
