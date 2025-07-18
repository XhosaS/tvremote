package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import j$.time.Instant;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class prj {
    public final Context a;
    public final qbv b;
    public final pkn c;
    public final prk d;
    public final pxv e;
    public final ueg f;
    public final yqt g;
    public final Executor h;
    public final yqt i;
    public final yqt j;
    public final qba k;
    public final phg l;
    public final qfq m = new qfq();
    public final pmq n;
    private final Executor o;

    public prj(Context context, qbv qbvVar, pkn pknVar, prk prkVar, pxv pxvVar, pmq pmqVar, yqt yqtVar, Executor executor, yqt yqtVar2, ueg uegVar, yqt yqtVar3, qba qbaVar, phg phgVar, Executor executor2) {
        this.a = context;
        this.b = qbvVar;
        this.c = pknVar;
        this.d = prkVar;
        this.e = pxvVar;
        this.n = pmqVar;
        this.g = yqtVar;
        this.h = executor;
        this.o = executor2;
        this.i = yqtVar2;
        this.f = uegVar;
        this.j = yqtVar3;
        this.k = qbaVar;
        this.l = phgVar;
    }

    public static yqt a(pia piaVar, pia piaVar2) {
        if (piaVar2.s != piaVar.s) {
            return yqt.i(zsj.NEW_BUILD_ID);
        }
        if (!piaVar2.t.equals(piaVar.t)) {
            return yqt.i(zsj.NEW_VARIANT_ID);
        }
        if (piaVar2.g != piaVar.g) {
            return yqt.i(zsj.NEW_VERSION_NUMBER);
        }
        if (!q(piaVar, piaVar2)) {
            return yqt.i(zsj.DIFFERENT_FILES);
        }
        abuy abuyVar = piaVar2.h;
        if (abuyVar == null) {
            abuyVar = abuy.a;
        }
        abuy abuyVar2 = piaVar.h;
        if (abuyVar2 == null) {
            abuyVar2 = abuy.a;
        }
        if (abuyVar != abuyVar2 && (abuyVar2 == null || abuyVar.getClass() != abuyVar2.getClass() || !abza.a.a(abuyVar.getClass()).k(abuyVar, abuyVar2))) {
            return yqt.i(zsj.DIFFERENT_CUSTOM_METADATA);
        }
        if (piaVar2.k != piaVar.k) {
            return yqt.i(zsj.DIFFERENT_STALE_LIFETIME);
        }
        if (piaVar2.l != piaVar.l) {
            return yqt.i(zsj.DIFFERENT_EXPIRATION_DATE);
        }
        pim pimVar = piaVar2.m;
        if (pimVar == null) {
            pimVar = pim.a;
        }
        pim pimVar2 = piaVar.m;
        if (pimVar2 == null) {
            pimVar2 = pim.a;
        }
        if (pimVar != pimVar2 && (pimVar2 == null || pimVar.getClass() != pimVar2.getClass() || !abza.a.a(pimVar.getClass()).k(pimVar, pimVar2))) {
            return yqt.i(zsj.DIFFERENT_DOWNLOAD_CONDITIONS);
        }
        int iA = phy.a(piaVar2.j);
        if (iA == 0) {
            iA = 1;
        }
        int iA2 = phy.a(piaVar.j);
        if (iA2 == 0) {
            iA2 = 1;
        }
        if (iA != iA2) {
            return yqt.i(zsj.DIFFERENT_ALLOWED_READERS);
        }
        int iA3 = qfp.a(piaVar2.r);
        if (iA3 == 0) {
            iA3 = 1;
        }
        int iA4 = qfp.a(piaVar.r);
        if (iA3 != (iA4 != 0 ? iA4 : 1)) {
            return yqt.i(zsj.DIFFERENT_DOWNLOAD_POLICY);
        }
        ahwr ahwrVar = piaVar2.u;
        if (ahwrVar == null) {
            ahwrVar = ahwr.a;
        }
        ahwr ahwrVar2 = piaVar.u;
        if (ahwrVar2 == null) {
            ahwrVar2 = ahwr.a;
        }
        return (ahwrVar == ahwrVar2 || (ahwrVar2 != null && ahwrVar.getClass() == ahwrVar2.getClass() && abza.a.a(ahwrVar.getClass()).k(ahwrVar, ahwrVar2))) ? ypv.a : yqt.i(zsj.DIFFERENT_EXPERIMENT_INFO);
    }

    public static boolean q(pia piaVar, pia piaVar2) {
        return piaVar.o.equals(piaVar2.o);
    }

    public static boolean s(pjj pjjVar, long j) {
        return j > pjjVar.g;
    }

    public static void x(int i, qbv qbvVar, pia piaVar) {
        qbvVar.l(i, piaVar.e, piaVar.g, piaVar.s, piaVar.t);
    }

    public static void y(qbv qbvVar, pia piaVar, phu phuVar, int i) {
        zql zqlVar = zql.a;
        zqk zqkVar = new zqk();
        if ((zqkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqkVar.y();
        }
        zql zqlVar2 = (zql) zqkVar.b;
        zqlVar2.c = zrx.a(i);
        zqlVar2.b |= 1;
        String str = piaVar.e;
        if ((zqkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqkVar.y();
        }
        zql zqlVar3 = (zql) zqkVar.b;
        str.getClass();
        zqlVar3.b |= 2;
        zqlVar3.d = str;
        int i2 = piaVar.g;
        if ((zqkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqkVar.y();
        }
        zql zqlVar4 = (zql) zqkVar.b;
        zqlVar4.b |= 4;
        zqlVar4.e = i2;
        long j = piaVar.s;
        if ((zqkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqkVar.y();
        }
        zql zqlVar5 = (zql) zqkVar.b;
        zqlVar5.b |= 128;
        zqlVar5.i = j;
        String str2 = piaVar.t;
        if ((zqkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqkVar.y();
        }
        zql zqlVar6 = (zql) zqkVar.b;
        str2.getClass();
        zqlVar6.b |= 256;
        zqlVar6.j = str2;
        String str3 = phuVar.c;
        if ((zqkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqkVar.y();
        }
        zql zqlVar7 = (zql) zqkVar.b;
        str3.getClass();
        zqlVar7.b |= 8;
        zqlVar7.f = str3;
        qbvVar.e((zql) zqkVar.v());
    }

    final yyr b(pia piaVar) {
        yyn yynVar = new yyn(4);
        Uri uriC = qeg.c(this.a, this.i, piaVar);
        for (phu phuVar : piaVar.o) {
            yynVar.c(phuVar, qeg.b(uriC, phuVar));
        }
        return yynVar.a(false);
    }

    public final zqf c(pia piaVar) {
        zqf zqfVar = zqf.a;
        zqe zqeVar = new zqe();
        String str = piaVar.e;
        if ((zqeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqeVar.y();
        }
        zqf zqfVar2 = (zqf) zqeVar.b;
        str.getClass();
        zqfVar2.b |= 1;
        zqfVar2.c = str;
        String str2 = piaVar.f;
        if ((zqeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqeVar.y();
        }
        zqf zqfVar3 = (zqf) zqeVar.b;
        str2.getClass();
        zqfVar3.b |= 4;
        zqfVar3.e = str2;
        int i = piaVar.g;
        if ((zqeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqeVar.y();
        }
        zqf zqfVar4 = (zqf) zqeVar.b;
        zqfVar4.b |= 2;
        zqfVar4.d = i;
        long j = piaVar.s;
        if ((zqeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqeVar.y();
        }
        zqf zqfVar5 = (zqf) zqeVar.b;
        zqfVar5.b |= 64;
        zqfVar5.i = j;
        String str3 = piaVar.t;
        if ((zqeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqeVar.y();
        }
        zqf zqfVar6 = (zqf) zqeVar.b;
        str3.getClass();
        zqfVar6.b |= 128;
        zqfVar6.j = str3;
        return (zqf) zqeVar.v();
    }

    public final zyd d(pia piaVar) {
        if (!piaVar.n) {
            return zxy.a;
        }
        try {
            qeg.f(this.a, this.i, piaVar, this.f);
            final abxs abxsVar = piaVar.o;
            if (zag.b(abxsVar, new yqx() { // from class: pob
                @Override // defpackage.yqx
                public final boolean a(Object obj) {
                    int iA = phq.a(((phu) obj).m);
                    return iA != 0 && iA == 2;
                }
            }).g()) {
                return zxn.g(new UnsupportedOperationException("Preserve File Paths is invalid with Android Blob Sharing"));
            }
            final yyr yyrVarB = b(piaVar);
            zyd zydVarJ = j(piaVar);
            zvi zviVar = new zvi() { // from class: poc
                @Override // defpackage.zvi
                public final zyd a(Object obj) {
                    prj prjVar = this.a;
                    yyr yyrVar = yyrVarB;
                    yyr yyrVar2 = (yyr) obj;
                    for (phu phuVar : abxsVar) {
                        try {
                            Uri uri = (Uri) yyrVar.get(phuVar);
                            uri.getClass();
                            Uri uri2 = (Uri) yyrVar2.get(phuVar);
                            uri2.getClass();
                            Uri uri3 = Uri.parse(uri.toString().substring(0, uri.toString().lastIndexOf("/")));
                            ueg uegVar = prjVar.f;
                            if (!uegVar.h(uri3)) {
                                uegVar.d(uri3);
                            }
                            qes.b(prjVar.a, uri, uri2);
                        } catch (IOException | NullPointerException e) {
                            pha phaVarA = phc.a();
                            phaVarA.a = phb.UNABLE_TO_CREATE_SYMLINK_STRUCTURE;
                            phaVarA.b = "Unable to create symlink";
                            phaVarA.c = e;
                            return zxn.g(phaVarA.a());
                        }
                    }
                    return zxy.a;
                }
            };
            Executor executor = this.h;
            zyd zydVarH = zuz.h(zydVarJ, wyo.c(zviVar), executor);
            zxn.p(zydVarH, wyo.f(new prg(this, piaVar)), executor);
            return zydVarH;
        } catch (IOException e) {
            pha phaVarA = phc.a();
            phaVarA.a = phb.UNABLE_TO_REMOVE_SYMLINK_STRUCTURE;
            phaVarA.b = "Unable to cleanup symlink structure";
            phaVarA.c = e;
            return zxn.g(phaVarA.a());
        }
    }

    public final zyd e(pjj pjjVar, final phu phuVar, final pia piaVar) {
        if (pjjVar.f) {
            return zxn.h(prh.FILE_ALREADY_SHARED);
        }
        if (phuVar.o.isEmpty()) {
            return zxn.h(prh.FILE_SHARING_CHECKSUM_NOT_PROVIDED);
        }
        final Context context = this.a;
        final String str = phuVar.o;
        final ueg uegVar = this.f;
        zyd zydVarL = zxn.l(wyo.b(new zvh() { // from class: qdv
            /* JADX WARN: Removed duplicated region for block: B:15:0x008c  */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0095  */
            @Override // defpackage.zvh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final defpackage.zyd a() throws defpackage.qdw {
                /*
                    r12 = this;
                    java.lang.String r0 = ""
                    java.lang.String r1 = "AndroidSharingUtil"
                    android.content.Context r2 = r1
                    java.lang.String r3 = r2
                    ueg r4 = r3
                    phu r5 = r4
                    pia r6 = r5
                    r7 = 3
                    r8 = 2
                    r9 = 1
                    r10 = 0
                    android.net.Uri r2 = defpackage.qdx.c(r2, r3)     // Catch: java.io.IOException -> L1c defpackage.ufu -> L40 defpackage.ufx -> L67
                    boolean r1 = r4.h(r2)     // Catch: java.io.IOException -> L1c defpackage.ufu -> L40 defpackage.ufx -> L67
                    goto L8a
                L1c:
                    java.lang.String r0 = r5.c
                    java.lang.String r2 = r6.e
                    java.lang.Object[] r3 = new java.lang.Object[r7]
                    r3[r10] = r1
                    r3[r9] = r0
                    r3[r8] = r2
                    java.lang.String r0 = "%s: Failed to check existence in the shared storage for file %s, file group %s"
                    defpackage.qce.e(r0, r3)
                    java.lang.String r0 = r5.c
                    java.lang.String r1 = r6.e
                    java.lang.Object[] r2 = new java.lang.Object[r8]
                    r2[r10] = r0
                    r2[r9] = r1
                    java.lang.String r0 = "Error while checking if file %s, group %s, exists in the shared blob storage."
                    java.lang.String r0 = java.lang.String.format(r0, r2)
                    r1 = 19
                    goto L63
                L40:
                    java.lang.String r0 = r5.c
                    java.lang.String r2 = r6.e
                    java.lang.Object[] r3 = new java.lang.Object[r7]
                    r3[r10] = r1
                    r3[r9] = r0
                    r3[r8] = r2
                    java.lang.String r0 = "%s: Malformed lease uri file %s, file group %s"
                    defpackage.qce.e(r0, r3)
                    java.lang.String r0 = r5.c
                    java.lang.String r1 = r6.e
                    java.lang.Object[] r2 = new java.lang.Object[r8]
                    r2[r10] = r0
                    r2[r9] = r1
                    java.lang.String r0 = "Malformed blob Uri for file %s, group %s"
                    java.lang.String r0 = java.lang.String.format(r0, r2)
                    r1 = 17
                L63:
                    r11 = r10
                    r10 = r1
                    r1 = r11
                    goto L8a
                L67:
                    r1 = move-exception
                    java.lang.String r2 = r1.getMessage()
                    boolean r2 = android.text.TextUtils.isEmpty(r2)
                    if (r2 == 0) goto L73
                    goto L77
                L73:
                    java.lang.String r0 = r1.getMessage()
                L77:
                    java.lang.String r1 = r5.c
                    java.lang.String r1 = r6.e
                    int r1 = defpackage.qce.a
                    java.lang.String r1 = "UnsupportedFileStorageOperation was thrown: "
                    java.lang.String r0 = java.lang.String.valueOf(r0)
                    java.lang.String r0 = r1.concat(r0)
                    r1 = 24
                    goto L63
                L8a:
                    if (r10 != 0) goto L95
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
                    zyd r0 = defpackage.zxn.h(r0)
                    return r0
                L95:
                    qdw r1 = new qdw
                    r1.<init>(r10, r0)
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.qdv.a():zyd");
            }
        }), this.o);
        yqi yqiVar = new yqi() { // from class: pqo
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return ((Boolean) obj).booleanValue() ? prh.FILE_ALREADY_EXISTS_IN_ANDROID_SHARED_STORAGE : prh.FILE_NOT_SHARED_IN_ANDROID_SHARED_STORAGE;
            }
        };
        return zuz.g(zydVarL, wyo.a(yqiVar), this.h);
    }

    public final zyd f(piy piyVar, boolean z) {
        pix pixVar = new pix();
        pixVar.B(piyVar);
        if ((pixVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            pixVar.y();
        }
        piy piyVar2 = (piy) pixVar.b;
        piy piyVar3 = piy.a;
        piyVar2.c |= 8;
        piyVar2.g = z;
        return this.d.g((piy) pixVar.v());
    }

    public final zyd g(pia piaVar) {
        return h(piaVar, false, false, 0, piaVar.o.size());
    }

    public final zyd h(final pia piaVar, final boolean z, final boolean z2, final int i, final int i2) {
        if (i >= i2) {
            return z ? zxn.h(pri.FAILED) : z2 ? zxn.h(pri.PENDING) : zxn.h(pri.DOWNLOADED);
        }
        final phu phuVar = (phu) piaVar.o.get(i);
        return qeg.k(phuVar) ? h(piaVar, z, z2, i + 1, i2) : qfr.c(i(phuVar, piaVar)).g(new zvi() { // from class: pqx
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                prj prjVar = this.a;
                pia piaVar2 = piaVar;
                boolean z3 = z;
                boolean z4 = z2;
                int i3 = i + 1;
                phu phuVar2 = phuVar;
                int i4 = i2;
                piw piwVar = (piw) obj;
                if (piwVar == piw.DOWNLOAD_COMPLETE) {
                    String str = phuVar2.c;
                    int i5 = qce.a;
                    return prjVar.h(piaVar2, z3, z4, i3, i4);
                }
                if (piwVar == piw.SUBSCRIBED || piwVar == piw.DOWNLOAD_IN_PROGRESS) {
                    String str2 = phuVar2.c;
                    int i6 = qce.a;
                    return prjVar.h(piaVar2, z3, true, i3, i4);
                }
                String str3 = phuVar2.c;
                int i7 = qce.a;
                return prjVar.h(piaVar2, true, z4, i3, i4);
            }
        }, this.h);
    }

    public final zyd i(phu phuVar, final pia piaVar) {
        int iA = phy.a(piaVar.j);
        if (iA == 0) {
            iA = 1;
        }
        pjf pjfVarA = pxx.a(phuVar, iA);
        pxv pxvVar = this.e;
        return qfr.c(zuz.h(pxvVar.e(pjfVarA), wyo.c(new zvi() { // from class: pxr
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                piw piwVarB = piw.b(((pjj) obj).e);
                if (piwVarB == null) {
                    piwVarB = piw.NONE;
                }
                return zxn.h(piwVarB);
            }
        }), pxvVar.k)).b(pxw.class, new zvi() { // from class: pnv
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                qce.d("%s: Encountered SharedFileMissingException for group: %s", "FileGroupManager", piaVar.e);
                this.a.c.a();
                return zxn.h(piw.NONE);
            }
        }, this.h);
    }

    final zyd j(pia piaVar) {
        final yyn yynVar = new yyn(4);
        yyn yynVar2 = new yyn(4);
        for (phu phuVar : piaVar.o) {
            if (qeg.k(phuVar)) {
                yynVar.c(phuVar, Uri.parse(phuVar.d));
            } else {
                int iA = phy.a(piaVar.j);
                if (iA == 0) {
                    iA = 1;
                }
                yynVar2.c(phuVar, pxx.a(phuVar, iA));
            }
        }
        final yyr yyrVarA = yynVar2.a(false);
        return qfr.c(this.e.d(yzq.o(yyrVarA.values()))).e(new yqi() { // from class: pqq
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                yyr yyrVar = (yyr) obj;
                zdl it = yyrVarA.entrySet().iterator();
                while (true) {
                    yyn yynVar3 = yynVar;
                    if (!it.hasNext()) {
                        return yynVar3.a(false);
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    pjf pjfVar = (pjf) entry.getValue();
                    if (pjfVar != null && yyrVar.containsKey(pjfVar)) {
                        yynVar3.c((phu) entry.getKey(), (Uri) yyrVar.get(pjfVar));
                    }
                }
            }
        }, this.h);
    }

    public final zyd k(final pia piaVar, final phu phuVar, final pjf pjfVar) {
        return zud.h(this.e.e(pjfVar), pxw.class, wyo.c(new zvi() { // from class: pqe
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                qce.d("%s: Shared file not found, newFileKey = %s", "FileGroupManager", pjfVar);
                prj prjVar = this.a;
                prjVar.c.a();
                prj.y(prjVar.b, piaVar, phuVar, 26);
                return zxn.g((pxw) obj);
            }
        }), this.h);
    }

    public final zyd l(final zvi zviVar) {
        final ArrayList arrayList = new ArrayList();
        return zuz.h(this.d.d(), wyo.c(new zvi() { // from class: pqk
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                Iterator it = ((List) obj).iterator();
                while (true) {
                    List list = arrayList;
                    prj prjVar = this.a;
                    if (!it.hasNext()) {
                        return qft.a(list).a(new Callable() { // from class: pqi
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return null;
                            }
                        }, prjVar.h);
                    }
                    final zvi zviVar2 = zviVar;
                    final piy piyVar = (piy) it.next();
                    zyd zydVarG = prjVar.d.g(piyVar);
                    zvi zviVar3 = new zvi() { // from class: pqh
                        @Override // defpackage.zvi
                        public final zyd a(Object obj2) {
                            pia piaVar = (pia) obj2;
                            if (piaVar == null) {
                                return zxy.a;
                            }
                            return zviVar2.a(new pyh(piyVar, piaVar));
                        }
                    };
                    list.add(zuz.h(zydVarG, wyo.c(zviVar3), prjVar.h));
                }
            }
        }), this.h);
    }

    public final zyd m(piy piyVar, final phc phcVar, long j, String str) {
        zqf zqfVar = zqf.a;
        final zqe zqeVar = new zqe();
        String str2 = piyVar.d;
        if ((zqeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqeVar.y();
        }
        zqf zqfVar2 = (zqf) zqeVar.b;
        str2.getClass();
        zqfVar2.b |= 1;
        zqfVar2.c = str2;
        String str3 = piyVar.e;
        if ((zqeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqeVar.y();
        }
        zqf zqfVar3 = (zqf) zqeVar.b;
        str3.getClass();
        zqfVar3.b |= 4;
        zqfVar3.e = str3;
        if ((zqeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqeVar.y();
        }
        zqf zqfVar4 = (zqf) zqeVar.b;
        zqfVar4.b |= 64;
        zqfVar4.i = j;
        if ((zqeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            zqeVar.y();
        }
        zqf zqfVar5 = (zqf) zqeVar.b;
        str.getClass();
        zqfVar5.b |= 128;
        zqfVar5.j = str;
        prk prkVar = this.d;
        pix pixVar = new pix();
        pixVar.B(piyVar);
        if ((pixVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            pixVar.y();
        }
        piy piyVar2 = (piy) pixVar.b;
        piyVar2.c |= 8;
        piyVar2.g = false;
        return zuz.h(prkVar.g((piy) pixVar.v()), wyo.c(new zvi() { // from class: ppf
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                zqe zqeVar2 = zqeVar;
                pia piaVar = (pia) obj;
                if (piaVar != null) {
                    int i = piaVar.g;
                    if ((zqeVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        zqeVar2.y();
                    }
                    zqf zqfVar6 = (zqf) zqeVar2.b;
                    zqf zqfVar7 = zqf.a;
                    zqfVar6.b |= 2;
                    zqfVar6.d = i;
                }
                phc phcVar2 = phcVar;
                prj prjVar = this.a;
                int iB = zsb.b(phcVar2.a.aF);
                zqf zqfVar8 = (zqf) zqeVar2.v();
                int i2 = phcVar2.c - 1;
                int i3 = phcVar2.b;
                prjVar.b.p(iB, zqfVar8, zrz.a(i2));
                return zxy.a;
            }
        }), this.h);
    }

    public final zyd n(final pia piaVar, final int i, final int i2) {
        if (i >= i2) {
            return zxn.h(true);
        }
        phu phuVar = (phu) piaVar.o.get(i);
        if (qeg.k(phuVar)) {
            return n(piaVar, i + 1, i2);
        }
        int iA = phy.a(piaVar.j);
        final pjf pjfVarA = pxx.a(phuVar, iA != 0 ? iA : 1);
        final pxv pxvVar = this.e;
        return zuz.h(zuz.h(pxvVar.c.e(pjfVarA), wyo.c(new zvi() { // from class: pwx
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                if (((pjj) obj) != null) {
                    return zxn.h(true);
                }
                final pjf pjfVar = pjfVarA;
                pxv pxvVar2 = pxvVar;
                SharedPreferences sharedPreferencesA = qer.a(pxvVar2.a, "gms_icing_mdd_shared_file_manager_metadata", pxvVar2.j);
                long j = sharedPreferencesA.getLong("next_file_name_v2", System.currentTimeMillis());
                if (!sharedPreferencesA.edit().putLong("next_file_name_v2", 1 + j).commit()) {
                    qce.d("%s: Unable to update file name %s", "SharedFileManager", pjfVar);
                    return zxn.h(false);
                }
                String strL = a.l(j, "datadownloadfile_");
                pjj pjjVar = pjj.a;
                pji pjiVar = new pji();
                piw piwVar = piw.SUBSCRIBED;
                if ((pjiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    pjiVar.y();
                }
                pjj pjjVar2 = (pjj) pjiVar.b;
                pjjVar2.e = piwVar.h;
                pjjVar2.c |= 2;
                if ((pjiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    pjiVar.y();
                }
                pjj pjjVar3 = (pjj) pjiVar.b;
                pjjVar3.c = 1 | pjjVar3.c;
                pjjVar3.d = strL;
                return zuz.h(pxvVar2.c.h(pjfVar, (pjj) pjiVar.v()), wyo.c(new zvi() { // from class: pxt
                    @Override // defpackage.zvi
                    public final zyd a(Object obj2) {
                        if (((Boolean) obj2).booleanValue()) {
                            return zxn.h(true);
                        }
                        qce.d("%s: Unable to write back subscription for file entry with %s", "SharedFileManager", pjfVar);
                        return zxn.h(false);
                    }
                }), pxvVar2.k);
            }
        }), pxvVar.k), wyo.c(new zvi() { // from class: pog
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                pia piaVar2 = piaVar;
                if (!zBooleanValue) {
                    qce.d("%s: Subscribing to file failed for group: %s", "FileGroupManager", piaVar2.e);
                    return zxn.h(false);
                }
                return this.a.n(piaVar2, i + 1, i2);
            }
        }), this.h);
    }

    public final zyd o(final pia piaVar, final phu phuVar, final pjf pjfVar, final long j) {
        final pxv pxvVar = this.e;
        return zuz.h(zuz.h(pxvVar.e(pjfVar), wyo.c(new zvi() { // from class: pxa
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                pjj pjjVar = (pjj) obj;
                long j2 = pjjVar.g;
                long j3 = j;
                if (j3 <= j2) {
                    return zxn.h(true);
                }
                pji pjiVar = new pji();
                pjiVar.B(pjjVar);
                if ((pjiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    pjiVar.y();
                }
                pjf pjfVar2 = pjfVar;
                pxv pxvVar2 = pxvVar;
                pjj pjjVar2 = (pjj) pjiVar.b;
                pjjVar2.c |= 8;
                pjjVar2.g = j3;
                return pxvVar2.c.h(pjfVar2, (pjj) pjiVar.v());
            }
        }), pxvVar.k), wyo.c(new zvi() { // from class: pnp
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    pia piaVar2 = piaVar;
                    phu phuVar2 = phuVar;
                    prj prjVar = this.a;
                    qce.e("%s: Failed to set new state for file %s, filegroup %s", "FileGroupManager", phuVar2.c, piaVar2.e);
                    prj.y(prjVar.b, piaVar2, phuVar2, 14);
                }
                return zxy.a;
            }
        }), this.h);
    }

    public final void p(List list, piy piyVar) throws phc, pgc {
        qce.e("%s downloadFileGroup %s %s can't finish!", "FileGroupManager", piyVar.d, piyVar.e);
        pgc.b(list, piyVar.d);
        qce.c("%s: An unknown error has occurred during download", "FileGroupManager");
        pha phaVarA = phc.a();
        phaVarA.a = phb.UNKNOWN_ERROR;
        throw phaVarA.a();
    }

    public final boolean r(String str) throws PackageManager.NameNotFoundException {
        try {
            this.a.getPackageManager().getApplicationInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    final zyd t(piy piyVar, final pia piaVar, final zvi zviVar, final qbt qbtVar) {
        int i = qce.a;
        pix pixVar = new pix();
        pixVar.B(piyVar);
        if ((pixVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            pixVar.y();
        }
        piy piyVar2 = (piy) pixVar.b;
        piy piyVar3 = piy.a;
        piyVar2.c |= 8;
        piyVar2.g = true;
        final piy piyVar4 = (piy) pixVar.v();
        pix pixVar2 = new pix();
        pixVar2.B(piyVar);
        if ((pixVar2.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            pixVar2.y();
        }
        piy piyVar5 = (piy) pixVar2.b;
        piyVar5.c |= 8;
        piyVar5.g = false;
        final piy piyVar6 = (piy) pixVar2.v();
        phw phwVar = piaVar.d;
        if (phwVar == null) {
            phwVar = phw.a;
        }
        final boolean z = (phwVar.b & 4) != 0;
        long epochMilli = Instant.now().toEpochMilli();
        phw phwVar2 = piaVar.d;
        if (phwVar2 == null) {
            phwVar2 = phw.a;
        }
        phv phvVar = new phv();
        phvVar.B(phwVar2);
        if ((phvVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            phvVar.y();
        }
        phw phwVar3 = (phw) phvVar.b;
        phwVar3.b |= 4;
        phwVar3.e = epochMilli;
        phw phwVar4 = (phw) phvVar.v();
        phz phzVar = new phz();
        phzVar.B(piaVar);
        if ((Integer.MIN_VALUE & phzVar.b.memoizedSerializedSize) == 0) {
            phzVar.y();
        }
        pia piaVar2 = (pia) phzVar.b;
        phwVar4.getClass();
        piaVar2.d = phwVar4;
        piaVar2.c |= 1;
        final pia piaVar3 = (pia) phzVar.v();
        qfr qfrVarC = qfr.c(g(piaVar));
        zvi zviVar2 = new zvi() { // from class: pqc
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                final qbt qbtVar2 = qbtVar;
                final pia piaVar4 = piaVar;
                pri priVar = (pri) obj;
                pri priVar2 = pri.FAILED;
                if (priVar == priVar2) {
                    qbtVar2.a(1008, piaVar4);
                    return zxn.h(priVar2);
                }
                pri priVar3 = pri.PENDING;
                if (priVar == priVar3) {
                    qbtVar2.a(1007, piaVar4);
                    return zxn.h(priVar3);
                }
                final boolean z2 = z;
                final pia piaVar5 = piaVar3;
                final piy piyVar7 = piyVar4;
                zvi zviVar3 = zviVar;
                final piy piyVar8 = piyVar6;
                final prj prjVar = this.a;
                yqw.A(priVar == pri.DOWNLOADED);
                qfr qfrVarC2 = qfr.c(zviVar3.a(new pyh(piyVar8, piaVar4)));
                zvi zviVar4 = new zvi() { // from class: ppj
                    @Override // defpackage.zvi
                    public final zyd a(Object obj2) {
                        pgn pgnVar = (pgn) obj2;
                        if (pgnVar == pgn.SUCCESS) {
                            return zxy.a;
                        }
                        final piy piyVar9 = piyVar8;
                        pia piaVar6 = piaVar4;
                        qbt qbtVar3 = qbtVar2;
                        final prj prjVar2 = prjVar;
                        qbtVar3.a(1008, piaVar6);
                        zyd zydVarH = zxn.h(true);
                        if (pgnVar != pgn.FAILURE_KEEP_PENDING) {
                            zydVarH = prjVar2.d.i(piyVar9);
                        }
                        zvi zviVar5 = new zvi() { // from class: ppv
                            @Override // defpackage.zvi
                            public final zyd a(Object obj3) {
                                if (((Boolean) obj3).booleanValue()) {
                                    pha phaVarA = phc.a();
                                    phb phbVar = phb.CUSTOM_FILEGROUP_VALIDATION_FAILED;
                                    phaVarA.a = phbVar;
                                    phaVarA.b = phbVar.name();
                                    return zxn.g(phaVarA.a());
                                }
                                piy piyVar10 = piyVar9;
                                prj prjVar3 = prjVar2;
                                qce.e("%s: Failed to remove pending version for group: '%s'; account: '%s'", "FileGroupManager", piyVar10.d, piyVar10.f);
                                prjVar3.b.k(1036);
                                return zxn.g(new IOException("Failed to remove pending group: ".concat(String.valueOf(piyVar10.d))));
                            }
                        };
                        return zuz.h(zydVarH, wyo.c(zviVar5), prjVar2.h);
                    }
                };
                Executor executor = prjVar.h;
                return qfrVarC2.g(zviVar4, executor).g(new zvi() { // from class: ppm
                    @Override // defpackage.zvi
                    public final zyd a(Object obj2) {
                        pia piaVar6 = piaVar4;
                        return qeg.j(piaVar6) ? prjVar.d(piaVar6) : zxy.a;
                    }
                }, executor).g(new zvi() { // from class: ppn
                    @Override // defpackage.zvi
                    public final zyd a(Object obj2) {
                        final prj prjVar2 = prjVar;
                        prk prkVar = prjVar2.d;
                        final piy piyVar9 = piyVar7;
                        qfr qfrVarC3 = qfr.c(prkVar.g(piyVar9));
                        yqi yqiVar = new yqi() { // from class: prd
                            @Override // defpackage.yqi
                            public final Object apply(Object obj3) {
                                return yqt.h((pia) obj3);
                            }
                        };
                        Executor executor2 = prjVar2.h;
                        final qfr qfrVarE = qfrVarC3.e(yqiVar, executor2);
                        final pia piaVar6 = piaVar5;
                        return qfrVarE.g(new zvi() { // from class: pre
                            @Override // defpackage.zvi
                            public final zyd a(Object obj3) {
                                return prjVar2.d.l(piyVar9, piaVar6);
                            }
                        }, executor2).g(new zvi() { // from class: pnl
                            @Override // defpackage.zvi
                            public final zyd a(Object obj3) {
                                if (((Boolean) obj3).booleanValue()) {
                                    return qfrVarE;
                                }
                                piy piyVar10 = piyVar9;
                                prjVar2.b.k(1036);
                                return zxn.g(new IOException("Failed to write updated group: ".concat(String.valueOf(piyVar10.d))));
                            }
                        }, executor2);
                    }
                }, executor).g(new zvi() { // from class: ppo
                    @Override // defpackage.zvi
                    public final zyd a(Object obj2) {
                        final prj prjVar2 = prjVar;
                        final yqt yqtVar = (yqt) obj2;
                        return zuz.g(prjVar2.d.i(piyVar8), wyo.a(new yqi() { // from class: pps
                            @Override // defpackage.yqi
                            public final Object apply(Object obj3) {
                                if (!((Boolean) obj3).booleanValue()) {
                                    prjVar2.b.k(1036);
                                }
                                return yqtVar;
                            }
                        }), prjVar2.h);
                    }
                }, executor).g(new zvi() { // from class: ppp
                    @Override // defpackage.zvi
                    public final zyd a(Object obj2) {
                        yqt yqtVar = (yqt) obj2;
                        if (!yqtVar.g()) {
                            return zxy.a;
                        }
                        final prj prjVar2 = prjVar;
                        return zuz.h(prjVar2.d.a((pia) yqtVar.c()), wyo.c(new zvi() { // from class: pqg
                            @Override // defpackage.zvi
                            public final zyd a(Object obj3) {
                                if (!((Boolean) obj3).booleanValue()) {
                                    prjVar2.b.k(1036);
                                }
                                return zxy.a;
                            }
                        }), prjVar2.h);
                    }
                }, executor).e(new yqi() { // from class: ppr
                    @Override // defpackage.yqi
                    public final Object apply(Object obj2) {
                        if (!z2) {
                            pia piaVar6 = piaVar5;
                            qbt qbtVar3 = qbtVar2;
                            qbtVar3.a(1009, piaVar6);
                            zqf zqfVar = zqf.a;
                            zqe zqeVar = new zqe();
                            String str = piaVar6.f;
                            if ((zqeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                zqeVar.y();
                            }
                            zqf zqfVar2 = (zqf) zqeVar.b;
                            str.getClass();
                            zqfVar2.b |= 4;
                            zqfVar2.e = str;
                            String str2 = piaVar6.e;
                            if ((zqeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                zqeVar.y();
                            }
                            zqf zqfVar3 = (zqf) zqeVar.b;
                            str2.getClass();
                            zqfVar3.b |= 1;
                            zqfVar3.c = str2;
                            int i2 = piaVar6.g;
                            if ((zqeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                zqeVar.y();
                            }
                            zqf zqfVar4 = (zqf) zqeVar.b;
                            zqfVar4.b |= 2;
                            zqfVar4.d = i2;
                            int size = piaVar6.o.size();
                            if ((zqeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                zqeVar.y();
                            }
                            zqf zqfVar5 = (zqf) zqeVar.b;
                            zqfVar5.b |= 8;
                            zqfVar5.f = size;
                            long j = piaVar6.s;
                            if ((zqeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                zqeVar.y();
                            }
                            zqf zqfVar6 = (zqf) zqeVar.b;
                            zqfVar6.b |= 64;
                            zqfVar6.i = j;
                            String str3 = piaVar6.t;
                            if ((zqeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                zqeVar.y();
                            }
                            zqf zqfVar7 = (zqf) zqeVar.b;
                            str3.getClass();
                            zqfVar7.b |= 128;
                            zqfVar7.j = str3;
                            zqf zqfVar8 = (zqf) zqeVar.v();
                            phw phwVar5 = piaVar6.d;
                            if (phwVar5 == null) {
                                phwVar5 = phw.a;
                            }
                            long j2 = phwVar5.d;
                            long j3 = phwVar5.f;
                            long j4 = phwVar5.e;
                            zqp zqpVar = zqp.a;
                            zqo zqoVar = new zqo();
                            int i3 = phwVar5.g;
                            if ((zqoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                zqoVar.y();
                            }
                            zqp zqpVar2 = (zqp) zqoVar.b;
                            zqpVar2.b |= 1;
                            zqpVar2.c = i3;
                            long j5 = j4 - j3;
                            if ((zqoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                zqoVar.y();
                            }
                            zqp zqpVar3 = (zqp) zqoVar.b;
                            zqpVar3.b |= 2;
                            zqpVar3.d = j5;
                            long j6 = j4 - j2;
                            if ((zqoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                zqoVar.y();
                            }
                            zqp zqpVar4 = (zqp) zqoVar.b;
                            zqpVar4.b |= 4;
                            zqpVar4.e = j6;
                            phw phwVar6 = piaVar6.d;
                            if (phwVar6 == null) {
                                phwVar6 = phw.a;
                            }
                            boolean z3 = phwVar6.i;
                            if ((zqoVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                                zqoVar.y();
                            }
                            zqp zqpVar5 = (zqp) zqoVar.b;
                            zqpVar5.b |= 8;
                            zqpVar5.f = z3;
                            qbtVar3.a.f(zqfVar8, (zqp) zqoVar.v());
                        }
                        return pri.DOWNLOADED;
                    }
                }, executor);
            }
        };
        Executor executor = this.h;
        return qfrVarC.g(zviVar2, executor).g(new zvi() { // from class: pqd
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                prj prjVar = this.a;
                final pri priVar = (pri) obj;
                return zuz.g(prjVar.k.c(piaVar.e), wyo.a(new yqi() { // from class: pnx
                    @Override // defpackage.yqi
                    public final Object apply(Object obj2) {
                        return priVar;
                    }
                }), prjVar.h);
            }
        }, executor);
    }

    public final zyd u(final pia piaVar, final phu phuVar, final pjf pjfVar, pjj pjjVar, final int i) {
        return zuz.h(w(piaVar, phuVar, pjjVar, pjfVar, phuVar.o, piaVar.l, i), wyo.c(new zvi() { // from class: pqb
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                if (((Boolean) obj).booleanValue() || i == 4) {
                    return zxy.a;
                }
                pjf pjfVar2 = pjfVar;
                phu phuVar2 = phuVar;
                pia piaVar2 = piaVar;
                return this.a.o(piaVar2, phuVar2, pjfVar2, piaVar2.l);
            }
        }), this.h);
    }

    public final zyd v(final pia piaVar, final phu phuVar, final pjf pjfVar, final pjj pjjVar, final int i) throws qdw {
        final String str = phuVar.o;
        final long j = piaVar.l;
        int iA = phy.a(pjfVar.f);
        if (iA == 0) {
            iA = 1;
        }
        final Context context = this.a;
        final Uri uriE = qdx.e(context, iA, pjjVar.d, phuVar.g, this.c, this.i, false);
        if (uriE == null) {
            qce.c("%s: Failed to get file uri!", "FileGroupManager");
            throw new qdw(28, "Failed to get local file uri");
        }
        final ueg uegVar = this.f;
        return qfr.c(zxn.l(wyo.b(new zvh() { // from class: qdu
            @Override // defpackage.zvh
            public final zyd a() throws qdw, IOException {
                String message;
                Uri uriC;
                InputStream inputStream;
                message = "";
                Context context2 = context;
                ueg uegVar2 = uegVar;
                String str2 = str;
                Uri uri = uriE;
                phu phuVar2 = phuVar;
                pia piaVar2 = piaVar;
                int i2 = 0;
                try {
                    uriC = qdx.c(context2, str2);
                    inputStream = (InputStream) uegVar2.c(uri, new uhi());
                } catch (ufu unused) {
                    qce.e("%s: Malformed lease uri file %s, file group %s", "AndroidSharingUtil", phuVar2.c, piaVar2.e);
                    message = String.format("Malformed blob Uri for file %s, group %s", phuVar2.c, piaVar2.e);
                    i2 = 17;
                } catch (IOException unused2) {
                    qce.e("%s: Failed to copy to the blobstore after download for file %s, file group %s", "AndroidSharingUtil", phuVar2.c, piaVar2.e);
                    message = String.format("Error while copying file %s, group %s, to the shared blob storage", phuVar2.c, piaVar2.e);
                    i2 = 22;
                } catch (ufo unused3) {
                    qce.e("%s: Failed to share after download for file %s, file group %s due to LimitExceededException", "AndroidSharingUtil", phuVar2.c, piaVar2.e);
                    message = String.format("System limit exceeded for file %s, group %s", phuVar2.c, piaVar2.e);
                    i2 = 25;
                } catch (ufx e) {
                    message = TextUtils.isEmpty(e.getMessage()) ? "" : e.getMessage();
                    String str3 = phuVar2.c;
                    String str4 = piaVar2.e;
                    int i3 = qce.a;
                    message = "UnsupportedFileStorageOperation was thrown: ".concat(String.valueOf(message));
                    i2 = 24;
                }
                try {
                    OutputStream outputStream = (OutputStream) uegVar2.c(uriC, new uhn());
                    try {
                        zkn.a(inputStream, outputStream);
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (i2 == 0) {
                            return zxy.a;
                        }
                        throw new qdw(i2, message);
                    } finally {
                    }
                } catch (Throwable th) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
        }), this.o)).g(new zvi() { // from class: ppi
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                final prj prjVar = this.a;
                final int i2 = i;
                final pia piaVar2 = piaVar;
                final phu phuVar2 = phuVar;
                pjj pjjVar2 = pjjVar;
                final pjf pjfVar2 = pjfVar;
                String str2 = str;
                final long j2 = j;
                return zuz.h(prjVar.w(piaVar2, phuVar2, pjjVar2, pjfVar2, str2, j2, i2), wyo.c(new zvi() { // from class: pot
                    @Override // defpackage.zvi
                    public final zyd a(Object obj2) {
                        if (((Boolean) obj2).booleanValue() || i2 == 6) {
                            return zxy.a;
                        }
                        long j3 = j2;
                        pjf pjfVar3 = pjfVar2;
                        phu phuVar3 = phuVar2;
                        return prjVar.o(piaVar2, phuVar3, pjfVar3, j3);
                    }
                }), prjVar.h);
            }
        }, this.h);
    }

    final zyd w(final pia piaVar, final phu phuVar, pjj pjjVar, final pjf pjfVar, final String str, long j, final int i) {
        if (pjjVar.f && !s(pjjVar, j)) {
            y(this.b, piaVar, phuVar, i);
            return zxn.h(true);
        }
        final long jMax = Math.max(j, pjjVar.g);
        final Context context = this.a;
        final ueg uegVar = this.f;
        zyd zydVarL = zxn.l(wyo.b(new zvh() { // from class: qdt
            @Override // defpackage.zvh
            public final zyd a() throws qdw, IOException {
                String message;
                message = "";
                Context context2 = context;
                String str2 = str;
                long j2 = jMax;
                ueg uegVar2 = uegVar;
                phu phuVar2 = phuVar;
                pia piaVar2 = piaVar;
                int i2 = 0;
                try {
                    int i3 = ueu.a;
                    OutputStream outputStream = (OutputStream) uegVar2.c(uet.a(String.valueOf(str2).concat(".lease"), context2.getPackageName(), j2), new uhn());
                    if (outputStream != null) {
                        outputStream.close();
                    }
                } catch (IOException unused) {
                    qce.e("%s: Failed to acquire lease for file %s, file group %s", "AndroidSharingUtil", phuVar2.c, piaVar2.e);
                    message = String.format("Error while acquiring lease for file %s, group %s", phuVar2.c, piaVar2.e);
                    i2 = 20;
                } catch (ufo unused2) {
                    qce.e("%s: Failed to share after download for file %s, file group %s due to LimitExceededException", "AndroidSharingUtil", phuVar2.c, piaVar2.e);
                    message = String.format("System limit exceeded for file %s, group %s", phuVar2.c, piaVar2.e);
                    i2 = 25;
                } catch (ufu unused3) {
                    qce.e("%s: Malformed lease uri file %s, file group %s", "AndroidSharingUtil", phuVar2.c, piaVar2.e);
                    message = String.format("Malformed lease Uri for file %s, group %s", phuVar2.c, piaVar2.e);
                    i2 = 18;
                } catch (ufx e) {
                    message = TextUtils.isEmpty(e.getMessage()) ? "" : e.getMessage();
                    String str3 = phuVar2.c;
                    String str4 = piaVar2.e;
                    int i4 = qce.a;
                    message = "UnsupportedFileStorageOperation was thrown: ".concat(String.valueOf(message));
                    i2 = 24;
                }
                if (i2 == 0) {
                    return zxy.a;
                }
                throw new qdw(i2, message);
            }
        }), this.o);
        zvi zviVar = new zvi() { // from class: pns
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                pjj pjjVar2 = pjj.a;
                pji pjiVar = new pji();
                piw piwVar = piw.DOWNLOAD_COMPLETE;
                if ((pjiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    pjiVar.y();
                }
                String str2 = str;
                pjj pjjVar3 = (pjj) pjiVar.b;
                pjjVar3.e = piwVar.h;
                pjjVar3.c |= 2;
                if ((pjiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    pjiVar.y();
                }
                String strValueOf = String.valueOf(str2);
                pjj pjjVar4 = (pjj) pjiVar.b;
                pjjVar4.c |= 1;
                pjjVar4.d = "android_shared_".concat(strValueOf);
                if ((pjiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    pjiVar.y();
                }
                pjj pjjVar5 = (pjj) pjiVar.b;
                pjjVar5.c |= 4;
                pjjVar5.f = true;
                if ((pjiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    pjiVar.y();
                }
                final long j2 = jMax;
                pjj pjjVar6 = (pjj) pjiVar.b;
                pjjVar6.c |= 8;
                pjjVar6.g = j2;
                if ((pjiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    pjiVar.y();
                }
                final prj prjVar = this.a;
                final int i2 = i;
                final pia piaVar2 = piaVar;
                final phu phuVar2 = phuVar;
                pjf pjfVar2 = pjfVar;
                pjj pjjVar7 = (pjj) pjiVar.b;
                str2.getClass();
                pjjVar7.c |= 16;
                pjjVar7.h = str2;
                return zuz.h(prjVar.e.c.h(pjfVar2, (pjj) pjiVar.v()), wyo.c(new zvi() { // from class: ppx
                    @Override // defpackage.zvi
                    public final zyd a(Object obj2) {
                        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                        prj prjVar2 = prjVar;
                        pia piaVar3 = piaVar2;
                        phu phuVar3 = phuVar2;
                        if (!zBooleanValue) {
                            qce.e("%s: Failed to set new state for file %s, filegroup %s", "FileGroupManager", phuVar3.c, piaVar3.e);
                            prj.y(prjVar2.b, piaVar3, phuVar3, 15);
                            return zxn.h(false);
                        }
                        qbv qbvVar = prjVar2.b;
                        zql zqlVar = zql.a;
                        zqk zqkVar = new zqk();
                        if ((zqkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            zqkVar.y();
                        }
                        int i3 = i2;
                        zql zqlVar2 = (zql) zqkVar.b;
                        zqlVar2.c = zrx.a(i3);
                        zqlVar2.b |= 1;
                        String str3 = piaVar3.e;
                        if ((zqkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            zqkVar.y();
                        }
                        zql zqlVar3 = (zql) zqkVar.b;
                        str3.getClass();
                        zqlVar3.b = 2 | zqlVar3.b;
                        zqlVar3.d = str3;
                        int i4 = piaVar3.g;
                        if ((zqkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            zqkVar.y();
                        }
                        zql zqlVar4 = (zql) zqkVar.b;
                        zqlVar4.b |= 4;
                        zqlVar4.e = i4;
                        long j3 = piaVar3.s;
                        if ((zqkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            zqkVar.y();
                        }
                        zql zqlVar5 = (zql) zqkVar.b;
                        zqlVar5.b |= 128;
                        zqlVar5.i = j3;
                        String str4 = piaVar3.t;
                        if ((zqkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            zqkVar.y();
                        }
                        zql zqlVar6 = (zql) zqkVar.b;
                        str4.getClass();
                        zqlVar6.b |= 256;
                        zqlVar6.j = str4;
                        String str5 = phuVar3.c;
                        if ((zqkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            zqkVar.y();
                        }
                        zql zqlVar7 = (zql) zqkVar.b;
                        str5.getClass();
                        zqlVar7.b |= 8;
                        zqlVar7.f = str5;
                        if ((zqkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            zqkVar.y();
                        }
                        zql zqlVar8 = (zql) zqkVar.b;
                        zqlVar8.b |= 16;
                        zqlVar8.g = true;
                        if ((zqkVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            zqkVar.y();
                        }
                        long j4 = j2;
                        zql zqlVar9 = (zql) zqkVar.b;
                        zqlVar9.b |= 32;
                        zqlVar9.h = j4;
                        qbvVar.e((zql) zqkVar.v());
                        return zxn.h(true);
                    }
                }), prjVar.h);
            }
        };
        return zuz.h(zydVarL, wyo.c(zviVar), this.h);
    }
}
