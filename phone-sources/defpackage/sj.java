package defpackage;

import android.support.v7.widget.ActivityChooserView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sj implements vs {
    public static final bii a = new bij(new xb(1), new pl(7));
    public float b;
    private final bdy e;
    private final bdy f;
    private final bdn g;
    private final bdn h = new bcf(0);
    public final kw c = new kw((byte[]) null, (byte[]) null);
    private final bdn i = new bcf(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    private final vs d = new tj(new kb(this, 14));

    public sj(int i) {
        this.g = new bcf(i);
        fg fgVar = new fg(this, 19);
        ivx ivxVar = bdt.a;
        this.e = new bbh(fgVar, null);
        this.f = new bbh(new fg(this, 20), null);
    }

    @Override // defpackage.vs
    public final float a(float f) {
        return this.d.a(f);
    }

    public final int b() {
        return this.i.e();
    }

    public final int c() {
        return this.g.e();
    }

    @Override // defpackage.vs
    public final Object d(rv rvVar, yjz yjzVar, yih yihVar) {
        Object objD = this.d.d(rvVar, yjzVar, yihVar);
        return objD == yio.a ? objD : ygi.a;
    }

    public final void e(int i) {
        this.i.h(i);
        bit bitVarT = bcm.t();
        yjv yjvVarI = bitVarT != null ? bitVarT.i() : null;
        bit bitVarU = bcm.u(bitVarT);
        try {
            if (c() > i) {
                f(i);
            }
        } finally {
            bcm.z(bitVarT, bitVarU, yjvVarI);
        }
    }

    public final void f(int i) {
        this.g.h(i);
    }

    public final void g(int i) {
        this.h.h(i);
    }

    @Override // defpackage.vs
    public final boolean h() {
        return ((Boolean) this.f.a()).booleanValue();
    }

    @Override // defpackage.vs
    public final boolean i() {
        return ((Boolean) this.e.a()).booleanValue();
    }

    @Override // defpackage.vs
    public final boolean j() {
        return this.d.j();
    }
}
