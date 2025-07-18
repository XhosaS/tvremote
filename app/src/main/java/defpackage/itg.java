package defpackage;

import j$.time.Instant;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class itg implements ite, fbx {
    private final fby a;
    private final agow b;
    private final ztw c;
    private iuw d;
    private final boolean e;
    private agux f;

    public itg(fby fbyVar, agow agowVar, ztw ztwVar) {
        fbyVar.getClass();
        ztwVar.getClass();
        this.a = fbyVar;
        this.b = agowVar;
        this.c = ztwVar;
        iuw iuwVar = iuw.a;
        iuwVar.getClass();
        this.d = iuwVar;
        Object objA = agowVar.a();
        objA.getClass();
        acbh.b((abwf) objA).getClass();
        this.e = !r1.isNegative();
        this.f = new agux() { // from class: itf
            @Override // defpackage.agux
            public final Object a(Object obj) {
                ((ite) obj).getClass();
                return agpu.a;
            }
        };
    }

    @Override // defpackage.fbx
    public final void a(abvo abvoVar) {
        iuw iuwVar = iuw.a;
        iuu iuuVar = new iuu();
        ivg ivgVar = ivg.a;
        ivf ivfVar = new ivf();
        Instant instantA = this.c.a();
        instantA.getClass();
        abzy abzyVarB = acbk.b(instantA);
        if ((ivfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ivfVar.y();
        }
        ivg ivgVar2 = (ivg) ivfVar.b;
        ivgVar2.c = abzyVarB;
        ivgVar2.b |= 1;
        if ((ivfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            ivfVar.y();
        }
        ivg ivgVar3 = (ivg) ivfVar.b;
        ivgVar3.b |= 2;
        ivgVar3.d = abvoVar;
        if ((iuuVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            iuuVar.y();
        }
        iuw iuwVar2 = (iuw) iuuVar.b;
        ivg ivgVar4 = (ivg) ivfVar.v();
        ivgVar4.getClass();
        iuwVar2.c = ivgVar4;
        iuwVar2.b = 8;
        abxd abxdVarV = iuuVar.v();
        abxdVarV.getClass();
        this.d = (iuw) abxdVarV;
        this.f.a(this);
    }

    @Override // defpackage.ite
    public final Object e(agsw agswVar) {
        List listSingletonList = Collections.singletonList(this.d);
        listSingletonList.getClass();
        return listSingletonList;
    }

    @Override // defpackage.ite
    public final /* synthetic */ Object f(agsw agswVar) {
        return agpu.a;
    }

    @Override // defpackage.ite
    public final void h() {
        this.a.l(this);
    }

    @Override // defpackage.ite
    public final void i() {
        this.a.g(this);
    }

    @Override // defpackage.ite
    public final void k(agux aguxVar) {
        this.f = aguxVar;
    }

    @Override // defpackage.ite
    public final boolean m() {
        return this.e;
    }

    @Override // defpackage.ite
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.ite
    public final void j(agux aguxVar) {
    }

    @Override // defpackage.ite
    public final void l(agvc agvcVar) {
    }
}
