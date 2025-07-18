package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.widget.LithoScrollView;
import com.google.android.katniss.R;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class elg extends dxv {

    @eau(a = eav.NONE)
    @eat(a = 10)
    public drq a;

    @eau(a = eav.NONE)
    @eat(a = 3)
    public boolean b;

    @eau(a = eav.NONE)
    @eat(a = 3)
    public boolean c;

    @eau(a = eav.NONE)
    @eat(a = 3)
    public boolean d;

    @eau(a = eav.NONE)
    @eat(a = 3)
    public int e;

    @eau(a = eav.NONE)
    @eat(a = 3)
    public boolean f;

    @eau(a = eav.NONE)
    @eat(a = 3)
    public int r;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public ejq s;

    @eau(a = eav.NONE)
    @eat(a = 3)
    public boolean t;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public mpu u;

    public elg() {
        super("VerticalScroll");
        this.r = 1;
    }

    private final elf aA(dru druVar) {
        dxo dxoVar = druVar.j;
        dxoVar.getClass();
        return (elf) dxoVar.c;
    }

    @Override // defpackage.drq
    protected final Object A(Context context) {
        return (LithoScrollView) LayoutInflater.from(context).inflate(R.layout.litho_scroll_view, (ViewGroup) null, false);
    }

    @Override // defpackage.drq
    protected final void C(duv duvVar, duv duvVar2) {
        ele eleVar = (ele) duvVar;
        ele eleVar2 = (ele) duvVar2;
        eleVar.a = eleVar2.a;
        eleVar.b = eleVar2.b;
    }

    @Override // defpackage.drq
    protected final void E(dru druVar) {
        elf elfVarAA = aA(druVar);
        dxz dxzVar = new dxz();
        dxz dxzVar2 = new dxz();
        drq drqVar = this.a;
        int i = this.e;
        boolean z = this.d;
        ehe eheVar = new ehe(null);
        eheVar.a = i;
        dxzVar.a = eheVar;
        dsi dsiVarD = ComponentTree.d(druVar, drqVar);
        dsiVarD.d = z;
        dxzVar2.a = dsiVarD.a();
        elfVarAA.b = (ehe) dxzVar.a;
        elfVarAA.a = (ComponentTree) dxzVar2.a;
    }

    @Override // defpackage.drq
    protected final void I(dru druVar, dse dseVar, duv duvVar) {
        elf elfVarAA = aA(druVar);
        drq drqVar = this.a;
        boolean z = this.c;
        boolean z2 = this.b;
        ComponentTree componentTree = elfVarAA.a;
        ele eleVar = (ele) duvVar;
        Integer num = eleVar.b;
        Integer num2 = eleVar.a;
        int iF = (dseVar.f() - dseVar.c()) - dseVar.d();
        int iA = (dseVar.a() - dseVar.e()) - dseVar.b();
        if (num != null && num.intValue() == iF) {
            if (!z) {
                return;
            }
            z = true;
            if (num2 != null && num2.intValue() == iA) {
                return;
            }
        }
        elh.a(druVar, View.MeasureSpec.makeMeasureSpec(dseVar.f(), 1073741824), View.MeasureSpec.makeMeasureSpec(dseVar.a(), 1073741824), new dxt(), componentTree, drqVar, z, z2);
    }

    @Override // defpackage.drq
    protected final void K(dru druVar, dse dseVar, int i, int i2, dxt dxtVar, duv duvVar) {
        elf elfVarAA = aA(druVar);
        dwz dwzVar = new dwz();
        dwz dwzVar2 = new dwz();
        elh.a(druVar, i, i2, dxtVar, elfVarAA.a, this.a, this.c, this.b);
        dwzVar.a = Integer.valueOf(dxtVar.a);
        dwzVar2.a = Integer.valueOf(dxtVar.b);
        ele eleVar = (ele) duvVar;
        eleVar.b = (Integer) dwzVar.a;
        eleVar.a = (Integer) dwzVar2.a;
    }

    @Override // defpackage.drq
    protected final void L(dru druVar, Object obj, duv duvVar) {
        elf elfVarAA = aA(druVar);
        LithoScrollView lithoScrollView = (LithoScrollView) obj;
        boolean z = this.t;
        boolean z2 = this.f;
        boolean z3 = this.d;
        mpu mpuVar = this.u;
        ejq ejqVar = this.s;
        int i = this.r;
        ComponentTree componentTree = elfVarAA.a;
        ehe eheVar = elfVarAA.b;
        lithoScrollView.i.v(componentTree, true);
        lithoScrollView.m = z3;
        int i2 = eheVar.a;
        lithoScrollView.j = eheVar;
        ehd ehdVar = new ehd(lithoScrollView, i2);
        lithoScrollView.getViewTreeObserver().addOnPreDrawListener(ehdVar);
        lithoScrollView.k = ehdVar;
        if (ejqVar != null) {
            lithoScrollView.n = new efs();
            lithoScrollView.n.a = ejqVar;
        }
        lithoScrollView.setScrollbarFadingEnabled(true);
        lithoScrollView.e.a(z2);
        lithoScrollView.setVerticalFadingEdgeEnabled(false);
        lithoScrollView.setFadingEdgeLength(0);
        lithoScrollView.setVerticalScrollBarEnabled(z);
        lithoScrollView.h = mpuVar;
        lithoScrollView.setOverScrollMode(i);
    }

    @Override // defpackage.drq
    protected final void O(dxx dxxVar, dxx dxxVar2) {
        elf elfVar = (elf) dxxVar;
        elf elfVar2 = (elf) dxxVar2;
        elfVar2.a = elfVar.a;
        elfVar2.b = elfVar.b;
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

    @Override // defpackage.drq
    protected final boolean ag(drq drqVar, dxx dxxVar, drq drqVar2, dxx dxxVar2) {
        elg elgVar = (elg) drqVar;
        elg elgVar2 = (elg) drqVar2;
        dtd dtdVar = new dtd(elgVar == null ? null : elgVar.a, elgVar2 == null ? null : elgVar2.a);
        dtd dtdVar2 = new dtd(elgVar == null ? null : Boolean.valueOf(elgVar.t), elgVar2 == null ? null : Boolean.valueOf(elgVar2.t));
        dtd dtdVar3 = new dtd(elgVar == null ? null : true, elgVar2 == null ? null : true);
        dtd dtdVar4 = new dtd(elgVar == null ? null : Boolean.valueOf(elgVar.c), elgVar2 == null ? null : Boolean.valueOf(elgVar2.c));
        dtd dtdVar5 = new dtd(elgVar == null ? null : Boolean.valueOf(elgVar.f), elgVar2 == null ? null : Boolean.valueOf(elgVar2.f));
        dtd dtdVar6 = new dtd(elgVar == null ? null : Boolean.valueOf(elgVar.d), elgVar2 != null ? Boolean.valueOf(elgVar2.d) : null);
        drq drqVar3 = (drq) dtdVar.a;
        drq drqVar4 = (drq) dtdVar.b;
        boolean z = ebc.a;
        return (drqVar3.g(drqVar4) && ((Boolean) dtdVar2.a).equals(dtdVar2.b) && ((Boolean) dtdVar3.a).equals(dtdVar3.b) && ((Boolean) dtdVar4.a).equals(dtdVar4.b) && ((Boolean) dtdVar5.a).equals(dtdVar5.b) && ((Boolean) dtdVar6.a).equals(dtdVar6.b)) ? false : true;
    }

    @Override // defpackage.drq
    public final int ah() {
        return 3;
    }

    @Override // defpackage.drq
    protected final void as(dru druVar, Object obj) {
        LithoScrollView lithoScrollView = (LithoScrollView) obj;
        lithoScrollView.h = null;
        lithoScrollView.i.v((ComponentTree) null, false);
        lithoScrollView.j = null;
        lithoScrollView.getViewTreeObserver().removeOnPreDrawListener(lithoScrollView.k);
        lithoScrollView.k = null;
        lithoScrollView.m = false;
        efs efsVar = lithoScrollView.n;
        if (efsVar != null) {
            efsVar.a = null;
            lithoScrollView.n = null;
        }
        lithoScrollView.l = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
    
        if (r2.g(r3) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
    
        if (r6.a != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0028, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002d, code lost:
    
        if (r5.b == r6.b) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0034, code lost:
    
        if (r5.c == r6.c) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0036, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003b, code lost:
    
        if (r5.d == r6.d) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0042, code lost:
    
        if (r5.e == r6.e) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0044, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0049, code lost:
    
        if (r5.f == r6.f) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004c, code lost:
    
        r2 = r5.u;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004e, code lost:
    
        if (r2 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0056, code lost:
    
        if (r2.equals(r6.u) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005b, code lost:
    
        if (r6.u == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0062, code lost:
    
        if (r5.r == r6.r) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0064, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0065, code lost:
    
        r2 = r5.s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0067, code lost:
    
        if (r2 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x006f, code lost:
    
        if (r2.equals(r6.s) == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0074, code lost:
    
        if (r6.s == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0076, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x007b, code lost:
    
        if (r5.t == r6.t) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x007d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x007e, code lost:
    
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
            if (r6 == 0) goto L7f
            java.lang.Class r2 = r5.getClass()
            java.lang.Class r3 = r6.getClass()
            if (r2 == r3) goto L13
            goto L7f
        L13:
            elg r6 = (defpackage.elg) r6
            drq r2 = r5.a
            if (r2 == 0) goto L24
            drq r3 = r6.a
            boolean r4 = defpackage.ebc.a
            boolean r2 = r2.g(r3)
            if (r2 == 0) goto L28
            goto L29
        L24:
            drq r2 = r6.a
            if (r2 == 0) goto L29
        L28:
            return r1
        L29:
            boolean r2 = r5.b
            boolean r3 = r6.b
            if (r2 == r3) goto L30
            return r1
        L30:
            boolean r2 = r5.c
            boolean r3 = r6.c
            if (r2 == r3) goto L37
            return r1
        L37:
            boolean r2 = r5.d
            boolean r3 = r6.d
            if (r2 == r3) goto L3e
            return r1
        L3e:
            int r2 = r5.e
            int r3 = r6.e
            if (r2 == r3) goto L45
            return r1
        L45:
            boolean r2 = r5.f
            boolean r3 = r6.f
            if (r2 == r3) goto L4c
            return r1
        L4c:
            mpu r2 = r5.u
            if (r2 == 0) goto L59
            mpu r3 = r6.u
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L5d
            goto L5e
        L59:
            mpu r2 = r6.u
            if (r2 == 0) goto L5e
        L5d:
            return r1
        L5e:
            int r2 = r5.r
            int r3 = r6.r
            if (r2 == r3) goto L65
            return r1
        L65:
            ejq r2 = r5.s
            if (r2 == 0) goto L72
            ejq r3 = r6.s
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L76
            goto L77
        L72:
            ejq r2 = r6.s
            if (r2 == 0) goto L77
        L76:
            return r1
        L77:
            boolean r2 = r5.t
            boolean r6 = r6.t
            if (r2 == r6) goto L7e
            return r1
        L7e:
            return r0
        L7f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.elg.g(drq):boolean");
    }

    @Override // defpackage.drq
    protected final int h() {
        return 3;
    }

    @Override // defpackage.drq
    public final /* bridge */ /* synthetic */ drq l() {
        elg elgVar = (elg) super.l();
        drq drqVar = elgVar.a;
        elgVar.a = drqVar != null ? drqVar.l() : null;
        return elgVar;
    }

    @Override // defpackage.drq
    protected final /* synthetic */ duv r() {
        return new ele();
    }

    @Override // defpackage.drq
    protected final /* synthetic */ dxx u() {
        return new elf();
    }
}
