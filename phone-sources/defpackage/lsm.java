package defpackage;

import android.content.SharedPreferences;
import android.net.Uri;
import java.util.Collections;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lsm implements xcm {
    private final xcq a;
    private final xcq b;
    private final xcq c;
    private final /* synthetic */ int d;

    public lsm(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, int i) {
        this.d = i;
        this.a = xcqVar;
        this.b = xcqVar2;
        this.c = xcqVar3;
    }

    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() {
        switch (this.d) {
            case 0:
                return new lrc(((lsj) this.b).b(), (lql) this.a.b(), ((kqg) this.c).b(), 7, null);
            case 1:
                return new lrc(((lsj) this.b).b(), (lql) this.a.b(), ((kqg) this.c).b(), 6, null);
            case 2:
                return new ltt((lql) this.a.b(), (moz) this.b.b(), (lie) this.c.b(), 0);
            case 3:
                return new jzs((ldv) this.c.b(), (lyz) this.b.b(), ((kqt) this.a).a());
            case 4:
                return new kuw((lfn) this.c.b(), (lie) this.a.b(), (krh) this.b.b());
            case 5:
                return kdw.q(new lfa((lfb) this.c.b(), new lfh(new lfc((vvq) xag.a.a(7, null), xag.class)), lxo.a), (idf) this.a.b(), 10800000L, 10800000L, ((Boolean) this.b.b()).booleanValue());
            case 6:
                ldv ldvVar = (ldv) this.c.b();
                idf idfVar = (idf) this.b.b();
                lfn lfnVar = (lfn) this.a.b();
                idh idhVarD = idh.d();
                idhVarD.e(idfVar);
                return new luq(ldvVar, idhVarD.b(new jxt(lxq.d, 8)), Uri.parse(lfnVar.bd()), 6);
            case 7:
                return new jzs(this.c, this.b, this.a, (char[]) null, (byte[]) null);
            case 8:
                return mak.c((lzh) this.b.b(), ((lwc) this.c).a(), (mma) this.a.b());
            case 9:
                return new jzs(this.c, this.b, this.a, (short[]) null);
            case 10:
                return new jzs((SharedPreferences) this.c.b(), (ltp) this.b.b(), ((mcg) this.a).b(), (byte[]) null);
            case 11:
                ldv ldvVar2 = (ldv) this.c.b();
                ExecutorService executorService = (ExecutorService) this.b.b();
                lyz lyzVar = (lyz) this.a.b();
                iea ieaVarF = ldvVar2.f();
                mca mcaVar = new mca(lyzVar, true);
                krz krzVar = new krz(Collections.EMPTY_MAP);
                krzVar.a = new ids[]{ieaVarF, lyzVar.c(16)};
                krzVar.b = executorService;
                krzVar.d(new ldj(ieaVarF, mcaVar, 11, null));
                return krzVar.a();
            case 12:
                ldv ldvVar3 = (ldv) this.c.b();
                ExecutorService executorService2 = (ExecutorService) this.b.b();
                lyz lyzVar2 = (lyz) this.a.b();
                mca mcaVar2 = new mca(lyzVar2, false);
                iea ieaVarF2 = ldvVar3.f();
                krz krzVar2 = new krz(Collections.EMPTY_MAP);
                krzVar2.a = new ids[]{ieaVarF2, lyzVar2.c(16)};
                krzVar2.b = executorService2;
                krzVar2.d(new ldj(ieaVarF2, mcaVar2, 12, null));
                return krzVar2.a();
            case 13:
                xcq xcqVar = this.b;
                xcq xcqVar2 = this.a;
                xku xkuVarB = ((xkv) this.c).b();
                mcq mcqVarB = ((mcs) xcqVar2).b();
                mcq mcqVar = (mdb) xcqVar.b();
                if (true == xkuVarB.a()) {
                    mcqVarB = mcqVar;
                }
                mcqVarB.getClass();
                return mcqVarB;
            case 14:
                xcq xcqVar3 = this.a;
                xku xkuVarB2 = ((xkv) this.c).b();
                Object obj = (mcv) xcqVar3.b();
                Object obj2 = (mdc) this.b.b();
                if (true == xkuVarB2.a()) {
                    obj = obj2;
                }
                obj.getClass();
                return obj;
            case 15:
                xcq xcqVar4 = this.a;
                xku xkuVarB3 = ((xkv) this.c).b();
                mcw mcwVar = (mcx) xcqVar4.b();
                mcw mcwVar2 = (mdd) this.b.b();
                if (true == xkuVarB3.a()) {
                    mcwVar = mcwVar2;
                }
                mcwVar.getClass();
                return mcwVar;
            case 16:
                xcq xcqVar5 = this.a;
                xku xkuVarB4 = ((xkv) this.c).b();
                mcy mcyVar = (mda) xcqVar5.b();
                mcy mcyVar2 = (mde) this.b.b();
                if (true == xkuVarB4.a()) {
                    mcyVar = mcyVar2;
                }
                mcyVar.getClass();
                return mcyVar;
            case 17:
                return new mdb((kuw) this.b.b(), (ldv) this.c.b(), (ltp) this.a.b());
            case 18:
                return new mru(((rgq) this.a).a(), ((kqg) this.c).b(), (jan) this.b.b());
            case 19:
                return new mru(this.c, this.b, this.a, null);
            default:
                xcl.a(this.a);
                return new osk();
        }
    }

    public lsm(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, int i, float[] fArr) {
        this.d = i;
        this.c = xcqVar;
        this.b = xcqVar2;
        this.a = xcqVar3;
    }

    public lsm(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, int i, int[] iArr) {
        this.d = i;
        this.c = xcqVar;
        this.a = xcqVar2;
        this.b = xcqVar3;
    }

    public lsm(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, int i, char[][] cArr) {
        this.d = i;
        this.b = xcqVar;
        this.c = xcqVar2;
        this.a = xcqVar3;
    }

    public lsm(xcq xcqVar, xcq xcqVar2, xcq xcqVar3, int i, float[][][] fArr) {
        this.d = i;
        this.a = xcqVar;
        this.c = xcqVar2;
        this.b = xcqVar3;
    }
}
