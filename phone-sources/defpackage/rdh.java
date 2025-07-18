package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rdh extends rem {
    public final rin a;
    private final rfc y;
    private final dvw z;

    public rdh(rfc rfcVar) {
        ret retVarC;
        uie uieVarA = ren.a();
        uieVarA.b = new rei(rfcVar.d, rfcVar.k);
        Drawable drawable = rfcVar.b;
        int i = 0;
        if (drawable == null) {
            int i2 = rfcVar.c;
            res resVar = new res((byte[]) null);
            resVar.d = null;
            resVar.b(i2);
            resVar.c(false);
            resVar.c(true);
            retVarC = resVar.a();
        } else {
            retVarC = ret.c(drawable);
        }
        uieVarA.g(retVarC);
        uieVarA.a = tst.i(Integer.valueOf(rfcVar.a));
        rek rekVar = new rek();
        rekVar.b(rfcVar.e);
        rekVar.c(90535);
        rekVar.d(90535);
        uieVarA.c = rekVar.a();
        super(uieVarA.f());
        this.z = new rdg(this, rfcVar.g, i);
        this.y = rfcVar;
        rin rinVar = rfcVar.l;
        rin rinVar2 = new rin();
        if (!rinVar2.a) {
            rinVar2.a = true;
            rrx.ap((dvv) rinVar2.b, true);
        }
        this.a = rinVar2;
        h(rfcVar.f);
        this.i = rfcVar.j;
        super.j();
        m(rej.CUSTOM_ACTION_CARD);
    }

    @Override // defpackage.rdu
    public final void b(dvk dvkVar) {
        dvs dvsVar = this.y.g;
        if (dvsVar != null) {
            dvsVar.d(dvkVar, this.z);
        }
    }

    @Override // defpackage.rdu
    public final void d(dvk dvkVar, dvw dvwVar) {
        rrx.ac(new lke((Object) this, (Object) dvkVar, (Object) dvwVar, 18, (short[]) null));
    }

    @Override // defpackage.rdu
    public final void e(dvw dvwVar) {
        rrx.ac(new qto(this, dvwVar, 13, null));
    }

    @Override // defpackage.rdu
    public final void f(dvk dvkVar) {
        rrx.ac(new qto(this, dvkVar, 12, null));
    }

    @Override // defpackage.rdu
    protected final void g() {
        dvs dvsVar = this.y.g;
        if (dvsVar != null) {
            dvsVar.i(this.z);
        }
    }

    @Override // defpackage.rdu
    public final Boolean p() {
        return Boolean.valueOf(this.a.a);
    }

    @Override // defpackage.rdu
    public final void q(dvw dvwVar) {
        rrx.ac(new qto(this, dvwVar, 11, null));
    }
}
