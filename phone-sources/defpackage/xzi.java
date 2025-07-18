package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xzi implements Closeable, xvy {
    public xzf a;
    public int b;
    public xqq c;
    public long e;
    private final ybs h;
    private final ybx i;
    private boolean k;
    private xvu l;
    private int o;
    private int p = 1;
    private int j = 5;
    public xvu d = new xvu();
    private boolean m = false;
    private int n = -1;
    public boolean f = false;
    public volatile boolean g = false;

    public xzi(xzf xzfVar, xqq xqqVar, int i, ybs ybsVar, ybx ybxVar) {
        this.a = xzfVar;
        this.c = xqqVar;
        this.b = i;
        this.h = ybsVar;
        this.i = ybxVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
    
        if (r3 <= 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005b, code lost:
    
        r8.a.a(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0062, code lost:
    
        if (r8.p != 2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
    
        r8.h.b(r3);
        r8.o += r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006f, code lost:
    
        r3 = r8.p;
        r4 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
    
        if (r3 == 0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
    
        if (r4 == 0) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0078, code lost:
    
        if (r4 == 1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007c, code lost:
    
        if (r3 == 1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007e, code lost:
    
        r0 = "BODY";
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0081, code lost:
    
        r0 = "HEADER";
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008c, code lost:
    
        throw new java.lang.AssertionError(defpackage.a.cr(r0, "Invalid state: "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008d, code lost:
    
        r2 = r8.h;
        r3 = r2.b;
        r4 = r3.length;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0093, code lost:
    
        if (r6 >= r4) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0095, code lost:
    
        r7 = r3[r6];
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009a, code lost:
    
        r8.o = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009e, code lost:
    
        if (r8.k == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a0, code lost:
    
        r3 = r8.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a4, code lost:
    
        if (r3 == defpackage.xqf.a) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a6, code lost:
    
        r4 = r8.l;
        r6 = defpackage.yaj.a;
        r4 = new defpackage.xzh(r3.a(new defpackage.yag(r4)), r8.b, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bb, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c1, code lost:
    
        throw new java.lang.RuntimeException(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00cf, code lost:
    
        throw new defpackage.xtn(defpackage.xtk.j.e("Can't decode compressed gRPC message as compression not configured"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d0, code lost:
    
        r3 = r8.l.a;
        defpackage.ybs.c(r2);
        r2 = r8.l;
        r3 = defpackage.yaj.a;
        r4 = new defpackage.yag(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e0, code lost:
    
        r8.l = null;
        r8.a.m(new defpackage.xzg(r4));
        r8.p = 1;
        r8.j = 5;
        r8.e--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00fa, code lost:
    
        r3 = r8.l.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0102, code lost:
    
        if ((r3 & 254) != 0) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0106, code lost:
    
        if (1 == (r3 & 1)) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0108, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x010a, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x010b, code lost:
    
        r8.k = r3;
        r3 = r8.l;
        r3.a(4);
        r3 = r3.e() | (((r3.e() << 24) | (r3.e() << 16)) | (r3.e() << 8));
        r8.j = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x012e, code lost:
    
        if (r3 < 0) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0132, code lost:
    
        if (r3 > r8.b) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0134, code lost:
    
        r8.n++;
        r3 = r8.h.b;
        r4 = r3.length;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x013f, code lost:
    
        if (r5 >= r4) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0141, code lost:
    
        r6 = r3[r5];
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0146, code lost:
    
        r3 = r8.i;
        r3.g.a();
        r3.h = r3.a.a();
        r8.p = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x018c, code lost:
    
        throw new defpackage.xtn(defpackage.xtk.j.e("gRPC frame header malformed: reserved bits not zero"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x018d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01a9, code lost:
    
        if (r8.f == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01af, code lost:
    
        if (c() == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b1, code lost:
    
        close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01b6, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xzi.a():void");
    }

    public final boolean b() {
        return this.d == null;
    }

    public final boolean c() {
        return this.d.a == 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, defpackage.xvy
    public final void close() {
        if (b()) {
            return;
        }
        xvu xvuVar = this.l;
        boolean z = false;
        if (xvuVar != null && xvuVar.a > 0) {
            z = true;
        }
        try {
            xvu xvuVar2 = this.d;
            if (xvuVar2 != null) {
                xvuVar2.close();
            }
            xvu xvuVar3 = this.l;
            if (xvuVar3 != null) {
                xvuVar3.close();
            }
            this.d = null;
            this.l = null;
            this.a.j(z);
        } catch (Throwable th) {
            this.d = null;
            this.l = null;
            throw th;
        }
    }
}
