package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class flk implements fln {
    private static final byte[] c = {73, 68, 51};
    private final boolean d;
    private final String g;
    private final int h;
    private final String i;
    private String j;
    private fel k;
    private fel l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private boolean q;
    private int t;
    private boolean u;
    private int v;
    private fel w;
    private long x;
    private final edh e = new edh(new byte[7]);
    private final edi f = new edi(Arrays.copyOf(c, 10));
    private int r = -1;
    private int s = -1;
    public long a = -9223372036854775807L;
    public long b = -9223372036854775807L;

    public flk(boolean z, String str, int i, String str2) {
        this.d = z;
        this.g = str;
        this.h = i;
        this.i = str2;
        h();
    }

    public static boolean f(int i) {
        return (i & 65526) == 65520;
    }

    private final void g() {
        this.q = false;
        h();
    }

    private final void h() {
        this.m = 0;
        this.n = 0;
        this.o = 256;
    }

    private final void i() {
        this.m = 3;
        this.n = 0;
    }

    private final void j(fel felVar, long j, int i, int i2) {
        this.m = 4;
        this.n = i;
        this.w = felVar;
        this.x = j;
        this.v = i2;
    }

    private final boolean k(edi ediVar, byte[] bArr, int i) {
        int iMin = Math.min(ediVar.a(), i - this.n);
        ediVar.F(bArr, this.n, iMin);
        int i2 = this.n + iMin;
        this.n = i2;
        return i2 == i;
    }

    private static final boolean l(byte b) {
        return f((b & 255) | 65280);
    }

    private static final boolean m(edi ediVar, byte[] bArr, int i) {
        if (ediVar.a() < i) {
            return false;
        }
        ediVar.F(bArr, 0, i);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x023b, code lost:
    
        r17.m = 1;
        r17.n = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0241, code lost:
    
        i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0244, code lost:
    
        r18.K(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0227, code lost:
    
        r17.t = (r14 & 8) >> 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0230, code lost:
    
        if (1 == ((r14 & 1) ^ 1)) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0232, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0234, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0235, code lost:
    
        r17.p = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0239, code lost:
    
        if (r17.q != false) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0227 A[EDGE_INSN: B:143:0x0227->B:94:0x0227 BREAK  A[LOOP:1: B:48:0x017e->B:169:0x017e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e3  */
    @Override // defpackage.fln
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.edi r18) {
        /*
            Method dump skipped, instructions count: 685
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.flk.a(edi):void");
    }

    @Override // defpackage.fln
    public final void b(fdr fdrVar, fmr fmrVar) {
        fmrVar.c();
        this.j = fmrVar.b();
        fel felVarDq = fdrVar.dq(fmrVar.a(), 1);
        this.k = felVarDq;
        this.w = felVarDq;
        if (!this.d) {
            this.l = new fdm();
            return;
        }
        fmrVar.c();
        fel felVarDq2 = fdrVar.dq(fmrVar.a(), 5);
        this.l = felVarDq2;
        dzd dzdVar = new dzd();
        dzdVar.a = fmrVar.b();
        dzdVar.a(this.i);
        dzdVar.d("application/id3");
        felVarDq2.b(new dze(dzdVar));
    }

    @Override // defpackage.fln
    public final void d(long j, int i) {
        this.b = j;
    }

    @Override // defpackage.fln
    public final void e() {
        this.b = -9223372036854775807L;
        g();
    }

    @Override // defpackage.fln
    public final void c(boolean z) {
    }
}
