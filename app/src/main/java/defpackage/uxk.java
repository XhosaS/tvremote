package defpackage;

import android.animation.ValueAnimator;
import com.facebook.litho.ComponentTree;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uxk extends dxv {

    @eau(a = eav.NONE)
    @eat(a = 10)
    drq a;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    oal b;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    oat c;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    adfi d;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    uwm e;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    adfi f;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    String r;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    adfe s;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    adfi t;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    String u;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    dug v;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    zyg w;
    dtx x;

    public uxk() {
        super("TvWrapper");
    }

    public static void aA(dug dugVar, boolean z, boolean z2) {
        dtx dtxVarD;
        ComponentTree componentTree = dugVar.a;
        if (componentTree == null) {
            dtxVarD = null;
        } else {
            dtz dtzVar = componentTree.H;
            synchronized (dtzVar) {
                dtxVarD = dtzVar.d(dugVar);
            }
        }
        if (dtxVarD == null) {
            return;
        }
        uxh uxhVar = new uxh();
        uxhVar.a = z;
        uxhVar.b = z2;
        dtxVarD.a(uxhVar);
    }

    private final uxj aB(dru druVar) {
        dxo dxoVar = druVar.j;
        dxoVar.getClass();
        return (uxj) dxoVar.c;
    }

    @Override // defpackage.drq
    protected final void E(dru druVar) {
        ValueAnimator valueAnimatorOfFloat;
        uxj uxjVarAB = aB(druVar);
        dxz dxzVar = new dxz();
        dxz dxzVar2 = new dxz();
        dxz dxzVar3 = new dxz();
        dxz dxzVar4 = new dxz();
        dxz dxzVar5 = new dxz();
        dxz dxzVar6 = new dxz();
        adfi adfiVar = this.d;
        adfe adfeVar = this.s;
        dxzVar.a = new AtomicReference();
        dxzVar2.a = new AtomicReference();
        dxzVar3.a = new dtl(Integer.valueOf(adfiVar.b));
        dxzVar4.a = new dtl(Float.valueOf(adfiVar.c));
        if (adfeVar != null) {
            dxzVar5.a = new dtl(Float.valueOf(adfeVar.b));
        } else {
            dxzVar5.a = new dtl(Float.valueOf(adfiVar.d));
        }
        if (adfeVar != null) {
            valueAnimatorOfFloat = ValueAnimator.ofFloat(adfeVar.b, adfeVar.c);
            valueAnimatorOfFloat.setDuration(adfeVar.d);
            valueAnimatorOfFloat.addUpdateListener(new uxq(dxzVar5));
        } else {
            valueAnimatorOfFloat = null;
        }
        dxzVar6.a = valueAnimatorOfFloat;
        uxjVarAB.d = (AtomicReference) dxzVar.a;
        uxjVarAB.b = (AtomicReference) dxzVar2.a;
        uxjVarAB.a = (dtl) dxzVar3.a;
        uxjVarAB.e = (dtl) dxzVar4.a;
        uxjVarAB.f = (dtl) dxzVar5.a;
        uxjVarAB.c = (ValueAnimator) dxzVar6.a;
    }

    @Override // defpackage.drq
    protected final void G(dru druVar) {
        uxj uxjVarAB = aB(druVar);
        final oal oalVar = this.b;
        final String str = this.u;
        final String str2 = this.r;
        final oat oatVar = this.c;
        final dug dugVar = this.v;
        zyg zygVar = this.w;
        final AtomicReference atomicReference = uxjVarAB.d;
        final AtomicReference atomicReference2 = uxjVarAB.b;
        vqi.d("com/google/android/libraries/tv/xuikit/tvwrapper/TvWrapperSpec", "onAttached", 119, zxn.j(wyo.h(new Runnable() { // from class: uxp
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0070 A[PHI: r5
  0x0070: PHI (r5v3 ??) = (r5v2 ??), (r5v5 ??), (r5v5 ??) binds: [B:10:0x0052, B:15:0x0062, B:17:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Type inference failed for: r0v2, types: [aghb] */
            /* JADX WARN: Type inference failed for: r3v1 */
            /* JADX WARN: Type inference failed for: r3v2, types: [aggi] */
            /* JADX WARN: Type inference failed for: r3v7 */
            /* JADX WARN: Type inference failed for: r5v1 */
            /* JADX WARN: Type inference failed for: r5v11 */
            /* JADX WARN: Type inference failed for: r5v2, types: [aggi] */
            /* JADX WARN: Type inference failed for: r5v3 */
            /* JADX WARN: Type inference failed for: r5v5 */
            /* JADX WARN: Type inference failed for: r5v7 */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    r9 = this;
                    oal r0 = r1
                    nyx r0 = (defpackage.nyx) r0
                    aghb r0 = r0.f
                    java.util.concurrent.atomic.AtomicReference r1 = r2
                    java.util.concurrent.atomic.AtomicReference r2 = r3
                    defpackage.uxr.a(r0, r1, r2)
                    oat r3 = r5
                    dug r4 = r6
                    java.lang.String r5 = r4
                    boolean r6 = r5.isEmpty()
                    r7 = 0
                    if (r6 != 0) goto L31
                    agfo r5 = r3.a(r5)
                    agfx r6 = defpackage.aggd.a
                    defpackage.aggb.a(r6)
                    agfo r5 = r5.k(r6)
                    uxn r6 = new uxn
                    r6.<init>()
                    aggi r5 = r5.l(r6)
                    goto L32
                L31:
                    r5 = r7
                L32:
                    java.lang.String r6 = r7
                    boolean r8 = r6.isEmpty()
                    if (r8 != 0) goto L51
                    agfo r3 = r3.a(r6)
                    agfx r6 = defpackage.aggd.a
                    defpackage.aggb.a(r6)
                    agfo r3 = r3.k(r6)
                    uxo r6 = new uxo
                    r6.<init>()
                    aggi r3 = r3.l(r6)
                    goto L52
                L51:
                    r3 = r7
                L52:
                    if (r0 == 0) goto L70
                    if (r5 == 0) goto L62
                    boolean r4 = r0.a(r5)
                    if (r4 != 0) goto L62
                    java.util.concurrent.atomic.AtomicReference r5 = (java.util.concurrent.atomic.AtomicReference) r5
                    defpackage.aghd.e(r5)
                    r5 = r7
                L62:
                    if (r3 == 0) goto L70
                    boolean r0 = r0.a(r3)
                    if (r0 != 0) goto L70
                    java.util.concurrent.atomic.AtomicReference r3 = (java.util.concurrent.atomic.AtomicReference) r3
                    defpackage.aghd.e(r3)
                    goto L71
                L70:
                    r7 = r3
                L71:
                    r1.set(r5)
                    r2.set(r7)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.uxp.run():void");
            }
        }), zygVar), "Failed to create item/group disposables.", new Object[0]);
    }

    @Override // defpackage.drq
    protected final void J(dru druVar) {
        uxj uxjVarAB = aB(druVar);
        final oal oalVar = this.b;
        zyg zygVar = this.w;
        final AtomicReference atomicReference = uxjVarAB.d;
        final AtomicReference atomicReference2 = uxjVarAB.b;
        vqi.d("com/google/android/libraries/tv/xuikit/tvwrapper/TvWrapperSpec", "onDetached", 210, zxn.j(wyo.h(new Runnable() { // from class: uxm
            @Override // java.lang.Runnable
            public final void run() {
                uxr.a(((nyx) oalVar).f, atomicReference, atomicReference2);
            }
        }), zygVar), "Failed to dispose item/group disposables.", new Object[0]);
    }

    @Override // defpackage.drq
    public final void N(dru druVar, dtz dtzVar) {
        dtx dtxVar = this.x;
        if (dtxVar != null) {
            dtxVar.b = druVar;
            dtxVar.a = this;
            dtzVar.c(dtxVar);
        }
    }

    @Override // defpackage.drq
    protected final void O(dxx dxxVar, dxx dxxVar2) {
        uxj uxjVar = (uxj) dxxVar;
        uxj uxjVar2 = (uxj) dxxVar2;
        uxjVar2.a = uxjVar.a;
        uxjVar2.b = uxjVar.b;
        uxjVar2.c = uxjVar.c;
        uxjVar2.d = uxjVar.d;
        uxjVar2.e = uxjVar.e;
        uxjVar2.f = uxjVar.f;
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
        boolean z;
        if (dtxVar.c != 1839493254) {
            return;
        }
        uxh uxhVar = (uxh) obj;
        dru druVar = dtxVar.b;
        dty dtyVar = dtxVar.a;
        boolean z2 = uxhVar.a;
        boolean z3 = uxhVar.b;
        uxk uxkVar = (uxk) dtyVar;
        dtl dtlVar = uxkVar.aB(druVar).a;
        dtl dtlVar2 = uxkVar.aB(druVar).e;
        dtl dtlVar3 = uxkVar.aB(druVar).f;
        ValueAnimator valueAnimator = uxkVar.aB(druVar).c;
        String str = uxkVar.u;
        String str2 = uxkVar.r;
        uwm uwmVar = uxkVar.e;
        adfe adfeVar = uxkVar.s;
        adfi adfiVar = uxkVar.d;
        adfi adfiVar2 = uxkVar.t;
        adfi adfiVar3 = uxkVar.f;
        if (z3) {
            boolean z4 = !str.isEmpty() && str.equals(uwmVar.a("xuikit_tv___current_item_selection_key"));
            z = z2;
            z2 = z4;
        } else {
            z = !str2.isEmpty() && str2.equals(uwmVar.a("xuikit_tv___current_group_selection_key"));
        }
        if (z2) {
            adfiVar = adfiVar2;
        } else if (z) {
            adfiVar = adfiVar3;
        }
        dtlVar.a(Integer.valueOf(adfiVar.b));
        dtlVar2.a(Float.valueOf(adfiVar.c));
        if (valueAnimator == null) {
            dtlVar3.a(Float.valueOf(adfiVar.d));
        } else if (z3) {
            valueAnimator.cancel();
            valueAnimator.setFloatValues(((Float) dtlVar3.a).floatValue(), z ? adfeVar.c : adfeVar.b);
            valueAnimator.start();
        }
    }

    @Override // defpackage.dxv
    protected final drq ay(dru druVar) {
        uxj uxjVarAB = aB(druVar);
        drq drqVar = this.a;
        dtl dtlVar = uxjVarAB.a;
        dtl dtlVar2 = uxjVarAB.e;
        dtl dtlVar3 = uxjVarAB.f;
        dzs dzsVarAA = dzt.aA(druVar);
        dzsVarAA.c(drqVar);
        dzsVarAA.c.j().put(7, dtlVar);
        dzsVarAA.M(dtlVar2);
        dzsVarAA.V(dtlVar3);
        dzsVarAA.W(dtlVar3);
        return dzsVarAA.a();
    }

    @Override // defpackage.drq
    public final /* bridge */ /* synthetic */ drq l() {
        uxk uxkVar = (uxk) super.l();
        drq drqVar = uxkVar.a;
        uxkVar.a = drqVar != null ? drqVar.l() : null;
        return uxkVar;
    }

    @Override // defpackage.drq
    protected final /* synthetic */ dxx u() {
        return new uxj();
    }
}
