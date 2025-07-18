package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uwz extends dxv {

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    efb a;

    @eau(a = eav.NONE)
    @eat(a = 3)
    boolean b;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    adey c;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    uws d;

    @eau(a = eav.NONE)
    @eat(a = 3)
    int e;

    @eau(a = eav.NONE)
    @eat(a = 3)
    boolean f;

    public uwz() {
        super("HorizontalGridRecycler");
    }

    @Override // defpackage.drq
    protected final Object A(Context context) {
        return new uww(context);
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
        int iA;
        uww uwwVar = (uww) obj;
        uws uwsVar = this.d;
        efb efbVar = this.a;
        int i = this.e;
        adey adeyVar = this.c;
        boolean z = this.f;
        uwu.d(druVar, uwsVar, uwwVar, adeyVar);
        DisplayMetrics displayMetrics = druVar.a.getResources().getDisplayMetrics();
        uwwVar.setNumRows(i);
        uwu.f(uwwVar, uwsVar);
        if ((adeyVar.b & 8) != 0) {
            acvi acviVar = adeyVar.f;
            if (acviVar == null) {
                acviVar = acvi.a;
            }
            acvk acvkVar = acviVar.g;
            if (acvkVar == null) {
                acvkVar = acvk.a;
            }
            iA = uwu.a(acvkVar.c, displayMetrics);
        } else {
            iA = 0;
        }
        if (z) {
            uwwVar.setWindowAlignment(3);
            uwwVar.setWindowAlignmentOffsetPercent(0.0f);
            uwwVar.setWindowAlignmentOffset(iA);
            uwwVar.setItemAlignmentOffsetPercent(0.0f);
            uwwVar.setItemAlignmentOffset(0);
            uwwVar.aD(true);
        }
        ((eiz) efbVar).g(uwwVar);
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
    protected final void as(dru druVar, Object obj) {
        uww uwwVar = (uww) obj;
        uws uwsVar = this.d;
        efb efbVar = this.a;
        uwu.e(uwsVar, uwwVar);
        uwwVar.setWindowAlignment(3);
        uwwVar.setWindowAlignmentOffsetPercent(50.0f);
        uwwVar.setWindowAlignmentOffset(0);
        uwwVar.setItemAlignmentOffsetPercent(50.0f);
        uwwVar.setItemAlignmentOffset(0);
        uwwVar.aD(false);
        ((eiz) efbVar).i(uwwVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0052, code lost:
    
        if (defpackage.abza.a.a(r2.getClass()).k(r2, r3) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0057, code lost:
    
        if (r7.c != null) goto L35;
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
            if (r7 == 0) goto L7b
            java.lang.Class r2 = r6.getClass()
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L13
            goto L7b
        L13:
            uwz r7 = (defpackage.uwz) r7
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
            boolean r2 = r6.b
            boolean r3 = r7.b
            if (r2 == r3) goto L2e
            return r1
        L2e:
            adey r2 = r6.c
            if (r2 == 0) goto L55
            adey r3 = r7.c
            if (r2 != r3) goto L37
            goto L5a
        L37:
            if (r3 != 0) goto L3a
            goto L59
        L3a:
            java.lang.Class r4 = r2.getClass()
            java.lang.Class r5 = r3.getClass()
            if (r4 != r5) goto L59
            java.lang.Class r4 = r2.getClass()
            abza r5 = defpackage.abza.a
            abzj r4 = r5.a(r4)
            boolean r2 = r4.k(r2, r3)
            if (r2 != 0) goto L5a
            goto L59
        L55:
            adey r2 = r7.c
            if (r2 == 0) goto L5a
        L59:
            return r1
        L5a:
            uws r2 = r6.d
            if (r2 == 0) goto L67
            uws r3 = r7.d
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L6b
            goto L6c
        L67:
            uws r2 = r7.d
            if (r2 == 0) goto L6c
        L6b:
            return r1
        L6c:
            int r2 = r6.e
            int r3 = r7.e
            if (r2 == r3) goto L73
            return r1
        L73:
            boolean r2 = r6.f
            boolean r7 = r7.f
            if (r2 == r7) goto L7a
            return r1
        L7a:
            return r0
        L7b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uwz.g(drq):boolean");
    }

    @Override // defpackage.drq
    protected final int h() {
        return 3;
    }
}
