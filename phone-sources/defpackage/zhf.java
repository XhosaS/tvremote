package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zhf implements zho {
    private final zgm a;
    private final zgk b;
    private zhj c;
    private int d;
    private boolean e;
    private long f;

    public zhf(zgm zgmVar) {
        this.a = zgmVar;
        zgk zgkVar = ((zhi) zgmVar).b;
        this.b = zgkVar;
        zhj zhjVar = zgkVar.a;
        this.c = zhjVar;
        this.d = zhjVar != null ? zhjVar.b : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
    
        if (r8 == r9.b) goto L13;
     */
    @Override // defpackage.zho
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(defpackage.zgk r7, long r8) {
        /*
            r6 = this;
            boolean r8 = r6.e
            if (r8 != 0) goto L59
            zhj r8 = r6.c
            if (r8 == 0) goto L20
            zgk r9 = r6.b
            zhj r9 = r9.a
            if (r8 != r9) goto L18
            int r8 = r6.d
            r9.getClass()
            int r9 = r9.b
            if (r8 != r9) goto L18
            goto L20
        L18:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Peek source is invalid because upstream source was used"
            r7.<init>(r8)
            throw r7
        L20:
            zgm r8 = r6.a
            long r0 = r6.f
            r2 = 1
            long r0 = r0 + r2
            boolean r8 = r8.D(r0)
            if (r8 != 0) goto L30
            r7 = -1
            return r7
        L30:
            zhj r8 = r6.c
            if (r8 != 0) goto L40
            zgk r8 = r6.b
            zhj r8 = r8.a
            if (r8 == 0) goto L40
            r6.c = r8
            int r8 = r8.b
            r6.d = r8
        L40:
            zgk r0 = r6.b
            long r8 = r0.b
            long r1 = r6.f
            long r8 = r8 - r1
            r1 = 8192(0x2000, double:4.0474E-320)
            long r4 = java.lang.Math.min(r1, r8)
            long r2 = r6.f
            r1 = r7
            r0.G(r1, r2, r4)
            long r7 = r6.f
            long r7 = r7 + r4
            r6.f = r7
            return r4
        L59:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "closed"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zhf.a(zgk, long):long");
    }

    @Override // defpackage.zho
    public final zhq b() {
        return this.a.b();
    }

    @Override // defpackage.zho, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.e = true;
    }
}
