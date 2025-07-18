package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.ViewConfiguration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mog extends dxv {

    @eau(a = eav.NONE)
    @eat(a = 5)
    List A;

    @eau(a = eav.NONE)
    @eat(a = 5)
    List B;

    @eau(a = eav.NONE)
    @eat(a = 5)
    List C;

    @eau(a = eav.NONE)
    @eat(a = 5)
    List D;

    @eau(a = eav.NONE)
    @eat(a = 5)
    List E;

    @eau(a = eav.NONE)
    @eat(a = 5)
    List F;

    @eau(a = eav.NONE)
    @eat(a = 5)
    List G;

    @eau(a = eav.NONE)
    @eat(a = 5)
    List H;

    @eau(a = eav.NONE)
    @eat(a = 5)
    List I;

    @eau(a = eav.NONE)
    @eat(a = 5)
    List J;

    @eau(a = eav.NONE)
    @eat(a = 5)
    List K;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    ogc L;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    obi a;

    @eau(a = eav.NONE)
    @eat(a = 10)
    drq b;

    @eau(a = eav.NONE)
    @eat(a = 5)
    List c;

    @eau(a = eav.NONE)
    @eat(a = 5)
    List d;

    @eau(a = eav.NONE)
    @eat(a = 5)
    List e;

    @eau(a = eav.NONE)
    @eat(a = 5)
    List f;

    @eau(a = eav.NONE)
    @eat(a = 5)
    List r;

    @eau(a = eav.NONE)
    @eat(a = 3)
    boolean s;

    @eau(a = eav.NONE)
    @eat(a = 3)
    boolean t;

    @eau(a = eav.NONE)
    @eat(a = 5)
    List u;

    @eau(a = eav.NONE)
    @eat(a = 5)
    List v;

    @eau(a = eav.NONE)
    @eat(a = 5)
    List w;

    @eau(a = eav.NONE)
    @eat(a = 5)
    List x;

    @eau(a = eav.NONE)
    @eat(a = 5)
    List y;

    @eau(a = eav.NONE)
    @eat(a = 5)
    List z;

    public mog() {
        super("ElementEventWithGesture");
    }

    private final mof aA(dru druVar) {
        dxo dxoVar = druVar.j;
        dxoVar.getClass();
        return (mof) dxoVar.c;
    }

    @Override // defpackage.drq
    protected final void E(dru druVar) {
        mof mofVarAA = aA(druVar);
        dxz dxzVar = new dxz();
        dxz dxzVar2 = new dxz();
        dxz dxzVar3 = new dxz();
        dxz dxzVar4 = new dxz();
        dxz dxzVar5 = new dxz();
        dxz dxzVar6 = new dxz();
        dxz dxzVar7 = new dxz();
        dxz dxzVar8 = new dxz();
        boolean z = this.t;
        dxzVar.a = new AtomicBoolean(true);
        dxzVar5.a = new moi();
        dxzVar2.a = new AtomicReference(null);
        dxzVar3.a = new AtomicReference(null);
        dxzVar4.a = new AtomicReference(null);
        dxzVar6.a = new AtomicReference(null);
        dxzVar7.a = new AtomicReference(null);
        if (z) {
            dxzVar8.a = new AtomicBoolean(druVar.a.getApplicationContext().getSystemService("accessibility") != null);
        } else {
            dxzVar8.a = new AtomicBoolean(false);
        }
        mofVarAA.c = (AtomicBoolean) dxzVar.a;
        mofVarAA.d = (AtomicReference) dxzVar2.a;
        mofVarAA.a = (AtomicReference) dxzVar3.a;
        mofVarAA.g = (AtomicReference) dxzVar4.a;
        mofVarAA.b = (moi) dxzVar5.a;
        mofVarAA.h = (AtomicReference) dxzVar6.a;
        mofVarAA.f = (AtomicReference) dxzVar7.a;
        mofVarAA.e = (AtomicBoolean) dxzVar8.a;
    }

    @Override // defpackage.drq
    protected final void G(dru druVar) {
        mof mofVarAA = aA(druVar);
        moi moiVar = mofVarAA.b;
        AtomicReference atomicReference = mofVarAA.d;
        AtomicReference atomicReference2 = mofVarAA.a;
        AtomicReference atomicReference3 = mofVarAA.g;
        boolean z = this.t;
        afz afzVar = (afz) atomicReference.get();
        if (afzVar == null) {
            afz afzVar2 = new afz(druVar.a, new mok(moiVar, z), new Handler(Looper.getMainLooper()));
            atomicReference.set(afzVar2);
            afzVar = afzVar2;
        }
        afzVar.a.setOnDoubleTapListener(moiVar.d() ? new moj(moiVar) : null);
        Context context = druVar.a;
        if (((mpb) atomicReference2.get()) == null) {
            mpb mpbVar = new mpb(context, new mom(moiVar), new Handler(Looper.getMainLooper()));
            atomicReference2.set(mpbVar);
            int i = context.getApplicationInfo().targetSdkVersion;
            if (i > 18) {
                mpbVar.b = true;
                if (mpbVar.m == null) {
                    mpbVar.m = new GestureDetector(mpbVar.a, new mpa(mpbVar), mpbVar.i);
                }
            }
            if (i > 22) {
                mpbVar.c = true;
            }
        }
        if (((mpq) atomicReference3.get()) == null) {
            atomicReference3.set(new mpq(new mol(moiVar), (int) (40.0f / context.getResources().getDisplayMetrics().density), ViewConfiguration.get(context).getScaledTouchSlop()));
        }
    }

    @Override // defpackage.drq
    protected final void J(dru druVar) {
        moi moiVar = aA(druVar).b;
        List list = this.d;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((obq) it.next()).d();
            }
        }
        moiVar.b = null;
        moiVar.c = null;
        moiVar.d = null;
        moiVar.e = null;
        moiVar.f = null;
        moiVar.g = null;
        moiVar.h = null;
        moiVar.i = null;
        moiVar.j = null;
        moiVar.k = null;
        moiVar.l = null;
        moiVar.m = null;
        moiVar.n = null;
        moiVar.o = null;
        moiVar.c(null);
    }

    @Override // defpackage.drq
    protected final void O(dxx dxxVar, dxx dxxVar2) {
        mof mofVar = (mof) dxxVar;
        mof mofVar2 = (mof) dxxVar2;
        mofVar2.a = mofVar.a;
        mofVar2.b = mofVar.b;
        mofVar2.c = mofVar.c;
        mofVar2.d = mofVar.d;
        mofVar2.e = mofVar.e;
        mofVar2.f = mofVar.f;
        mofVar2.g = mofVar.g;
        mofVar2.h = mofVar.h;
    }

    @Override // defpackage.drq
    protected final boolean Q() {
        return true;
    }

    @Override // defpackage.drq
    protected final boolean U() {
        return true;
    }

    @Override // defpackage.dxv
    protected final drq ay(dru druVar) {
        dru druVar2;
        mof mofVarAA = aA(druVar);
        drq drqVar = this.b;
        List list = this.u;
        List list2 = this.K;
        List list3 = this.w;
        List list4 = this.v;
        moi moiVar = mofVarAA.b;
        List list5 = this.F;
        List list6 = this.H;
        List list7 = this.J;
        List list8 = this.I;
        List list9 = this.e;
        List list10 = this.r;
        List list11 = this.f;
        List list12 = this.E;
        List list13 = this.D;
        List list14 = this.C;
        List list15 = this.B;
        List list16 = this.A;
        List list17 = this.G;
        List list18 = this.z;
        List list19 = this.c;
        List list20 = this.x;
        List list21 = this.y;
        obi obiVar = this.a;
        boolean z = this.t;
        AtomicBoolean atomicBoolean = mofVarAA.e;
        dzs dzsVarAA = dzt.aA(druVar);
        dzsVarAA.c(drqVar);
        moiVar.b = list6;
        moiVar.c = list7;
        moiVar.d = list8;
        moiVar.e = list5;
        moiVar.f = list9;
        moiVar.g = list17;
        moiVar.h = list18;
        moiVar.i = list10;
        moiVar.j = list11;
        moiVar.k = list12;
        moiVar.l = list13;
        moiVar.m = list14;
        moiVar.n = list15;
        moiVar.o = list16;
        if (moiVar.l() || moiVar.f()) {
            druVar2 = druVar;
            dzsVarAA.X(o(mog.class, "ElementEventWithGesture", druVar2, -1336101728, new Object[]{druVar}));
        } else {
            druVar2 = druVar;
        }
        if (moiVar.l() || moiVar.e()) {
            dzsVarAA.c.k().F().n(o(mog.class, "ElementEventWithGesture", druVar2, -1270658234, new Object[]{druVar2}));
        }
        if (moiVar.f()) {
            dzsVarAA.c.k().F().i(true);
        }
        if (moiVar.m(z)) {
            dzsVarAA.c.k().F().u(true);
        }
        if (!moiVar.m(z) && !moiVar.d()) {
            if (moiVar.k()) {
                dzsVarAA.p(o(mog.class, "ElementEventWithGesture", druVar2, -1351902487, new Object[]{druVar2}));
            }
            if (moiVar.g()) {
                dzsVarAA.c.k().F().t(o(mog.class, "ElementEventWithGesture", druVar2, 71235917, new Object[]{druVar2}));
            }
        }
        if (list19 != null) {
            dzsVarAA.c.k().F().m(o(mog.class, "ElementEventWithGesture", druVar2, -1236836200, new Object[]{druVar2}));
        }
        if (list20 != null) {
            dzsVarAA.c.k().F().r(o(mog.class, "ElementEventWithGesture", druVar2, -708308421, new Object[]{druVar2}));
        }
        if (list21 != null) {
            dzsVarAA.c.k().F().s(o(mog.class, "ElementEventWithGesture", druVar2, 1501181275, new Object[]{druVar2}));
        }
        if (list2 != null || list != null) {
            dzsVarAA.G(o(mog.class, "ElementEventWithGesture", druVar2, 1803022739, new Object[]{druVar2}));
        }
        if (list3 != null) {
            dtu dtuVarO = o(mog.class, "ElementEventWithGesture", druVar2, -1932591986, new Object[]{druVar2});
            drj drjVarD = dzsVarAA.c.k().D();
            drjVarD.a |= 64;
            drjVarD.c = dtuVarO;
        }
        if (list4 != null) {
            dzsVarAA.v(o(mog.class, "ElementEventWithGesture", druVar2, -1974694341, new Object[]{druVar2}));
        }
        boolean z2 = atomicBoolean.get() && moiVar.m(z) && moiVar.f();
        if (z2 || obiVar != null) {
            dzsVarAA.S(o(mog.class, "ElementEventWithGesture", druVar2, 466811311, new Object[]{druVar2}));
            if (z2) {
                dzsVarAA.c.k().F().x(o(mog.class, "ElementEventWithGesture", druVar2, -843172861, new Object[]{druVar2}));
            }
        }
        return dzsVarAA.a();
    }

    @Override // defpackage.drq
    public final /* bridge */ /* synthetic */ drq l() {
        mog mogVar = (mog) super.l();
        drq drqVar = mogVar.b;
        mogVar.b = drqVar != null ? drqVar.l() : null;
        return mogVar;
    }

    @Override // defpackage.drq
    protected final /* synthetic */ dxx u() {
        return new mof();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x059a  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0632  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0765  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0783  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02a4  */
    @Override // defpackage.drq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final java.lang.Object y(defpackage.dtu r31, java.lang.Object r32) {
        /*
            Method dump skipped, instructions count: 2478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mog.y(dtu, java.lang.Object):java.lang.Object");
    }
}
