package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class afvg implements Closeable, afox {
    public afvd a;
    public int b;
    public affu c;
    public long e;
    private final afzw h;
    private final agae i;
    private boolean k;
    private afor l;
    private int o;
    private int p = 1;
    private int j = 5;
    public afor d = new afor();
    private boolean m = false;
    private int n = -1;
    public boolean f = false;
    public volatile boolean g = false;

    public afvg(afvd afvdVar, affu affuVar, int i, afzw afzwVar, agae agaeVar) {
        this.a = afvdVar;
        this.c = affuVar;
        this.b = i;
        this.h = afzwVar;
        this.i = agaeVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
    
        if (r3 <= 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005b, code lost:
    
        r9.a.a(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0062, code lost:
    
        if (r9.p != 2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0064, code lost:
    
        r9.h.b(r3);
        r9.o += r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006f, code lost:
    
        r3 = r9.p;
        r4 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
    
        if (r3 == 0) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
    
        if (r4 == 0) goto L98;
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
    
        throw new java.lang.AssertionError(defpackage.a.j(r0, "Invalid state: "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008d, code lost:
    
        r2 = r9.h;
        r2.e();
        r9.o = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0096, code lost:
    
        if (r9.k == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0098, code lost:
    
        r3 = r9.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009c, code lost:
    
        if (r3 == defpackage.afey.a) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009e, code lost:
    
        r4 = r9.l;
        r6 = defpackage.afwr.a;
        r4 = new defpackage.afvf(r3.a(new defpackage.afwo(r4)), r9.b, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b9, code lost:
    
        throw new java.lang.RuntimeException(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c7, code lost:
    
        throw new defpackage.afjx(io.grpc.Status.k.withDescription("Can't decode compressed gRPC message as compression not configured"), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c8, code lost:
    
        r3 = r9.l.b;
        r2.f();
        r2 = r9.l;
        r3 = defpackage.afwr.a;
        r4 = new defpackage.afwo(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d8, code lost:
    
        r9.l = null;
        r9.a.k(new defpackage.afve(r4));
        r9.p = 1;
        r9.j = 5;
        r9.e--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f2, code lost:
    
        r3 = r9.l.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00fa, code lost:
    
        if ((r3 & 254) != 0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00fe, code lost:
    
        if (1 == (r3 & 1)) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0100, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0102, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0103, code lost:
    
        r9.k = r3;
        r3 = r9.l;
        r3.a(4);
        r3 = r3.f() | (((r3.f() << 24) | (r3.f() << 16)) | (r3.f() << 8));
        r9.j = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0126, code lost:
    
        if (r3 < 0) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x012a, code lost:
    
        if (r3 > r9.b) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x012c, code lost:
    
        r9.n++;
        r9.h.d();
        r3 = r9.i;
        r3.h.a();
        r3.i = r3.b.a();
        r9.p = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x017c, code lost:
    
        throw new defpackage.afjx(io.grpc.Status.k.withDescription("gRPC frame header malformed: reserved bits not zero"), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x017d, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0199, code lost:
    
        if (r9.f == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x019f, code lost:
    
        if (c() == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01a1, code lost:
    
        close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01a6, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 427
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afvg.a():void");
    }

    public final boolean b() {
        return this.d == null;
    }

    public final boolean c() {
        return this.d.b == 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, defpackage.afox
    public final void close() {
        if (b()) {
            return;
        }
        afor aforVar = this.l;
        boolean z = false;
        if (aforVar != null && aforVar.b > 0) {
            z = true;
        }
        try {
            afor aforVar2 = this.d;
            if (aforVar2 != null) {
                aforVar2.close();
            }
            afor aforVar3 = this.l;
            if (aforVar3 != null) {
                aforVar3.close();
            }
            this.d = null;
            this.l = null;
            this.a.i(z);
        } catch (Throwable th) {
            this.d = null;
            this.l = null;
            throw th;
        }
    }
}
