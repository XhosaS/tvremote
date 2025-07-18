package defpackage;

import android.view.KeyEvent;
import android.widget.EdgeEffect;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vr extends ty implements bry, cae, bxu {
    private final ybo D;
    private ybo E;
    public final bse h;
    public final vx i;
    public final tf j;
    private final vd k;
    private final vm l;
    private yjz m;
    private yjz n;
    private uu o;
    private qj p;

    public vr(vs vsVar, qj qjVar, ybo yboVar, uv uvVar, boolean z, boolean z2, kw kwVar) {
        super(vk.a, z, kwVar, uvVar);
        this.p = qjVar;
        this.E = yboVar;
        bse bseVar = new bse();
        this.h = bseVar;
        vd vdVar = new vd(z);
        O(vdVar);
        this.k = vdVar;
        ybo yboVar2 = new ybo(fh.l(vk.d));
        this.D = yboVar2;
        qj qjVar2 = this.p;
        ybo yboVar3 = this.E;
        vx vxVar = new vx(vsVar, qjVar2, yboVar3 == null ? yboVar2 : yboVar3, uvVar, z2, bseVar, this, new sw(this, 5));
        this.i = vxVar;
        vm vmVar = new vm(vxVar, z);
        this.l = vmVar;
        tf tfVar = new tf(uvVar, vxVar, z2);
        O(tfVar);
        this.j = tfVar;
        O(new bsh(vmVar, bseVar));
        O(new bmr(2, null, 4));
        O(new aed(tfVar));
        O(new rg(new kb(this, 16)));
    }

    private final void C() {
        if (this.A) {
            clx clxVarL = fh.L(this);
            this.D.c = fh.l(clxVarL);
        }
    }

    public final void A(vs vsVar, uv uvVar, qj qjVar, boolean z, boolean z2, ybo yboVar, kw kwVar) {
        boolean z3;
        boolean z4 = false;
        boolean z5 = true;
        if (((ty) this).c != z) {
            this.l.a = z;
            this.k.a = z;
            z3 = true;
        } else {
            z3 = false;
        }
        ybo yboVar2 = yboVar == null ? this.D : yboVar;
        vx vxVar = this.i;
        bse bseVar = this.h;
        if (!yks.e(vxVar.a, vsVar)) {
            vxVar.a = vsVar;
            z4 = true;
        }
        vxVar.j = qjVar;
        if (vxVar.b != uvVar) {
            vxVar.b = uvVar;
            z4 = true;
        }
        if (vxVar.c != z2) {
            vxVar.c = z2;
        } else {
            z5 = z4;
        }
        vxVar.k = yboVar2;
        vxVar.d = bseVar;
        tf tfVar = this.j;
        tfVar.a = uvVar;
        tfVar.c = z2;
        this.p = qjVar;
        this.E = yboVar;
        w(vk.a, z, kwVar, vxVar.k() ? uv.a : uv.b, z5);
        if (z3) {
            this.m = null;
            this.n = null;
            cbp.M(this);
        }
    }

    @Override // defpackage.ty
    public final Object b(yjz yjzVar, yih yihVar) {
        vx vxVar = this.i;
        Object objI = vxVar.i(rv.b, new uc(yjzVar, vxVar, (yih) null, 2), yihVar);
        return objI == yio.a ? objI : ygi.a;
    }

    @Override // defpackage.bko
    public final void cd() {
        C();
        uu uuVar = this.o;
        if (uuVar != null) {
            uuVar.b = fh.L(this);
        }
    }

    @Override // defpackage.bko
    public final boolean ce() {
        return false;
    }

    @Override // defpackage.ty, defpackage.bko
    public final void cg() {
        bV();
        C();
        uu uuVar = this.o;
        if (uuVar != null) {
            uuVar.b = fh.L(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x014f  */
    @Override // defpackage.ty, defpackage.cad
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(defpackage.bsr r10, defpackage.bss r11, long r12) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vr.m(bsr, bss, long):void");
    }

    @Override // defpackage.cae
    public final /* synthetic */ boolean q() {
        return false;
    }

    @Override // defpackage.ty
    public final void r(long j) {
        ykr.q(this.h.f(), null, 0, new vo(this, j, (yih) null, 1, (byte[]) null), 3);
    }

    @Override // defpackage.bry
    public final boolean s(KeyEvent keyEvent) {
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        if (!((ty) this).c || ((!a.s(brx.b(keyEvent), brv.p) && !a.s(brx.b(keyEvent), brv.o)) || !a.r(brx.a(keyEvent), 2) || keyEvent.isCtrlPressed())) {
            return false;
        }
        if (this.i.k()) {
            float f = (int) (this.j.g & 4294967295L);
            if (!a.s(brx.b(keyEvent), brv.o)) {
                f = -f;
            }
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            iFloatToRawIntBits = Float.floatToRawIntBits(f);
        } else {
            float f2 = (int) (this.j.g >> 32);
            if (!a.s(brx.b(keyEvent), brv.o)) {
                f2 = -f2;
            }
            jFloatToRawIntBits = Float.floatToRawIntBits(f2);
            iFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
        }
        ykr.q(F(), null, 0, new vo(this, (4294967295L & iFloatToRawIntBits) | (jFloatToRawIntBits << 32), (yih) null, 0), 3);
        return true;
    }

    @Override // defpackage.bry
    public final boolean t(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.ty
    public final boolean v() {
        re reVar;
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        EdgeEffect edgeEffect3;
        EdgeEffect edgeEffect4;
        vx vxVar = this.i;
        if (vxVar.a.j()) {
            return true;
        }
        qj qjVar = vxVar.j;
        return (qjVar == null || (((edgeEffect = (reVar = qjVar.b).b) == null || hu.o(edgeEffect) == 0.0f) && (((edgeEffect2 = reVar.c) == null || hu.o(edgeEffect2) == 0.0f) && (((edgeEffect3 = reVar.d) == null || hu.o(edgeEffect3) == 0.0f) && ((edgeEffect4 = reVar.e) == null || hu.o(edgeEffect4) == 0.0f))))) ? false : true;
    }

    @Override // defpackage.cae
    public final void x(cfc cfcVar) {
        if (((ty) this).c && (this.m == null || this.n == null)) {
            this.m = new xa(this, 1);
            this.n = new vq(this, null);
        }
        yjz yjzVar = this.m;
        if (yjzVar != null) {
            ymp[] ympVarArr = cfk.a;
            cfcVar.e(cfb.d, new ces(null, yjzVar));
        }
        yjz yjzVar2 = this.n;
        if (yjzVar2 != null) {
            ymp[] ympVarArr2 = cfk.a;
            cfcVar.e(cfb.e, yjzVar2);
        }
    }

    @Override // defpackage.cae
    public final /* synthetic */ void B() {
    }

    @Override // defpackage.cae
    public final /* synthetic */ void z() {
    }

    @Override // defpackage.ty
    public final void o(long j) {
    }
}
