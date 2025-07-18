package defpackage;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
class gcs extends gct {
    final /* synthetic */ gcu a;
    final /* synthetic */ gcv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gcs(gcv gcvVar, gcu gcuVar) {
        super(gcvVar);
        this.a = gcuVar;
        this.b = gcvVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        jrx jrxVar;
        gcv gcvVar = this.b;
        if (gcvVar.b != null) {
            return;
        }
        if (iBinder == null) {
            jrxVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.assistant.led.IFixedStateLedService");
            jrxVar = iInterfaceQueryLocalInterface instanceof jrx ? (jrx) iInterfaceQueryLocalInterface : new jrx(iBinder);
        }
        jrxVar.getClass();
        gcvVar.b = new gbx(jrxVar);
        try {
            this.a.a(gcvVar.b.b());
        } catch (Exception e) {
            ((zdv) ((zdv) ((zdv) gcv.a.d()).p(e)).q("com/google/android/apps/tvsearch/led/controller/LegacyLedController$3", "onServiceConnected", (char) 320, "LegacyLedController.java")).u("Exception connecting to FixedStateLedService");
        }
    }
}
