package defpackage;

import android.content.SharedPreferences;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lsd implements xcm {
    private final xcq a;
    private final xcq b;
    private final xcq c;
    private final xcq d;
    private final /* synthetic */ int e;

    public lsd(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, int i) {
        this.e = i;
        this.a = xcqVar;
        this.b = xcqVar2;
        this.c = xcqVar3;
        this.d = xcqVar4;
    }

    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() {
        switch (this.e) {
            case 0:
                return new lsc(((lrz) this.b).b(), (lql) this.a.b(), (SharedPreferences) this.d.b(), ((lsb) this.c).b());
            case 1:
                lfn lfnVar = (lfn) this.c.b();
                vvd vvdVar = (vvd) this.b.b();
                lpw lpwVar = (lpw) this.d.b();
                kpy kpyVar = (kpy) this.a.b();
                xpz xpzVarD = vvdVar.d(vgk.g);
                return new lql(lfnVar, xpzVarD, (vfh) vfh.J(new veq(2), xpzVarD), lpwVar, kpyVar);
            case 2:
                lfn lfnVar2 = (lfn) this.c.b();
                vvd vvdVar2 = (vvd) this.b.b();
                lpw lpwVar2 = (lpw) this.d.b();
                kpy kpyVar2 = (kpy) this.a.b();
                xpz xpzVarD2 = vvdVar2.d(waz.e);
                return new lql(lfnVar2, xpzVarD2, (wad) wad.J(new veq(5), xpzVarD2), lpwVar2, kpyVar2);
            case 3:
                lfn lfnVar3 = (lfn) this.c.b();
                vvd vvdVar3 = (vvd) this.b.b();
                lpw lpwVar3 = (lpw) this.d.b();
                kpy kpyVar3 = (kpy) this.a.b();
                xpz xpzVarD3 = vvdVar3.d(wbc.c);
                return new lql(lfnVar3, xpzVarD3, (wba) wba.J(new veq(6), xpzVarD3), lpwVar3, kpyVar3);
            case 4:
                return new ltq((lql) this.c.b(), (moz) this.a.b(), (ltp) this.b.b(), (lfn) this.d.b());
            case 5:
                lfn lfnVar4 = (lfn) this.c.b();
                vvd vvdVar4 = (vvd) this.b.b();
                lpw lpwVar4 = (lpw) this.d.b();
                kpy kpyVar4 = (kpy) this.a.b();
                xpz xpzVarD4 = vvdVar4.d(wcr.e);
                return new lql(lfnVar4, xpzVarD4, (wcp) wcp.J(new veq(7), xpzVarD4), lpwVar4, lfnVar4.aC(), !lfnVar4.cW(), kpyVar4);
            case 6:
                return new lym(((kqi) this.b).a(), (Executor) this.a.b(), (ids) this.c.b(), ((kqg) this.d).b());
            case 7:
                return new lkt((SharedPreferences) this.a.b(), (ltp) this.b.b(), (ltp) this.c.b(), (Executor) this.d.b());
            case 8:
                return new lzq(((rgq) this.d).a(), (lyz) this.b.b(), (isy) this.c.b(), ((lzr) this.a).b());
            case 9:
                return new mbk((luq) this.d.b(), (luq) this.b.b(), (luq) this.a.b(), (luq) this.c.b());
            case 10:
                xcq xcqVar = this.c;
                return new mbk(this.b, this.a, this.d, xcqVar, (byte[]) null);
            case 11:
                xcq xcqVar2 = this.d;
                return new mbk(this.a, this.c, this.b, xcqVar2);
            case 12:
                return new mbx((lhr) this.a.b(), (ldv) this.d.b(), (Executor) this.c.b(), ((kqg) this.b).b(), 0);
            case 13:
                return new mde((kuw) this.a.b(), (lie) this.d.b(), ((mco) this.b).b(), (Executor) this.c.b());
            case 14:
                xcq xcqVar3 = this.c;
                return new paq(this.d, this.b, this.a, xcqVar3, null);
            case 15:
                ((mtb) this.b).b();
                xcq xcqVar4 = this.d;
                moz mozVarB = ((lwe) this.c).b();
                return new msl(mozVarB);
            case 16:
                xcq xcqVar5 = this.d;
                mru mruVarB = ((mrv) this.a).b();
                return new msm(mruVarB);
            case 17:
                xcq xcqVar6 = this.a;
                return new ouo(((rmk) this.c).a(), ((rmk) this.b).a(), ((rmk) this.d).a(), ((rmk) xcqVar6).a());
            case 18:
                return new ovv(((owb) this.c).b(), (ovk) this.a.b(), (oum) this.d.b(), igh.d(), ((rmk) this.b).a());
            case 19:
                xcq xcqVar7 = this.b;
                pbg pbgVarB = ((pbh) this.a).b();
                return new paw(pbgVarB, xcl.a(this.d), (String) this.c.b());
            default:
                return new pdu((owz) this.d.b(), (oxp) this.b.b(), ((rgq) this.c).a(), (qei) this.a.b());
        }
    }

    public lsd(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, int i, byte[] bArr) {
        this.e = i;
        this.c = xcqVar;
        this.b = xcqVar2;
        this.d = xcqVar3;
        this.a = xcqVar4;
    }

    public lsd(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, int i, byte[] bArr, byte[] bArr2) {
        this.e = i;
        this.a = xcqVar;
        this.b = xcqVar2;
        this.d = xcqVar3;
        this.c = xcqVar4;
    }

    public lsd(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, int i, float[] fArr) {
        this.e = i;
        this.b = xcqVar;
        this.a = xcqVar2;
        this.c = xcqVar3;
        this.d = xcqVar4;
    }

    public lsd(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, int i, int[] iArr) {
        this.e = i;
        this.c = xcqVar;
        this.a = xcqVar2;
        this.b = xcqVar3;
        this.d = xcqVar4;
    }

    public lsd(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, int i, char[][] cArr) {
        this.e = i;
        this.d = xcqVar;
        this.b = xcqVar2;
        this.c = xcqVar3;
        this.a = xcqVar4;
    }

    public lsd(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, int i, float[][] fArr) {
        this.e = i;
        this.a = xcqVar;
        this.d = xcqVar2;
        this.c = xcqVar3;
        this.b = xcqVar4;
    }

    public lsd(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, int i, int[][] iArr) {
        this.e = i;
        this.b = xcqVar;
        this.a = xcqVar2;
        this.d = xcqVar3;
        this.c = xcqVar4;
    }

    public lsd(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, int i, short[][] sArr) {
        this.e = i;
        this.d = xcqVar;
        this.b = xcqVar2;
        this.a = xcqVar3;
        this.c = xcqVar4;
    }

    public lsd(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, int i, boolean[][] zArr) {
        this.e = i;
        this.a = xcqVar;
        this.c = xcqVar2;
        this.b = xcqVar3;
        this.d = xcqVar4;
    }

    public lsd(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, int i, byte[][][] bArr) {
        this.e = i;
        this.a = xcqVar;
        this.d = xcqVar2;
        this.b = xcqVar3;
        this.c = xcqVar4;
    }

    public lsd(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, int i, float[][][] fArr) {
        this.e = i;
        this.c = xcqVar;
        this.a = xcqVar2;
        this.d = xcqVar3;
        this.b = xcqVar4;
    }

    public lsd(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, xcq xcqVar4, int i, short[][][] sArr) {
        this.e = i;
        this.b = xcqVar;
        this.c = xcqVar2;
        this.d = xcqVar3;
        this.a = xcqVar4;
    }
}
