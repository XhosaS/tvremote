package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oyz extends BroadcastReceiver {
    final /* synthetic */ ozi a;

    public oyz(ozi oziVar) {
        this.a = oziVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        ozi oziVar = this.a;
        if (oziVar.u) {
            oziVar.u();
        }
    }
}
