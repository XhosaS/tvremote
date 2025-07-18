package defpackage;

import android.media.session.MediaController;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iui implements ite, gnx {
    private final fau a;
    private final gnz b;
    private final agow c;
    private final ztw d;
    private final ghp e;
    private final ghr f;
    private boolean g;
    private ivi h;
    private final boolean i;
    private agux j;

    public iui(fau fauVar, gnz gnzVar, agow agowVar, ztw ztwVar, ghp ghpVar, ghr ghrVar) {
        gnzVar.getClass();
        agowVar.getClass();
        ztwVar.getClass();
        ghpVar.getClass();
        ghrVar.getClass();
        this.a = fauVar;
        this.b = gnzVar;
        this.c = agowVar;
        this.d = ztwVar;
        this.e = ghpVar;
        this.f = ghrVar;
        Object objA = agowVar.a();
        objA.getClass();
        acbh.b((abwf) objA).getClass();
        this.i = !r1.isNegative();
        this.j = new agux() { // from class: iug
            @Override // defpackage.agux
            public final Object a(Object obj) {
                ((ite) obj).getClass();
                return agpu.a;
            }
        };
    }

    @Override // defpackage.gnx
    public final void d(MediaController mediaController, int i) {
        this.e.r();
        this.f.ac(2);
        this.g = false;
        this.j.a(this);
    }

    @Override // defpackage.ite
    public final Object e(agsw agswVar) {
        iuw iuwVar = iuw.a;
        iuu iuuVar = new iuu();
        ivi iviVar = this.h;
        if (iviVar != null) {
            if ((iuuVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                iuuVar.y();
            }
            iuw iuwVar2 = (iuw) iuuVar.b;
            iuwVar2.c = iviVar;
            iuwVar2.b = 3;
        }
        List listSingletonList = Collections.singletonList(iuuVar.v());
        listSingletonList.getClass();
        return listSingletonList;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ite
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.agsw r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.iuh
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == 0) goto L13
            r0 = r7
            iuh r0 = (defpackage.iuh) r0
            int r2 = r0.c
            r3 = r2 & r1
            if (r3 == 0) goto L13
            int r2 = r2 - r1
            r0.c = r2
            goto L18
        L13:
            iuh r0 = new iuh
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            agtg r2 = defpackage.agtg.a
            int r3 = r0.c
            r4 = 1
            if (r3 == 0) goto L33
            if (r3 != r4) goto L2b
            ivh r2 = r0.e
            ivh r0 = r0.d
            defpackage.agpl.b(r7)
            goto L70
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            defpackage.agpl.b(r7)
            ivi r7 = defpackage.ivi.a
            ivh r7 = new ivh
            r7.<init>()
            ztw r3 = r6.d
            j$.time.Instant r3 = r3.a()
            r3.getClass()
            abzy r3 = defpackage.acbk.b(r3)
            abxd r5 = r7.b
            int r5 = r5.memoizedSerializedSize
            r5 = r5 & r1
            if (r5 != 0) goto L54
            r7.y()
        L54:
            abxd r5 = r7.b
            ivi r5 = (defpackage.ivi) r5
            r5.c = r3
            int r3 = r5.b
            r3 = r3 | r4
            r5.b = r3
            fau r3 = r6.a
            r0.d = r7
            r0.e = r7
            r0.c = r4
            java.lang.Object r0 = r3.a(r0)
            if (r0 == r2) goto Lb6
            r2 = r7
            r7 = r0
            r0 = r2
        L70:
            xdz r7 = (defpackage.xdz) r7
            abxd r3 = r2.b
            int r3 = r3.memoizedSerializedSize
            r1 = r1 & r3
            if (r1 != 0) goto L7c
            r2.y()
        L7c:
            abxd r1 = r2.b
            ivi r1 = (defpackage.ivi) r1
            ivi r2 = defpackage.ivi.a
            r7.getClass()
            r1.d = r7
            int r7 = r1.b
            r7 = r7 | 2
            r1.b = r7
            abxd r7 = r0.v()
            r7.getClass()
            ivi r7 = (defpackage.ivi) r7
            iwe r0 = defpackage.iwe.a
            boolean r1 = r6.g
            if (r1 == 0) goto Lb1
            ivi r1 = r6.h
            if (r1 == 0) goto Lb1
            boolean r0 = r0.a(r7, r1)
            if (r0 != 0) goto Lb1
            ghp r0 = r6.e
            r0.q()
            ghr r0 = r6.f
            r1 = 3
            r0.ac(r1)
        Lb1:
            r6.h = r7
            agpu r7 = defpackage.agpu.a
            return r7
        Lb6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iui.f(agsw):java.lang.Object");
    }

    @Override // defpackage.ite
    public final void g() {
        this.g = true;
    }

    @Override // defpackage.ite
    public final void h() {
        this.b.b(this);
    }

    @Override // defpackage.ite
    public final void i() {
        this.b.d.remove(this);
    }

    @Override // defpackage.ite
    public final void k(agux aguxVar) {
        this.j = aguxVar;
    }

    @Override // defpackage.ite
    public final boolean m() {
        return this.i;
    }

    @Override // defpackage.gnx
    public final void b(MediaController mediaController) {
    }

    @Override // defpackage.gnx
    public final void c(MediaController mediaController) {
    }

    @Override // defpackage.ite
    public final void j(agux aguxVar) {
    }

    @Override // defpackage.ite
    public final void l(agvc agvcVar) {
    }
}
