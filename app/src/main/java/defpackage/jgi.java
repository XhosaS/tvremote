package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jgi extends BroadcastReceiver {
    final /* synthetic */ jhh a;

    public jgi(jhh jhhVar) {
        this.a = jhhVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (agvy.c(action, "android.os.action.LOW_POWER_STANDBY_ENABLED_CHANGED") || agvy.c(action, "android.os.action.LOW_POWER_STANDBY_POLICY_CHANGED")) {
            jhh jhhVar = this.a;
            if (((Boolean) jhhVar.o.a()).booleanValue()) {
                ((zdv) jhh.a.b().q("com/google/android/apps/tvsearch/voice/libassistant/AssistantWrapperImpl$lowPowerStandbyBroadcastReceiver$1", "onReceive", 531, "AssistantWrapperImpl.kt")).u("Received energy mode update");
                jhhVar.ap("energy mode");
            }
        }
    }
}
