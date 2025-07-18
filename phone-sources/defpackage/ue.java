package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ue extends ty {
    public uf h;
    public uv i;
    public boolean j;
    public yka k;
    public yka l;
    public boolean m;

    public ue(uf ufVar, yjv yjvVar, uv uvVar, boolean z, kw kwVar, boolean z2, yka ykaVar, yka ykaVar2, boolean z3) {
        super(yjvVar, z, kwVar, uvVar);
        this.h = ufVar;
        this.i = uvVar;
        this.j = z2;
        this.k = ykaVar;
        this.l = ykaVar2;
        this.m = z3;
    }

    @Override // defpackage.ty
    public final Object b(yjz yjzVar, yih yihVar) {
        Object objA = this.h.a(rv.b, new uc(yjzVar, this, (yih) null, 0), yihVar);
        return objA == yio.a ? objA : ygi.a;
    }

    @Override // defpackage.ty
    public final void o(long j) {
        if (!this.A || yks.e(this.k, ub.a)) {
            return;
        }
        ykr.q(F(), null, 4, new ud(this, j, null, 1, null), 1);
    }

    @Override // defpackage.ty
    public final void r(long j) {
        if (!this.A || yks.e(this.l, ub.b)) {
            return;
        }
        ykr.q(F(), null, 4, new ud(this, j, (yih) null, 0), 1);
    }

    @Override // defpackage.ty
    public final boolean v() {
        return this.j;
    }
}
