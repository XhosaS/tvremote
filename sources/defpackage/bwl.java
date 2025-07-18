package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bwl implements bxk {
    private final bxk a;
    private final UUID b;
    private final String c;
    private final String d;
    private Thread e;

    public bwl(String str, bxk bxkVar, bxj bxjVar) {
        this.d = str;
        this.a = bxkVar;
        this.b = bxkVar.f();
        this.c = bxkVar.d();
        Object obj = bxjVar.c;
        this.e = Thread.currentThread();
    }

    public static String aR(UUID uuid) {
        return "tk-trace-id: ".concat(String.valueOf(Long.toString(uuid.getLeastSignificantBits() >>> 1, 36)));
    }

    @Override // defpackage.bxk
    public final bxk a() {
        return this.a;
    }

    @Override // defpackage.bxk
    public final String c() {
        return this.d;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [bxk, java.lang.Object] */
    @Override // defpackage.bxl, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        bxj bxjVarA = bwv.a();
        ?? r1 = bxjVarA.b;
        if (r1 == 0) {
            throw new bws("Tried to end [" + c() + "], but no trace was active. This is caused by mismatched or missing calls to beginSpan.");
        }
        if (this == r1) {
            bwv.c(bxjVarA, r1.a());
            this.e = null;
            return;
        }
        throw new bwt("Tried to end span " + c() + ", but that span is not the current span. The current span is " + r1.c() + ".");
    }

    @Override // defpackage.bxk
    public final String d() {
        return this.c;
    }

    @Override // defpackage.bxk
    public final Thread e() {
        return this.e;
    }

    @Override // defpackage.bxk
    public final UUID f() {
        return this.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a2, code lost:
    
        r9 = r1.c.d;
        r16 = r10;
        r10 = java.lang.Integer.valueOf(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b0, code lost:
    
        if (r9.containsKey(r10) != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b2, code lost:
    
        r1.c.d.put(r10, new defpackage.bxg(r7, 1073741824));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00be, code lost:
    
        if (r15 == null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c0, code lost:
    
        r15.c = r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cf, code lost:
    
        if (r15 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d1, code lost:
    
        r15.c = r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d5, code lost:
    
        r1.d = r7;
        r1.e++;
        r1.b();
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x025d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 744
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwl.toString():java.lang.String");
    }

    public bwl(String str, UUID uuid, String str2, bxj bxjVar) {
        this.d = str;
        this.a = null;
        this.b = uuid;
        this.c = str2;
        Object obj = bxjVar.c;
        this.e = Thread.currentThread();
    }
}
