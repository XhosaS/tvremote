package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.litho.ComponentTree;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ejy extends dxv {

    @eau(a = eav.NONE)
    @eat(a = 10)
    public drq a;

    @eau(a = eav.NONE)
    @eat(a = 3)
    public boolean b;

    public ejy() {
        super("SizeSpecMountWrapperComponent");
        this.b = true;
    }

    private final ejx aA(dru druVar) {
        dxo dxoVar = druVar.j;
        dxoVar.getClass();
        return (ejx) dxoVar.c;
    }

    @Override // defpackage.drq
    protected final Object A(Context context) {
        Handler handler = eka.a;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(new dvz(context));
        return frameLayout;
    }

    @Override // defpackage.drq
    protected final void E(dru druVar) {
        ejx ejxVarAA = aA(druVar);
        dxz dxzVar = new dxz();
        boolean z = this.b;
        Handler handler = eka.a;
        dxzVar.a = new AtomicReference();
        eka.a(druVar, (AtomicReference) dxzVar.a, z);
        ejxVarAA.a = (AtomicReference) dxzVar.a;
    }

    @Override // defpackage.drq
    protected final void H(dru druVar, Object obj, duv duvVar) {
        Handler handler = eka.a;
        ((dvz) ((FrameLayout) obj).getChildAt(0)).n.s();
    }

    @Override // defpackage.drq
    protected final void I(dru druVar, dse dseVar, duv duvVar) {
        ejx ejxVarAA = aA(druVar);
        drq drqVar = this.a;
        boolean z = this.b;
        AtomicReference atomicReference = ejxVarAA.a;
        Handler handler = eka.a;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(dseVar.f(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(dseVar.a(), 1073741824);
        ComponentTree componentTreeA = eka.a(druVar, atomicReference, z);
        if (componentTreeA.y(iMakeMeasureSpec, iMakeMeasureSpec2)) {
            return;
        }
        componentTreeA.u(drqVar, iMakeMeasureSpec, iMakeMeasureSpec2, null, eka.b(druVar, iMakeMeasureSpec, iMakeMeasureSpec2), druVar.a());
    }

    @Override // defpackage.drq
    protected final void J(dru druVar) {
        AtomicReference atomicReference = aA(druVar).a;
        Handler handler = eka.a;
        ComponentTree componentTree = (ComponentTree) atomicReference.get();
        if (componentTree != null) {
            atomicReference.set(null);
            if (dyd.b()) {
                componentTree.r();
            } else {
                eka.a.post(new ejz(componentTree));
            }
        }
    }

    @Override // defpackage.drq
    protected final void K(dru druVar, dse dseVar, int i, int i2, dxt dxtVar, duv duvVar) {
        ejx ejxVarAA = aA(druVar);
        eka.a(druVar, ejxVarAA.a, this.b).u(this.a, i, i2, dxtVar, eka.b(druVar, i, i2), druVar.a());
        if (dxtVar.a < 0 || dxtVar.b < 0) {
            dxtVar.b = 0;
            dxtVar.a = 0;
        }
    }

    @Override // defpackage.drq
    protected final void L(dru druVar, Object obj, duv duvVar) {
        AtomicReference atomicReference = aA(druVar).a;
        Handler handler = eka.a;
        ((dvz) ((FrameLayout) obj).getChildAt(0)).v((ComponentTree) atomicReference.get(), true);
    }

    @Override // defpackage.drq
    protected final void O(dxx dxxVar, dxx dxxVar2) {
        ((ejx) dxxVar2).a = ((ejx) dxxVar).a;
    }

    @Override // defpackage.drq
    protected final boolean P() {
        return true;
    }

    @Override // defpackage.drq
    protected final boolean Q() {
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
    public final int ah() {
        return 3;
    }

    @Override // defpackage.drq
    protected final void ar(Object obj) {
        Handler handler = eka.a;
        ((dvz) ((FrameLayout) obj).getChildAt(0)).n.v();
    }

    @Override // defpackage.drq
    protected final void as(dru druVar, Object obj) {
        Handler handler = eka.a;
        ((dvz) ((FrameLayout) obj).getChildAt(0)).v((ComponentTree) null, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0020, code lost:
    
        if (r2.g(r3) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0025, code lost:
    
        if (r6.a != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
    
        if (r5.b == r6.b) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002f, code lost:
    
        return true;
     */
    @Override // defpackage.drq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(defpackage.drq r6) {
        /*
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            r1 = 0
            if (r6 == 0) goto L30
            java.lang.Class r2 = r5.getClass()
            java.lang.Class r3 = r6.getClass()
            if (r2 == r3) goto L12
            goto L30
        L12:
            ejy r6 = (defpackage.ejy) r6
            drq r2 = r5.a
            if (r2 == 0) goto L23
            drq r3 = r6.a
            boolean r4 = defpackage.ebc.a
            boolean r2 = r2.g(r3)
            if (r2 == 0) goto L27
            goto L28
        L23:
            drq r2 = r6.a
            if (r2 == 0) goto L28
        L27:
            return r1
        L28:
            boolean r2 = r5.b
            boolean r6 = r6.b
            if (r2 == r6) goto L2f
            return r1
        L2f:
            return r0
        L30:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ejy.g(drq):boolean");
    }

    @Override // defpackage.drq
    protected final int h() {
        return 3;
    }

    @Override // defpackage.drq
    public final /* bridge */ /* synthetic */ drq l() {
        ejy ejyVar = (ejy) super.l();
        drq drqVar = ejyVar.a;
        ejyVar.a = drqVar != null ? drqVar.l() : null;
        return ejyVar;
    }

    @Override // defpackage.drq
    protected final /* synthetic */ dxx u() {
        return new ejx();
    }
}
