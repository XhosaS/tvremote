package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class osv implements ufv {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ osv(int i) {
        this.b = i;
        this.a = "growthkit.db";
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Callable] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v72, types: [java.lang.Object, uhp] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, ttm] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, xbw] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, ttm] */
    @Override // defpackage.ufv
    public final uhp a() {
        int i = 3;
        int i2 = 0;
        int i3 = 1;
        switch (this.b) {
            case 0:
                ?? r0 = this.a;
                int i4 = osx.a;
                return sfy.F(r0, ugk.a);
            case 1:
                Object obj = this.a;
                mbx mbxVar = (mbx) obj;
                if (mbxVar.c.getInt(krh.UPDATE_WORKER_LAST_RUN_VERSION_CODE, 0) == ((lxc) mbxVar.b).b) {
                    krd.b("Skipping AppUpdateWork because it's already been run for this app version");
                    return sfy.C(new gpl());
                }
                ArrayList arrayList = new ArrayList();
                for (lef lefVar : (Set) mbxVar.d.b()) {
                    krd.b("Running update listener for ".concat(String.valueOf(String.valueOf(lefVar))));
                    arrayList.add(lefVar.a());
                }
                return sfy.M(arrayList).a(new eet(obj, 7), mbxVar.a);
            case 2:
                return ((pfj) ((pgh) this.a).c).b().j(vlo.GROWTHKIT_SYNC_AFTER_USER_ACTION);
            case 3:
                lhr lhrVar = (lhr) this.a;
                tst tstVar = (tst) lhrVar.f.get();
                boolean zG = tstVar.g();
                Object obj2 = lhrVar.e.get();
                if (zG) {
                    tst tstVar2 = (tst) obj2;
                    if (tstVar2.g()) {
                        rqr rqrVar = new rqr((File) tstVar.c(), (String) tstVar2.c());
                        int iA = rqrVar.a();
                        rqrVar.b().delete();
                        rqrVar.b = 0;
                        rqrVar.c = true;
                        if (iA < ((rqs) lhrVar.g.b()).c) {
                            return uhl.a;
                        }
                        Object obj3 = lhrVar.a;
                        rpz rpzVarA = rqa.a();
                        vtw vtwVarM = zba.a.m();
                        vtw vtwVarM2 = zaz.a.m();
                        if (!vtwVarM2.b.A()) {
                            vtwVarM2.u();
                        }
                        zaz zazVar = (zaz) vtwVarM2.b;
                        zazVar.c = 6;
                        zazVar.b |= 1;
                        if (!vtwVarM.b.A()) {
                            vtwVarM.u();
                        }
                        zba zbaVar = (zba) vtwVarM.b;
                        zaz zazVar2 = (zaz) vtwVarM2.r();
                        zazVar2.getClass();
                        zbaVar.v = zazVar2;
                        zbaVar.b |= 16777216;
                        rpzVarA.f((zba) vtwVarM.r());
                        return ((rqd) obj3).b(rpzVarA.a());
                    }
                }
                return uhl.a;
            case 4:
                rrc rrcVar = (rrc) this.a;
                return (!rrcVar.n() || rrcVar.c.getAndSet(true)) ? uhl.a : rrcVar.p(6, (rqq) rrcVar.b.b(), ((rqs) rrcVar.e.b()).f);
            case 5:
                rrc rrcVar2 = (rrc) this.a;
                if (rrcVar2.n()) {
                    lhr lhrVar2 = rrcVar2.g;
                    if (((AtomicBoolean) lhrVar2.d).getAndSet(false)) {
                        sfy.G(new osv(lhrVar2, i), lhrVar2.b);
                    } else {
                        uhp uhpVar = uhl.a;
                    }
                }
                return uhl.a;
            case 6:
                Object obj4 = this.a;
                return osx.c(((rro) obj4).b, new rtr(obj4, i3));
            case 7:
                return uhl.a;
            case 8:
                return ((rtk) this.a).c();
            case 9:
                return sfy.D(sil.c(((slk) this.a).b));
            case 10:
                slk slkVar = (slk) this.a;
                return slkVar.c((Uri) sfy.J(slkVar.b), new slh(slkVar, i3));
            case 11:
                Object obj5 = this.a;
                slw slwVar = (slw) obj5;
                return ufn.i(sfy.D(slwVar.b), new nbb(slwVar.i, new slt(obj5, i2), 11, null), ugk.a);
            case 12:
                Object obj6 = this.a;
                slw slwVar2 = (slw) obj6;
                Uri uri = (Uri) sfy.J(slwVar2.b);
                try {
                    return sfy.C(((slw) obj6).g(uri));
                } catch (IOException e) {
                    tst tstVar3 = slwVar2.d;
                    if (!tstVar3.g()) {
                        return sfy.B(e);
                    }
                    if (slw.d(e)) {
                        return sfy.B(e);
                    }
                    Object objC = tstVar3.c();
                    unx unxVar = slwVar2.k;
                    ufv ufvVarB = trc.b(new lhx(obj6, objC, 15));
                    Executor executor = slwVar2.c;
                    return ufn.j(unxVar.e(ufvVarB, executor), trc.c(new pap(obj6, uri, 17)), executor);
                }
            case 13:
                Object obj7 = this.a;
                ufw ufwVarC = trc.c(new sls(obj7, 4));
                slz slzVar = (slz) obj7;
                return sfy.D(ufn.j(slzVar.a, ufwVarC, slzVar.b));
            case 14:
                Object obj8 = this.a;
                slz slzVar2 = (slz) obj8;
                try {
                    return sfy.C(((slz) obj8).b((Uri) sfy.J(slzVar2.a)));
                } catch (IOException e2) {
                    slv slvVar = new slv(obj8, 2);
                    tst tstVar4 = slzVar2.c;
                    return !tstVar4.g() ? sfy.B(e2) : ((e2 instanceof sjx) || (e2.getCause() instanceof sjx)) ? sfy.B(e2) : ufn.j(((ulp) tstVar4.c()).as(e2, slvVar), trc.c(new sls(obj8, i)), slzVar2.b);
                }
            case 15:
                return this.a;
            default:
                return sfy.C(this.a);
        }
    }

    public /* synthetic */ osv(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
