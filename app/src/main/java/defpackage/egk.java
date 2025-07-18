package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import com.facebook.litho.ComponentTree;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class egk extends dxv {

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public int A;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public int B;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public int C;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public int D;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public mpw E;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public int F;

    @eau(a = eav.NONE)
    @eat(a = 3)
    public boolean a;

    @eau(a = eav.NONE)
    @eat(a = 6)
    public List b;

    @eau(a = eav.NONE)
    @eat(a = 10)
    public drq c;

    @eau(a = eav.NONE)
    @eat(a = 0)
    public float d;

    @eau(a = eav.NONE)
    @eat(a = 3)
    public boolean e;

    @eau(a = eav.NONE)
    @eat(a = 3)
    public int f;

    @eau(a = eav.NONE)
    @eat(a = 3)
    public long r;

    @eau(a = eav.NONE)
    @eat(a = 3)
    public boolean s;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public String t;

    @eau(a = eav.NONE)
    @eat(a = 0)
    public float u;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public String v;

    @eau(a = eav.NONE)
    @eat(a = 3)
    public int w;

    @eau(a = eav.NONE)
    @eat(a = 3)
    public long x;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    public ejq y;

    @eau(a = eav.BOOL)
    @eat(a = 3)
    public boolean z;

    public egk() {
        super("HorizontalScroll");
        this.f = -1;
        this.w = 1;
        this.z = true;
    }

    private final egj aA(dru druVar) {
        dxo dxoVar = druVar.j;
        dxoVar.getClass();
        return (egj) dxoVar.c;
    }

    @Override // defpackage.drq
    protected final Object A(Context context) {
        return new egp(context);
    }

    @Override // defpackage.drq
    protected final void C(duv duvVar, duv duvVar2) {
        egi egiVar = (egi) duvVar;
        egi egiVar2 = (egi) duvVar2;
        egiVar.a = egiVar2.a;
        egiVar.b = egiVar2.b;
        egiVar.c = egiVar2.c;
        egiVar.d = egiVar2.d;
        egiVar.e = egiVar2.e;
        egiVar.f = egiVar2.f;
        egiVar.g = egiVar2.g;
        egiVar.h = egiVar2.h;
    }

    @Override // defpackage.drq
    protected final void E(dru druVar) {
        egj egjVarAA = aA(druVar);
        dxz dxzVar = new dxz();
        dxz dxzVar2 = new dxz();
        drq drqVar = this.c;
        dxzVar.a = new egq(this.f);
        dsi dsiVarD = ComponentTree.d(druVar, drqVar);
        dsiVarD.d = false;
        dxzVar2.a = dsiVarD.a();
        egjVarAA.b = (egq) dxzVar.a;
        egjVarAA.a = (ComponentTree) dxzVar2.a;
    }

    @Override // defpackage.drq
    protected final void I(dru druVar, dse dseVar, duv duvVar) {
        dwz dwzVar;
        int i;
        egj egjVarAA = aA(druVar);
        dwz dwzVar2 = new dwz();
        dwz dwzVar3 = new dwz();
        dwz dwzVar4 = new dwz();
        dwz dwzVar5 = new dwz();
        dwz dwzVar6 = new dwz();
        drq drqVar = this.c;
        boolean z = this.e;
        boolean z2 = this.s;
        List list = this.b;
        int i2 = this.F;
        int i3 = this.B;
        int i4 = this.D;
        int i5 = this.C;
        int i6 = this.A;
        boolean z3 = this.a;
        float f = this.u;
        ComponentTree componentTreeA = egjVarAA.a;
        egi egiVar = (egi) duvVar;
        Integer num = egiVar.f;
        Integer num2 = egiVar.d;
        ComponentTree componentTree = egiVar.e;
        int iF = (dseVar.f() - dseVar.c()) - dseVar.d();
        int i7 = true != z ? 0 : iF;
        if (num == null || num2 == null || componentTree == null) {
            dxt dxtVar = new dxt();
            dwzVar = dwzVar5;
            componentTreeA.t(drqVar, View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(dseVar.a(), 1073741824), dxtVar);
            int iMax = Math.max(dxtVar.a, i7);
            int i8 = dxtVar.b;
            dwzVar2.a = Integer.valueOf(iMax);
            dwzVar3.a = Integer.valueOf(i8);
            dwzVar6.a = componentTreeA;
            if (!z2 || ((!z3 && iF >= dxtVar.a) || list == null || list.isEmpty())) {
                i = iF;
            } else {
                i = iF;
                drq drqVarC = egr.c(druVar, list, i, dxtVar.a, f, i2, i3, i4, i5, i6);
                dsi dsiVarC = ComponentTree.c(dru.c(druVar), drqVarC, null);
                dsiVarC.d = false;
                componentTreeA = dsiVarC.a();
                componentTreeA.t(drqVarC, View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(dseVar.a(), 1073741824), dxtVar);
                dwzVar2.a = Integer.valueOf(Math.max(dxtVar.a, true != z ? 0 : i));
                dwzVar3.a = Integer.valueOf(dxtVar.b);
            }
            dwzVar6.a = componentTreeA;
        } else {
            dwzVar2.a = Integer.valueOf(Math.max(num.intValue(), i7));
            dwzVar3.a = num2;
            dwzVar6.a = componentTree;
            dwzVar = dwzVar5;
            i = iF;
        }
        dwzVar4.a = Integer.valueOf(i);
        dwz dwzVar7 = dwzVar;
        dwzVar7.a = dseVar.g();
        egiVar.b = (Integer) dwzVar2.a;
        egiVar.a = (Integer) dwzVar3.a;
        egiVar.h = (Integer) dwzVar4.a;
        egiVar.c = (eny) dwzVar7.a;
        egiVar.g = (ComponentTree) dwzVar6.a;
    }

    @Override // defpackage.drq
    protected final void K(dru druVar, dse dseVar, int i, int i2, dxt dxtVar, duv duvVar) {
        egj egjVarAA = aA(druVar);
        dwz dwzVar = new dwz();
        dwz dwzVar2 = new dwz();
        dwz dwzVar3 = new dwz();
        drq drqVar = this.c;
        boolean z = this.s;
        List list = this.b;
        int i3 = this.F;
        int i4 = this.B;
        int i5 = this.D;
        int i6 = this.C;
        int i7 = this.A;
        boolean z2 = this.a;
        float f = this.u;
        ComponentTree componentTree = egjVarAA.a;
        dxt dxtVar2 = new dxt();
        componentTree.t(drqVar, View.MeasureSpec.makeMeasureSpec(0, 0), i2, dxtVar2);
        if (dxtVar2.a == 0 && View.MeasureSpec.getMode(i) == 1073741824) {
            componentTree.t(drqVar, i, i2, dxtVar2);
        }
        int i8 = dxtVar2.a;
        int i9 = dxtVar2.b;
        dwzVar.a = Integer.valueOf(i8);
        dwzVar2.a = Integer.valueOf(i9);
        dwzVar3.a = componentTree;
        dxtVar.a = View.MeasureSpec.getMode(i) == 0 ? i8 : View.MeasureSpec.getSize(i);
        dxtVar.b = i9;
        int size = View.MeasureSpec.getMode(i) == 0 ? i8 : View.MeasureSpec.getSize(i);
        if (!z || ((!z2 && size >= i8) || list == null || list.isEmpty())) {
            dwzVar3.a = componentTree;
        } else {
            drq drqVarC = egr.c(druVar, list, size, i8, f, i3, i4, i5, i6, i7);
            dsi dsiVarC = ComponentTree.c(dru.c(druVar), drqVarC, null);
            dsiVarC.d = false;
            ComponentTree componentTreeA = dsiVarC.a();
            componentTreeA.t(drqVarC, View.MeasureSpec.makeMeasureSpec(0, 0), i2, dxtVar2);
            if (dxtVar2.a == 0 && View.MeasureSpec.getMode(i) == 1073741824) {
                componentTreeA.t(drqVarC, i, i2, dxtVar2);
            }
            dwzVar.a = Integer.valueOf(dxtVar2.a);
            dwzVar2.a = Integer.valueOf(dxtVar2.b);
            dwzVar3.a = componentTreeA;
            dxtVar.a = View.MeasureSpec.getMode(i) == 0 ? dxtVar2.a : View.MeasureSpec.getSize(i);
            dxtVar.b = dxtVar2.b;
        }
        egi egiVar = (egi) duvVar;
        egiVar.f = (Integer) dwzVar.a;
        egiVar.d = (Integer) dwzVar2.a;
        egiVar.e = (ComponentTree) dwzVar3.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0137  */
    @Override // defpackage.drq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void L(defpackage.dru r23, java.lang.Object r24, defpackage.duv r25) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.egk.L(dru, java.lang.Object, duv):void");
    }

    @Override // defpackage.drq
    protected final void O(dxx dxxVar, dxx dxxVar2) {
        egj egjVar = (egj) dxxVar;
        egj egjVar2 = (egj) dxxVar2;
        egjVar2.a = egjVar.a;
        egjVar2.b = egjVar.b;
    }

    @Override // defpackage.drq
    protected final boolean P() {
        return true;
    }

    @Override // defpackage.drq
    protected final boolean U() {
        return true;
    }

    @Override // defpackage.drq
    protected final boolean ab() {
        return true;
    }

    @Override // defpackage.drq
    public final int ah() {
        return 3;
    }

    @Override // defpackage.drq
    protected final void as(dru druVar, Object obj) {
        egp egpVar = (egp) obj;
        egpVar.a.v((ComponentTree) null, false);
        egpVar.b = 0;
        egpVar.c = 0;
        egpVar.e = null;
        egpVar.g = null;
        ValueAnimator valueAnimator = egpVar.f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            egpVar.f = null;
        }
        egpVar.setScrollX(0);
        efs efsVar = egpVar.h;
        if (efsVar != null) {
            efsVar.a = null;
            egpVar.h = null;
        }
        egpVar.setScrollX(0);
        egpVar.d = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00ff, code lost:
    
        if (r2.equals(r8.v) == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0104, code lost:
    
        if (r8.v == null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0106, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0107, code lost:
    
        r2 = r7.E;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0109, code lost:
    
        if (r2 == null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0111, code lost:
    
        if (r2.equals(r8.E) == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0116, code lost:
    
        if (r8.E == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0118, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x011d, code lost:
    
        if (r7.w == r8.w) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x011f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0126, code lost:
    
        if (r7.x == r8.x) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0128, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0129, code lost:
    
        r2 = r7.y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x012b, code lost:
    
        if (r2 == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0133, code lost:
    
        if (r2.equals(r8.y) == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0138, code lost:
    
        if (r8.y == null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x013a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x013f, code lost:
    
        if (r7.z == r8.z) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0141, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0142, code lost:
    
        r2 = r7.D;
        r8 = r8.D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0146, code lost:
    
        if (r2 == 0) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0148, code lost:
    
        if (r2 == r8) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x014b, code lost:
    
        if (r8 == 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x014d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x014e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008b, code lost:
    
        if (r2.g(r3) != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0090, code lost:
    
        if (r8.c != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0092, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x009b, code lost:
    
        if (java.lang.Float.compare(r7.d, r8.d) == 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a2, code lost:
    
        if (r7.e == r8.e) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a4, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a5, code lost:
    
        r2 = r7.F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a7, code lost:
    
        if (r2 == 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ab, code lost:
    
        if (r2 != r8.F) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b0, code lost:
    
        if (r8.F == 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b2, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00b7, code lost:
    
        if (r7.f == r8.f) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00b9, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ba, code lost:
    
        r2 = r7.C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00bc, code lost:
    
        if (r2 == 0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00c0, code lost:
    
        if (r2 != r8.C) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00c5, code lost:
    
        if (r8.C == 0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00c7, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00ce, code lost:
    
        if (r7.r == r8.r) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00d0, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00d5, code lost:
    
        if (r7.s == r8.s) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00d7, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00d8, code lost:
    
        r2 = r7.t;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00da, code lost:
    
        if (r2 == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00e2, code lost:
    
        if (r2.equals(r8.t) == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00e7, code lost:
    
        if (r8.t == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00e9, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00f2, code lost:
    
        if (java.lang.Float.compare(r7.u, r8.u) == 0) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00f4, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00f5, code lost:
    
        r2 = r7.v;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00f7, code lost:
    
        if (r2 == null) goto L102;
     */
    @Override // defpackage.drq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(defpackage.drq r8) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.egk.g(drq):boolean");
    }

    @Override // defpackage.drq
    protected final int h() {
        return 3;
    }

    @Override // defpackage.drq
    public final /* bridge */ /* synthetic */ drq l() {
        egk egkVar = (egk) super.l();
        drq drqVar = egkVar.c;
        egkVar.c = drqVar != null ? drqVar.l() : null;
        return egkVar;
    }

    @Override // defpackage.drq
    protected final /* synthetic */ duv r() {
        return new egi();
    }

    @Override // defpackage.drq
    protected final /* synthetic */ dxx u() {
        return new egj();
    }
}
