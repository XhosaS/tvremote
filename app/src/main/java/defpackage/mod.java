package defpackage;

import android.os.Looper;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mod implements obz {
    public static final /* synthetic */ int b = 0;
    private static final boolean c = Boolean.getBoolean("force_elements_view_materialization");
    private List A;
    private List B;
    private List C;
    private List D;
    private List E;
    private List F;
    private List G;
    private List H;
    private niv I;
    private SparseArray J;
    private Map K;
    private obe L;
    private obi M;
    private ogc P;
    public drn a;
    private final boolean e;
    private final Optional f;
    private final Optional g;
    private final Optional h;
    private final Optional i;
    private final Optional j;
    private final acxn k;
    private final ocq l;
    private List m;
    private List n;
    private List o;
    private List p;
    private List q;
    private List r;
    private List s;
    private List t;
    private List u;
    private List v;
    private List w;
    private List x;
    private List y;
    private List z;
    private final Object d = new Object();
    private boolean N = false;
    private boolean O = false;

    public mod(acxn acxnVar, ocq ocqVar, boolean z, Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5) {
        this.k = acxnVar;
        this.l = ocqVar;
        this.e = z;
        this.f = optional;
        this.g = optional2;
        this.h = optional3;
        this.i = optional4;
        this.j = optional5;
    }

    private final void I(drn drnVar) {
        niv nivVar = this.I;
        if (nivVar == null || !(drnVar instanceof mld)) {
            return;
        }
        ((mld) drnVar).a.t = nivVar;
    }

    private final void J() {
        if (this.N) {
            throw new IllegalStateException("Element already built!");
        }
    }

    private final void K(obo oboVar, Optional optional) {
        synchronized (this.d) {
            J();
            if (this.B == null) {
                this.B = new ArrayList();
            }
            if (optional.isPresent()) {
                List list = this.B;
                ((Integer) optional.get()).intValue();
                list.add(0, oboVar);
            } else {
                this.B.add(oboVar);
            }
            this.O = true;
        }
    }

    private final void L(oby obyVar, Optional optional) {
        synchronized (this.d) {
            J();
            if (this.A == null) {
                this.A = new ArrayList();
            }
            if (optional.isPresent()) {
                List list = this.A;
                ((Integer) optional.get()).intValue();
                list.add(0, obyVar);
            } else {
                this.A.add(obyVar);
            }
            this.O = true;
        }
    }

    public static void c() {
        yqw.M(Looper.getMainLooper() == Looper.myLooper(), "The code must run on UI thread.");
    }

    @Override // defpackage.obz
    public final void A(obw obwVar) {
        synchronized (this.d) {
            J();
            if (this.E == null) {
                this.E = new ArrayList();
            }
            this.E.add(obwVar);
            this.O = true;
        }
    }

    @Override // defpackage.obz
    public final void B(obx obxVar) {
        synchronized (this.d) {
            J();
            if (this.C == null) {
                this.C = new ArrayList();
            }
            this.C.add(obxVar);
            this.O = true;
        }
    }

    @Override // defpackage.obz
    public final void C(oby obyVar) {
        L(obyVar, Optional.empty());
    }

    @Override // defpackage.obz
    public final void D(int i, Object obj) {
        synchronized (this.d) {
            J();
            if (this.J == null) {
                this.J = new SparseArray();
            }
            this.J.put(i, obj);
        }
    }

    @Override // defpackage.obz
    public final void E(obi obiVar) {
        this.M = obiVar;
    }

    @Override // defpackage.obz
    public final void F(obe obeVar) {
        this.L = obeVar;
        Map map = this.K;
        if (map != null) {
            obeVar.e(map);
        }
    }

    @Override // defpackage.obz
    public final void G(niv nivVar) {
        this.I = nivVar;
    }

    @Override // defpackage.obz
    public final void H(ogc ogcVar) {
        this.P = ogcVar;
    }

    @Override // defpackage.obz
    public final drn a() {
        drn drnVar = this.a;
        drnVar.getClass();
        return drnVar;
    }

    @Override // defpackage.obz
    public final drq b(dru druVar) {
        drn drnVar;
        drq drqVarA;
        final acxn acxnVar;
        Object obj = this.d;
        synchronized (obj) {
            J();
            final ocq ocqVar = this.l;
            if (ocqVar != null && (acxnVar = this.k) != null) {
                moc mocVar = new moc(ocqVar, acxnVar);
                obo oboVar = new obo() { // from class: mnz
                    @Override // defpackage.obo
                    public final void a(View view) {
                        int i = mod.b;
                        mod.c();
                        ocqVar.b(yyk.o(acxnVar), 3);
                    }
                };
                Optional optional = this.g;
                if (optional.isPresent() && ((Boolean) optional.get()).booleanValue()) {
                    L(mocVar, Optional.of(0));
                    K(oboVar, Optional.of(0));
                } else {
                    L(mocVar, Optional.empty());
                    K(oboVar, Optional.empty());
                }
                synchronized (obj) {
                    if (f()) {
                        obu obuVar = new obu() { // from class: moa
                            @Override // defpackage.obu
                            public final /* synthetic */ void a(View view, ofs ofsVar, MotionEvent motionEvent) {
                                mod.c();
                                ocqVar.a(acxnVar, 2);
                            }
                        };
                        if (this.m != null) {
                            Optional optional2 = this.f;
                            if (optional2.isPresent() && ((Boolean) optional2.get()).booleanValue()) {
                                this.m.add(0, obuVar);
                            }
                        }
                        x(obuVar);
                    }
                    if (e()) {
                        obp obpVar = new obp() { // from class: mob
                            @Override // defpackage.obp
                            public final boolean a(View view, ofs ofsVar) {
                                mod.c();
                                ocqVar.a(acxnVar, 4);
                                return false;
                            }
                        };
                        if (this.o != null) {
                            Optional optional3 = this.f;
                            if (optional3.isPresent() && ((Boolean) optional3.get()).booleanValue()) {
                                this.o.add(0, obpVar);
                            }
                        }
                        r(obpVar);
                    }
                }
            }
            this.N = true;
            if (!this.O || this.e) {
                drn drnVar2 = this.a;
                drnVar2.getClass();
                I(drnVar2);
                drnVar = drnVar2;
            } else {
                drn drnVar3 = this.a;
                drnVar3.getClass();
                I(drnVar3);
                List list = this.A;
                if (list != null && !list.isEmpty() && (drnVar3 instanceof mld)) {
                    ((mld) drnVar3).a.u = true;
                }
                moe moeVar = new moe(druVar, new mog());
                mog mogVar = moeVar.a;
                mogVar.b = drnVar3.a();
                BitSet bitSet = moeVar.d;
                bitSet.set(0);
                mogVar.F = this.m;
                mogVar.z = this.o;
                mogVar.c = this.p;
                mogVar.x = this.q;
                mogVar.y = this.r;
                mogVar.u = this.z;
                mogVar.K = this.A;
                mogVar.J = this.C;
                mogVar.H = this.D;
                mogVar.I = this.E;
                mogVar.G = this.F;
                mogVar.w = this.B;
                mogVar.v = this.G;
                mogVar.d = this.H;
                mogVar.e = this.n;
                mogVar.r = this.s;
                mogVar.f = this.t;
                mogVar.L = this.P;
                bitSet.set(1);
                mogVar.E = this.u;
                mogVar.D = this.v;
                mogVar.C = this.w;
                mogVar.B = this.x;
                mogVar.A = this.y;
                mogVar.a = this.M;
                mogVar.s = ((Boolean) this.h.orElse(false)).booleanValue();
                mogVar.t = ((Boolean) this.j.orElse(false)).booleanValue();
                drnVar = moeVar;
            }
            if (c) {
                drnVar.Z();
            }
            SparseArray sparseArray = this.J;
            if (sparseArray != null) {
                drnVar.c.k().F().F(sparseArray);
            }
            obe obeVar = this.L;
            drn drnVar4 = drnVar;
            if (obeVar != null) {
                mmx mmxVar = new mmx(druVar, new mmz());
                mmz mmzVar = mmxVar.a;
                mmzVar.a = drnVar.a();
                BitSet bitSet2 = mmxVar.d;
                bitSet2.set(0);
                mmzVar.b = obeVar;
                bitSet2.set(1);
                mmzVar.c = ((Boolean) this.i.orElse(false)).booleanValue();
                bitSet2.set(2);
                drnVar4 = mmxVar;
            }
            drqVarA = drnVar4.a();
        }
        return drqVarA;
    }

    @Override // defpackage.obz
    public final boolean d() {
        List list = this.n;
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // defpackage.obz
    public final boolean e() {
        List list = this.o;
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // defpackage.obz
    public final boolean f() {
        List list = this.m;
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // defpackage.obz
    public final void g(acvm acvmVar, Float f) {
        synchronized (this.d) {
            J();
            if (this.K == null) {
                this.K = new EnumMap(acvm.class);
            }
            this.K.put(acvmVar, f);
        }
    }

    @Override // defpackage.obz
    public final void h(mtq mtqVar) {
        synchronized (this.d) {
            J();
            if (this.p == null) {
                this.p = new ArrayList();
            }
            this.p.add(mtqVar);
            this.O = true;
        }
    }

    @Override // defpackage.obz
    public final void i(obq obqVar) {
        synchronized (this.d) {
            J();
            if (this.H == null) {
                this.H = new ArrayList();
            }
            this.H.add(obqVar);
            this.O = true;
        }
    }

    @Override // defpackage.obz
    public final void j(mtp mtpVar) {
        synchronized (this.d) {
            J();
            if (this.n == null) {
                this.n = new ArrayList();
            }
            this.n.add(mtpVar);
            this.O = true;
        }
    }

    @Override // defpackage.obz
    public final void k(obl oblVar) {
        synchronized (this.d) {
            J();
            if (this.t == null) {
                this.t = new ArrayList();
            }
            this.t.add(oblVar);
            this.O = true;
        }
    }

    @Override // defpackage.obz
    public final void l(obm obmVar) {
        synchronized (this.d) {
            J();
            if (this.s == null) {
                this.s = new ArrayList();
            }
            this.s.add(obmVar);
            this.O = true;
        }
    }

    @Override // defpackage.obz
    public final void m(oby obyVar) {
        synchronized (this.d) {
            J();
            if (this.z == null) {
                this.z = new ArrayList();
            }
            this.z.add(obyVar);
            this.O = true;
        }
    }

    @Override // defpackage.obz
    public final void n(obn obnVar) {
        synchronized (this.d) {
            J();
            if (this.G == null) {
                this.G = new ArrayList();
            }
            this.G.add(obnVar);
            this.O = true;
        }
    }

    @Override // defpackage.obz
    public final void o(obo oboVar) {
        K(oboVar, Optional.empty());
    }

    @Override // defpackage.obz
    public final void p(mtr mtrVar) {
        synchronized (this.d) {
            J();
            if (this.q == null) {
                this.q = new ArrayList();
            }
            this.q.add(mtrVar);
            this.O = true;
        }
    }

    @Override // defpackage.obz
    public final void q(mts mtsVar) {
        synchronized (this.d) {
            J();
            if (this.r == null) {
                this.r = new ArrayList();
            }
            this.r.add(mtsVar);
            this.O = true;
        }
    }

    @Override // defpackage.obz
    public final void r(obp obpVar) {
        synchronized (this.d) {
            J();
            if (this.o == null) {
                this.o = new ArrayList();
            }
            this.o.add(obpVar);
            this.O = true;
        }
    }

    @Override // defpackage.obz
    public final void s(mtg mtgVar) {
        synchronized (this.d) {
            J();
            if (this.y == null) {
                this.y = new ArrayList();
            }
            this.y.add(mtgVar);
            this.O = true;
        }
    }

    @Override // defpackage.obz
    public final void t(obr obrVar) {
        synchronized (this.d) {
            J();
            if (this.x == null) {
                this.x = new ArrayList();
            }
            this.x.add(obrVar);
            this.O = true;
        }
    }

    @Override // defpackage.obz
    public final void u(mte mteVar) {
        synchronized (this.d) {
            J();
            if (this.w == null) {
                this.w = new ArrayList();
            }
            this.w.add(mteVar);
            this.O = true;
        }
    }

    @Override // defpackage.obz
    public final void v(obs obsVar) {
        synchronized (this.d) {
            J();
            if (this.v == null) {
                this.v = new ArrayList();
            }
            this.v.add(obsVar);
            this.O = true;
        }
    }

    @Override // defpackage.obz
    public final void w(obt obtVar) {
        synchronized (this.d) {
            J();
            if (this.u == null) {
                this.u = new ArrayList();
            }
            this.u.add(obtVar);
            this.O = true;
        }
    }

    @Override // defpackage.obz
    public final void x(obu obuVar) {
        synchronized (this.d) {
            J();
            if (this.m == null) {
                this.m = new ArrayList();
            }
            this.m.add(obuVar);
            this.O = true;
        }
    }

    @Override // defpackage.obz
    public final void y(mto mtoVar) {
        synchronized (this.d) {
            J();
            if (this.F == null) {
                this.F = new ArrayList();
            }
            this.F.add(mtoVar);
            this.O = true;
        }
    }

    @Override // defpackage.obz
    public final void z(obv obvVar) {
        synchronized (this.d) {
            J();
            if (this.D == null) {
                this.D = new ArrayList();
            }
            this.D.add(obvVar);
            this.O = true;
        }
    }
}
