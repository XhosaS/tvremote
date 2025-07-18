package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byo extends bzq {
    private static final tac E;
    private buh D;
    public byl f;
    public clv g;
    public bza h;

    static {
        tac tacVar = new tac(null, null);
        tacVar.o(bnq.e);
        tacVar.v(1.0f);
        tacVar.w(1);
        E = tacVar;
    }

    public byo(bys bysVar, byl bylVar) {
        super(bysVar);
        this.f = bylVar;
        this.h = bysVar.h != null ? new bym(this) : null;
        this.D = (bylVar.E().r & 512) != 0 ? new buh(this, (buf) bylVar) : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void az() {
        /*
            r7 = this;
            boolean r0 = r7.j
            if (r0 == 0) goto L5
            return
        L5:
            r7.aj()
            buh r0 = r7.D
            r1 = 0
            if (r0 == 0) goto L5f
            buf r2 = r0.b
            bza r3 = r7.h
            r3.getClass()
            boolean r2 = r2.d()
            if (r2 != 0) goto L58
            boolean r0 = r0.c
            if (r0 != 0) goto L58
            long r2 = r7.c
            bza r0 = r7.h
            r4 = 0
            if (r0 == 0) goto L2f
            long r5 = r0.s()
            cmh r0 = new cmh
            r0.<init>(r5)
            goto L30
        L2f:
            r0 = r4
        L30:
            boolean r0 = defpackage.cmh.b(r2, r0)
            if (r0 == 0) goto L58
            bzq r0 = r7.F()
            long r2 = r0.c
            bzq r0 = r7.F()
            bza r0 = r0.B()
            if (r0 == 0) goto L50
            long r4 = r0.s()
            cmh r0 = new cmh
            r0.<init>(r4)
            r4 = r0
        L50:
            boolean r0 = defpackage.cmh.b(r2, r4)
            if (r0 == 0) goto L58
            r0 = 1
            goto L59
        L58:
            r0 = r1
        L59:
            bzq r2 = r7.F()
            r2.t = r0
        L5f:
            bvu r0 = r7.J()
            r0.f()
            bzq r0 = r7.F()
            r0.t = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byo.az():void");
    }

    @Override // defpackage.bzq
    public final bko A() {
        return this.f.E();
    }

    @Override // defpackage.bzq
    public final bza B() {
        return this.h;
    }

    @Override // defpackage.bzq
    public final void C() {
        if (this.h == null) {
            this.h = new bym(this);
        }
    }

    @Override // defpackage.bzq
    public final void E(bnp bnpVar, bpu bpuVar) {
        bzq bzqVar;
        F().ac(bnpVar, bpuVar);
        if (!byv.a(this.s).A() || (bzqVar = this.v) == null) {
            return;
        }
        if (a.s(this.c, bzqVar.c) && a.s(bzqVar.x, 0L)) {
            return;
        }
        ay(bnpVar, E);
    }

    public final bzq F() {
        bzq bzqVar = this.v;
        bzqVar.getClass();
        return bzqVar;
    }

    public final void G(byl bylVar) {
        if (!yks.e(bylVar, this.f)) {
            if ((bylVar.E().r & 512) != 0) {
                buf bufVar = (buf) bylVar;
                buh buhVar = this.D;
                if (buhVar != null) {
                    buhVar.b = bufVar;
                } else {
                    buhVar = new buh(this, bufVar);
                }
                this.D = buhVar;
            } else {
                this.D = null;
            }
        }
        this.f = bylVar;
    }

    @Override // defpackage.buy
    public final int c(int i) {
        buh buhVar = this.D;
        if (buhVar == null) {
            return this.f.e(this, F(), i);
        }
        buf bufVar = buhVar.b;
        F();
        return bufVar.i();
    }

    @Override // defpackage.bzq, defpackage.bwj
    public final void cm(long j, float f, yjv yjvVar) {
        super.cm(j, f, yjvVar);
        az();
    }

    @Override // defpackage.buy
    public final int d(int i) {
        buh buhVar = this.D;
        if (buhVar == null) {
            return this.f.f(this, F(), i);
        }
        buf bufVar = buhVar.b;
        F();
        return bufVar.j();
    }

    @Override // defpackage.buy
    public final int e(int i) {
        buh buhVar = this.D;
        if (buhVar == null) {
            return this.f.g(this, F(), i);
        }
        buf bufVar = buhVar.b;
        F();
        return bufVar.k();
    }

    @Override // defpackage.buy
    public final int f(int i) {
        buh buhVar = this.D;
        if (buhVar == null) {
            return this.f.h(this, F(), i);
        }
        buf bufVar = buhVar.b;
        F();
        return bufVar.l();
    }

    @Override // defpackage.byz
    public final int q(bub bubVar) {
        bza bzaVar = this.h;
        return bzaVar != null ? bzaVar.p.c(bubVar, Integer.MIN_VALUE) : fh.w(this, bubVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2  */
    @Override // defpackage.bvs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.bwj u(long r9) {
        /*
            r8 = this;
            boolean r0 = r8.u
            if (r0 == 0) goto L13
            clv r9 = r8.g
            if (r9 == 0) goto Lb
            long r9 = r9.a
            goto L13
        Lb:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Lookahead constraints cannot be null in approach pass."
            r9.<init>(r10)
            throw r9
        L13:
            r8.z(r9)
            buh r0 = r8.D
            if (r0 == 0) goto La2
            byo r1 = r0.a
            buf r2 = r0.b
            bza r1 = r1.h
            r1.getClass()
            bvu r1 = r1.J()
            r1.b()
            r1.a()
            boolean r1 = r2.c()
            r3 = 0
            r4 = 1
            if (r1 != 0) goto L40
            clv r1 = r8.g
            boolean r1 = defpackage.clv.f(r9, r1)
            if (r1 != 0) goto L3e
            goto L40
        L3e:
            r1 = r3
            goto L41
        L40:
            r1 = r4
        L41:
            r0.c = r1
            if (r1 != 0) goto L4b
            bzq r1 = r8.F()
            r1.u = r4
        L4b:
            r8.F()
            bvu r1 = r2.a()
            bzq r2 = r8.F()
            r2.u = r3
            int r2 = r1.b()
            bza r5 = r8.h
            r5.getClass()
            int r5 = r5.a
            if (r2 != r5) goto L73
            int r2 = r1.a()
            bza r5 = r8.h
            r5.getClass()
            int r5 = r5.b
            if (r2 != r5) goto L73
            r3 = r4
        L73:
            boolean r0 = r0.c
            if (r0 != 0) goto La0
            bzq r0 = r8.F()
            long r4 = r0.c
            bzq r0 = r8.F()
            bza r0 = r0.B()
            if (r0 == 0) goto L91
            long r6 = r0.s()
            cmh r0 = new cmh
            r0.<init>(r6)
            goto L92
        L91:
            r0 = 0
        L92:
            boolean r0 = defpackage.cmh.b(r4, r0)
            if (r0 == 0) goto La0
            if (r3 != 0) goto La0
            byn r0 = new byn
            r0.<init>(r1, r8)
            r1 = r0
        La0:
            if (r1 != 0) goto Lac
        La2:
            byl r0 = r8.f
            bzq r1 = r8.F()
            bvu r1 = r0.b(r8, r1, r9)
        Lac:
            r8.ap(r1)
            r8.ai()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byo.u(long):bwj");
    }

    @Override // defpackage.bzq, defpackage.bwj
    public final void x(long j, float f, bpu bpuVar) {
        super.x(j, f, bpuVar);
        az();
    }
}
