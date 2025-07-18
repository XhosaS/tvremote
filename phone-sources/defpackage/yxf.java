package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class yxf {
    public final ynu e;
    public final ynu f;
    public final ynu g;

    public yxf() {
        ynv ynvVar = ynv.a;
        this.e = new ynu(this, ynvVar);
        this.f = new ynu(this, ynvVar);
        this.g = new ynu(null, ynvVar);
    }

    public boolean eG() {
        return f() instanceof yxj;
    }

    public final Object f() {
        return this.e.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0018, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
    
        if (r4.e.d(r3, ((defpackage.yxj) r5).a) == false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.yxf g() {
        /*
            r8 = this;
        L0:
            ynu r0 = r8.f
            java.lang.Object r1 = r0.a
            yxf r1 = (defpackage.yxf) r1
            r2 = 0
            r3 = r1
        L8:
            r4 = r2
        L9:
            ynu r5 = r3.e
            java.lang.Object r5 = r5.a
            if (r5 != r8) goto L19
            if (r1 != r3) goto L12
            goto L18
        L12:
            boolean r0 = r0.d(r1, r3)
            if (r0 == 0) goto L0
        L18:
            return r3
        L19:
            boolean r6 = r8.eG()
            if (r6 == 0) goto L20
            return r2
        L20:
            boolean r6 = r5 instanceof defpackage.yxj
            if (r6 == 0) goto L3b
            if (r4 == 0) goto L34
            yxj r5 = (defpackage.yxj) r5
            yxf r5 = r5.a
            ynu r6 = r4.e
            boolean r3 = r6.d(r3, r5)
            if (r3 == 0) goto L0
            r3 = r4
            goto L8
        L34:
            ynu r3 = r3.f
            java.lang.Object r3 = r3.a
            yxf r3 = (defpackage.yxf) r3
            goto L9
        L3b:
            r5.getClass()
            r4 = r5
            yxf r4 = (defpackage.yxf) r4
            r7 = r4
            r4 = r3
            r3 = r7
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yxf.g():yxf");
    }

    public final yxf h() {
        Object objF = f();
        yxj yxjVar = objF instanceof yxj ? (yxj) objF : null;
        if (yxjVar != null) {
            return yxjVar.a;
        }
        objF.getClass();
        return (yxf) objF;
    }

    public final yxf i() {
        yxf yxfVarG = g();
        if (yxfVarG != null) {
            return yxfVarG;
        }
        Object obj = this.f.a;
        while (true) {
            yxf yxfVar = (yxf) obj;
            if (!yxfVar.eG()) {
                return yxfVar;
            }
            obj = yxfVar.f.a;
        }
    }

    public final void j(int i) {
        l(new yxc(i), i);
    }

    public final void k(yxf yxfVar) {
        ynu ynuVar;
        yxf yxfVar2;
        do {
            ynuVar = yxfVar.f;
            yxfVar2 = (yxf) ynuVar.a;
            if (f() != yxfVar) {
                return;
            }
        } while (!ynuVar.d(yxfVar2, this));
        if (eG()) {
            yxfVar.g();
        }
    }

    public final boolean l(yxf yxfVar, int i) {
        yxf yxfVarI;
        do {
            yxfVarI = i();
            if (yxfVarI instanceof yxc) {
                return (((yxc) yxfVarI).a & i) == 0 && yxfVarI.l(yxfVar, i);
            }
            yxfVar.f.b(yxfVarI);
            yxfVar.e.b(this);
        } while (!yxfVarI.e.d(this, yxfVar));
        yxfVar.k(this);
        return true;
    }

    public String toString() {
        return new ykx(this) { // from class: yxe
            @Override // defpackage.ykx
            public final Object b() {
                return yoz.a(this.e);
            }
        } + "@" + yoz.b(this);
    }
}
