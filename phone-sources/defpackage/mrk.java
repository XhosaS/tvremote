package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mrk extends BroadcastReceiver {
    final /* synthetic */ mrm a;

    public mrk(mrm mrmVar) {
        this.a = mrmVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        int iHashCode = action.hashCode();
        if (iHashCode != -1018851765) {
            if (iHashCode == 2065806138 && action.equals("com.google.android.videos.intent.action.pip_controllers")) {
                if (intent.hasExtra("PIP_ACTION_EXTRA")) {
                    this.a.g.b(intent.getIntExtra("PIP_ACTION_EXTRA", 0));
                    return;
                }
                return;
            }
        } else if (action.equals("com.google.android.videos.NEW_PLAYBACK_STARTED")) {
            mrm mrmVar = this.a;
            if (mrmVar.h) {
                mrmVar.b();
                return;
            }
            return;
        }
        krd.f("Unknown Intent action for PiP: ".concat(String.valueOf(action)));
    }
}
