package defpackage;

import android.content.Intent;
import j$.time.Duration;
import j$.util.Objects;
import j$.util.concurrent.ThreadLocalRandom;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ihh implements wlk {
    private final agow a;
    private final vtm b;

    public ihh(agow agowVar, vtm vtmVar) {
        this.a = agowVar;
        this.b = vtmVar;
    }

    @Override // defpackage.wlk
    public final zyd a(Intent intent) {
        if ("com.google.android.apps.tvsearch.setup.fix.START_FIX_SETTING_RECEIVER_KATNISS_COLDSTART".equals(intent.getAction())) {
            this.b.c(iht.a.a(feq.b(ThreadLocalRandom.current(), Duration.ofHours(1L), Duration.ofHours(12L))));
        } else if (Objects.equals(intent.getAction(), "com.google.android.apps.tvsearch.setup.fix.SCHEDULE_KATNISS_PERIODIC_FIX_SETTING_WORK") || Objects.equals(intent.getAction(), "com.google.android.apps.tvsearch.setup.share.ASSISTANT_ENABLED")) {
            intent.getAction();
            if (((Boolean) this.a.a()).booleanValue()) {
                this.b.c(iht.a.a(ihk.a(iht.c)));
            }
        }
        return zxy.a;
    }
}
