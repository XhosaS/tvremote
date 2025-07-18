package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.mdi.download.delta.vcdiff.VcDiffFileDecoder;
import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qae implements qax {
    public final Context a;
    public final pxy b;
    public final ueg c;
    public final pkn d;
    public final phu e;
    public final pie f;
    public final qbv g;
    public final piy h;
    public final int i;
    public final long j;
    public final String k;
    public final yqt l;
    public final Executor m;
    public final pkx n;
    public final int o;
    private final phg p;

    public qae(Context context, pxy pxyVar, ueg uegVar, pkn pknVar, phu phuVar, int i, pkx pkxVar, pie pieVar, qbv qbvVar, piy piyVar, int i2, long j, String str, yqt yqtVar, phg phgVar, Executor executor) {
        this.a = context;
        this.b = pxyVar;
        this.c = uegVar;
        this.d = pknVar;
        this.e = phuVar;
        this.o = i;
        this.n = pkxVar;
        this.f = pieVar;
        this.g = qbvVar;
        this.h = piyVar;
        this.i = i2;
        this.j = j;
        this.k = str;
        this.l = yqtVar;
        this.p = phgVar;
        this.m = executor;
    }

    @Override // defpackage.qax
    public final zyd a(final Uri uri) {
        int i = qce.a;
        ueg uegVar = this.c;
        pie pieVar = this.f;
        if (!qan.b(uegVar, uri).equals(pieVar.e)) {
            qce.e("%s: Downloaded delta file at uri = %s, checksum = %s verification failed", "DeltaFileDownloaderCallbackImpl", uri, pieVar.e);
            pha phaVarA = phc.a();
            phaVarA.a = phb.DOWNLOADED_FILE_CHECKSUM_MISMATCH_ERROR;
            final phc phcVarA = phaVarA.a();
            pxy pxyVar = this.b;
            phu phuVar = this.e;
            int i2 = this.o;
            String str = pieVar.e;
            qbv qbvVar = this.g;
            phg phgVar = this.p;
            Executor executor = this.m;
            return qfr.c(qal.c(pxyVar, phuVar, i2, uegVar, uri, str, qbvVar, phgVar, executor)).b(IOException.class, new zvi() { // from class: qab
                @Override // defpackage.zvi
                public final zyd a(Object obj) {
                    phcVarA.addSuppressed((IOException) obj);
                    return zxy.a;
                }
            }, executor).g(new zvi() { // from class: qac
                @Override // defpackage.zvi
                public final zyd a(Object obj) {
                    return zxn.g(phcVarA);
                }
            }, executor);
        }
        final Uri uriA = qam.a(uri);
        pjf pjfVar = pjf.a;
        pje pjeVar = new pje();
        phm phmVar = pieVar.g;
        if (phmVar == null) {
            phmVar = phm.a;
        }
        String str2 = phmVar.b;
        if ((pjeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            pjeVar.y();
        }
        pjf pjfVar2 = (pjf) pjeVar.b;
        str2.getClass();
        pjfVar2.b |= 4;
        pjfVar2.e = str2;
        int i3 = this.o;
        if ((pjeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            pjeVar.y();
        }
        pjf pjfVar3 = (pjf) pjeVar.b;
        pjfVar3.f = i3 - 1;
        pjfVar3.b |= 8;
        final pjf pjfVar4 = (pjf) pjeVar.v();
        zyd zydVarE = this.b.e(pjfVar4);
        zvi zviVar = new zvi() { // from class: qaa
            @Override // defpackage.zvi
            public final zyd a(Object obj) throws pkw {
                int i4;
                qae qaeVar = this.a;
                Uri uri2 = uriA;
                Uri uri3 = uri;
                pjj pjjVar = (pjj) obj;
                Uri uriE = null;
                if (pjjVar != null) {
                    piw piwVarB = piw.b(pjjVar.e);
                    if (piwVarB == null) {
                        piwVarB = piw.NONE;
                    }
                    if (piwVarB == piw.DOWNLOAD_COMPLETE) {
                        uriE = qdx.e(qaeVar.a, qaeVar.o, pjjVar.d, pjfVar4.e, qaeVar.d, qaeVar.l, false);
                    }
                }
                if (uriE == null) {
                    pha phaVarA2 = phc.a();
                    phaVarA2.a = phb.DELTA_DOWNLOAD_BASE_FILE_NOT_FOUND_ERROR;
                    return zxn.g(phaVarA2.a());
                }
                try {
                    ueg uegVar2 = qaeVar.c;
                    if (uegVar2.h(uri2)) {
                        uegVar2.f(uri2);
                    }
                    pkx pkxVar = qaeVar.n;
                    if (!VcDiffFileDecoder.a) {
                        throw new pkw("VcDiff decoding library is not initialized!");
                    }
                    try {
                        if (!VcDiffFileDecoder.a(pkxVar.a(uriE), pkxVar.a(uri3), pkxVar.a(uri2))) {
                            throw new pkw("Failed to decode.");
                        }
                        uegVar2.f(uri3);
                        zqf zqfVar = zqf.a;
                        zqe zqeVar = new zqe();
                        piy piyVar = qaeVar.h;
                        String str3 = piyVar.d;
                        if ((zqeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            zqeVar.y();
                        }
                        zqf zqfVar2 = (zqf) zqeVar.b;
                        str3.getClass();
                        zqfVar2.b = 1 | zqfVar2.b;
                        zqfVar2.c = str3;
                        int i5 = qaeVar.i;
                        if ((zqeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            zqeVar.y();
                        }
                        zqf zqfVar3 = (zqf) zqeVar.b;
                        zqfVar3.b = 2 | zqfVar3.b;
                        zqfVar3.d = i5;
                        String str4 = piyVar.e;
                        if ((zqeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            zqeVar.y();
                        }
                        zqf zqfVar4 = (zqf) zqeVar.b;
                        str4.getClass();
                        zqfVar4.b |= 4;
                        zqfVar4.e = str4;
                        long j = qaeVar.j;
                        if ((zqeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            zqeVar.y();
                        }
                        zqf zqfVar5 = (zqf) zqeVar.b;
                        zqfVar5.b |= 64;
                        zqfVar5.i = j;
                        String str5 = qaeVar.k;
                        if ((zqeVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                            zqeVar.y();
                        }
                        zqf zqfVar6 = (zqf) zqeVar.b;
                        str5.getClass();
                        zqfVar6.b |= 128;
                        zqfVar6.j = str5;
                        zqf zqfVar7 = (zqf) zqeVar.v();
                        qbv qbvVar2 = qaeVar.g;
                        phu phuVar2 = qaeVar.e;
                        pie pieVar2 = qaeVar.f;
                        long j2 = phuVar2.e;
                        long j3 = pieVar2.d;
                        String str6 = phuVar2.c;
                        int i6 = 0;
                        while (true) {
                            if (i6 >= phuVar2.l.size()) {
                                i4 = 0;
                                break;
                            }
                            int i7 = i6 + 1;
                            if (ypx.d(((pie) phuVar2.l.get(i6)).e, pieVar2.e)) {
                                i4 = i7;
                                break;
                            }
                            i6 = i7;
                        }
                        qbvVar2.n(zqfVar7, 4, j2, j3, str6, i4);
                        return zxy.a;
                    } catch (ufu e) {
                        throw new pkw(e);
                    }
                } catch (IOException e2) {
                    qce.g(e2, "%s: Failed to decode delta file with url = %s failed. checksum = %s ", "DeltaFileDownloaderCallbackImpl", qaeVar.f.c, qaeVar.e.g);
                    qaeVar.d.a();
                    pha phaVarA3 = phc.a();
                    phaVarA3.a = phb.DELTA_DOWNLOAD_DECODE_IO_ERROR;
                    phaVarA3.c = e2;
                    return zxn.g(phaVarA3.a());
                }
            }
        };
        Executor executor2 = this.m;
        return zuz.h(zuz.h(zydVarE, wyo.c(zviVar), executor2), wyo.c(new zvi() { // from class: qad
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                qae qaeVar = this.a;
                ueg uegVar2 = qaeVar.c;
                Uri uri2 = uriA;
                phu phuVar2 = qaeVar.e;
                if (qan.b(uegVar2, uri2).equals(phuVar2.g)) {
                    return qal.d(piw.DOWNLOAD_COMPLETE, phuVar2, qaeVar.o, qaeVar.b, qaeVar.m);
                }
                qce.d("%s: Final file checksum verification failed. %s.", "DeltaFileDownloaderCallbackImpl", uri2);
                pha phaVarA2 = phc.a();
                phaVarA2.a = phb.FINAL_FILE_CHECKSUM_MISMATCH_ERROR;
                return zxn.g(phaVarA2.a());
            }
        }), executor2);
    }

    @Override // defpackage.qax
    public final zyd b(phc phcVar) {
        phu phuVar = this.e;
        String str = phuVar.g;
        int i = qce.a;
        if (phcVar.a.equals(phb.DOWNLOADED_FILE_CHECKSUM_MISMATCH_ERROR)) {
            return qal.d(piw.CORRUPTED, phuVar, this.o, this.b, this.m);
        }
        return qal.d(piw.DOWNLOAD_FAILED, phuVar, this.o, this.b, this.m);
    }
}
