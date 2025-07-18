package defpackage;

import android.content.Intent;
import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gku implements wlk {
    private static final zdy a = zdy.h("com/google/android/apps/tvsearch/logging/intentlogger/IntentLoggerBroadcastReceiver");
    private final idl b;
    private final ztw c;

    public gku(idl idlVar, ztw ztwVar) {
        idlVar.getClass();
        ztwVar.getClass();
        this.b = idlVar;
        this.c = ztwVar;
    }

    @Override // defpackage.wlk
    public final zyd a(Intent intent) {
        intent.getClass();
        Instant instantPlus = agvy.c(intent.getAction(), "com.google.android.katniss.action.ENABLE_INTENT_LOGGER") ? this.c.a().plus(Duration.ofDays(1L)) : Instant.EPOCH;
        instantPlus.getClass();
        ((zdv) a.d().q("com/google/android/apps/tvsearch/logging/intentlogger/IntentLoggerBroadcastReceiver", "onReceive", 43, "IntentLoggerBroadcastReceiver.kt")).x("onReceive, detailed intent logging expiry set to %s.", instantPlus);
        this.b.z(instantPlus);
        return zxy.a;
    }
}
