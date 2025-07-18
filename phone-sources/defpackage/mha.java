package defpackage;

import android.content.SharedPreferences;
import com.google.android.apps.googletv.app.presentation.pages.entitypurchase.EntityPurchasePageActivity;
import com.google.android.apps.play.movies.common.presenter.activity.ApiActivity;
import com.google.android.apps.play.movies.mobile.usecase.settings.SettingsActivity;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mha implements xby {
    final xcq a;
    final xcq b;
    private final mif c;
    private final /* synthetic */ int d;

    public mha(mif mifVar, int i) {
        this.d = i;
        this.c = mifVar;
        itl itlVar = new itl(mifVar.ok, mifVar.pd, mifVar.pi, mifVar.ps, 7, (byte[][]) null);
        this.a = itlVar;
        this.b = new inc((Object) itlVar, (xcq) iyf.a, 13);
    }

    @Override // defpackage.xby
    public final /* synthetic */ void a(Object obj) {
        int i = this.d;
        if (i == 0) {
            mif mifVar = this.c;
            EntityPurchasePageActivity entityPurchasePageActivity = (EntityPurchasePageActivity) obj;
            entityPurchasePageActivity.R = mifVar.F();
            entityPurchasePageActivity.n = (lfn) mifVar.bG.b();
            entityPurchasePageActivity.o = (lie) mifVar.bR.b();
            entityPurchasePageActivity.p = (jaf) mifVar.tj.b();
            entityPurchasePageActivity.q = mifVar.s();
            entityPurchasePageActivity.u = (jan) mifVar.gw.b();
            entityPurchasePageActivity.r = (itk) mifVar.gl.b();
            entityPurchasePageActivity.v = (gag) mifVar.gm.b();
            entityPurchasePageActivity.s = mifVar.G();
            entityPurchasePageActivity.t = mifVar.i();
            entityPurchasePageActivity.a = mifVar.getAccountRepository();
            entityPurchasePageActivity.b = jvy.a(mifVar.a);
            entityPurchasePageActivity.m = (kwy) mifVar.nR.b();
            entityPurchasePageActivity.c = mifVar.m();
            entityPurchasePageActivity.d = (kmo) mifVar.tL.b();
            entityPurchasePageActivity.w = new iyn(new kw((Object) iyr.a, (byte[]) null), mifVar.l(), (mjb) mifVar.wD.b(), (gag) mifVar.gm.b(), (kmo) mifVar.tL.b());
            entityPurchasePageActivity.G = new hfw(this.b);
            entityPurchasePageActivity.x = mifVar.p();
            entityPurchasePageActivity.F = (mta) mifVar.uD.b();
            entityPurchasePageActivity.C = (pke) mifVar.tg.b();
            entityPurchasePageActivity.D = (pkg) mifVar.tf.b();
            entityPurchasePageActivity.E = (nqq) mifVar.th.b();
            return;
        }
        if (i == 1) {
            mif mifVar2 = this.c;
            ApiActivity apiActivity = (ApiActivity) obj;
            apiActivity.h = (ldv) mifVar2.bs.b();
            apiActivity.i = (lfn) mifVar2.bG.b();
            apiActivity.j = mifVar2.c();
            apiActivity.r = (mta) mifVar2.uD.b();
            apiActivity.k = (mab) mifVar2.ev.b();
            kqf kqfVar = mifVar2.a;
            apiActivity.l = jvy.a(kqfVar);
            apiActivity.t = new isy(mifVar2.bE, mifVar2.bF, this.b, this.a, (char[]) null);
            apiActivity.m = mifVar2.F();
            apiActivity.n = (lie) mifVar2.bR.b();
            apiActivity.q = new lkt(rgq.c(kqfVar), kfm.a(kqfVar), jvy.a(kqfVar), kqu.c(kqfVar), (lie) mifVar2.bR.b(), mifVar2.Ch);
            return;
        }
        if (i == 2) {
            mif mifVar3 = this.c;
            kch kchVar = (kch) obj;
            kchVar.androidInjector = mifVar3.F();
            kchVar.c = new kdh(this.b);
            kchVar.a = new kcn(new hfw(kcr.a), mifVar3.l());
            kchVar.b = mifVar3.i();
            return;
        }
        mif mifVar4 = this.c;
        SettingsActivity settingsActivity = (SettingsActivity) obj;
        settingsActivity.R = mifVar4.F();
        settingsActivity.a = (lfn) mifVar4.bG.b();
        settingsActivity.t = (lfn) mifVar4.bG.b();
        settingsActivity.b = (SharedPreferences) mifVar4.bm.b();
        settingsActivity.c = (lie) mifVar4.bR.b();
        settingsActivity.d = mifVar4.getItagInfoStore();
        settingsActivity.o = mifVar4.ai();
        settingsActivity.q = (lfz) mifVar4.cv.b();
        settingsActivity.e = (mem) mifVar4.bQ.b();
        settingsActivity.f = (lxc) mifVar4.bk.b();
        settingsActivity.s = mifVar4.as();
        settingsActivity.g = (Executor) mifVar4.bF.b();
        settingsActivity.r = (ltp) this.b.b();
        settingsActivity.h = mifVar4.getAccountRepository();
        settingsActivity.i = mifVar4.V();
        settingsActivity.j = mifVar4.J();
        settingsActivity.k = mifVar4.Q();
        settingsActivity.p = (isi) mifVar4.fB.b();
        settingsActivity.l = mifVar4.R();
        settingsActivity.n = mifVar4.F();
    }

    public mha(mif mifVar, int i, char[] cArr) {
        this.d = i;
        this.c = mifVar;
        itl itlVar = new itl(mifVar.ok, mifVar.ps, mifVar.pi, mifVar.pd, 8, (char[][]) null);
        this.a = itlVar;
        this.b = new jbh((xcq) itlVar, (xcq) iyf.a, mifVar.oo, mifVar.fB, mifVar.Dy, mifVar.bR, mifVar.fG, 2, (char[]) null);
    }

    public mha(mif mifVar, int i, byte[] bArr) {
        this.d = i;
        this.c = mifVar;
        this.b = new lti(mifVar.bS, 11);
        this.a = xct.a(new lsm(mifVar.dg, mifVar.dh, mifVar.bw, 1));
    }

    public mha(mif mifVar, int i, short[] sArr) {
        this.d = i;
        this.c = mifVar;
        lqv lqvVar = new lqv(mifVar.cf, mifVar.cm, 7);
        this.a = lqvVar;
        this.b = xct.a(lqvVar);
    }
}
