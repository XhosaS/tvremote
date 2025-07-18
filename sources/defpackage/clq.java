package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class clq extends clo implements cna {
    public clq() {
        throw null;
    }

    private final clk Z() {
        clk clkVar = ((clr) this.b).d;
        if (!clkVar.c) {
            return clkVar;
        }
        clk clkVarC = clkVar.clone();
        ((clr) this.b).d = clkVarC;
        return clkVarC;
    }

    private final void aa(cmt cmtVar) {
        if (cmtVar.c != this.a) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    @Override // defpackage.clo, defpackage.cmy
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public final clr j() {
        if (!((clr) this.b).A()) {
            return (clr) this.b;
        }
        ((clr) this.b).d.e();
        return (clr) super.j();
    }

    public final void X(cmt cmtVar) {
        Map map = clt.t;
        aa(cmtVar);
        if (!this.b.A()) {
            l();
        }
        clk clkVarZ = Z();
        Object obj = cmtVar.d;
        cnt cntVar = clkVarZ.b;
        cntVar.remove(obj);
        if (cntVar.isEmpty()) {
            clkVarZ.d = false;
        }
    }

    public final void Y(cmt cmtVar, Object obj) {
        Map map = clt.t;
        aa(cmtVar);
        if (!this.b.A()) {
            l();
        }
        clk clkVarZ = Z();
        cls clsVar = (cls) cmtVar.d;
        if (clsVar.a() == coh.ENUM) {
            obj = Integer.valueOf(((clx) obj).a());
        }
        clkVarZ.l(clsVar, obj);
    }

    @Override // defpackage.clo
    public final void l() {
        super.l();
        if (((clr) this.b).d != clk.a) {
            clr clrVar = (clr) this.b;
            clrVar.d = clrVar.d.clone();
        }
    }

    public clq(clr clrVar) {
        super(clrVar);
    }
}
