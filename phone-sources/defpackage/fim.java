package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fim {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f = new int[255];
    private final edi g = new edi(255);

    public final void a() {
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
    }

    public final boolean b(fdq fdqVar, boolean z) throws eaf {
        a();
        edi ediVar = this.g;
        ediVar.G(27);
        if (fki.Z(fdqVar, ediVar.a, 27, z) && ediVar.r() == 1332176723) {
            if (ediVar.j() != 0) {
                if (z) {
                    return false;
                }
                throw new eaf("unsupported bit stream revision", null, false, 1);
            }
            this.a = ediVar.j();
            this.b = ediVar.o();
            ediVar.p();
            ediVar.p();
            ediVar.p();
            int iJ = ediVar.j();
            this.c = iJ;
            this.d = iJ + 27;
            ediVar.G(iJ);
            if (fki.Z(fdqVar, ediVar.a, this.c, z)) {
                for (int i = 0; i < this.c; i++) {
                    int[] iArr = this.f;
                    int iJ2 = ediVar.j();
                    iArr[i] = iJ2;
                    this.e += iJ2;
                }
                return true;
            }
        }
        return false;
    }

    public final boolean c(fdq fdqVar) {
        return d(fdqVar, -1L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
    
        if (r12 == (-1)) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if (r0.b >= r12) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
    
        if (r11.c(1) != (-1)) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(defpackage.fdq r11, long r12) {
        /*
            r10 = this;
            r0 = r11
            fdi r0 = (defpackage.fdi) r0
            long r1 = r0.b
            long r3 = r11.e()
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L11
            r1 = r3
            goto L12
        L11:
            r1 = r2
        L12:
            defpackage.a.H(r1)
            edi r1 = r10.g
            r4 = 4
            r1.G(r4)
        L1b:
            r5 = -1
            int r5 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r5 == 0) goto L2b
            long r6 = r0.b
            r8 = 4
            long r6 = r6 + r8
            int r6 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r6 < 0) goto L2b
            goto L49
        L2b:
            byte[] r6 = r1.a
            boolean r6 = defpackage.fki.Z(r11, r6, r4, r3)
            if (r6 == 0) goto L49
            r1.K(r2)
            long r5 = r1.r()
            r7 = 1332176723(0x4f676753, double:6.58182753E-315)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L45
            r11.k()
            return r3
        L45:
            r11.l(r3)
            goto L1b
        L49:
            if (r5 == 0) goto L51
            long r6 = r0.b
            int r1 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r1 >= 0) goto L58
        L51:
            int r1 = r11.c(r3)
            r4 = -1
            if (r1 != r4) goto L49
        L58:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fim.d(fdq, long):boolean");
    }
}
