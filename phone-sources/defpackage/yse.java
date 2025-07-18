package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yse extends ywp {
    private final yrv c;
    private final upq d;

    public yse(long j, yse yseVar, yrv yrvVar, int i) {
        super(j, yseVar, i);
        this.c = yrvVar;
        int i2 = yrx.b;
        this.d = new upq(i2 + i2);
    }

    @Override // defpackage.ywp
    public final int a() {
        return yrx.b;
    }

    public final Object b(int i, Object obj) {
        return this.d.C(i + i + 1).a(obj);
    }

    public final Object c(int i) {
        return this.d.C(i + i).a;
    }

    public final Object d(int i) {
        return this.d.C(i + i + 1).a;
    }

    public final Object e(int i) {
        Object objC = c(i);
        g(i);
        return objC;
    }

    public final yrv f() {
        yrv yrvVar = this.c;
        yrvVar.getClass();
        return yrvVar;
    }

    public final void g(int i) {
        i(i, null);
    }

    public final void h(int i, boolean z) {
        if (z) {
            f().v((this.b * yrx.b) + i);
        }
        s();
    }

    public final void i(int i, Object obj) {
        this.d.C(i + i).b(obj);
    }

    public final void j(int i, Object obj) {
        this.d.C(i + i + 1).c(obj);
    }

    public final boolean k(int i, Object obj, Object obj2) {
        return this.d.C(i + i + 1).d(obj, obj2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x004b, code lost:
    
        g(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004e, code lost:
    
        if (r1 == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0050, code lost:
    
        f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
    
        return;
     */
    @Override // defpackage.ywp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(int r4) {
        /*
            r3 = this;
            int r0 = defpackage.yrx.b
            if (r4 < r0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            if (r1 == 0) goto La
            int r4 = r4 - r0
        La:
            r3.c(r4)
        Ld:
            java.lang.Object r0 = r3.d(r4)
            boolean r2 = r0 instanceof defpackage.yri
            if (r2 != 0) goto L54
            boolean r2 = r0 instanceof defpackage.yso
            if (r2 == 0) goto L1a
            goto L54
        L1a:
            yxo r2 = defpackage.yrx.j
            if (r0 == r2) goto L4b
            yxo r2 = defpackage.yrx.k
            if (r0 != r2) goto L23
            goto L4b
        L23:
            yxo r2 = defpackage.yrx.g
            if (r0 == r2) goto Ld
            yxo r2 = defpackage.yrx.f
            if (r0 == r2) goto Ld
            yxo r4 = defpackage.yrx.i
            if (r0 == r4) goto L6e
            yxo r4 = defpackage.yrx.d
            if (r0 == r4) goto L6e
            yxo r4 = defpackage.yrx.l
            if (r0 != r4) goto L38
            goto L6e
        L38:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.util.Objects.toString(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "unexpected state: "
            java.lang.String r0 = r1.concat(r0)
            r4.<init>(r0)
            throw r4
        L4b:
            r3.g(r4)
            if (r1 == 0) goto L6e
            r3.f()
            return
        L54:
            if (r1 == 0) goto L59
            yxo r2 = defpackage.yrx.j
            goto L5b
        L59:
            yxo r2 = defpackage.yrx.k
        L5b:
            boolean r0 = r3.k(r4, r0, r2)
            if (r0 == 0) goto Ld
            r3.g(r4)
            r0 = r1 ^ 1
            r3.h(r4, r0)
            if (r1 == 0) goto L6e
            r3.f()
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yse.l(int):void");
    }
}
