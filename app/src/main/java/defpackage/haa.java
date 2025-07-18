package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class haa extends BroadcastReceiver {
    final /* synthetic */ hab a;

    public haa(hab habVar) {
        this.a = habVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        ((zdv) hab.a.b().q("com/google/android/apps/tvsearch/platform/packagemanager/PackageCache$init$2", "onReceive", 84, "PackageCache.kt")).x("Rebuilding package cache for %s", intent);
        hab habVar = this.a;
        ahal.e(habVar.g, null, 0, new gzz(habVar, intent, null), 3);
    }
}
