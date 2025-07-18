package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
class jcj extends BroadcastReceiver {
    final /* synthetic */ jcv a;

    public jcj(jcv jcvVar) {
        this.a = jcvVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (Objects.equals(action, "android.os.action.LOW_POWER_STANDBY_ENABLED_CHANGED") || Objects.equals(action, "android.os.action.LOW_POWER_STANDBY_POLICY_CHANGED")) {
            ((zdv) ((zdv) jcv.a.b()).q("com/google/android/apps/tvsearch/voice/dsp/DspManager$1", "onReceive", 254, "DspManager.java")).x("Low power standby update: %s", action);
            this.a.g("energy mode");
        }
    }
}
