package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gpu extends BroadcastReceiver {
    final /* synthetic */ gpx a;

    public gpu(gpx gpxVar) {
        this.a = gpxVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        gpx gpxVar = this.a;
        ahal.e(gpxVar.c, null, 0, new gpt(intent, gpxVar, null), 3);
    }
}
