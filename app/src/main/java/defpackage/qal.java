package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class qal implements qax {
    private final pxy a;
    private final ueg b;
    private final phu c;
    private final String d;
    private final qbv e;
    private final piy f;
    private final int g;
    private final long h;
    private final String i;
    private final phg j;
    private final Executor k;
    private final int l;

    public qal(pxy pxyVar, ueg uegVar, phu phuVar, int i, qbv qbvVar, piy piyVar, int i2, long j, String str, phg phgVar, Executor executor) {
        this.a = pxyVar;
        this.b = uegVar;
        this.c = phuVar;
        this.l = i;
        this.d = qeg.e(phuVar);
        this.e = qbvVar;
        this.f = piyVar;
        this.g = i2;
        this.h = j;
        this.i = str;
        this.j = phgVar;
        this.k = executor;
    }

    static zyd c(pxy pxyVar, phu phuVar, int i, final ueg uegVar, final Uri uri, final String str, final qbv qbvVar, final phg phgVar, Executor executor) {
        return qfr.c(e(pxyVar, pxx.a(phuVar, i), executor)).g(new zvi() { // from class: qah
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                int i2 = ((pjj) obj).i;
                ueg uegVar2 = uegVar;
                Uri uri2 = uri;
                if (i2 >= phgVar.f()) {
                    qbv qbvVar2 = qbvVar;
                    int i3 = qce.a;
                    qbvVar2.k(1115);
                } else {
                    int i4 = qce.a;
                    try {
                        uegVar2.f(uri2);
                    } catch (IOException e) {
                        qce.g(e, "%s: Failed to remove corrupted file %s", "DownloaderCallbackImpl", str);
                        return zxn.g(e);
                    }
                }
                return zxy.a;
            }
        }, executor);
    }

    static zyd d(final piw piwVar, phu phuVar, int i, final pxy pxyVar, Executor executor) {
        final pjf pjfVarA = pxx.a(phuVar, i);
        return qfr.c(e(pxyVar, pjfVarA, executor)).g(new zvi() { // from class: qaf
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                pjj pjjVar = (pjj) obj;
                pji pjiVar = new pji();
                pjiVar.B(pjjVar);
                if ((pjiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    pjiVar.y();
                }
                piw piwVar2 = piwVar;
                pjj pjjVar2 = (pjj) pjiVar.b;
                pjj pjjVar3 = pjj.a;
                pjjVar2.e = piwVar2.h;
                pjjVar2.c |= 2;
                if (piwVar2.equals(piw.CORRUPTED)) {
                    int i2 = pjjVar.i + 1;
                    if ((pjiVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                        pjiVar.y();
                    }
                    pjj pjjVar4 = (pjj) pjiVar.b;
                    pjjVar4.c |= 32;
                    pjjVar4.i = i2;
                }
                return pxyVar.h(pjfVarA, (pjj) pjiVar.v());
            }
        }, executor).g(new zvi() { // from class: qag
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    return zxy.a;
                }
                qce.d("%s: Unable to write back download info for file entry with %s", "DownloaderCallbackImpl", pjfVarA);
                pha phaVarA = phc.a();
                phaVarA.a = phb.UNABLE_TO_UPDATE_FILE_STATE_ERROR;
                return zxn.g(phaVarA.a());
            }
        }, executor);
    }

    private static zyd e(pxy pxyVar, final pjf pjfVar, Executor executor) {
        return zuz.h(pxyVar.e(pjfVar), wyo.c(new zvi() { // from class: qak
            @Override // defpackage.zvi
            public final zyd a(Object obj) {
                pjj pjjVar = (pjj) obj;
                if (pjjVar != null) {
                    return zxn.h(pjjVar);
                }
                qce.d("%s: Shared file not found, newFileKey = %s", "DownloaderCallbackImpl", pjfVar);
                pha phaVarA = phc.a();
                phaVarA.a = phb.SHARED_FILE_NOT_FOUND_ERROR;
                return zxn.g(phaVarA.a());
            }
        }), executor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x013a, code lost:
    
        r0 = r29.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x013c, code lost:
    
        r0.c(r30, new defpackage.uhc());
        r0.g(r30, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0149, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x014a, code lost:
    
        defpackage.qce.g(r0, "%s: Failed to apply defrag download transform for file %s.", "DownloaderCallbackImpl", r30);
        r2 = defpackage.phc.a();
        r2.a = defpackage.phb.DOWNLOAD_TRANSFORM_IO_ERROR;
        r2.c = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0163, code lost:
    
        throw r2.a();
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02a8 A[Catch: phc -> 0x031b, TryCatch #5 {phc -> 0x031b, blocks: (B:6:0x0013, B:8:0x001e, B:11:0x002b, B:13:0x0039, B:14:0x0041, B:16:0x0054, B:17:0x0057, B:19:0x0070, B:20:0x0073, B:22:0x0086, B:23:0x0089, B:25:0x009d, B:26:0x00a0, B:28:0x00b9, B:29:0x00bc, B:33:0x00f5, B:34:0x010e, B:35:0x010f, B:37:0x011d, B:39:0x0121, B:40:0x0123, B:41:0x0129, B:43:0x012f, B:45:0x013a, B:46:0x013c, B:49:0x014a, B:50:0x0163, B:51:0x0164, B:53:0x016c, B:54:0x016e, B:55:0x017a, B:56:0x0188, B:62:0x01a8, B:63:0x01ab, B:65:0x01b1, B:67:0x01b5, B:68:0x01b7, B:69:0x01bd, B:71:0x01c3, B:74:0x01d1, B:76:0x01dd, B:78:0x01ee, B:79:0x01f1, B:81:0x020c, B:82:0x020f, B:84:0x0223, B:85:0x0226, B:87:0x023a, B:88:0x023d, B:90:0x0256, B:91:0x0259, B:94:0x0284, B:97:0x028a, B:102:0x0299, B:105:0x02a8, B:106:0x02b9, B:122:0x02d3, B:121:0x02d0, B:124:0x02d5, B:125:0x02f1, B:127:0x02f3, B:128:0x030b), top: B:150:0x0013, inners: #0, #1, #7, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0164 A[EDGE_INSN: B:140:0x0164->B:51:0x0164 BREAK  A[LOOP:0: B:41:0x0129->B:162:?], EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0294 A[ADDED_TO_REGION] */
    @Override // defpackage.qax
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.zyd a(android.net.Uri r30) throws defpackage.phc, java.io.IOException {
        /*
            Method dump skipped, instructions count: 856
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qal.a(android.net.Uri):zyd");
    }

    @Override // defpackage.qax
    public final zyd b(phc phcVar) {
        int i = qce.a;
        if (phcVar.a.equals(phb.DOWNLOADED_FILE_CHECKSUM_MISMATCH_ERROR)) {
            return d(piw.CORRUPTED, this.c, this.l, this.a, this.k);
        }
        return d(piw.DOWNLOAD_FAILED, this.c, this.l, this.a, this.k);
    }
}
