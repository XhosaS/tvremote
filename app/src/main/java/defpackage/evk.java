package defpackage;

import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class evk extends wil {
    private static final zdy g = zdy.h("com/google/android/apps/tvsearch/app/TvSearchApp");
    public gyj a;
    public hag b;
    public agow c;

    public evk() {
        gmw gmwVar = gmw.a;
        gmwVar.a();
        gmwVar.c = Instant.now();
        gmwVar.e = Duration.ofNanos(gmwVar.b.b());
    }

    public final hag d() {
        hag hagVar = this.b;
        if (hagVar != null) {
            return hagVar;
        }
        agvy.b("processId");
        return null;
    }

    public final agow e() {
        agow agowVar = this.c;
        if (agowVar != null) {
            return agowVar;
        }
        agvy.b("tvLogger");
        return null;
    }

    @Override // defpackage.wil, android.app.Application
    public void onCreate() {
        super.onCreate();
        gyj gyjVar = this.a;
        if (gyjVar == null) {
            agvy.b("initManager");
            gyjVar = null;
        }
        gyjVar.a();
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        ((zdv) g.b().q("com/google/android/apps/tvsearch/app/TvSearchApp", "onTrimMemory", 43, "TvSearchApp.kt")).v("onTrimMemory level=%d", i);
        if (d() == hag.g) {
            ((ghr) e().a()).P(i, 3);
        } else if (d() == hag.d) {
            ((ghr) e().a()).P(i, 2);
        }
    }
}
