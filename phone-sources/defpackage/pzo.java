package defpackage;

import android.content.Context;
import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pzo {
    public final pyg a;
    public final qms b;
    private final qei c;
    private final qjq d;
    private final qmt e;
    private final pvg f;
    private final Context g;
    private final qoj h;
    private final cb i;

    static {
        tvn.n("GnpSdk");
    }

    public pzo(qei qeiVar, qjq qjqVar, pyg pygVar, qmt qmtVar, qms qmsVar, pvg pvgVar, Context context, qoj qojVar, cb cbVar) {
        qeiVar.getClass();
        qjqVar.getClass();
        pygVar.getClass();
        pvgVar.getClass();
        qojVar.getClass();
        this.c = qeiVar;
        this.d = qjqVar;
        this.a = pygVar;
        this.e = qmtVar;
        this.b = qmsVar;
        this.f = pvgVar;
        this.g = context;
        this.h = qojVar;
        this.i = cbVar;
    }

    public final vjq a(qen qenVar, vmd vmdVar, vme vmeVar) throws qjr {
        pzo pzoVar;
        qen qenVar2;
        qjr qjrVar;
        vmdVar.getClass();
        vmeVar.getClass();
        try {
            vtw vtwVarM = vjz.a.m();
            vtwVarM.getClass();
            vtw vtwVarM2 = vjy.a.m();
            vtwVarM2.getClass();
            String str = this.c.b;
            if (str != null) {
                try {
                    vef.K(Long.parseLong(str), vtwVarM2);
                } catch (qjr e) {
                    qjrVar = e;
                    pzoVar = this;
                    qenVar2 = qenVar;
                    pvh pvhVarA = pzoVar.f.a(vhq.FAILED_TO_GET_IID);
                    pvhVarA.e(qenVar2);
                    pvhVarA.a();
                    throw qjrVar;
                }
            }
            vef.J(this.d.c(), vtwVarM2);
            vef.M(vef.I(vtwVarM2), vtwVarM);
            vjz vjzVarL = vef.L(vtwVarM);
            vtw vtwVarM3 = vjq.a.m();
            vtwVarM3.getClass();
            String str2 = this.c.a;
            str2.getClass();
            if (!vtwVarM3.b.A()) {
                vtwVarM3.u();
            }
            vjq vjqVar = (vjq) vtwVarM3.b;
            vjqVar.b |= 2;
            vjqVar.d = str2;
            vkk vkkVarB = this.e.b(qenVar);
            if (!vtwVarM3.b.A()) {
                vtwVarM3.u();
            }
            vjq vjqVar2 = (vjq) vtwVarM3.b;
            vjqVar2.e = vkkVarB;
            vjqVar2.b |= 4;
            vki vkiVar = (vki) ykr.n(yim.a, new pfd(this, qenVar, (yih) null, 10));
            vkiVar.getClass();
            if (!vtwVarM3.b.A()) {
                vtwVarM3.u();
            }
            vuc vucVar = vtwVarM3.b;
            vjq vjqVar3 = (vjq) vucVar;
            vjqVar3.g = vkiVar;
            vjqVar3.b |= 8;
            if (!vucVar.A()) {
                vtwVarM3.u();
            }
            vuc vucVar2 = vtwVarM3.b;
            vjq vjqVar4 = (vjq) vucVar2;
            vjqVar4.c = vmdVar.p;
            vjqVar4.b |= 1;
            if (!vucVar2.A()) {
                vtwVarM3.u();
            }
            vuc vucVar3 = vtwVarM3.b;
            vjq vjqVar5 = (vjq) vucVar3;
            vjqVar5.h = vjzVarL;
            vjqVar5.b |= 16;
            if (!vucVar3.A()) {
                vtwVarM3.u();
            }
            vjq vjqVar6 = (vjq) vtwVarM3.b;
            vjqVar6.i = vmeVar;
            vjqVar6.b |= 32;
            ((snf) this.h.e.get()).b(this.g.getPackageName(), false, false);
            cb cbVar = this.i;
            if (cbVar.I().length() > 0) {
                vef.N(cbVar.I(), vtwVarM3);
            } else {
                String str3 = qenVar.n;
                if (str3 != null) {
                    vef.N(str3, vtwVarM3);
                }
            }
            List list = (List) ykr.n(yim.a, new pfd(this, qenVar, (yih) null, 11, (byte[]) null));
            if (list != null) {
                DesugarCollections.unmodifiableList(((vjq) vtwVarM3.b).f).getClass();
                if (!vtwVarM3.b.A()) {
                    vtwVarM3.u();
                }
                vjq vjqVar7 = (vjq) vtwVarM3.b;
                vun vunVar = vjqVar7.f;
                if (!vunVar.c()) {
                    vjqVar7.f = vuc.s(vunVar);
                }
                vsf.h(list, vjqVar7.f);
            }
            vuc vucVarR = vtwVarM3.r();
            vucVarR.getClass();
            return (vjq) vucVarR;
        } catch (qjr e2) {
            pzoVar = this;
            qenVar2 = qenVar;
            qjrVar = e2;
        }
    }
}
