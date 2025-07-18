package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ehr extends BroadcastReceiver {
    private final ecu a;

    public ehr(ecu ecuVar) {
        this.a = ecuVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.a.d(new ehq(0));
        }
    }
}
