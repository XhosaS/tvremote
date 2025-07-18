package defpackage;

import com.google.android.apps.play.movies.common.service.workmanager.MoviesWorkerWrapper;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lhw implements lef {
    private final /* synthetic */ int a;
    private final Object b;

    public lhw(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, lfn] */
    @Override // defpackage.lef
    public final uhp a() {
        int i = this.a;
        if (i == 0) {
            return ((kuw) this.b).b(false);
        }
        if (i == 1) {
            isy isyVar = (isy) this.b;
            ?? r1 = isyVar.d;
            gpv gpvVar = new gpv(MoviesWorkerWrapper.class, r1.aA(), TimeUnit.SECONDS, r1.az(), TimeUnit.SECONDS);
            gpvVar.b("refresh_license_periodic");
            gpvVar.c((gou) isyVar.a);
            gpvVar.e((gox) isyVar.b);
            cvi cviVarF = gpvVar.f();
            krd.e("Scheduling a periodic refresh of licenses.");
            return ufn.i(((gpt) ((gpz) isyVar.c).f("refresh_license_periodic", 1, cviVarF)).c, new ldl(cviVarF, 3), ugk.a);
        }
        if (i == 2) {
            return ((hfx) this.b).r(3, 0);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        gli.D("worker_name_key", "AccountsChangedWorker", linkedHashMap);
        gox goxVarY = gli.y(linkedHashMap);
        gpo gpoVar = new gpo(MoviesWorkerWrapper.class);
        gpoVar.b("accounts_changed");
        gpoVar.e(goxVarY);
        cvi cviVarF2 = gpoVar.f();
        return ufn.i(((gpt) ((gpz) ((hfx) this.b).a).g("accounts_changed", 1, cviVarF2)).c, new ldl(cviVarF2, 19), ugk.a);
    }
}
