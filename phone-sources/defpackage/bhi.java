package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.ActivityChooserView;
import android.view.View;
import android.view.animation.Animation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhi {
    public final Object a;
    public final Object b;

    public bhi(Intent intent, Bundle bundle) {
        this.a = intent;
        this.b = bundle;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [bcb, java.lang.Object] */
    private final void J(avq avqVar) {
        this.a.b(avqVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [bcb, java.lang.Object] */
    private final void K(alj aljVar) {
        this.b.b(aljVar);
    }

    public final void A(bv bvVar, boolean z) {
        bvVar.getClass();
        bv bvVar2 = ((cr) this.b).o;
        if (bvVar2 != null) {
            bvVar2.getParentFragmentManager().A.A(bvVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        while (it.hasNext()) {
            cb cbVar = (cb) it.next();
            if (!z) {
                Object obj = cbVar.a;
            }
        }
    }

    public final void B(bv bvVar, Bundle bundle, boolean z) {
        bvVar.getClass();
        bv bvVar2 = ((cr) this.b).o;
        if (bvVar2 != null) {
            bvVar2.getParentFragmentManager().A.B(bvVar, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        while (it.hasNext()) {
            cb cbVar = (cb) it.next();
            if (!z) {
                Object obj = cbVar.a;
            }
        }
    }

    public final void C(bv bvVar, boolean z) {
        bvVar.getClass();
        bv bvVar2 = ((cr) this.b).o;
        if (bvVar2 != null) {
            bvVar2.getParentFragmentManager().A.C(bvVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        while (it.hasNext()) {
            cb cbVar = (cb) it.next();
            if (!z) {
                Object obj = cbVar.a;
            }
        }
    }

    public final void D(bv bvVar, boolean z) {
        bvVar.getClass();
        bv bvVar2 = ((cr) this.b).o;
        if (bvVar2 != null) {
            bvVar2.getParentFragmentManager().A.D(bvVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        while (it.hasNext()) {
            cb cbVar = (cb) it.next();
            if (!z) {
                Object obj = cbVar.a;
            }
        }
    }

    public final void E(bv bvVar, View view, Bundle bundle, boolean z) {
        bvVar.getClass();
        view.getClass();
        cr crVar = (cr) this.b;
        bv bvVar2 = crVar.o;
        if (bvVar2 != null) {
            bvVar2.getParentFragmentManager().A.E(bvVar, view, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        while (it.hasNext()) {
            cb cbVar = (cb) it.next();
            if (!z) {
                ((a) cbVar.a).bC(crVar, bvVar, view);
            }
        }
    }

    public final void F(bv bvVar, boolean z) {
        bvVar.getClass();
        bv bvVar2 = ((cr) this.b).o;
        if (bvVar2 != null) {
            bvVar2.getParentFragmentManager().A.F(bvVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        while (it.hasNext()) {
            cb cbVar = (cb) it.next();
            if (!z) {
                Object obj = cbVar.a;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, yqe] */
    public final void H(bhi bhiVar) {
        AtomicReference atomicReference;
        bhi bhiVar2;
        do {
            atomicReference = (AtomicReference) this.b;
            bhiVar2 = (bhi) atomicReference.get();
            if (bhiVar2 != null) {
                if (((rv) bhiVar.b).compareTo((rv) bhiVar2.b) < 0) {
                    throw new CancellationException("Current mutation had a higher priority");
                }
            }
        } while (!a.t(atomicReference, bhiVar2, bhiVar));
        if (bhiVar2 != null) {
            bhiVar2.a.t(new rw());
        }
    }

    public final bhi a(Object obj) {
        return new bhi(this.a, obj);
    }

    public final boolean b() {
        return this.b != bhm.a;
    }

    public final boolean c() {
        return this.a != bhm.a;
    }

    public final Object d(rv rvVar, yjv yjvVar, yih yihVar) {
        return yoz.k(new rx(rvVar, this, yjvVar, (yih) null, 2), yihVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.awc r8, defpackage.yih r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.avs
            if (r0 == 0) goto L13
            r0 = r9
            avs r0 = (defpackage.avs) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            avs r0 = new avs
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.b
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            yyk r8 = r0.d
            defpackage.ybn.f(r9)     // Catch: java.lang.Throwable -> L2d
            goto L7b
        L2d:
            r9 = move-exception
            goto L8a
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            yyk r8 = r0.d
            java.lang.Object r2 = r0.a
            defpackage.ybn.f(r9)
            r9 = r8
            r8 = r2
            goto L55
        L41:
            defpackage.ybn.f(r9)
            java.lang.Object r9 = r7.b
            r0.a = r8
            r2 = r9
            yyk r2 = (defpackage.yyk) r2
            r0.d = r2
            r0.c = r5
            java.lang.Object r2 = r2.b(r0)
            if (r2 == r1) goto L94
        L55:
            r0.a = r8     // Catch: java.lang.Throwable -> L86
            r2 = r9
            yyk r2 = (defpackage.yyk) r2     // Catch: java.lang.Throwable -> L86
            r0.d = r2     // Catch: java.lang.Throwable -> L86
            r0.c = r4     // Catch: java.lang.Throwable -> L86
            yof r2 = new yof     // Catch: java.lang.Throwable -> L86
            yih r0 = defpackage.wcq.S(r0)     // Catch: java.lang.Throwable -> L86
            r2.<init>(r0, r5)     // Catch: java.lang.Throwable -> L86
            r2.v()     // Catch: java.lang.Throwable -> L86
            avq r0 = new avq     // Catch: java.lang.Throwable -> L86
            r0.<init>(r8, r2)     // Catch: java.lang.Throwable -> L86
            r7.J(r0)     // Catch: java.lang.Throwable -> L86
            java.lang.Object r8 = r2.i()     // Catch: java.lang.Throwable -> L86
            if (r8 == r1) goto L94
            r6 = r9
            r9 = r8
            r8 = r6
        L7b:
            r7.J(r3)     // Catch: java.lang.Throwable -> L84
            yyk r8 = (defpackage.yyk) r8
            r8.d()
            return r9
        L84:
            r9 = move-exception
            goto L8e
        L86:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L8a:
            r7.J(r3)     // Catch: java.lang.Throwable -> L84
            throw r9     // Catch: java.lang.Throwable -> L84
        L8e:
            yyk r8 = (defpackage.yyk) r8
            r8.d()
            throw r9
        L94:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bhi.e(awc, yih):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [bdy, java.lang.Object] */
    public final avq f() {
        return (avq) this.a.a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final aqf g(aqh aqhVar) {
        return (aqf) this.a.get(aqhVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    public final void h(aqh aqhVar) {
        ?? r0 = this.a;
        aqf aqfVar = (aqf) r0.get(aqhVar);
        if (aqfVar != null) {
        }
        r0.remove(aqhVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [bdy, java.lang.Object] */
    public final alj i() {
        return (alj) this.b.a();
    }

    public final void j() {
        K(null);
        nou nouVar = (nou) this.a;
        ((bje) nouVar.b).clear();
        ((bje) nouVar.c).clear();
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, java.util.List] */
    public final void k() {
        bit bitVarT = bcm.t();
        yjv yjvVarI = bitVarT != null ? bitVarT.i() : null;
        bit bitVarU = bcm.u(bitVarT);
        try {
            alj aljVarI = i();
            if (aljVarI != null) {
                nou nouVar = (nou) this.a;
                ((bje) nouVar.c).clear();
                while (((bje) nouVar.b).a() + ((bje) nouVar.c).a() > nouVar.a - 1) {
                    yfm.D(nouVar.b);
                }
                ((bje) nouVar.b).add(aljVarI);
            }
            K(null);
        } finally {
            bcm.z(bitVarT, bitVarU, yjvVarI);
        }
    }

    public final void l(alj aljVar) {
        int i;
        alj aljVar2;
        bit bitVarT = bcm.t();
        alj aljVar3 = null;
        yjv yjvVarI = bitVarT != null ? bitVarT.i() : null;
        bit bitVarU = bcm.u(bitVarT);
        try {
            alj aljVarI = i();
            if (aljVarI == null) {
                K(aljVar);
                return;
            }
            if (aljVarI.h && aljVar.h) {
                long j = aljVar.g;
                long j2 = aljVarI.g;
                if (j >= j2 && j - j2 < 5000 && !hu.N(aljVarI) && !hu.N(aljVar) && (i = aljVarI.i) == aljVar.i) {
                    if (i == 1) {
                        int i2 = aljVarI.b;
                        String str = aljVarI.d;
                        if (str.length() + i2 == aljVar.b) {
                            aljVar2 = new alj(i2, "", String.valueOf(str).concat(String.valueOf(aljVar.d)), aljVarI.e, aljVar.f, j2, false, 64);
                            aljVar3 = aljVar2;
                        }
                    } else if (i == 2 && aljVarI.a() == aljVar.a() && (aljVarI.a() == 1 || aljVarI.a() == 2)) {
                        int i3 = aljVarI.b;
                        int i4 = aljVar.b;
                        String str2 = aljVar.c;
                        if (i3 == str2.length() + i4) {
                            aljVar2 = new alj(i4, String.valueOf(str2).concat(String.valueOf(aljVarI.c)), "", aljVarI.e, aljVar.f, j2, false, 64);
                        } else if (i3 == i4) {
                            aljVar2 = new alj(i3, String.valueOf(aljVarI.c).concat(String.valueOf(str2)), "", aljVarI.e, aljVar.f, j2, false, 64);
                        }
                        aljVar3 = aljVar2;
                    }
                }
            }
            if (aljVar3 != null) {
                K(aljVar3);
            } else {
                k();
                K(aljVar);
            }
        } finally {
            bcm.z(bitVarT, bitVarU, yjvVarI);
        }
    }

    public final void m() {
        ((kc) this.a).p(agn.b);
    }

    public final boolean n() {
        return (((bdn) this.a).e() & 1) != 0;
    }

    public final boolean o() {
        return (((bdn) this.a).e() & 2) != 0;
    }

    public final boolean p() {
        return (((bdn) this.a).e() & 4) != 0;
    }

    public final Object q(Object obj, rv rvVar, yjz yjzVar, yih yihVar) {
        return yoz.k(new ry(rvVar, this, yjzVar, obj, null), yihVar);
    }

    public final void r(Context context, Uri uri) {
        Intent intent = (Intent) this.a;
        intent.setData(uri);
        context.startActivity(intent, (Bundle) this.b);
    }

    public final void s(bv bvVar, Bundle bundle, boolean z) {
        bvVar.getClass();
        bv bvVar2 = ((cr) this.b).o;
        if (bvVar2 != null) {
            bvVar2.getParentFragmentManager().A.s(bvVar, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        while (it.hasNext()) {
            cb cbVar = (cb) it.next();
            if (!z) {
                Object obj = cbVar.a;
            }
        }
    }

    public final void t(bv bvVar, boolean z) {
        bvVar.getClass();
        cr crVar = (cr) this.b;
        Context context = crVar.m.c;
        bv bvVar2 = crVar.o;
        if (bvVar2 != null) {
            bvVar2.getParentFragmentManager().A.t(bvVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        while (it.hasNext()) {
            cb cbVar = (cb) it.next();
            if (!z) {
                Object obj = cbVar.a;
            }
        }
    }

    public final void u(bv bvVar, Bundle bundle, boolean z) {
        bvVar.getClass();
        bv bvVar2 = ((cr) this.b).o;
        if (bvVar2 != null) {
            bvVar2.getParentFragmentManager().A.u(bvVar, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        while (it.hasNext()) {
            cb cbVar = (cb) it.next();
            if (!z) {
                Object obj = cbVar.a;
            }
        }
    }

    public final void v(bv bvVar, boolean z) {
        bvVar.getClass();
        bv bvVar2 = ((cr) this.b).o;
        if (bvVar2 != null) {
            bvVar2.getParentFragmentManager().A.v(bvVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        while (it.hasNext()) {
            cb cbVar = (cb) it.next();
            if (!z) {
                Object obj = cbVar.a;
            }
        }
    }

    public final void w(bv bvVar, boolean z) {
        bvVar.getClass();
        bv bvVar2 = ((cr) this.b).o;
        if (bvVar2 != null) {
            bvVar2.getParentFragmentManager().A.w(bvVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        while (it.hasNext()) {
            cb cbVar = (cb) it.next();
            if (!z) {
                ((a) cbVar.a).bB(bvVar);
            }
        }
    }

    public final void x(bv bvVar, boolean z) {
        bvVar.getClass();
        bv bvVar2 = ((cr) this.b).o;
        if (bvVar2 != null) {
            bvVar2.getParentFragmentManager().A.x(bvVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        while (it.hasNext()) {
            cb cbVar = (cb) it.next();
            if (!z) {
                Object obj = cbVar.a;
            }
        }
    }

    public final void y(bv bvVar, boolean z) {
        bvVar.getClass();
        cr crVar = (cr) this.b;
        Context context = crVar.m.c;
        bv bvVar2 = crVar.o;
        if (bvVar2 != null) {
            bvVar2.getParentFragmentManager().A.y(bvVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        while (it.hasNext()) {
            cb cbVar = (cb) it.next();
            if (!z) {
                Object obj = cbVar.a;
            }
        }
    }

    public final void z(bv bvVar, Bundle bundle, boolean z) {
        bvVar.getClass();
        bv bvVar2 = ((cr) this.b).o;
        if (bvVar2 != null) {
            bvVar2.getParentFragmentManager().A.z(bvVar, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.a).iterator();
        it.getClass();
        while (it.hasNext()) {
            cb cbVar = (cb) it.next();
            if (!z) {
                Object obj = cbVar.a;
            }
        }
    }

    public bhi(Animation animation) {
        this.a = animation;
        this.b = null;
    }

    public bhi(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public bhi(Object obj, Object obj2, byte[] bArr) {
        this.b = obj;
        this.a = obj2;
    }

    public bhi(Animator animator) {
        this.a = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.b = animatorSet;
        animatorSet.play(animator);
    }

    public bhi(cr crVar) {
        this.b = crVar;
        this.a = new CopyOnWriteArrayList();
    }

    public bhi(dve dveVar) {
        dveVar.getClass();
        this.b = dveVar;
        this.a = new ArrayList();
    }

    public bhi(int[] iArr) {
        this.b = new AtomicReference(null);
        this.a = new yyk();
    }

    public bhi(char[] cArr, byte[] bArr, byte[] bArr2) {
        this.b = new AtomicReference(null);
        this.a = new yyk();
    }

    public bhi(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = new btu(null);
        this.a = new btu(null);
    }

    public bhi(short[] sArr, byte[] bArr) {
        this.a = new bcf(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        this.b = new bcf(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }

    public bhi(kw kwVar) {
        this.b = kwVar;
        this.a = new bcf(0);
    }

    public bhi(char[] cArr, byte[] bArr) {
        byte[] bArr2 = null;
        this.a = new kc(bArr2);
        this.b = new kc(bArr2);
    }

    public bhi(alj aljVar, nou nouVar) {
        this.a = nouVar;
        this.b = new bci(aljVar, bcz.c);
    }

    public /* synthetic */ bhi(byte[] bArr, short[] sArr) {
        this((alj) null, new nou(100, 3));
    }

    public bhi(byte[] bArr, char[] cArr) {
        this.a = new LinkedHashMap();
        this.b = new LinkedHashMap();
    }

    public bhi(char[] cArr) {
        this.b = new yyk();
        this.a = new bci(null, bcz.c);
    }

    public bhi(byte[] bArr, byte[] bArr2) {
        this.b = new AtomicReference(null);
        this.a = new yyk();
    }

    public bhi(byte[] bArr) {
        byte[] bArr2 = null;
        this.a = new ki(bArr2);
        this.b = new ki(bArr2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public bhi() {
        bhm bhmVar = bhm.a;
        this(bhmVar, bhmVar);
    }
}
