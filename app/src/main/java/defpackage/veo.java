package defpackage;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class veo {
    private static final zdy b = zdy.h("com/google/android/tv/remote/virtual/host/common/RemoteServiceConnector");
    public BroadcastReceiver a;
    private final Context c;
    private final String d = "com.google.android.tv.remote.service.IAtvAudioProviderService";
    private final ComponentName e;
    private final ven f;

    public veo(Context context, ComponentName componentName, jbv jbvVar) {
        this.c = context;
        this.e = componentName;
        this.f = new ven(this, jbvVar);
    }

    public final void a() {
        if (b()) {
            return;
        }
        if (this.a != null) {
            ((zdv) ((zdv) b.c()).q("com/google/android/tv/remote/virtual/host/common/RemoteServiceConnector", "connectNowOrLater", 84, "RemoteServiceConnector.java")).u("Deferred AtvRemoteService connection is already scheduled");
            return;
        }
        this.a = new vem(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
        intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter.addDataScheme("package");
        intentFilter.addDataSchemeSpecificPart("com.google.android.tv.remote.service", 0);
        Context context = this.c;
        context.registerReceiver(this.a, intentFilter);
        this.a.onReceive(context, null);
    }

    public final boolean b() {
        Intent intent = new Intent(this.d);
        intent.setPackage("com.google.android.tv.remote.service");
        intent.setComponent(this.e);
        return this.c.bindService(intent, this.f, 0);
    }
}
