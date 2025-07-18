package defpackage;

import android.text.TextUtils;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gnd implements gmy {
    public final gne a;
    public final gng b;
    public final agte c;
    private final ahbt d;
    private final ahbt e;

    public gnd(gne gneVar, gng gngVar, agte agteVar, ahbt ahbtVar, ahbt ahbtVar2) {
        gneVar.getClass();
        gngVar.getClass();
        agteVar.getClass();
        ahbtVar.getClass();
        ahbtVar2.getClass();
        this.a = gneVar;
        this.b = gngVar;
        this.c = agteVar;
        this.d = ahbtVar;
        this.e = ahbtVar2;
        ahal.e(ahbtVar2, null, 0, new gnb(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[PHI: r1
  0x003b: PHI (r1v7 j$.time.Instant) = (r1v5 j$.time.Instant), (r1v10 j$.time.Instant) binds: [B:14:0x0041, B:11:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.gmy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j$.time.Instant a(java.lang.String r6) {
        /*
            r5 = this;
            gne r0 = r5.a
            java.util.Map r0 = r0.d
            java.lang.Object r0 = r0.get(r6)
            j$.time.Instant r0 = (j$.time.Instant) r0
            if (r0 != 0) goto Le
            j$.time.Instant r0 = defpackage.gne.a
        Le:
            j$.time.Instant r1 = defpackage.gne.a
            boolean r1 = defpackage.agvy.c(r0, r1)
            if (r1 == 0) goto L5b
            gng r0 = r5.b
            java.lang.String r1 = "timestamp"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            java.lang.String[] r2 = new java.lang.String[]{r6}
            java.lang.String r3 = "1"
            java.lang.String r4 = "package_name=?"
            android.database.Cursor r0 = r0.a(r1, r4, r2, r3)
            boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L3f
            r1 = 0
            long r1 = r0.getLong(r1)     // Catch: java.lang.Throwable -> L4f
            j$.time.Instant r1 = j$.time.Instant.ofEpochMilli(r1)     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto L44
        L3b:
            r0.close()
            goto L44
        L3f:
            j$.time.Instant r1 = j$.time.Instant.EPOCH     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto L44
            goto L3b
        L44:
            gne r0 = r5.a
            java.util.Map r0 = r0.d
            r0.put(r6, r1)
            r1.getClass()
            return r1
        L4f:
            r6 = move-exception
            if (r0 == 0) goto L5a
            r0.close()     // Catch: java.lang.Throwable -> L56
            goto L5a
        L56:
            r0 = move-exception
            r6.addSuppressed(r0)
        L5a:
            throw r6
        L5b:
            r0.getClass()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gnd.a(java.lang.String):j$.time.Instant");
    }

    @Override // defpackage.gmy
    public final void b(gnf gnfVar) {
        ahal.e(this.d, null, 0, new gnc(this, gnfVar, null), 3);
        String str = gnfVar.b;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        gne gneVar = this.a;
        Instant instant = gnfVar.a;
        int i = gnfVar.c;
        gnh gnhVar = new gnh(str, instant);
        if (i == 2) {
            gne.c(gneVar.b, gneVar.e, gnhVar);
        } else if (i == 3) {
            gne.c(gneVar.c, gneVar.f, gnhVar);
        }
        gneVar.d(gnhVar);
    }
}
