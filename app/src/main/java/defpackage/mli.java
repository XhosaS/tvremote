package defpackage;

import java.util.Iterator;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mli extends ecq {

    @eau(a = eav.NONE)
    @eat(a = 6)
    List m;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    ngd n;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    aggh o;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    oal p;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    obk q;

    @eau(a = eav.NONE)
    @eat(a = UrlRequest.Status.WAITING_FOR_RESPONSE)
    oca r;

    public mli() {
        super("CollectionSection");
    }

    @Override // defpackage.ecq
    /* renamed from: f */
    public final boolean a(ecq ecqVar) {
        if (this == ecqVar) {
            return true;
        }
        if (ecqVar == null || getClass() != ecqVar.getClass()) {
            return false;
        }
        mli mliVar = (mli) ecqVar;
        List list = this.m;
        if (list != null) {
            if (mliVar.m != null && list.size() == mliVar.m.size()) {
                Iterator it = this.m.iterator();
                Iterator it2 = mliVar.m.iterator();
                while (it.hasNext() && it2.hasNext()) {
                    drq drqVar = (drq) it.next();
                    drq drqVar2 = (drq) it2.next();
                    boolean z = ebc.a;
                    if (!drqVar.g(drqVar2)) {
                    }
                }
            }
            return false;
        }
        if (mliVar.m != null) {
            return false;
        }
        ngd ngdVar = this.n;
        if (ngdVar == null ? mliVar.n != null : !ngdVar.equals(mliVar.n)) {
            return false;
        }
        aggh agghVar = this.o;
        if (agghVar == null ? mliVar.o != null : !agghVar.equals(mliVar.o)) {
            return false;
        }
        oal oalVar = this.p;
        if (oalVar == null ? mliVar.p != null : !oalVar.equals(mliVar.p)) {
            return false;
        }
        obk obkVar = this.q;
        if (obkVar == null ? mliVar.q != null : !obkVar.equals(mliVar.q)) {
            return false;
        }
        oca ocaVar = this.r;
        return ocaVar == null ? mliVar.r == null : ocaVar.equals(mliVar.r);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    @Override // defpackage.ect
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final defpackage.ecj g(defpackage.ecr r15) {
        /*
            r14 = this;
            oal r2 = r14.p
            oca r0 = r14.r
            obk r4 = r14.q
            aggh r5 = r14.o
            ngd r6 = r14.n
            java.util.List r1 = r14.m
            ecj r7 = new ecj
            r7.<init>()
            int r3 = r6.g()
            r8 = 0
            if (r3 <= 0) goto L4b
            r9 = r8
        L19:
            int r1 = r6.g()
            if (r9 >= r1) goto Ldd
            ngi r10 = r6.j(r9)
            r11 = r8
        L24:
            int r1 = r10.g()
            if (r11 >= r1) goto L45
            nid r3 = r10.h(r11)
            r1 = r15
            drq r15 = r0.a(r1, r2, r3, r4, r5)
            r13 = r1
            r1 = r0
            r0 = r13
            eds r3 = defpackage.edt.t(r0)
            r3.c(r15)
            defpackage.eci.a(r3, r7)
            int r11 = r11 + 1
            r15 = r0
            r0 = r1
            goto L24
        L45:
            r1 = r0
            r0 = r15
            int r9 = r9 + 1
            r0 = r1
            goto L19
        L4b:
            r0 = r15
            if (r1 == 0) goto Ldd
            nfz r15 = r6.i()
            r2 = -1
            if (r15 == 0) goto L69
            mii r3 = defpackage.njf.Q
            boolean r4 = r15.b(r3)
            if (r4 != 0) goto L5e
            goto L69
        L5e:
            mil r15 = r15.a(r3)
            njf r15 = (defpackage.njf) r15
            int r15 = r15.g()
            goto L6a
        L69:
            r15 = r2
        L6a:
            if (r15 > 0) goto L87
            java.util.Iterator r15 = r1.iterator()
        L70:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto Ldd
            java.lang.Object r1 = r15.next()
            drq r1 = (defpackage.drq) r1
            eds r2 = defpackage.edt.t(r0)
            r2.c(r1)
            defpackage.eci.a(r2, r7)
            goto L70
        L87:
            int r3 = r6.A()
            java.util.Iterator r1 = r1.iterator()
        L8f:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto Ldd
            java.lang.Object r4 = r1.next()
            drq r4 = (defpackage.drq) r4
            r5 = 1
            int r2 = r2 + r5
            r6 = 2
            if (r3 != r6) goto La5
            int r9 = r2 % r15
            int r10 = r2 / r15
            goto La9
        La5:
            int r9 = r2 / r15
            int r10 = r2 % r15
        La9:
            mqp r11 = new mqp
            r11.<init>()
            mqo r12 = new mqo
            r12.<init>(r0, r11)
            mqp r11 = r12.a
            if (r4 != 0) goto Lb9
            r4 = 0
            goto Lbd
        Lb9:
            drq r4 = r4.l()
        Lbd:
            r11.b = r4
            java.util.BitSet r4 = r12.d
            r4.set(r5)
            r11.c = r9
            r4.set(r6)
            r11.a = r10
            r4.set(r8)
            mqp r4 = r12.a()
            eds r5 = defpackage.edt.t(r0)
            r5.c(r4)
            defpackage.eci.a(r5, r7)
            goto L8f
        Ldd:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mli.g(ecr):ecj");
    }
}
