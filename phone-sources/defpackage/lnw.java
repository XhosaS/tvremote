package defpackage;

import com.google.android.apps.play.movies.common.service.workmanager.MoviesWorkerWrapper;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lnw implements lef {
    private final gpz a;
    private final /* synthetic */ int b;
    private final Object c;

    public lnw(gpz gpzVar, Object obj, int i) {
        this.b = i;
        this.a = gpzVar;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, lfn] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, lfr] */
    @Override // defpackage.lef
    public final uhp a() {
        if (this.b != 0) {
            gos gosVar = new gos();
            gosVar.b();
            gosVar.c(3);
            gou gouVarA = gosVar.a();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            gli.D("worker_name_key", "FlushLogsWorker", linkedHashMap);
            gox goxVarY = gli.y(linkedHashMap);
            ?? r3 = this.c;
            gpv gpvVar = new gpv(MoviesWorkerWrapper.class, r3.dA(), TimeUnit.SECONDS, r3.dz(), TimeUnit.SECONDS);
            gpvVar.b("flush_logs");
            gpvVar.c(gouVarA);
            gpvVar.e(goxVarY);
            cvi cviVarF = gpvVar.f();
            return ufn.i(((gpt) this.a.f("flush_qoe_logs", 1, cviVarF)).c, new ldl(cviVarF, 6), ugk.a);
        }
        gos gosVar2 = new gos();
        gosVar2.b();
        gosVar2.c(3);
        gou gouVarA2 = gosVar2.a();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        gli.D("worker_name_key", "QoePingWorker", linkedHashMap2);
        gox goxVarY2 = gli.y(linkedHashMap2);
        ?? r32 = this.c;
        gpv gpvVar2 = new gpv(MoviesWorkerWrapper.class, r32.av(), TimeUnit.SECONDS, r32.au(), TimeUnit.SECONDS);
        gpvVar2.b("flush_qoe_logs");
        gpvVar2.c(gouVarA2);
        gpvVar2.e(goxVarY2);
        cvi cviVarF2 = gpvVar2.f();
        return ufn.i(((gpt) this.a.f("flush_qoe_logs", 1, cviVarF2)).c, new ldl(cviVarF2, 8), ugk.a);
    }
}
