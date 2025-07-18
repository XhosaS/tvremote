package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class pbz implements tsl {
    public abstract void a(vnl vnlVar, vtw vtwVar);

    @Override // defpackage.tsl
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        vnl vnlVar = (vnl) obj;
        vtw vtwVarM = uyc.a.m();
        if ((vnlVar.b & 2) != 0) {
            e(vnlVar, vtwVarM);
        }
        if ((vnlVar.b & 4) != 0) {
            c(vnlVar, vtwVarM);
        }
        if ((vnlVar.b & 8) != 0) {
            f(vnlVar, vtwVarM);
        }
        if ((vnlVar.b & 16) != 0) {
            tsg tsgVar = pdf.e;
            vni vniVarB = vni.b(vnlVar.i);
            if (vniVarB == null) {
                vniVarB = vni.FONT_SIZE_UNSPECIFIED;
            }
            uyb uybVar = (uyb) tsgVar.convert(vniVarB);
            if (!vtwVarM.b.A()) {
                vtwVarM.u();
            }
            uyc uycVar = (uyc) vtwVarM.b;
            uycVar.h = uybVar.d;
            uycVar.b |= 8;
        }
        j(vnlVar, vtwVarM);
        b(vnlVar, vtwVarM);
        a(vnlVar, vtwVarM);
        i(vnlVar, vtwVarM);
        g(vnlVar, vtwVarM);
        h(vnlVar, vtwVarM);
        d(vnlVar, vtwVarM);
        return (uyc) vtwVarM.r();
    }

    public abstract void b(vnl vnlVar, vtw vtwVar);

    public abstract void c(vnl vnlVar, vtw vtwVar);

    public abstract void d(vnl vnlVar, vtw vtwVar);

    public abstract void e(vnl vnlVar, vtw vtwVar);

    public void f(vnl vnlVar, vtw vtwVar) {
        throw null;
    }

    public abstract void g(vnl vnlVar, vtw vtwVar);

    public abstract void h(vnl vnlVar, vtw vtwVar);

    public abstract void i(vnl vnlVar, vtw vtwVar);

    public abstract void j(vnl vnlVar, vtw vtwVar);
}
