package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fep implements fdp {
    private static final int[] a = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final int[] b = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    private static final byte[] c = edt.ar("#!AMR\n");
    private static final byte[] d = edt.ar("#!AMR-WB\n");
    private final byte[] e;
    private final fel f;
    private boolean g;
    private long h;
    private int i;
    private int j;
    private int k;
    private int l;
    private long m;
    private fdr n;
    private fel o;
    private fel p;
    private fef q;
    private long r;
    private boolean s;

    public fep(byte[] bArr) {
        this.e = new byte[1];
        this.k = -1;
        fdm fdmVar = new fdm();
        this.f = fdmVar;
        this.p = fdmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0035 A[Catch: EOFException -> 0x0096, TryCatch #0 {EOFException -> 0x0096, blocks: (B:5:0x0008, B:7:0x0017, B:21:0x0035, B:23:0x003e, B:22:0x003a, B:40:0x007c, B:41:0x0089, B:42:0x008a, B:43:0x0095), top: B:45:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a A[Catch: EOFException -> 0x0096, TryCatch #0 {EOFException -> 0x0096, blocks: (B:5:0x0008, B:7:0x0017, B:21:0x0035, B:23:0x003e, B:22:0x003a, B:40:0x007c, B:41:0x0089, B:42:0x008a, B:43:0x0095), top: B:45:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int h(defpackage.fdq r10) throws defpackage.eaf {
        /*
            r9 = this;
            int r0 = r9.j
            r1 = 0
            r2 = -1
            r3 = 1
            if (r0 == 0) goto L8
            goto L50
        L8:
            r10.k()     // Catch: java.io.EOFException -> L96
            byte[] r0 = r9.e     // Catch: java.io.EOFException -> L96
            r10.i(r0, r1, r3)     // Catch: java.io.EOFException -> L96
            r0 = r0[r1]     // Catch: java.io.EOFException -> L96
            r4 = r0 & 131(0x83, float:1.84E-43)
            r5 = 0
            if (r4 > 0) goto L8a
            int r0 = r0 >> 3
            boolean r4 = r9.g     // Catch: java.io.EOFException -> L96
            r0 = r0 & 15
            if (r4 == 0) goto L28
            r6 = 10
            if (r0 < r6) goto L33
            r6 = 13
            if (r0 <= r6) goto L28
            goto L33
        L28:
            if (r4 != 0) goto L75
            r6 = 12
            if (r0 < r6) goto L33
            r6 = 14
            if (r0 > r6) goto L33
            goto L75
        L33:
            if (r4 == 0) goto L3a
            int[] r4 = defpackage.fep.b     // Catch: java.io.EOFException -> L96
            r0 = r4[r0]     // Catch: java.io.EOFException -> L96
            goto L3e
        L3a:
            int[] r4 = defpackage.fep.a     // Catch: java.io.EOFException -> L96
            r0 = r4[r0]     // Catch: java.io.EOFException -> L96
        L3e:
            r9.i = r0     // Catch: java.io.EOFException -> L96
            r9.j = r0
            int r4 = r9.k
            if (r4 != r2) goto L49
            r9.k = r0
            r4 = r0
        L49:
            if (r4 != r0) goto L50
            int r4 = r9.l
            int r4 = r4 + r3
            r9.l = r4
        L50:
            fel r4 = r9.p
            int r10 = r4.a(r10, r0, r3)
            if (r10 != r2) goto L59
            return r2
        L59:
            int r0 = r9.j
            int r0 = r0 - r10
            r9.j = r0
            if (r0 <= 0) goto L61
            return r1
        L61:
            fel r2 = r9.p
            long r3 = r9.h
            int r6 = r9.i
            r7 = 0
            r8 = 0
            r5 = 1
            r2.e(r3, r5, r6, r7, r8)
            long r2 = r9.h
            r4 = 20000(0x4e20, double:9.8813E-320)
            long r2 = r2 + r4
            r9.h = r2
            return r1
        L75:
            java.lang.String r10 = "WB"
            java.lang.String r1 = "NB"
            if (r3 == r4) goto L7c
            r10 = r1
        L7c:
            java.lang.String r1 = "Illegal AMR "
            java.lang.String r4 = " frame type "
            java.lang.String r10 = defpackage.a.cy(r0, r10, r1, r4)     // Catch: java.io.EOFException -> L96
            eaf r0 = new eaf     // Catch: java.io.EOFException -> L96
            r0.<init>(r10, r5, r3, r3)     // Catch: java.io.EOFException -> L96
            throw r0     // Catch: java.io.EOFException -> L96
        L8a:
            java.lang.String r10 = "Invalid padding bits for frame header "
            java.lang.String r10 = defpackage.a.cf(r0, r10)     // Catch: java.io.EOFException -> L96
            eaf r0 = new eaf     // Catch: java.io.EOFException -> L96
            r0.<init>(r10, r5, r3, r3)     // Catch: java.io.EOFException -> L96
            throw r0     // Catch: java.io.EOFException -> L96
        L96:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fep.h(fdq):int");
    }

    private static boolean i(fdq fdqVar, byte[] bArr) {
        fdqVar.k();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        fdqVar.i(bArr2, 0, length);
        return Arrays.equals(bArr2, bArr);
    }

    private final boolean j(fdq fdqVar) {
        byte[] bArr = c;
        if (i(fdqVar, bArr)) {
            this.g = false;
            fdqVar.l(bArr.length);
            return true;
        }
        byte[] bArr2 = d;
        if (!i(fdqVar, bArr2)) {
            return false;
        }
        this.g = true;
        fdqVar.l(bArr2.length);
        return true;
    }

    @Override // defpackage.fdp
    public final void d(long j, long j2) {
        this.h = 0L;
        this.i = 0;
        this.j = 0;
        this.r = j2;
        this.m = 0L;
    }

    @Override // defpackage.fdp
    public final boolean e(fdq fdqVar) {
        return j(fdqVar);
    }

    @Override // defpackage.fdp
    public final int g(fdq fdqVar, rsj rsjVar) throws eaf {
        eci.e(this.o);
        String str = edt.a;
        if (((fdi) fdqVar).b == 0 && !j(fdqVar)) {
            throw new eaf("Could not find AMR header.", null, true, 1);
        }
        if (!this.s) {
            this.s = true;
            boolean z = this.g;
            String str2 = true != z ? "audio/amr" : "audio/amr-wb";
            String str3 = true != z ? "audio/3gpp" : "audio/amr-wb";
            int i = true != z ? 8000 : 16000;
            int i2 = z ? b[8] : a[7];
            fel felVar = this.o;
            dzd dzdVar = new dzd();
            dzdVar.a(str2);
            dzdVar.d(str3);
            dzdVar.n = i2;
            dzdVar.E = 1;
            dzdVar.F = i;
            felVar.b(new dze(dzdVar));
        }
        int iH = h(fdqVar);
        if (this.q == null) {
            fee feeVar = new fee(-9223372036854775807L);
            this.q = feeVar;
            this.n.r(feeVar);
        }
        return iH == -1 ? -1 : 0;
    }

    @Override // defpackage.fdp
    public final /* synthetic */ List x() {
        return ImmutableList.of();
    }

    @Override // defpackage.fdp
    public final void y(fdr fdrVar) {
        this.n = fdrVar;
        fel felVarDq = fdrVar.dq(0, 1);
        this.o = felVarDq;
        this.p = felVarDq;
        fdrVar.j();
    }

    public fep() {
        this(null);
    }

    @Override // defpackage.fdp
    public final void c() {
    }

    @Override // defpackage.fdp
    public final /* synthetic */ void f() {
    }
}
