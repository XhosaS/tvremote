package defpackage;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
class gcr extends gct {
    final /* synthetic */ gcv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gcr(gcv gcvVar) {
        super(gcvVar);
        this.a = gcvVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        jry jryVar;
        gcv gcvVar = this.a;
        if (gcvVar.b != null) {
            return;
        }
        if (iBinder == null) {
            jryVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.assistant.led.ILedService");
            jryVar = iInterfaceQueryLocalInterface instanceof jry ? (jry) iInterfaceQueryLocalInterface : new jry(iBinder);
        }
        jryVar.getClass();
        gcvVar.b = new gby(jryVar);
        try {
            gcvVar.b.c();
        } catch (Exception e) {
            ((zdv) ((zdv) ((zdv) gcv.a.d()).p(e)).q("com/google/android/apps/tvsearch/led/controller/LegacyLedController$2", "onServiceConnected", (char) 299, "LegacyLedController.java")).u("Exception connecting to LedService");
        }
    }
}
