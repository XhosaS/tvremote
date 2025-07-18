package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.widget.FrameLayout;
import com.facebook.litho.ComponentTree;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uvz extends dxv {

    @eau(a = eav.NONE)
    @eat(a = 10)
    drq a;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    oat b;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    String c;

    @eau(a = eav.NONE)
    @eat(a = 0)
    float d;

    @eau(a = eav.NONE)
    @eat(a = 3)
    int e;

    @eau(a = eav.NONE)
    @eat(a = 0)
    float f;

    @eau(a = eav.NONE)
    @eat(a = 3)
    int r;

    @eau(a = eav.NONE)
    @eat(a = 0)
    float s;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    emk t;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    zyg u;

    public uvz() {
        super("FocusAnimatedCard");
    }

    private final uvy aA(dru druVar) {
        dxo dxoVar = druVar.j;
        dxoVar.getClass();
        return (uvy) dxoVar.c;
    }

    @Override // defpackage.drq
    protected final Object A(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(new dvz(context));
        return frameLayout;
    }

    @Override // defpackage.drq
    protected final void D(dxe dxeVar, dxe dxeVar2) {
        ((uvx) dxeVar).a = ((uvx) dxeVar2).a;
    }

    @Override // defpackage.drq
    protected final void E(dru druVar) {
        uvy uvyVarAA = aA(druVar);
        dxz dxzVar = new dxz();
        dxz dxzVar2 = new dxz();
        dxz dxzVar3 = new dxz();
        drq drqVar = this.a;
        emk emkVar = this.t;
        dxzVar.a = new AtomicReference();
        uwh.a(druVar, (AtomicReference) dxzVar.a, drqVar, emkVar);
        dxzVar2.a = new AtomicReference();
        dxzVar3.a = new AtomicReference();
        uvyVarAA.b = (AtomicReference) dxzVar.a;
        uvyVarAA.c = (AtomicReference) dxzVar2.a;
        uvyVarAA.a = (AtomicReference) dxzVar3.a;
    }

    @Override // defpackage.drq
    protected final void H(dru druVar, Object obj, duv duvVar) {
        ((dvz) ((FrameLayout) obj).getChildAt(0)).n.s();
    }

    @Override // defpackage.drq
    protected final void J(dru druVar) {
        uvy uvyVarAA = aA(druVar);
        zyg zygVar = this.u;
        final AtomicReference atomicReference = uvyVarAA.b;
        vqi.d("com/google/android/libraries/tv/xuikit/focus/FocusAnimatedCardSpec", "onDetached", 251, zxn.j(wyo.h(new Runnable() { // from class: uwe
            @Override // java.lang.Runnable
            public final void run() {
                AtomicReference atomicReference2 = atomicReference;
                ComponentTree componentTree = (ComponentTree) atomicReference2.get();
                if (componentTree != null) {
                    componentTree.r();
                    atomicReference2.set(null);
                }
            }
        }), zygVar), "Failed to clean up child ComponentTree", new Object[0]);
    }

    @Override // defpackage.drq
    protected final void K(dru druVar, dse dseVar, int i, int i2, dxt dxtVar, duv duvVar) {
        uvy uvyVarAA = aA(druVar);
        drq drqVar = this.a;
        uwh.a(druVar, uvyVarAA.b, drqVar, this.t).t(drqVar, i, i2, dxtVar);
    }

    @Override // defpackage.drq
    protected final void L(dru druVar, Object obj, duv duvVar) throws Resources.NotFoundException {
        uvy uvyVarAA = aA(druVar);
        final FrameLayout frameLayout = (FrameLayout) obj;
        drq drqVar = this.a;
        emk emkVar = this.t;
        oat oatVar = this.b;
        String str = this.c;
        float f = this.f;
        float f2 = this.d;
        final int i = this.r;
        dxo dxoVar = druVar.j;
        dxoVar.getClass();
        final utq utqVar = ((uvx) dxoVar.d).a;
        AtomicReference atomicReference = uvyVarAA.b;
        AtomicReference atomicReference2 = uvyVarAA.c;
        AtomicReference atomicReference3 = uvyVarAA.a;
        dvz dvzVar = (dvz) frameLayout.getChildAt(0);
        dvzVar.v(uwh.a(druVar, atomicReference, drqVar, emkVar), true);
        final utf utfVarD = utf.d(dvzVar, frameLayout, false, Math.round(f2), -1);
        final utg utgVarC = utg.c(frameLayout, frameLayout, f);
        dvzVar.setOnKeyListener(utgVarC);
        final ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, i);
        valueAnimatorOfInt.setDuration(150L);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: uwb
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                utqVar.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        valueAnimatorOfInt.addListener(new uwg());
        atomicReference3.set(valueAnimatorOfInt);
        atomicReference2.set(oatVar.a(str).j(new aggz() { // from class: uwc
            @Override // defpackage.aggz
            public final Object a(Object obj2) {
                return Boolean.valueOf(((yqt) obj2).g());
            }
        }).l(new aggy() { // from class: uwd
            @Override // defpackage.aggy
            public final void a(Object obj2) {
                Boolean bool = (Boolean) obj2;
                boolean zBooleanValue = bool.booleanValue();
                utf utfVar = utfVarD;
                FrameLayout frameLayout2 = frameLayout;
                utfVar.onFocusChange(frameLayout2, zBooleanValue);
                utgVarC.onFocusChange(frameLayout2, bool.booleanValue());
                ValueAnimator valueAnimator = valueAnimatorOfInt;
                valueAnimator.cancel();
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                int i2 = true != bool.booleanValue() ? 0 : i;
                if (iIntValue != i2) {
                    valueAnimator.setIntValues(iIntValue, i2);
                    valueAnimator.start();
                }
            }
        }));
        frameLayout.setBackground(utqVar);
    }

    @Override // defpackage.drq
    protected final void M(dru druVar) {
        dwz dwzVar = new dwz();
        Context context = druVar.a;
        int i = this.e;
        float f = this.d;
        float f2 = this.s;
        utp utpVarA = utq.a(context);
        utpVarA.a = i;
        utpVarA.a(f);
        utpVarA.g = false;
        if (f2 != 0.0f) {
            utpVarA.b(f2);
        }
        utq utqVar = new utq(utpVarA);
        utqVar.setAlpha(0);
        dwzVar.a = utqVar;
        dxo dxoVar = druVar.j;
        dxoVar.getClass();
        ((uvx) dxoVar.d).a = (utq) dwzVar.a;
    }

    @Override // defpackage.drq
    protected final void O(dxx dxxVar, dxx dxxVar2) {
        uvy uvyVar = (uvy) dxxVar;
        uvy uvyVar2 = (uvy) dxxVar2;
        uvyVar2.a = uvyVar.a;
        uvyVar2.b = uvyVar.b;
        uvyVar2.c = uvyVar.c;
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
    public final boolean ad() {
        return true;
    }

    @Override // defpackage.drq
    public final int ah() {
        return 3;
    }

    @Override // defpackage.drq
    protected final void ar(Object obj) {
        ((dvz) ((FrameLayout) obj).getChildAt(0)).n.v();
    }

    @Override // defpackage.drq
    protected final void as(dru druVar, Object obj) {
        uvy uvyVarAA = aA(druVar);
        FrameLayout frameLayout = (FrameLayout) obj;
        AtomicReference atomicReference = uvyVarAA.c;
        AtomicReference atomicReference2 = uvyVarAA.a;
        ((dvz) frameLayout.getChildAt(0)).v((ComponentTree) null, true);
        frameLayout.setBackground(null);
        ((aggi) atomicReference.get()).dispose();
        atomicReference.set(null);
        ((ValueAnimator) atomicReference2.get()).cancel();
        atomicReference2.set(null);
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
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0029, code lost:
    
        r2 = r5.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002b, code lost:
    
        if (r2 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0033, code lost:
    
        if (r2.equals(r6.b) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0038, code lost:
    
        if (r6.b == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003a, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:
    
        r2 = r5.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003d, code lost:
    
        if (r2 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0045, code lost:
    
        if (r2.equals(r6.c) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004a, code lost:
    
        if (r6.c == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0055, code lost:
    
        if (java.lang.Float.compare(r5.d, r6.d) == 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0057, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005c, code lost:
    
        if (r5.e == r6.e) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0067, code lost:
    
        if (java.lang.Float.compare(r5.f, r6.f) == 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0069, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x006e, code lost:
    
        if (r5.r == r6.r) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0070, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0079, code lost:
    
        if (java.lang.Float.compare(r5.s, r6.s) == 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x007b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x007c, code lost:
    
        r2 = r5.t;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x007e, code lost:
    
        if (r2 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0086, code lost:
    
        if (r2.equals(r6.t) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x008b, code lost:
    
        if (r6.t == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x008d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x008e, code lost:
    
        r2 = r5.u;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0090, code lost:
    
        if (r2 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0098, code lost:
    
        if (r2.equals(r6.u) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x009d, code lost:
    
        if (r6.u == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x009f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00a0, code lost:
    
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
            if (r6 == 0) goto La1
            java.lang.Class r2 = r5.getClass()
            java.lang.Class r3 = r6.getClass()
            if (r2 == r3) goto L13
            goto La1
        L13:
            uvz r6 = (defpackage.uvz) r6
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
            oat r2 = r5.b
            if (r2 == 0) goto L36
            oat r3 = r6.b
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L3a
            goto L3b
        L36:
            oat r2 = r6.b
            if (r2 == 0) goto L3b
        L3a:
            return r1
        L3b:
            java.lang.String r2 = r5.c
            if (r2 == 0) goto L48
            java.lang.String r3 = r6.c
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L4c
            goto L4d
        L48:
            java.lang.String r2 = r6.c
            if (r2 == 0) goto L4d
        L4c:
            return r1
        L4d:
            float r2 = r5.d
            float r3 = r6.d
            int r2 = java.lang.Float.compare(r2, r3)
            if (r2 == 0) goto L58
            return r1
        L58:
            int r2 = r5.e
            int r3 = r6.e
            if (r2 == r3) goto L5f
            return r1
        L5f:
            float r2 = r5.f
            float r3 = r6.f
            int r2 = java.lang.Float.compare(r2, r3)
            if (r2 == 0) goto L6a
            return r1
        L6a:
            int r2 = r5.r
            int r3 = r6.r
            if (r2 == r3) goto L71
            return r1
        L71:
            float r2 = r5.s
            float r3 = r6.s
            int r2 = java.lang.Float.compare(r2, r3)
            if (r2 == 0) goto L7c
            return r1
        L7c:
            emk r2 = r5.t
            if (r2 == 0) goto L89
            emk r3 = r6.t
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L8d
            goto L8e
        L89:
            emk r2 = r6.t
            if (r2 == 0) goto L8e
        L8d:
            return r1
        L8e:
            zyg r2 = r5.u
            if (r2 == 0) goto L9b
            zyg r6 = r6.u
            boolean r6 = r2.equals(r6)
            if (r6 != 0) goto La0
            goto L9f
        L9b:
            zyg r6 = r6.u
            if (r6 == 0) goto La0
        L9f:
            return r1
        La0:
            return r0
        La1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uvz.g(drq):boolean");
    }

    @Override // defpackage.drq
    protected final int h() {
        return 0;
    }

    @Override // defpackage.drq
    public final /* bridge */ /* synthetic */ drq l() {
        uvz uvzVar = (uvz) super.l();
        drq drqVar = uvzVar.a;
        uvzVar.a = drqVar != null ? drqVar.l() : null;
        return uvzVar;
    }

    @Override // defpackage.drq
    protected final /* synthetic */ dxe t() {
        return new uvx();
    }

    @Override // defpackage.drq
    protected final /* synthetic */ dxx u() {
        return new uvy();
    }
}
