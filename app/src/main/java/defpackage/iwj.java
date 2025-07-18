package defpackage;

import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iwj {
    public final flz a;
    private final ztw b;

    public iwj(flz flzVar, ztw ztwVar) {
        ztwVar.getClass();
        this.a = flzVar;
        this.b = ztwVar;
    }

    private final Duration b(Instant instant) {
        Instant instantA = this.b.a();
        instantA.getClass();
        return fep.a(instant, instantA);
    }

    private static final Duration c(Duration duration, Duration duration2) {
        return duration.compareTo(Duration.ZERO) > 0 ? duration : duration2;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02b5 A[PHI: r2 r12 r13
  0x02b5: PHI (r2v17 flz) = (r2v14 flz), (r2v19 flz) binds: [B:102:0x02b2, B:25:0x00d9] A[DONT_GENERATE, DONT_INLINE]
  0x02b5: PHI (r12v34 j$.time.Duration) = (r12v31 j$.time.Duration), (r12v37 j$.time.Duration) binds: [B:102:0x02b2, B:25:0x00d9] A[DONT_GENERATE, DONT_INLINE]
  0x02b5: PHI (r13v21 java.lang.Object) = (r13v20 java.lang.Object), (r13v1 java.lang.Object) binds: [B:102:0x02b2, B:25:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0154 A[PHI: r2 r12 r13
  0x0154: PHI (r2v11 flz) = (r2v8 flz), (r2v13 flz) binds: [B:43:0x0152, B:28:0x0100] A[DONT_GENERATE, DONT_INLINE]
  0x0154: PHI (r12v21 j$.time.Duration) = (r12v18 j$.time.Duration), (r12v24 j$.time.Duration) binds: [B:43:0x0152, B:28:0x0100] A[DONT_GENERATE, DONT_INLINE]
  0x0154: PHI (r13v13 java.lang.Object) = (r13v12 java.lang.Object), (r13v1 java.lang.Object) binds: [B:43:0x0152, B:28:0x0100] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x019a A[PHI: r2 r12 r13
  0x019a: PHI (r2v41 flz) = (r2v38 flz), (r2v43 flz) binds: [B:54:0x0196, B:13:0x003d] A[DONT_GENERATE, DONT_INLINE]
  0x019a: PHI (r12v86 j$.time.Duration) = (r12v83 j$.time.Duration), (r12v89 j$.time.Duration) binds: [B:54:0x0196, B:13:0x003d] A[DONT_GENERATE, DONT_INLINE]
  0x019a: PHI (r13v56 java.lang.Object) = (r13v55 java.lang.Object), (r13v1 java.lang.Object) binds: [B:54:0x0196, B:13:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e3 A[PHI: r2 r12 r13
  0x01e3: PHI (r2v35 flz) = (r2v32 flz), (r2v37 flz) binds: [B:66:0x01df, B:16:0x0064] A[DONT_GENERATE, DONT_INLINE]
  0x01e3: PHI (r12v73 j$.time.Duration) = (r12v70 j$.time.Duration), (r12v76 j$.time.Duration) binds: [B:66:0x01df, B:16:0x0064] A[DONT_GENERATE, DONT_INLINE]
  0x01e3: PHI (r13v47 java.lang.Object) = (r13v46 java.lang.Object), (r13v1 java.lang.Object) binds: [B:66:0x01df, B:16:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x022a A[PHI: r2 r12 r13
  0x022a: PHI (r2v29 flz) = (r2v26 flz), (r2v31 flz) binds: [B:78:0x0226, B:19:0x008b] A[DONT_GENERATE, DONT_INLINE]
  0x022a: PHI (r12v60 j$.time.Duration) = (r12v57 j$.time.Duration), (r12v63 j$.time.Duration) binds: [B:78:0x0226, B:19:0x008b] A[DONT_GENERATE, DONT_INLINE]
  0x022a: PHI (r13v38 java.lang.Object) = (r13v37 java.lang.Object), (r13v1 java.lang.Object) binds: [B:78:0x0226, B:19:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0271 A[PHI: r2 r12 r13
  0x0271: PHI (r2v23 flz) = (r2v20 flz), (r2v25 flz) binds: [B:90:0x026d, B:22:0x00b2] A[DONT_GENERATE, DONT_INLINE]
  0x0271: PHI (r12v47 j$.time.Duration) = (r12v44 j$.time.Duration), (r12v50 j$.time.Duration) binds: [B:90:0x026d, B:22:0x00b2] A[DONT_GENERATE, DONT_INLINE]
  0x0271: PHI (r13v30 java.lang.Object) = (r13v29 java.lang.Object), (r13v1 java.lang.Object) binds: [B:90:0x026d, B:22:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0281  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.abnb r12, defpackage.agsw r13) {
        /*
            Method dump skipped, instructions count: 774
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iwj.a(abnb, agsw):java.lang.Object");
    }
}
