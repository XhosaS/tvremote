package defpackage;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mni extends dxv {
    public static final /* synthetic */ int A = 0;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    oaa a;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    oal b;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    nhw c;

    @eau(a = eav.NONE)
    @eat(a = 3)
    boolean d;

    @eau(a = eav.NONE)
    @eat(a = 3)
    boolean e;

    @eau(a = eav.NONE)
    @eat(a = 3)
    boolean f;

    @eau(a = eav.NONE)
    @eat(a = 3)
    boolean r;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    oco s;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    ogq t;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    ogq u;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    ogq v;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    ogq w;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    Map x;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    ofy y;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    mrg z;

    public mni() {
        super("EditableText");
    }

    public static dtu aA(dru druVar, ogq ogqVar) {
        return o(mni.class, "EditableText", druVar, 378376578, new Object[]{druVar, ogqVar});
    }

    private final mnh aB(dru druVar) {
        dxo dxoVar = druVar.j;
        dxoVar.getClass();
        return (mnh) dxoVar.c;
    }

    @Override // defpackage.drq
    protected final void E(dru druVar) {
        mnh mnhVarAB = aB(druVar);
        dxz dxzVar = new dxz();
        dxz dxzVar2 = new dxz();
        dxz dxzVar3 = new dxz();
        dxz dxzVar4 = new dxz();
        dxz dxzVar5 = new dxz();
        dxz dxzVar6 = new dxz();
        dxz dxzVar7 = new dxz();
        nhw nhwVar = this.c;
        String str = mny.a;
        mnu mnuVar = new mnu();
        dxzVar.a = mnuVar;
        if (nhwVar.h() > 0) {
            dxzVar7.a = new mnw(mnuVar);
        }
        dxzVar4.a = new AtomicBoolean(false);
        dxzVar3.a = new AtomicBoolean(true);
        if (nhwVar.s()) {
            dxzVar2.a = new AtomicReference(new mnl());
        }
        dxzVar6.a = new AtomicReference(null);
        dxzVar5.a = new HashSet();
        Object obj = dxzVar.a;
        if (obj != null) {
            mnhVarAB.e = (mnu) obj;
        }
        Object obj2 = dxzVar2.a;
        if (obj2 != null) {
            mnhVarAB.a = (AtomicReference) obj2;
        }
        Object obj3 = dxzVar3.a;
        if (obj3 != null) {
            mnhVarAB.d = (AtomicBoolean) obj3;
        }
        Object obj4 = dxzVar4.a;
        if (obj4 != null) {
            mnhVarAB.c = (AtomicBoolean) obj4;
        }
        Object obj5 = dxzVar5.a;
        if (obj5 != null) {
            mnhVarAB.b = (Set) obj5;
        }
        Object obj6 = dxzVar6.a;
        if (obj6 != null) {
            mnhVarAB.g = (AtomicReference) obj6;
        }
        Object obj7 = dxzVar7.a;
        if (obj7 != null) {
            mnhVarAB.f = (mnw) obj7;
        }
    }

    @Override // defpackage.drq
    protected final void J(dru druVar) {
        mnl mnlVar;
        mnh mnhVarAB = aB(druVar);
        nhw nhwVar = this.c;
        AtomicReference atomicReference = mnhVarAB.g;
        AtomicReference atomicReference2 = mnhVarAB.a;
        String str = mny.a;
        mnx mnxVar = (mnx) atomicReference.getAndSet(null);
        if (mnxVar != null) {
            mnxVar.a();
        }
        if (!nhwVar.s() || (mnlVar = (mnl) atomicReference2.get()) == null) {
            return;
        }
        mnlVar.c();
        atomicReference2.set(null);
    }

    @Override // defpackage.drq
    protected final void O(dxx dxxVar, dxx dxxVar2) {
        mnh mnhVar = (mnh) dxxVar;
        mnh mnhVar2 = (mnh) dxxVar2;
        mnhVar2.a = mnhVar.a;
        mnhVar2.b = mnhVar.b;
        mnhVar2.c = mnhVar.c;
        mnhVar2.d = mnhVar.d;
        mnhVar2.e = mnhVar.e;
        mnhVar2.f = mnhVar.f;
        mnhVar2.g = mnhVar.g;
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
        mnh mnhVarAB = aB(druVar);
        return mny.c(druVar, this.c, this.u, this.v, this.t, this.w, this.y, this.s, this.z, this.e, this.f, this.d, this.a, this.b, this.x, mnhVarAB.e, mnhVarAB.c, mnhVarAB.b, mnhVarAB.f);
    }

    @Override // defpackage.drq
    protected final /* synthetic */ dxx u() {
        return new mnh();
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x01d6  */
    @Override // defpackage.drq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final java.lang.Object y(defpackage.dtu r20, java.lang.Object r21) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 700
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mni.y(dtu, java.lang.Object):java.lang.Object");
    }
}
