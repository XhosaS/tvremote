package defpackage;

import android.content.SharedPreferences;
import j$.time.Instant;
import java.net.URL;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pmr implements xcm {
    private final xcq a;
    private final /* synthetic */ int b;

    public pmr(xcq xcqVar, int i) {
        this.b = i;
        this.a = xcqVar;
    }

    @Override // defpackage.yfo, defpackage.yfn
    public final /* synthetic */ Object b() {
        uht uhtVar;
        uht uhtVar2;
        switch (this.b) {
            case 0:
                Map map = (Map) ((xcn) this.a).a;
                tvn tvnVar = pne.a;
                return new jzs(map, new pno(1));
            case 1:
                tvn tvnVar2 = pne.a;
                return new jzs(((xcj) this.a).a, new pno(1));
            case 2:
                return new pui((qte) this.a.b());
            case 3:
                return new pux(new qps(), ((puw) this.a).b());
            case 4:
                return new pve(((qoe) this.a).a());
            case 5:
                return new pvy(((rgq) this.a).a());
            case 6:
                return new pzj(((rgq) this.a).a());
            case 7:
                return new qan(((rgq) this.a).a());
            case 8:
                return new ntp(((rgq) this.a).a(), (byte[]) null);
            case 9:
                ((osk) this.a.b()).getClass();
                return new Random(Instant.now().toEpochMilli());
            case 10:
                return new mhb((mif) ((mhg) this.a).b().a, 1);
            case 11:
                return new mhb((mif) ((mhh) this.a).b().a, 0);
            case 12:
                SharedPreferences sharedPreferences = ((rgq) this.a).a().getSharedPreferences("restart_receiver_manager_shared_prefs", 0);
                sharedPreferences.getClass();
                return sharedPreferences;
            case 13:
                tst tstVar = (tst) ((xcn) this.a).a;
                tvn tvnVar3 = qhu.a;
                yfo yfoVar = (yfo) tstVar.f();
                if (yfoVar != null && (uhtVar = (uht) yfoVar.b()) != null) {
                    return uhtVar;
                }
                uie uieVar = new uie();
                uieVar.d("gnp-background-thread-%d");
                qeg qegVar = new qeg(sfy.v(Executors.newFixedThreadPool(4, uie.b(uieVar))), sfy.w(Executors.newSingleThreadScheduledExecutor()));
                qhu.a.l().s("`@GnpBackgroundExecutor ListeningScheduledExecutorService` was not provided, creating an internal executor");
                return qegVar;
            case 14:
                tst tstVar2 = (tst) ((xcn) this.a).a;
                tvn tvnVar4 = qhu.a;
                yfo yfoVar2 = (yfo) tstVar2.f();
                if (yfoVar2 != null && (uhtVar2 = (uht) yfoVar2.b()) != null) {
                    return uhtVar2;
                }
                uie uieVar2 = new uie();
                uieVar2.d("gnp-blocking-thread-%d");
                qeg qegVar2 = new qeg(sfy.v(Executors.newCachedThreadPool(uie.b(uieVar2))), sfy.w(Executors.newSingleThreadScheduledExecutor()));
                qhu.a.l().s("`@GnpBlockingExecutor ListeningScheduledExecutorService` was not provided, creating an internal executor");
                return qegVar2;
            case 15:
                String strB = ((qif) this.a).b();
                int i = qid.a;
                String host = new URL(strB).getHost();
                host.getClass();
                return host;
            case 16:
                new qps().a(((rgq) this.a).a());
                return Boolean.valueOf(xff.a.get().e());
            case 17:
                new qps().a(((rgq) this.a).a());
                return Boolean.valueOf(xfl.a.get().d());
            case 18:
                return new ntp((tst) ((xcn) this.a).a);
            case 19:
                return ((qjj) this.a).b();
            default:
                SharedPreferences sharedPreferences2 = ((rgq) this.a).a().getSharedPreferences("fcm_registration_data", 0);
                sharedPreferences2.getClass();
                return sharedPreferences2;
        }
    }
}
