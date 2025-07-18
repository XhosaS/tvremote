package defpackage;

import android.os.Looper;
import android.support.v7.widget.ActivityChooserView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fqt extends dzg {
    public fqt(eao eaoVar) {
        super(eaoVar);
    }

    @Override // defpackage.dzg, defpackage.eao
    public final long A() {
        aC();
        return this.a.A();
    }

    @Override // defpackage.dzg, defpackage.eao
    public final long D() {
        aC();
        return this.a.D();
    }

    @Override // defpackage.dzg, defpackage.eao
    public final long E() {
        aC();
        return this.a.E();
    }

    @Override // defpackage.dzg, defpackage.eao
    public final eah K() {
        aC();
        return ((eiz) this.a).aw();
    }

    @Override // defpackage.dzg, defpackage.eao
    public final eai L() {
        aC();
        return this.a.L();
    }

    @Override // defpackage.dzg, defpackage.eao
    public final eak M() {
        aC();
        return this.a.M();
    }

    @Override // defpackage.dzg, defpackage.eao
    public final eay N() {
        aC();
        return this.a.N();
    }

    @Override // defpackage.dzg, defpackage.eao
    public final void T(int i, List list) {
        aC();
        this.a.T(i, list);
    }

    @Override // defpackage.dzg, defpackage.eao
    public final void W() {
        aC();
        super.W();
    }

    @Override // defpackage.dzg, defpackage.eao
    public final void Z(int i, int i2, List list) {
        aC();
        this.a.Z(i, i2, list);
    }

    public final void aA(int i) {
        aC();
        ((dyq) this.a).x(i);
    }

    public final void aB(float f) {
        aC();
        dyq dyqVar = (dyq) this.a;
        dyqVar.ac(dyqVar.L().a(f));
    }

    public final void aC() {
        a.ab(Looper.myLooper() == ((eiz) this.a).h);
    }

    public final boolean aD() {
        aC();
        eiz eizVar = (eiz) this.a;
        eizVar.aG();
        return eizVar.D.h;
    }

    @Override // defpackage.dzg, defpackage.eao
    public final void ad(int i) {
        aC();
        this.a.ad(i);
    }

    @Override // defpackage.dzg, defpackage.eao
    public final void ae(boolean z) {
        aC();
        this.a.ae(z);
    }

    @Override // defpackage.dzg, defpackage.eao
    public final void ak() {
        aC();
        this.a.ak();
    }

    @Override // defpackage.dzg, defpackage.eao
    public final boolean al() {
        aC();
        return super.al();
    }

    @Override // defpackage.dzg, defpackage.eao
    public final boolean am() {
        aC();
        return this.a.am();
    }

    public final dyo ap() {
        if (!q(21)) {
            return dyo.a;
        }
        aC();
        eiz eizVar = (eiz) this.a;
        eizVar.aG();
        return eizVar.v;
    }

    public final dyx aq() {
        aC();
        eiz eizVar = (eiz) this.a;
        eizVar.aG();
        return eizVar.A;
    }

    public final dzy ar() {
        aC();
        dyq dyqVar = (dyq) this.a;
        eay eayVarN = dyqVar.N();
        if (eayVarN.q()) {
            return null;
        }
        return eayVarN.p(dyqVar.bd(), dyqVar.a).q;
    }

    public final dzy as() {
        if (q(16)) {
            return ar();
        }
        return null;
    }

    public final eab at() {
        if (!q(18)) {
            return eab.a;
        }
        aC();
        return this.a.J();
    }

    public final eab au() {
        if (!q(18)) {
            return eab.a;
        }
        aC();
        eiz eizVar = (eiz) this.a;
        eizVar.aG();
        return eizVar.q;
    }

    public final ean av() {
        int iBb;
        boolean zQ = q(16);
        boolean zQ2 = q(17);
        int iBe = 0;
        int iBd = zQ2 ? bd() : 0;
        dzy dzyVarAr = zQ ? ar() : null;
        if (zQ2) {
            aC();
            iBe = this.a.be();
        }
        int i = iBe;
        long jC = 0;
        long jD = zQ ? D() : 0L;
        if (zQ) {
            aC();
            jC = this.a.C();
        }
        int iBc = -1;
        if (zQ) {
            aC();
            iBb = this.a.bb();
        } else {
            iBb = -1;
        }
        if (zQ) {
            aC();
            iBc = this.a.bc();
        }
        return new ean(null, iBd, dzyVarAr, null, i, jD, jC, iBb, iBc);
    }

    public final eay aw() {
        return q(17) ? N() : q(16) ? N().q() ? eay.a : new fqs(this) : eay.a;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v0 fqz, still in use, count: 2, list:
          (r2v0 fqz) from 0x0096: MOVE (r21v0 fqz) = (r2v0 fqz) (LINE:151)
          (r2v0 fqz) from 0x0075: MOVE (r21v3 fqz) = (r2v0 fqz) (LINE:118)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public final defpackage.fqz ax() {
        /*
            r25 = this;
            r0 = r25
            r1 = 16
            boolean r1 = r0.q(r1)
            fqz r2 = new fqz
            ean r3 = r0.av()
            r4 = 0
            if (r1 == 0) goto L1e
            r0.aC()
            eao r5 = r0.a
            boolean r5 = r5.an()
            if (r5 == 0) goto L1e
            r5 = 1
            goto L1f
        L1e:
            r5 = r4
        L1f:
            long r6 = android.os.SystemClock.elapsedRealtime()
            if (r1 == 0) goto L2a
            long r10 = r0.E()
            goto L2f
        L2a:
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L2f:
            if (r1 == 0) goto L36
            long r14 = r0.A()
            goto L38
        L36:
            r14 = 0
        L38:
            if (r1 == 0) goto L43
            r0.aC()
            eao r4 = r0.a
            int r4 = r4.a()
        L43:
            if (r1 == 0) goto L54
            r0.aC()
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            eao r8 = r0.a
            long r8 = r8.I()
            goto L5b
        L54:
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = 0
        L5b:
            if (r1 == 0) goto L94
            r0.aC()
            eao r12 = r0.a
            dyq r12 = (defpackage.dyq) r12
            eay r13 = r12.N()
            boolean r20 = r13.q()
            if (r20 == 0) goto L6f
            goto L94
        L6f:
            r20 = r1
            int r1 = r12.bd()
            r21 = r2
            eax r2 = r12.a
            eax r1 = r13.p(r1, r2)
            r13 = r3
            r22 = r4
            long r3 = r1.t
            int r1 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r1 != 0) goto L87
            goto L9b
        L87:
            long r3 = r2.a()
            long r1 = r2.t
            long r3 = r3 - r1
            long r1 = r12.C()
            long r3 = r3 - r1
            goto L9d
        L94:
            r20 = r1
            r21 = r2
            r13 = r3
            r22 = r4
        L9b:
            r3 = r16
        L9d:
            if (r20 == 0) goto La5
            long r1 = r0.d()
            r16 = r1
        La5:
            if (r20 == 0) goto Lb3
            r0.aC()
            eao r1 = r0.a
            long r1 = r1.B()
            r18 = r1
            goto Lb5
        Lb3:
            r18 = 0
        Lb5:
            r2 = r21
            r23 = r3
            r4 = r5
            r5 = r6
            r3 = r13
            r12 = r8
            r7 = r10
            r9 = r14
            r11 = r22
            r14 = r23
            r2.<init>(r3, r4, r5, r7, r9, r11, r12, r14, r16, r18)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fqt.ax():fqz");
    }

    public final void ay(List list) {
        aC();
        ((dyq) this.a).T(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, list);
    }

    public final void az(int i) {
        aC();
        ((dyq) this.a).Y(i, i + 1);
    }

    @Override // defpackage.dzg, defpackage.eao
    public final int bd() {
        aC();
        return this.a.bd();
    }

    @Override // defpackage.dzg, defpackage.eao
    public final int bf() {
        aC();
        return super.bf();
    }

    @Override // defpackage.dzg, defpackage.eao
    public final int bg() {
        aC();
        return super.bg();
    }

    @Override // defpackage.dzg, defpackage.eao
    public final int bh() {
        aC();
        return this.a.bh();
    }

    @Override // defpackage.dzg, defpackage.eao
    public final long d() {
        aC();
        return this.a.d();
    }

    @Override // defpackage.dzg, defpackage.eao
    public final void e() {
        aC();
        super.e();
    }

    @Override // defpackage.dzg, defpackage.eao
    public final void f() {
        aC();
        super.f();
    }

    @Override // defpackage.dzg, defpackage.eao
    public final void g() {
        aC();
        this.a.g();
    }

    @Override // defpackage.dzg, defpackage.eao
    public final void h() {
        aC();
        this.a.h();
    }

    @Override // defpackage.dzg, defpackage.eao
    public final void i(long j) {
        aC();
        super.i(j);
    }

    @Override // defpackage.dzg, defpackage.eao
    public final void j() {
        aC();
        super.j();
    }

    @Override // defpackage.dzg, defpackage.eao
    public final void k() {
        aC();
        this.a.k();
    }

    @Override // defpackage.dzg, defpackage.eao
    public final void l() {
        aC();
        ((dyq) this.a).y();
    }

    @Override // defpackage.dzg, defpackage.eao
    public final void m() {
        aC();
        this.a.m();
    }

    @Override // defpackage.dzg, defpackage.eao
    public final void n() {
        aC();
        ((dyq) this.a).z();
    }

    @Override // defpackage.dzg, defpackage.eao
    public final boolean q(int i) {
        aC();
        return super.q(i);
    }

    @Override // defpackage.dzg, defpackage.eao
    public final boolean s() {
        aC();
        return this.a.s();
    }

    @Override // defpackage.dzg, defpackage.eao
    public final boolean u() {
        aC();
        return this.a.u();
    }
}
