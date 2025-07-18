package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayp<T> extends bko implements byl {
    public ayd a;
    public yjz b;
    public uv c;
    private boolean d;

    public ayp(ayd aydVar, yjz yjzVar, uv uvVar) {
        this.a = aydVar;
        this.b = yjzVar;
        this.c = uvVar;
    }

    @Override // defpackage.byl
    public final bvu b(bvv bvvVar, bvs bvsVar, long j) {
        bwj bwjVarU = bvsVar.u(j);
        boolean z = true;
        z = true;
        if (!bvvVar.cA() || !this.d) {
            yfw yfwVar = (yfw) this.b.a(new cmh((bwjVarU.b & 4294967295L) | (bwjVarU.a << 32)), new clv(j));
            ayd aydVar = this.a;
            ayv ayvVar = (ayv) yfwVar.a;
            Object obj = yfwVar.b;
            if (!yks.e(aydVar.n(), ayvVar)) {
                aydVar.e.b(ayvVar);
                bhi bhiVar = aydVar.g;
                aye ayeVar = new aye(aydVar, obj, z ? 1 : 0, null);
                if (((yyk) bhiVar.a).c()) {
                    try {
                        ayeVar.a();
                    } finally {
                        ((yyk) bhiVar.a).d();
                    }
                } else {
                    aydVar.l(obj);
                }
            }
        }
        if (!bvvVar.cA() && !this.d) {
            z = false;
        }
        this.d = z;
        return bvvVar.cz(bwjVarU.a, bwjVarU.b, yhc.a, new gk((Object) bvvVar, (Object) this, (Object) bwjVarU, 12, (short[]) null));
    }

    @Override // defpackage.bko
    public final void ch() {
        this.d = false;
    }

    @Override // defpackage.byl
    public final /* synthetic */ int e(buz buzVar, buy buyVar, int i) {
        return fh.x(this, buzVar, buyVar, i);
    }

    @Override // defpackage.byl
    public final /* synthetic */ int f(buz buzVar, buy buyVar, int i) {
        return fh.y(this, buzVar, buyVar, i);
    }

    @Override // defpackage.byl
    public final /* synthetic */ int g(buz buzVar, buy buyVar, int i) {
        return fh.z(this, buzVar, buyVar, i);
    }

    @Override // defpackage.byl
    public final /* synthetic */ int h(buz buzVar, buy buyVar, int i) {
        return fh.A(this, buzVar, buyVar, i);
    }
}
