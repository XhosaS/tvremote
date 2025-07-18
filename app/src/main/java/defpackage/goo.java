package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.tv.remote.service.IAtvSearchAssistantService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class goo implements ServiceConnection {
    final /* synthetic */ gor a;
    final /* synthetic */ agum b;

    public goo(gor gorVar, agum agumVar) {
        this.a = gorVar;
        this.b = agumVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        IAtvSearchAssistantService veiVar;
        try {
            gor gorVar = this.a;
            if (iBinder == null) {
                veiVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.tv.remote.service.IAtvSearchAssistantService");
                veiVar = iInterfaceQueryLocalInterface instanceof IAtvSearchAssistantService ? (IAtvSearchAssistantService) iInterfaceQueryLocalInterface : new vei(iBinder);
            }
            gorVar.b = veiVar;
        } catch (ClassCastException e) {
            ((zdv) ((zdv) gor.a.c()).p(e).q("com/google/android/apps/tvsearch/media/control/keycodeinjector/KeyCodeInjectorImpl$connectToAtvSearchAssistantServiceAndRun$remoteServiceConnection$1", "onServiceConnected", 91, "KeyCodeInjectorImpl.kt")).u("ATV Search Assistant Service interface failure");
        }
        this.b.a();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.b = null;
    }
}
