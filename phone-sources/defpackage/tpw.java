package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class tpw implements tqt {
    private final tqt a;
    private final UUID b;
    private final String c;
    private final String d;
    private Thread e;

    public tpw(String str, tqt tqtVar, yau yauVar) {
        this.d = str;
        this.a = tqtVar;
        this.b = tqtVar.f();
        this.c = tqtVar.d();
        Object obj = yauVar.a;
        this.e = Thread.currentThread();
    }

    public static String ey(UUID uuid) {
        return "tk-trace-id: ".concat(String.valueOf(Long.toString(uuid.getLeastSignificantBits() >>> 1, 36)));
    }

    @Override // defpackage.tqt
    public final tqt a() {
        return this.a;
    }

    @Override // defpackage.tqt
    public final String c() {
        return this.d;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, tqt] */
    @Override // defpackage.tqu, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        yau yauVarD = tqg.d();
        ?? r1 = yauVarD.c;
        if (r1 == 0) {
            throw new tqd("Tried to end [" + c() + "], but no trace was active. This is caused by mismatched or missing calls to beginSpan.");
        }
        if (this == r1) {
            tqg.e(yauVarD, r1.a());
            this.e = null;
            return;
        }
        throw new tqe("Tried to end span " + c() + ", but that span is not the current span. The current span is " + r1.c() + ".");
    }

    @Override // defpackage.tqt
    public final String d() {
        return this.c;
    }

    @Override // defpackage.tqt
    public final Thread e() {
        return this.e;
    }

    @Override // defpackage.tqt
    public final UUID f() {
        return this.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a4, code lost:
    
        r9 = r1.c.d;
        r16 = r10;
        r10 = java.lang.Integer.valueOf(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b2, code lost:
    
        if (r9.containsKey(r10) != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b4, code lost:
    
        r1.c.d.put(r10, new defpackage.tqq(r11, 1073741824));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c0, code lost:
    
        if (r15 == null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c2, code lost:
    
        r15.c = r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d1, code lost:
    
        if (r15 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d3, code lost:
    
        r15.c = r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d7, code lost:
    
        r1.d = r11;
        r1.e++;
        r1.b();
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0261  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 748
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tpw.toString():java.lang.String");
    }

    public tpw(String str, UUID uuid, String str2, yau yauVar) {
        this.d = str;
        this.a = null;
        this.b = uuid;
        this.c = str2;
        Object obj = yauVar.a;
        this.e = Thread.currentThread();
    }
}
