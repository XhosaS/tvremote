package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class itl implements xcm {
    private final xcq a;
    private final xcq b;
    private final xcq c;
    private final /* synthetic */ int d;
    private final Object e;

    public itl(kqf kqfVar, xcq xcqVar, xcq xcqVar2, xcq xcqVar3, int i) {
        this.d = i;
        this.e = kqfVar;
        this.b = xcqVar;
        this.c = xcqVar2;
        this.a = xcqVar3;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r1v42, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r1v48, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, xcq] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, yfo] */
    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() {
        switch (this.d) {
            case 0:
                xcq xcqVar = this.a;
                Context contextA = ((rgq) this.e).a();
                itk itkVar = (itk) xcqVar.b();
                yow yowVar = (yow) this.b.b();
                xnc xncVarB = ((xnd) this.c).b();
                itkVar.getClass();
                yowVar.getClass();
                return new itq(contextA, itkVar, yowVar, xncVarB);
            case 1:
                return new isf((kdj) this.a.b(), (iov) this.b.b(), ((ite) this.c).b(), ((rgq) this.e).a());
            case 2:
                xcq xcqVar2 = this.c;
                ?? r1 = this.e;
                return new isy(this.b, this.a, (yfo) r1, xcqVar2);
            case 3:
                return new izq((gpz) this.c.b(), (ldv) this.e.b(), ((ihj) this.b).b(), (isi) this.a.b());
            case 4:
                ldv ldvVar = (ldv) this.e.b();
                xcq xcqVar3 = this.c;
                return new izs(ldvVar, ((izv) this.b).b(), ((ihj) this.a).b(), (isi) xcqVar3.b());
            case 5:
                return new jdl(((rgq) this.e).a(), (crv) this.c.b(), (euc) this.b.b(), (mem) this.a.b());
            case 6:
                xcq xcqVar4 = this.c;
                ?? r5 = this.e;
                return new iom(this.b, this.a, r5, xcqVar4, null, null, null, null);
            case 7:
                ?? r52 = this.e;
                xcq xcqVar5 = this.a;
                return new iom(this.b, this.c, xcqVar5, (yfo) r52, (byte[]) null, (char[]) null);
            case 8:
                xcq xcqVar6 = this.c;
                xcq xcqVar7 = this.a;
                return new iom(this.b, (yfo) this.e, xcqVar7, xcqVar6, (char[]) null);
            case 9:
                xcq xcqVar8 = this.c;
                ?? r10 = this.e;
                return new iom(this.b, this.a, r10, xcqVar8, null, null, null);
            case 10:
                xcq xcqVar9 = this.c;
                ?? r9 = this.e;
                return new iom(this.b, this.a, (yfo) r9, xcqVar9, (byte[]) null, (byte[]) null);
            case 11:
                xcq xcqVar10 = this.c;
                ?? r8 = this.e;
                return new iom(this.b, this.a, (yfo) r8, xcqVar10, (byte[]) null);
            case 12:
                xcq xcqVar11 = this.c;
                return new kqe((kqf) this.e, ((rgq) this.b).a(), (ExecutorService) xcqVar11.b(), (lyz) this.a.b());
            case 13:
                return new mbx((ExecutorService) this.b.b(), (SharedPreferences) this.a.b(), xcl.a(this.e), (lxc) this.c.b(), 1);
            case 14:
                return new ljg(((rgq) this.b).a(), (lyz) this.a.b(), (lxp) this.c.b(), (lfn) this.e.b(), kfm.c());
            case 15:
                xcq xcqVar12 = this.b;
                return new isy(((lnm) this.e).b(), (lnp) xcqVar12.b(), ((lns) this.a).b(), (lny) this.c.b());
            case 16:
                return new loz((osk) this.e.b(), ((rgq) this.b).a(), (Map) this.a.b(), ((xnj) this.c).b());
            case 17:
                lfn lfnVar = (lfn) this.a.b();
                vvd vvdVar = (vvd) this.b.b();
                lpw lpwVar = (lpw) this.e.b();
                kpy kpyVar = (kpy) this.c.b();
                xpz xpzVarD = vvdVar.d(vep.l);
                return new lql(lfnVar, xpzVarD, (vee) vee.J(new veq(1), xpzVarD), lpwVar, kpyVar);
            case 18:
                lfn lfnVar2 = (lfn) this.a.b();
                vvd vvdVar2 = (vvd) this.b.b();
                lpw lpwVar2 = (lpw) this.e.b();
                kpy kpyVar2 = (kpy) this.c.b();
                xpz xpzVarD2 = vvdVar2.d(vyd.c);
                return new lql(lfnVar2, xpzVarD2, (vxq) vxq.J(new veq(3), xpzVarD2), lpwVar2, kpyVar2);
            case 19:
                lfn lfnVar3 = (lfn) this.a.b();
                vvd vvdVar3 = (vvd) this.b.b();
                lpw lpwVar3 = (lpw) this.e.b();
                kpy kpyVar3 = (kpy) this.c.b();
                xpz xpzVarD3 = vvdVar3.d(vyt.h);
                return new lql(lfnVar3, xpzVarD3, (vye) vye.J(new veq(4), xpzVarD3), lpwVar3, kpyVar3);
            default:
                lfn lfnVar4 = (lfn) this.a.b();
                vvd vvdVar4 = (vvd) this.b.b();
                lpw lpwVar4 = (lpw) this.e.b();
                kpy kpyVar4 = (kpy) this.c.b();
                xpz xpzVarD4 = vvdVar4.d(vev.j);
                return new lql(lfnVar4, xpzVarD4, (ver) ver.J(new veq(0), xpzVarD4), lpwVar4, lfnVar4.aD(), lfnVar4.dm(), kpyVar4);
        }
    }

    public itl(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, int i) {
        this.d = i;
        this.e = xcqVar;
        this.a = xcqVar2;
        this.b = xcqVar3;
        this.c = xcqVar4;
    }

    public itl(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, int i, byte[] bArr) {
        this.d = i;
        this.a = xcqVar;
        this.b = xcqVar2;
        this.c = xcqVar3;
        this.e = xcqVar4;
    }

    public itl(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, int i, char[] cArr) {
        this.d = i;
        this.b = xcqVar;
        this.a = xcqVar2;
        this.e = xcqVar3;
        this.c = xcqVar4;
    }

    public itl(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, int i, int[] iArr) {
        this.d = i;
        this.e = xcqVar;
        this.b = xcqVar2;
        this.a = xcqVar3;
        this.c = xcqVar4;
    }

    public itl(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, int i, short[] sArr) {
        this.d = i;
        this.c = xcqVar;
        this.e = xcqVar2;
        this.b = xcqVar3;
        this.a = xcqVar4;
    }

    public itl(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, int i, boolean[] zArr) {
        this.d = i;
        this.e = xcqVar;
        this.c = xcqVar2;
        this.b = xcqVar3;
        this.a = xcqVar4;
    }

    public itl(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, int i, byte[][] bArr) {
        this.d = i;
        this.b = xcqVar;
        this.c = xcqVar2;
        this.a = xcqVar3;
        this.e = xcqVar4;
    }

    public itl(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, int i, char[][] cArr) {
        this.d = i;
        this.b = xcqVar;
        this.e = xcqVar2;
        this.a = xcqVar3;
        this.c = xcqVar4;
    }

    public itl(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, int i, byte[][][] bArr) {
        this.d = i;
        this.b = xcqVar;
        this.a = xcqVar2;
        this.c = xcqVar3;
        this.e = xcqVar4;
    }

    public itl(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, int i, float[][][] fArr) {
        this.d = i;
        this.a = xcqVar;
        this.b = xcqVar2;
        this.e = xcqVar3;
        this.c = xcqVar4;
    }
}
