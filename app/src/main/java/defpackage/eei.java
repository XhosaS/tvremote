package defpackage;

import com.facebook.litho.ComponentTree;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eei extends dxv {
    public static final /* synthetic */ int K = 0;

    @eau(a = eav.NONE)
    @eat(a = 3)
    public boolean A;

    @eau(a = eav.NONE)
    @eat(a = 5)
    List B;

    @eau(a = eav.NONE)
    @eat(a = 3)
    public int C;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public eeq D;

    @eau(a = eav.DIMEN_SIZE)
    @eat(a = 3)
    int E;

    @eau(a = eav.NONE)
    @eat(a = 15)
    public ecq F;

    @eau(a = eav.DIMEN_SIZE)
    @eat(a = 3)
    int G;
    dtx H;
    dtx I;
    dtx J;

    @eau(a = eav.DIMEN_SIZE)
    @eat(a = 3)
    int a;

    @eau(a = eav.NONE)
    @eat(a = 3)
    public boolean b;

    @eau(a = eav.NONE)
    @eat(a = 3)
    public boolean c;

    @eau(a = eav.NONE)
    @eat(a = 3)
    boolean d;

    @eau(a = eav.NONE)
    @eat(a = 3)
    public boolean e;

    @eau(a = eav.NONE)
    @eat(a = 10)
    drq f;

    @eau(a = eav.NONE)
    @eat(a = 10)
    drq r;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public eeo s;

    @eau(a = eav.NONE)
    @eat(a = 3)
    boolean t;

    @eau(a = eav.NONE)
    @eat(a = 3)
    public boolean u;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public px v;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public qh w;

    @eau(a = eav.NONE)
    @eat(a = 3)
    public int x;

    @eau(a = eav.DIMEN_SIZE)
    @eat(a = 3)
    int y;

    @eau(a = eav.NONE)
    @eat(a = 10)
    drq z;

    public eei() {
        super("RecyclerCollectionComponent");
        this.c = true;
        this.d = true;
        this.u = true;
        this.v = een.b;
        this.A = true;
        this.B = Collections.EMPTY_LIST;
        this.C = 0;
        this.D = een.a;
    }

    private final eeh aA(dru druVar) {
        dxo dxoVar = druVar.j;
        dxoVar.getClass();
        return (eeh) dxoVar.c;
    }

    @Override // defpackage.drq
    protected final void E(dru druVar) {
        eeh eehVarAA = aA(druVar);
        dxz dxzVar = new dxz();
        dxz dxzVar2 = new dxz();
        dxz dxzVar3 = new dxz();
        dxz dxzVar4 = new dxz();
        dxz dxzVar5 = new dxz();
        dxz dxzVar6 = new dxz();
        dxz dxzVar7 = new dxz();
        ecq ecqVar = this.F;
        eeq eeqVar = this.D;
        eeo eeoVar = this.s;
        boolean z = this.b;
        boolean z2 = this.u;
        eeq eeqVar2 = een.a;
        eef eefVarD = eeqVar.d();
        egy egyVarE = eeqVar.e(druVar);
        dxzVar7.a = egyVarE;
        eis eisVar = new eis();
        eisVar.b = egyVarE;
        eisVar.n = eefVarD.i;
        eisVar.a = eefVarD.b;
        eisVar.p = eefVarD.v;
        boolean z3 = eefVarD.d;
        eisVar.f = eefVarD.l;
        List list = eefVarD.m;
        dvg dvgVar = eefVarD.w;
        boolean z4 = eefVarD.k;
        boolean z5 = eefVarD.c;
        eisVar.e = eefVarD.h;
        eisVar.o = eefVarD.s;
        eisVar.g = z2;
        eisVar.c = eefVarD.a;
        eisVar.h = eefVarD.e;
        boolean z6 = eefVarD.o;
        eisVar.j = eefVarD.p;
        efo efoVar = eefVarD.f;
        ehf ehfVar = eefVarD.g;
        dtp dtpVar = eefVarD.t;
        eisVar.l = eefVarD.u;
        int i = eefVarD.r;
        if (i != -1) {
            if (i <= 0) {
                throw new IllegalArgumentException("Estimated viewport count must be > 0: 0");
            }
            eisVar.i = i;
        }
        eet eetVar = new eet(eisVar.a(druVar), eefVarD.j);
        ecr ecrVar = new ecr(druVar);
        dxzVar4.a = eetVar;
        dxzVar.a = eeqVar.c();
        ecz eczVar = new ecz(ecrVar, eetVar);
        eczVar.c = ecqVar.f;
        eczVar.d = eefVarD.n;
        boolean z7 = eefVarD.q;
        edf edfVar = new edf(eczVar);
        dxzVar2.a = edfVar;
        if (eeoVar == null) {
            eeoVar = new eeo();
        }
        int iB = eeqVar.b();
        if (iB == Integer.MIN_VALUE) {
            iB = Integer.MAX_VALUE;
        }
        eeoVar.a = iB;
        dxzVar6.a = eeoVar;
        eel eelVar = new eel(druVar, eeoVar);
        dxzVar3.a = eelVar;
        edfVar.m = eelVar;
        eej eejVar = new eej(edfVar);
        eiz eizVar = eetVar.a;
        eizVar.F.a(eejVar);
        eizVar.q = z;
        dxzVar5.a = eek.LOADING;
        Object obj = dxzVar.a;
        if (obj != null) {
            eehVarAA.h = (rh) obj;
        }
        Object obj2 = dxzVar2.a;
        if (obj2 != null) {
            eehVarAA.g = (edf) obj2;
        }
        Object obj3 = dxzVar3.a;
        if (obj3 != null) {
            eehVarAA.f = (eel) obj3;
        }
        Object obj4 = dxzVar4.a;
        if (obj4 != null) {
            eehVarAA.a = (efb) obj4;
        }
        Object obj5 = dxzVar5.a;
        if (obj5 != null) {
            eehVarAA.e = (eek) obj5;
        }
        Object obj6 = dxzVar6.a;
        if (obj6 != null) {
            eehVarAA.c = (eeo) obj6;
        }
        Object obj7 = dxzVar7.a;
        if (obj7 != null) {
            eehVarAA.d = (egy) obj7;
        }
    }

    @Override // defpackage.drq
    protected final void J(dru druVar) {
        efb efbVar = aA(druVar).a;
        eeq eeqVar = een.a;
        efbVar.af();
    }

    @Override // defpackage.drq
    public final void N(dru druVar, dtz dtzVar) {
        dtx dtxVar = this.H;
        if (dtxVar != null) {
            dtxVar.b = druVar;
            dtxVar.a = this;
            dtzVar.c(dtxVar);
        }
        dtx dtxVar2 = this.I;
        if (dtxVar2 != null) {
            dtxVar2.b = druVar;
            dtxVar2.a = this;
            dtzVar.c(dtxVar2);
        }
        dtx dtxVar3 = this.J;
        if (dtxVar3 != null) {
            dtxVar3.b = druVar;
            dtxVar3.a = this;
            dtzVar.c(dtxVar3);
        }
    }

    @Override // defpackage.drq
    protected final void O(dxx dxxVar, dxx dxxVar2) {
        eeh eehVar = (eeh) dxxVar;
        eeh eehVar2 = (eeh) dxxVar2;
        eehVar2.a = eehVar.a;
        eehVar2.b = eehVar.b;
        eehVar2.c = eehVar.c;
        eehVar2.d = eehVar.d;
        eehVar2.e = eehVar.e;
        eehVar2.f = eehVar.f;
        eehVar2.g = eehVar.g;
        eehVar2.h = eehVar.h;
    }

    @Override // defpackage.drq
    protected final boolean Q() {
        return true;
    }

    @Override // defpackage.drq
    protected final boolean U() {
        return true;
    }

    @Override // defpackage.drq
    protected final void aw(dtx dtxVar, Object obj) {
        int i = dtxVar.c;
        if (i == -1505688212) {
            dru druVar = dtxVar.b;
            eei eeiVar = (eei) dtxVar.a;
            edf edfVar = eeiVar.aA(druVar).g;
            eeo eeoVar = eeiVar.aA(druVar).c;
            eeq eeqVar = een.a;
            String strE = edfVar.e();
            if (strE != null) {
                emk emkVar = edfVar.b;
                ecv ecvVar = new ecv(edfVar, strE);
                if (dyd.b()) {
                    ecvVar.run();
                    return;
                } else {
                    ((emj) emkVar).post(ecvVar);
                    return;
                }
            }
            return;
        }
        if (i == -1017305181) {
            eeo eeoVar2 = ((eei) dtxVar.a).aA(dtxVar.b).c;
            eeq eeqVar2 = een.a;
            eeoVar2.d();
            return;
        }
        if (i != -238194236) {
            return;
        }
        edf edfVar2 = ((eei) dtxVar.a).aA(dtxVar.b).g;
        eeq eeqVar3 = een.a;
        if (edfVar2.g) {
            synchronized (edfVar2) {
            }
        }
    }

    @Override // defpackage.dxv
    protected final drq ay(dru druVar) {
        boolean z;
        rh rhVar;
        egy egyVar;
        eeh eehVarAA = aA(druVar);
        ecq ecqVar = this.F;
        drq drqVar = this.z;
        drq drqVar2 = this.f;
        drq drqVar3 = this.r;
        List list = this.B;
        boolean z2 = this.d;
        boolean z3 = this.c;
        boolean z4 = this.A;
        px pxVar = this.v;
        int i = this.C;
        int i2 = this.y;
        int i3 = this.E;
        int i4 = this.G;
        int i5 = this.a;
        qh qhVar = this.w;
        boolean z5 = this.e;
        eeq eeqVar = this.D;
        int i6 = this.x;
        boolean z6 = eehVarAA.b;
        eeo eeoVar = eehVarAA.c;
        egy egyVar2 = eehVarAA.d;
        eek eekVar = eehVarAA.e;
        efb efbVar = eehVarAA.a;
        edf edfVar = eehVarAA.g;
        eel eelVar = eehVarAA.f;
        rh rhVar2 = eehVarAA.h;
        eeq eeqVar2 = een.a;
        if (druVar.c == null) {
            rhVar = rhVar2;
            egyVar = egyVar2;
            z = false;
        } else {
            z = false;
            rhVar = rhVar2;
            egyVar = egyVar2;
            dxw dxwVar = new dxw(Integer.MIN_VALUE, true);
            ComponentTree componentTree = druVar.h;
            if (componentTree != null) {
                componentTree.x(druVar.i(), dxwVar);
            }
        }
        synchronized (edfVar) {
            boolean z7 = edfVar.a;
            ecq ecqVar2 = edfVar.i;
            if (ecqVar2 == null || ecqVar2.h != ecqVar.h) {
                ecq ecqVar3 = edfVar.j;
                if (ecqVar3 == null || ecqVar3.h != ecqVar.h) {
                    boolean z8 = z;
                    edfVar.j = edf.b(ecqVar, z8);
                    boolean z9 = ebc.a;
                    edfVar.o(z8 ? 1 : 0, null, null);
                }
            }
        }
        eek eekVar2 = eek.ERROR;
        boolean z10 = eekVar == eekVar2 && drqVar3 == null;
        eek eekVar3 = eek.EMPTY;
        if ((eekVar == eekVar3 && drqVar2 == null) || z10) {
            return null;
        }
        boolean z11 = (eeqVar.a() == 0 || z5) ? false : true;
        ehn ehnVar = new ehn(druVar, new ehp());
        ehp ehpVar = ehnVar.a;
        ehpVar.d = z2;
        ehpVar.t = i2;
        ehpVar.D = i3;
        ehpVar.F = i4;
        ehpVar.b = i5;
        ehpVar.c = z3;
        ehpVar.u = z4;
        ehpVar.A = -1;
        ehpVar.x = i;
        ehpVar.z = eeoVar;
        ehpVar.B = !z11 ? null : o(eei.class, "RecyclerCollectionComponent", druVar, -1873243140, new Object[]{druVar, edfVar});
        ehpVar.y = z11;
        ehpVar.f = ehnVar.b.a(0.0f);
        eem eemVar = new eem(egyVar);
        if (ehpVar.w == Collections.EMPTY_LIST) {
            ehpVar.w = new ArrayList();
        }
        ehpVar.w.add(eemVar);
        if (list != null) {
            if (ehpVar.w.isEmpty()) {
                ehpVar.w = list;
            } else {
                ehpVar.w.addAll(list);
            }
        }
        ehpVar.C = -12425294;
        ehpVar.E = rhVar;
        ehpVar.v = qhVar;
        ehpVar.a = efbVar;
        ehnVar.d.set(0);
        ehpVar.r = een.b == pxVar ? new eec() : pxVar;
        ehnVar.O(0.0f);
        ehnVar.X(null);
        ehpVar.s = i6;
        if (!efbVar.j()) {
            boolean z12 = eeqVar.d().d;
            ehnVar.U(3);
            ehnVar.T(9, 0);
        }
        drg drgVarB = drh.b(druVar);
        drgVarB.O(0.0f);
        drh drhVar = drgVarB.a;
        drhVar.c = 2;
        drgVarB.e(ehnVar.a());
        if (eekVar == eek.LOADING && drqVar != null) {
            dzs dzsVarAA = dzt.aA(druVar);
            dzsVarAA.c(drqVar);
            dzsVarAA.O(0.0f);
            dzsVarAA.U(3);
            dzsVarAA.T(9, 0);
            drgVarB.e(dzsVarAA.a());
            return drhVar;
        }
        if (eekVar == eekVar3) {
            dzs dzsVarAA2 = dzt.aA(druVar);
            dzsVarAA2.c(drqVar2);
            dzsVarAA2.O(0.0f);
            dzsVarAA2.U(3);
            dzsVarAA2.T(9, 0);
            drgVarB.e(dzsVarAA2.a());
            return drhVar;
        }
        if (eekVar != eekVar2) {
            return drhVar;
        }
        dzs dzsVarAA3 = dzt.aA(druVar);
        dzsVarAA3.c(drqVar3);
        dzsVarAA3.O(0.0f);
        dzsVarAA3.U(3);
        dzsVarAA3.T(9, 0);
        drgVarB.e(dzsVarAA3.a());
        return drhVar;
    }

    @Override // defpackage.drq
    public final /* bridge */ /* synthetic */ drq l() {
        eei eeiVar = (eei) super.l();
        drq drqVar = eeiVar.f;
        eeiVar.f = drqVar != null ? drqVar.l() : null;
        drq drqVar2 = eeiVar.r;
        eeiVar.r = drqVar2 != null ? drqVar2.l() : null;
        drq drqVar3 = eeiVar.z;
        eeiVar.z = drqVar3 != null ? drqVar3.l() : null;
        ecq ecqVar = eeiVar.F;
        eeiVar.F = ecqVar != null ? ecqVar.c(false) : null;
        return eeiVar;
    }

    @Override // defpackage.drq
    protected final /* synthetic */ dxx u() {
        return new eeh();
    }

    @Override // defpackage.drq
    protected final Object y(dtu dtuVar, Object obj) {
        ecq ecqVar;
        int i = dtuVar.c;
        if (i != -1873243140) {
            if (i != -1048037474) {
                return null;
            }
            dsq.b((dru) dtuVar.d[0], (dto) obj);
            return null;
        }
        dui duiVar = dtuVar.b;
        Object[] objArr = dtuVar.d;
        dru druVar = (dru) objArr[0];
        edf edfVar = (edf) objArr[1];
        boolean z = ((eei) duiVar).t;
        eeq eeqVar = een.a;
        drq drqVar = druVar.c;
        if (drqVar != null) {
        }
        synchronized (edfVar) {
            boolean z2 = edfVar.a;
            ecqVar = edfVar.i;
        }
        if (ecqVar != null) {
            edfVar.i(ecqVar);
        }
        return true;
    }
}
