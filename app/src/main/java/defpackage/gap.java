package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gap extends BroadcastReceiver {
    final /* synthetic */ gar a;

    public gap(gar garVar) {
        this.a = garVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        intent.getClass();
        if (agvy.c("android.katniss.search.action.CONVERSATION_IS_ENDED", intent.getAction())) {
            this.a.b.finish();
        }
    }
}
