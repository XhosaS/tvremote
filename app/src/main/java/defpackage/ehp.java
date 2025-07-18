package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ehp extends dxv {
    public static final /* synthetic */ int G = 0;

    @eau(a = eav.NONE)
    @eat(a = 3)
    public int A;

    @eau(a = eav.NONE)
    @eat(a = 11)
    public dtu B;

    @eau(a = eav.COLOR)
    @eat(a = 3)
    public int C;

    @eau(a = eav.NONE)
    @eat(a = 3)
    public int D;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public rh E;

    @eau(a = eav.NONE)
    @eat(a = 3)
    public int F;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public efb a;

    @eau(a = eav.NONE)
    @eat(a = 3)
    public int b;

    @eau(a = eav.NONE)
    @eat(a = 3)
    public boolean c;

    @eau(a = eav.NONE)
    @eat(a = 3)
    public boolean d;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    CharSequence e;

    @eau(a = eav.DIMEN_SIZE)
    @eat(a = 3)
    public int f;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public px r;

    @eau(a = eav.NONE)
    @eat(a = 3)
    public int s;

    @eau(a = eav.NONE)
    @eat(a = 3)
    public int t;

    @eau(a = eav.NONE)
    @eat(a = 3)
    public boolean u;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public qh v;

    @eau(a = eav.NONE)
    @eat(a = 5)
    public List w;

    @eau(a = eav.NONE)
    @eat(a = 3)
    public int x;

    @eau(a = eav.NONE)
    @eat(a = 3)
    public boolean y;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public ejf z;

    public ehp() {
        super("Recycler");
        this.b = 0;
        this.c = true;
        this.d = true;
        this.r = ejl.a;
        this.t = 0;
        this.u = true;
        this.w = Collections.EMPTY_LIST;
        this.x = 0;
        this.y = true;
        this.A = -1;
        this.C = -16777216;
        this.D = 0;
        this.F = 0;
    }

    private final eho aA(dru druVar) {
        dxo dxoVar = druVar.j;
        dxoVar.getClass();
        return (eho) dxoVar.c;
    }

    @Override // defpackage.drq
    protected final Object A(Context context) {
        int i = ejl.b;
        return new ejt(context, new ehc(context));
    }

    @Override // defpackage.drq
    protected final void E(dru druVar) {
        eho ehoVarAA = aA(druVar);
        dxz dxzVar = new dxz();
        int i = ejl.b;
        dxzVar.a = 0;
        ehoVarAA.a = ((Integer) dxzVar.a).intValue();
    }

    @Override // defpackage.drq
    protected final void H(dru druVar, Object obj, duv duvVar) {
        ejt ejtVar = (ejt) obj;
        efb efbVar = this.a;
        ejf ejfVar = this.z;
        List list = this.w;
        rh rhVar = this.E;
        boolean z = this.y;
        qh qhVar = this.v;
        dtu dtuVar = this.B;
        int i = ejl.b;
        ejtVar.setContentDescription(null);
        ejtVar.setEnabled(z && dtuVar != null);
        ejtVar.l = dtuVar != null ? new ejj(dtuVar) : null;
        ehc ehcVar = (ehc) ejtVar.getRecyclerView();
        if (ehcVar == null) {
            throw new IllegalStateException("RecyclerView not found, it should not be removed from SwipeRefreshLayout before unmounting");
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ehcVar.y((qi) it.next());
            }
        }
        if (qhVar != null) {
            ehcVar.r.add(qhVar);
        }
        if (rhVar != null && ehcVar.getOnFlingListener() == null) {
            rhVar.g(ehcVar);
        }
        efbVar.k();
        if (ejfVar != null) {
            ejfVar.b = ejtVar;
        }
        if (ejtVar.o) {
            ehcVar.requestLayout();
            ejtVar.o = false;
        }
    }

    @Override // defpackage.drq
    protected final void I(dru druVar, dse dseVar, duv duvVar) {
        efb efbVar = this.a;
        int i = ejl.b;
        efbVar.ag(dseVar.f(), dseVar.a());
    }

    @Override // defpackage.drq
    protected final void K(dru druVar, dse dseVar, int i, int i2, dxt dxtVar, duv duvVar) {
        dtu dtuVarO;
        efb efbVar = this.a;
        int i3 = ejl.b;
        if (efbVar.j()) {
            dtuVarO = o(ehp.class, "Recycler", druVar, 946341036, new Object[]{druVar});
        } else {
            efbVar.m();
            dtuVarO = null;
        }
        efbVar.f(dxtVar, i, i2, dtuVarO);
    }

    @Override // defpackage.drq
    protected final void L(dru druVar, Object obj, duv duvVar) {
        ejt ejtVar = (ejt) obj;
        efb efbVar = this.a;
        boolean z = this.d;
        int i = this.t;
        int i2 = this.D;
        int i3 = this.F;
        int i4 = this.b;
        int i5 = this.C;
        boolean z2 = this.c;
        boolean z3 = this.u;
        int i6 = this.f;
        int i7 = this.A;
        int i8 = this.x;
        CharSequence charSequence = this.e;
        px ejkVar = this.r;
        int i9 = this.s;
        int i10 = ejl.b;
        RecyclerView recyclerView = ejtVar.getRecyclerView();
        if (recyclerView == null) {
            throw new IllegalStateException("RecyclerView not found, it should not be removed from SwipeRefreshLayout");
        }
        recyclerView.setContentDescription(charSequence);
        recyclerView.t = true;
        recyclerView.setClipToPadding(z);
        ejtVar.setClipToPadding(z);
        int[] iArr = ahj.a;
        recyclerView.setPaddingRelative(i, i3, i2, i4);
        recyclerView.setClipChildren(z2);
        ejtVar.setClipChildren(z2);
        recyclerView.q().a(z3);
        ejtVar.b.a(z3);
        recyclerView.setScrollBarStyle(0);
        recyclerView.setHorizontalFadingEdgeEnabled(false);
        recyclerView.setVerticalFadingEdgeEnabled(false);
        recyclerView.setFadingEdgeLength(i6);
        recyclerView.setId(i7);
        recyclerView.setOverScrollMode(i8);
        ejtVar.cH();
        btb btbVar = ejtVar.i;
        bta btaVar = btbVar.a;
        btaVar.i = new int[]{i5};
        btaVar.e();
        btaVar.e();
        btbVar.invalidateSelf();
        if (i9 > 0) {
            recyclerView.setItemViewCacheSize(i9);
        }
        if (ejkVar == ejl.a) {
            ejkVar = new ejk();
        }
        RecyclerView recyclerView2 = ejtVar.n;
        ejtVar.p = recyclerView2.getItemAnimator();
        recyclerView2.ah(ejkVar);
        efbVar.g(recyclerView);
    }

    @Override // defpackage.drq
    protected final void O(dxx dxxVar, dxx dxxVar2) {
        ((eho) dxxVar2).a = ((eho) dxxVar).a;
    }

    @Override // defpackage.drq
    protected final boolean P() {
        return true;
    }

    @Override // defpackage.drq
    public final boolean R() {
        return true;
    }

    @Override // defpackage.drq
    protected final boolean U() {
        return true;
    }

    @Override // defpackage.drq
    public final boolean X() {
        return true;
    }

    @Override // defpackage.drq
    public final boolean ad() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x0275  */
    @Override // defpackage.drq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final boolean ag(defpackage.drq r21, defpackage.dxx r22, defpackage.drq r23, defpackage.dxx r24) {
        /*
            Method dump skipped, instructions count: 653
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ehp.ag(drq, dxx, drq, dxx):boolean");
    }

    @Override // defpackage.drq
    public final int ah() {
        return 3;
    }

    @Override // defpackage.drq
    protected final void ar(Object obj) {
        ejt ejtVar = (ejt) obj;
        efb efbVar = this.a;
        ejf ejfVar = this.z;
        qh qhVar = this.v;
        List list = this.w;
        int i = ejl.b;
        ehc ehcVar = (ehc) ejtVar.getRecyclerView();
        if (ehcVar == null) {
            throw new IllegalStateException("RecyclerView not found, it should not be removed from SwipeRefreshLayout before unmounting");
        }
        efbVar.l();
        if (ejfVar != null) {
            ejfVar.b = null;
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ehcVar.ac((qi) it.next());
            }
        }
        if (qhVar != null) {
            ehcVar.ab(qhVar);
        }
        if (qhVar != null) {
            ehcVar.ab(qhVar);
        }
        ejtVar.l = null;
    }

    @Override // defpackage.drq
    protected final void as(dru druVar, Object obj) {
        ejt ejtVar = (ejt) obj;
        efb efbVar = this.a;
        rh rhVar = this.E;
        int i = ejl.b;
        RecyclerView recyclerView = ejtVar.getRecyclerView();
        if (recyclerView == null) {
            throw new IllegalStateException("RecyclerView not found, it should not be removed from SwipeRefreshLayout before unmounting");
        }
        recyclerView.setId(-1);
        efbVar.i(recyclerView);
        if (rhVar != null) {
            rhVar.g(null);
        }
        ejtVar.n.ah(ejtVar.p);
        ejtVar.p = null;
    }

    @Override // defpackage.drq
    protected final void au() {
        efb efbVar = this.a;
        int i = ejl.b;
        efbVar.m();
    }

    @Override // defpackage.drq
    public final boolean g(drq drqVar) {
        if (this == drqVar) {
            return true;
        }
        if (drqVar == null || getClass() != drqVar.getClass()) {
            return false;
        }
        ehp ehpVar = (ehp) drqVar;
        efb efbVar = this.a;
        if (efbVar == null ? ehpVar.a != null : !efbVar.equals(ehpVar.a)) {
            return false;
        }
        if (this.b != ehpVar.b || this.c != ehpVar.c || this.d != ehpVar.d) {
            return false;
        }
        CharSequence charSequence = this.e;
        if (charSequence == null ? ehpVar.e != null : !charSequence.equals(ehpVar.e)) {
            return false;
        }
        if (this.f != ehpVar.f) {
            return false;
        }
        px pxVar = this.r;
        if (pxVar == null ? ehpVar.r != null : !pxVar.equals(ehpVar.r)) {
            return false;
        }
        if (this.s != ehpVar.s || this.t != ehpVar.t || this.u != ehpVar.u) {
            return false;
        }
        qh qhVar = this.v;
        if (qhVar == null ? ehpVar.v != null : !qhVar.equals(ehpVar.v)) {
            return false;
        }
        List list = this.w;
        if (list == null ? ehpVar.w != null : !list.equals(ehpVar.w)) {
            return false;
        }
        if (this.x != ehpVar.x || this.y != ehpVar.y) {
            return false;
        }
        ejf ejfVar = this.z;
        if (ejfVar == null ? ehpVar.z != null : !ejfVar.equals(ehpVar.z)) {
            return false;
        }
        if (this.A != ehpVar.A) {
            return false;
        }
        dtu dtuVar = this.B;
        if (dtuVar == null ? ehpVar.B != null : !dtuVar.a(ehpVar.B)) {
            return false;
        }
        if (this.C != ehpVar.C || this.D != ehpVar.D) {
            return false;
        }
        rh rhVar = this.E;
        if (rhVar == null ? ehpVar.E == null : rhVar.equals(ehpVar.E)) {
            return this.F == ehpVar.F;
        }
        return false;
    }

    @Override // defpackage.drq
    protected final int h() {
        return 3;
    }

    @Override // defpackage.drq
    public final /* synthetic */ drq l() {
        return (ehp) super.l();
    }

    @Override // defpackage.drq
    protected final /* synthetic */ dxx u() {
        return new eho();
    }

    @Override // defpackage.drq
    protected final Object y(dtu dtuVar, Object obj) {
        int i = dtuVar.c;
        if (i == -1048037474) {
            dsq.b((dru) dtuVar.d[0], (dto) obj);
            return null;
        }
        if (i == 946341036) {
            dui duiVar = dtuVar.b;
            dru druVar = (dru) dtuVar.d[0];
            int i2 = aA(druVar).a;
            int i3 = ejl.b;
            int i4 = i2 + 1;
            if (druVar.c != null) {
                druVar.k(new dxw(0, Integer.valueOf(i4)), "updateState:Recycler.onUpdateMeasure");
            }
        }
        return null;
    }
}
