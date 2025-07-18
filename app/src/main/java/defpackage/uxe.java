package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uxe extends dxv {

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    efb a;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    String b;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    adey c;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    uwm d;

    @eau(a = eav.NONE)
    @eat(a = 3)
    boolean e;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    uws f;

    @eau(a = eav.NONE)
    @eat(a = 3)
    int r;

    public uxe() {
        super("VerticalGridRecycler");
    }

    private final uxd aA(dru druVar) {
        dxo dxoVar = druVar.j;
        dxoVar.getClass();
        return (uxd) dxoVar.c;
    }

    @Override // defpackage.drq
    protected final Object A(Context context) {
        return new uxa(context);
    }

    @Override // defpackage.drq
    protected final void E(dru druVar) {
        uxd uxdVarAA = aA(druVar);
        dxz dxzVar = new dxz();
        dxz dxzVar2 = new dxz();
        if (!this.b.isEmpty()) {
            dxzVar.a = new AtomicReference();
            dxzVar2.a = new AtomicReference();
        }
        uxdVarAA.a = (AtomicReference) dxzVar.a;
        uxdVarAA.b = (AtomicReference) dxzVar2.a;
    }

    @Override // defpackage.drq
    protected final void H(dru druVar, Object obj, duv duvVar) {
    }

    @Override // defpackage.drq
    protected final void I(dru druVar, dse dseVar, duv duvVar) {
        this.a.ag(dseVar.f(), dseVar.a());
    }

    @Override // defpackage.drq
    protected final void J(dru druVar) {
        this.a.af();
    }

    @Override // defpackage.drq
    protected final void L(dru druVar, Object obj, duv duvVar) {
        uxd uxdVarAA = aA(druVar);
        uxa uxaVar = (uxa) obj;
        uws uwsVar = this.f;
        efb efbVar = this.a;
        int i = this.r;
        adey adeyVar = this.c;
        String str = this.b;
        uwm uwmVar = this.d;
        AtomicReference atomicReference = uxdVarAA.a;
        AtomicReference atomicReference2 = uxdVarAA.b;
        uwu.d(druVar, uwsVar, uxaVar, adeyVar);
        uxaVar.setNumColumns(i);
        uwu.f(uxaVar, uwsVar);
        ((eiz) efbVar).g(uxaVar);
        if (str.isEmpty()) {
            return;
        }
        uxf uxfVar = new uxf(str, uwmVar);
        uxg uxgVar = new uxg(uwmVar, str, uxaVar);
        uxaVar.ad.K(uxfVar);
        uxaVar.ad.L(uxgVar);
        atomicReference.set(uxfVar);
        atomicReference2.set(uxgVar);
    }

    @Override // defpackage.drq
    protected final void O(dxx dxxVar, dxx dxxVar2) {
        uxd uxdVar = (uxd) dxxVar;
        uxd uxdVar2 = (uxd) dxxVar2;
        uxdVar2.a = uxdVar.a;
        uxdVar2.b = uxdVar.b;
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
    }

    @Override // defpackage.drq
    protected final void as(dru druVar, Object obj) throws abxv {
        uxd uxdVarAA = aA(druVar);
        uxa uxaVar = (uxa) obj;
        uws uwsVar = this.f;
        efb efbVar = this.a;
        String str = this.b;
        uwm uwmVar = this.d;
        AtomicReference atomicReference = uxdVarAA.a;
        AtomicReference atomicReference2 = uxdVarAA.b;
        if (!str.isEmpty()) {
            uxaVar.ad.V((aze) atomicReference.get());
            uxaVar.ad.W((awg) atomicReference2.get());
            atomicReference.set(null);
            atomicReference2.set(null);
            uwmVar.b("xuikit_tv___current_group_selection_key", uwmVar.a("xuikit_tv___current_group_selection_key"), false);
        }
        uwu.e(uwsVar, uxaVar);
        ((eiz) efbVar).i(uxaVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x005d, code lost:
    
        if (defpackage.abza.a.a(r2.getClass()).k(r2, r3) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0062, code lost:
    
        if (r7.c != null) goto L40;
     */
    @Override // defpackage.drq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(defpackage.drq r7) {
        /*
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 == 0) goto L98
            java.lang.Class r2 = r6.getClass()
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L13
            goto L98
        L13:
            uxe r7 = (defpackage.uxe) r7
            efb r2 = r6.a
            if (r2 == 0) goto L22
            efb r3 = r7.a
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L26
            goto L27
        L22:
            efb r2 = r7.a
            if (r2 == 0) goto L27
        L26:
            return r1
        L27:
            java.lang.String r2 = r6.b
            if (r2 == 0) goto L34
            java.lang.String r3 = r7.b
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L38
            goto L39
        L34:
            java.lang.String r2 = r7.b
            if (r2 == 0) goto L39
        L38:
            return r1
        L39:
            adey r2 = r6.c
            if (r2 == 0) goto L60
            adey r3 = r7.c
            if (r2 != r3) goto L42
            goto L65
        L42:
            if (r3 != 0) goto L45
            goto L64
        L45:
            java.lang.Class r4 = r2.getClass()
            java.lang.Class r5 = r3.getClass()
            if (r4 != r5) goto L64
            java.lang.Class r4 = r2.getClass()
            abza r5 = defpackage.abza.a
            abzj r4 = r5.a(r4)
            boolean r2 = r4.k(r2, r3)
            if (r2 != 0) goto L65
            goto L64
        L60:
            adey r2 = r7.c
            if (r2 == 0) goto L65
        L64:
            return r1
        L65:
            uwm r2 = r6.d
            if (r2 == 0) goto L72
            uwm r3 = r7.d
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L76
            goto L77
        L72:
            uwm r2 = r7.d
            if (r2 == 0) goto L77
        L76:
            return r1
        L77:
            boolean r2 = r6.e
            boolean r3 = r7.e
            if (r2 == r3) goto L7e
            return r1
        L7e:
            uws r2 = r6.f
            if (r2 == 0) goto L8b
            uws r3 = r7.f
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L8f
            goto L90
        L8b:
            uws r2 = r7.f
            if (r2 == 0) goto L90
        L8f:
            return r1
        L90:
            int r2 = r6.r
            int r7 = r7.r
            if (r2 == r7) goto L97
            return r1
        L97:
            return r0
        L98:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uxe.g(drq):boolean");
    }

    @Override // defpackage.drq
    protected final int h() {
        return 3;
    }

    @Override // defpackage.drq
    protected final /* synthetic */ dxx u() {
        return new uxd();
    }
}
