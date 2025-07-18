package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iel extends BroadcastReceiver {
    final /* synthetic */ iem a;

    public iel(iem iemVar) {
        this.a = iemVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        iem iemVar = this.a;
        if (iemVar.g.hasAction(intent.getAction())) {
            iemVar.eb();
        }
    }
}
