package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wyn extends BroadcastReceiver {
    final /* synthetic */ BroadcastReceiver a;

    public wyn(BroadcastReceiver broadcastReceiver) {
        this.a = broadcastReceiver;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        wwq wwqVarN = wyo.a.n(intent, true);
        if (wwqVarN == null) {
            this.a.onReceive(context, intent);
            return;
        }
        wwq wwqVarG = wum.g(wum.c(), wwqVarN);
        try {
            this.a.onReceive(context, intent);
        } finally {
            wum.g(wum.c(), wwqVarG);
        }
    }
}
