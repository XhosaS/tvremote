package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vty extends vtw implements vua, pkb {
    public vty() {
        throw null;
    }

    private final vtr bM() {
        vtr vtrVar = ((vtz) this.b).l;
        if (!vtrVar.c) {
            return vtrVar;
        }
        vtr vtrVarC = vtrVar.clone();
        ((vtz) this.b).l = vtrVarC;
        return vtrVarC;
    }

    private final void bN(vvd vvdVar) {
        if (vvdVar.d != this.a) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    @Override // defpackage.vtw, defpackage.vvi
    /* renamed from: bH, reason: merged with bridge method [inline-methods] */
    public final vtz s() {
        if (!((vtz) this.b).A()) {
            return (vtz) this.b;
        }
        ((vtz) this.b).l.e();
        return (vtz) super.s();
    }

    @Override // defpackage.vua
    public final Object bI(vvd vvdVar) {
        vtz vtzVar = (vtz) this.b;
        vtzVar.i(vvdVar);
        Object objK = vtzVar.l.k((vub) vvdVar.c);
        if (objK == null) {
            return vvdVar.b;
        }
        vvdVar.c(objK);
        return objK;
    }

    @Override // defpackage.vua
    public final boolean bJ(vvd vvdVar) {
        vtz vtzVar = (vtz) this.b;
        vtzVar.i(vvdVar);
        return vtzVar.l.m((vub) vvdVar.c);
    }

    public final void bK(vvd vvdVar) {
        Map map = vuc.N;
        bN(vvdVar);
        if (!this.b.A()) {
            u();
        }
        vtr vtrVarBM = bM();
        Object obj = vvdVar.c;
        vwc vwcVar = vtrVarBM.b;
        vwcVar.remove(obj);
        if (vwcVar.isEmpty()) {
            vtrVarBM.d = false;
        }
    }

    public final void bL(vvd vvdVar, Object obj) {
        Map map = vuc.N;
        bN(vvdVar);
        if (!this.b.A()) {
            u();
        }
        vtr vtrVarBM = bM();
        vub vubVar = (vub) vvdVar.c;
        if (vubVar.a() == vwp.ENUM) {
            obj = Integer.valueOf(((vug) obj).a());
        }
        vtrVarBM.l(vubVar, obj);
    }

    @Override // defpackage.vtw
    public final void u() {
        super.u();
        if (((vtz) this.b).l != vtr.a) {
            vtz vtzVar = (vtz) this.b;
            vtzVar.l = vtzVar.l.clone();
        }
    }

    public vty(vtz vtzVar) {
        super(vtzVar);
    }
}
