package defpackage;

import j$.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aicw extends aiag {
    private static final String a = "aicw";
    private final AtomicInteger b;
    private final aida c;

    public aicw() {
        aida aidaVar = new aida();
        this.b = new AtomicInteger();
        this.c = aidaVar;
    }

    private static int e(aiad aiadVar) {
        int iOrdinal = aiadVar.ordinal();
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3) {
                    return 0;
                }
            }
        }
        return i;
    }

    @Override // defpackage.aiag
    public final long a() {
        long jNextLong = ThreadLocalRandom.current().nextLong(-9223372036854775807L, 9223372036854775805L);
        return jNextLong >= -1 ? jNextLong + 2 : jNextLong;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0030 A[PHI: r5
  0x0030: PHI (r5v4 int) = (r5v0 int), (r5v5 int), (r5v6 int) binds: [B:13:0x0027, B:15:0x002a, B:17:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.aiag
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.aiac r17) {
        /*
            r16 = this;
            r0 = r17
            ahya r1 = new ahya
            java.lang.String r2 = "CronetLoggerImpl#logCronetEngineBuilderInitializedInfo"
            r1.<init>(r2)
            long r1 = r0.a     // Catch: java.lang.Throwable -> Lab
            int r3 = r0.h     // Catch: java.lang.Throwable -> Lab
            int r4 = r3 + (-1)
            if (r3 == 0) goto La9
            r3 = 0
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L1c
            if (r4 == r6) goto L1a
            r4 = r3
            goto L1d
        L1a:
            r4 = r5
            goto L1d
        L1c:
            r4 = r6
        L1d:
            int r7 = r0.b     // Catch: java.lang.Throwable -> Lab
            aiad r8 = r0.c     // Catch: java.lang.Throwable -> Lab
            int r8 = r8.ordinal()     // Catch: java.lang.Throwable -> Lab
            if (r8 == r6) goto L32
            if (r8 == r5) goto L30
            r5 = 3
            if (r8 == r5) goto L30
            r5 = 4
            if (r8 == r5) goto L30
            goto L33
        L30:
            r3 = r5
            goto L33
        L32:
            r3 = r6
        L33:
            java.lang.Boolean r5 = r0.d     // Catch: java.lang.Throwable -> Lab
            int r5 = defpackage.aicz.a(r5)     // Catch: java.lang.Throwable -> Lab
            r8 = -1
            int r5 = r5 + r8
            aiaf r9 = r0.e     // Catch: java.lang.Throwable -> Lab
            int r10 = r9.a     // Catch: java.lang.Throwable -> Lab
            int r11 = r9.b     // Catch: java.lang.Throwable -> Lab
            int r12 = r9.c     // Catch: java.lang.Throwable -> Lab
            int r9 = r9.d     // Catch: java.lang.Throwable -> Lab
            aiaf r13 = r0.f     // Catch: java.lang.Throwable -> Lab
            if (r13 != 0) goto L4b
            r14 = r8
            goto L4d
        L4b:
            int r14 = r13.a     // Catch: java.lang.Throwable -> Lab
        L4d:
            if (r13 != 0) goto L51
            r15 = r8
            goto L53
        L51:
            int r15 = r13.b     // Catch: java.lang.Throwable -> Lab
        L53:
            if (r13 != 0) goto L56
            goto L58
        L56:
            int r8 = r13.c     // Catch: java.lang.Throwable -> Lab
        L58:
            if (r13 != 0) goto L5c
            r13 = -1
            goto L5e
        L5c:
            int r13 = r13.d     // Catch: java.lang.Throwable -> Lab
        L5e:
            int r0 = r0.g     // Catch: java.lang.Throwable -> Lab
            android.util.StatsEvent$Builder r6 = android.util.StatsEvent.newBuilder()     // Catch: java.lang.Throwable -> Lab
            r17 = r0
            r0 = 762(0x2fa, float:1.068E-42)
            r6.setAtomId(r0)     // Catch: java.lang.Throwable -> Lab
            r6.writeLong(r1)     // Catch: java.lang.Throwable -> Lab
            r6.writeInt(r4)     // Catch: java.lang.Throwable -> Lab
            r6.writeInt(r7)     // Catch: java.lang.Throwable -> Lab
            r6.writeInt(r3)     // Catch: java.lang.Throwable -> Lab
            r6.writeInt(r5)     // Catch: java.lang.Throwable -> Lab
            r6.writeInt(r10)     // Catch: java.lang.Throwable -> Lab
            r6.writeInt(r11)     // Catch: java.lang.Throwable -> Lab
            r6.writeInt(r12)     // Catch: java.lang.Throwable -> Lab
            r6.writeInt(r9)     // Catch: java.lang.Throwable -> Lab
            r6.writeInt(r14)     // Catch: java.lang.Throwable -> Lab
            r6.writeInt(r15)     // Catch: java.lang.Throwable -> Lab
            r6.writeInt(r8)     // Catch: java.lang.Throwable -> Lab
            r6.writeInt(r13)     // Catch: java.lang.Throwable -> Lab
            r0 = r17
            r6.writeInt(r0)     // Catch: java.lang.Throwable -> Lab
            r0 = 1
            r6.addBooleanAnnotation(r0, r0)     // Catch: java.lang.Throwable -> Lab
            r6.usePooledBuffer()     // Catch: java.lang.Throwable -> Lab
            android.util.StatsEvent r0 = r6.build()     // Catch: java.lang.Throwable -> Lab
            android.util.StatsLog.write(r0)     // Catch: java.lang.Throwable -> Lab
            android.os.Trace.endSection()
            return
        La9:
            r0 = 0
            throw r0     // Catch: java.lang.Throwable -> Lab
        Lab:
            r0 = move-exception
            r1 = r0
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lb1
            goto Lb5
        Lb1:
            r0 = move-exception
            r1.addSuppressed(r0)
        Lb5:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aicw.b(aiac):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.ClassCastException, java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [long] */
    /* JADX WARN: Type inference failed for: r6v29, types: [long] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    @Override // defpackage.aiag
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(long r43, defpackage.aiab r45, defpackage.aiaf r46, defpackage.aiad r47) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 762
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aicw.c(long, aiab, aiaf, aiad):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.aiag
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(long r25, defpackage.aiae r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 641
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aicw.d(long, aiae):void");
    }
}
