package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.tv.remote.service.IAtvAudioProviderService;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ven implements ServiceConnection {
    final /* synthetic */ veo a;
    private final jbv b;

    public ven(veo veoVar, jbv jbvVar) {
        this.a = veoVar;
        this.b = jbvVar;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        this.a.a();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        componentName.getClass();
        iBinder.getClass();
        int i = jbw.b;
        componentName.flattenToString();
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.tv.remote.service.IAtvAudioProviderService");
        this.b.a.a = iInterfaceQueryLocalInterface instanceof IAtvAudioProviderService ? (IAtvAudioProviderService) iInterfaceQueryLocalInterface : new veh(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        componentName.getClass();
        this.b.a.a = null;
    }
}
