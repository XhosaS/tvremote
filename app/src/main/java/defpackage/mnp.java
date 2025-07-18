package defpackage;

import android.content.Context;
import android.text.TextWatcher;
import android.view.View;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mnp extends dxv {

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    oaa a;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    oal b;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    oap c;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    nhw d;

    @eau(a = eav.NONE)
    @eat(a = 3)
    boolean e;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    oco f;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    ogq r;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    ogq s;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    ogq t;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    ogq u;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    Map v;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    ofy w;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    mrg x;

    public mnp() {
        super("EditableTextMount");
    }

    private final mno aA(dru druVar) {
        dxo dxoVar = druVar.j;
        dxoVar.getClass();
        return (mno) dxoVar.c;
    }

    @Override // defpackage.drq
    protected final Object A(Context context) {
        return new mmo(context, false);
    }

    @Override // defpackage.drq
    protected final void C(duv duvVar, duv duvVar2) {
        mnn mnnVar = (mnn) duvVar;
        mnn mnnVar2 = (mnn) duvVar2;
        mnnVar.a = mnnVar2.a;
        mnnVar.b = mnnVar2.b;
        mnnVar.c = mnnVar2.c;
    }

    @Override // defpackage.drq
    protected final void E(dru druVar) {
        mno mnoVarAA = aA(druVar);
        dxz dxzVar = new dxz();
        dxz dxzVar2 = new dxz();
        dxz dxzVar3 = new dxz();
        dxzVar.a = new AtomicInteger(0);
        dxzVar2.a = new AtomicReference(new ArrayList());
        dxzVar3.a = new AtomicInteger(0);
        mnoVarAA.a = (AtomicInteger) dxzVar.a;
        mnoVarAA.c = (AtomicReference) dxzVar2.a;
        mnoVarAA.b = (AtomicInteger) dxzVar3.a;
    }

    @Override // defpackage.drq
    protected final void H(dru druVar, Object obj, duv duvVar) {
        mmo mmoVar = (mmo) obj;
        TextWatcher textWatcher = mmoVar.b;
        if (textWatcher != null) {
            mmoVar.addTextChangedListener(textWatcher);
        }
        if (((mla) mmoVar.a).e.s()) {
            mmoVar.c = new mnl();
        }
        mmoVar.d = true;
    }

    @Override // defpackage.drq
    protected final void I(dru druVar, dse dseVar, duv duvVar) {
        dwz dwzVar = new dwz();
        dwz dwzVar2 = new dwz();
        dwz dwzVar3 = new dwz();
        dwzVar.a = Integer.valueOf(dseVar.f());
        dwzVar2.a = Integer.valueOf(dseVar.a());
        dwzVar3.a = dseVar.g();
        mnn mnnVar = (mnn) duvVar;
        mnnVar.b = (Integer) dwzVar.a;
        mnnVar.a = (Integer) dwzVar2.a;
        mnnVar.c = (eny) dwzVar3.a;
    }

    @Override // defpackage.drq
    protected final void K(dru druVar, dse dseVar, int i, int i2, dxt dxtVar, duv duvVar) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        mno mnoVarAA = aA(druVar);
        nhw nhwVar = this.d;
        oal oalVar = this.b;
        ofy ofyVar = this.w;
        oco ocoVar = this.f;
        oap oapVar = this.c;
        boolean z = this.e;
        oaa oaaVar = this.a;
        mrg mrgVar = this.x;
        Map map = this.v;
        CharSequence charSequenceA = mmo.a(nhwVar, mnoVarAA.c);
        mmo mmoVar = new mmo(druVar.a, true);
        mmoVar.c(nhwVar, mmn.n(null, null, null, null, nhwVar, mrgVar, ofyVar, ocoVar, oapVar, z, oaaVar, map, oalVar));
        if (charSequenceA != null) {
            mmoVar.setText(charSequenceA);
        }
        mmoVar.measure(eew.a(i), eew.a(i2));
        dxtVar.b = mmoVar.getMeasuredHeight();
        if (View.MeasureSpec.getMode(i) == 0) {
            dxtVar.a = 0;
        } else {
            dxtVar.a = Math.min(View.MeasureSpec.getSize(i), mmoVar.getMeasuredWidth());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00d8 A[PHI: r5
  0x00d8: PHI (r5v6 int) = (r5v5 int), (r5v7 int) binds: [B:26:0x00ca, B:30:0x00d0] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.drq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void L(defpackage.dru r19, java.lang.Object r20, defpackage.duv r21) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mnp.L(dru, java.lang.Object, duv):void");
    }

    @Override // defpackage.drq
    protected final void O(dxx dxxVar, dxx dxxVar2) {
        mno mnoVar = (mno) dxxVar;
        mno mnoVar2 = (mno) dxxVar2;
        mnoVar2.a = mnoVar.a;
        mnoVar2.b = mnoVar.b;
        mnoVar2.c = mnoVar.c;
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
    public final boolean X() {
        return true;
    }

    @Override // defpackage.drq
    protected final boolean ab() {
        return true;
    }

    @Override // defpackage.drq
    public final boolean ad() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x012f, code lost:
    
        if (r7.anyMatch(new defpackage.mnq(r9)) == false) goto L78;
     */
    @Override // defpackage.drq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final boolean ag(defpackage.drq r7, defpackage.dxx r8, defpackage.drq r9, defpackage.dxx r10) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mnp.ag(drq, dxx, drq, dxx):boolean");
    }

    @Override // defpackage.drq
    public final int ah() {
        return 3;
    }

    @Override // defpackage.drq
    protected final void ar(Object obj) {
        mmo mmoVar = (mmo) obj;
        TextWatcher textWatcher = mmoVar.b;
        if (textWatcher != null) {
            mmoVar.removeTextChangedListener(textWatcher);
        }
        mnl mnlVar = mmoVar.c;
        if (mnlVar != null) {
            mnlVar.c();
            mmoVar.c = null;
        }
        mmoVar.d = false;
    }

    @Override // defpackage.drq
    public final boolean g(drq drqVar) {
        if (this == drqVar) {
            return true;
        }
        if (drqVar == null || getClass() != drqVar.getClass()) {
            return false;
        }
        mnp mnpVar = (mnp) drqVar;
        oaa oaaVar = this.a;
        if (oaaVar == null ? mnpVar.a != null : !oaaVar.equals(mnpVar.a)) {
            return false;
        }
        oal oalVar = this.b;
        if (oalVar == null ? mnpVar.b != null : !oalVar.equals(mnpVar.b)) {
            return false;
        }
        oap oapVar = this.c;
        if (oapVar == null ? mnpVar.c != null : !oapVar.equals(mnpVar.c)) {
            return false;
        }
        nhw nhwVar = this.d;
        if (nhwVar == null ? mnpVar.d != null : !nhwVar.equals(mnpVar.d)) {
            return false;
        }
        if (this.e != mnpVar.e) {
            return false;
        }
        mrg mrgVar = this.x;
        if (mrgVar == null ? mnpVar.x != null : !mrgVar.equals(mnpVar.x)) {
            return false;
        }
        oco ocoVar = this.f;
        if (ocoVar == null ? mnpVar.f != null : !ocoVar.equals(mnpVar.f)) {
            return false;
        }
        ogq ogqVar = this.r;
        if (ogqVar == null ? mnpVar.r != null : !ogqVar.equals(mnpVar.r)) {
            return false;
        }
        ogq ogqVar2 = this.s;
        if (ogqVar2 == null ? mnpVar.s != null : !ogqVar2.equals(mnpVar.s)) {
            return false;
        }
        ogq ogqVar3 = this.t;
        if (ogqVar3 == null ? mnpVar.t != null : !ogqVar3.equals(mnpVar.t)) {
            return false;
        }
        ogq ogqVar4 = this.u;
        if (ogqVar4 == null ? mnpVar.u != null : !ogqVar4.equals(mnpVar.u)) {
            return false;
        }
        Map map = this.v;
        if (map == null ? mnpVar.v != null : !map.equals(mnpVar.v)) {
            return false;
        }
        ofy ofyVar = this.w;
        return ofyVar == null ? mnpVar.w == null : ofyVar.equals(mnpVar.w);
    }

    @Override // defpackage.drq
    protected final int h() {
        return 3;
    }

    @Override // defpackage.drq
    public final /* synthetic */ drq l() {
        return (mnp) super.l();
    }

    @Override // defpackage.drq
    protected final /* synthetic */ duv r() {
        return new mnn();
    }

    @Override // defpackage.drq
    protected final /* synthetic */ dxx u() {
        return new mno();
    }
}
