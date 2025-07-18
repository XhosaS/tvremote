package defpackage;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import com.google.android.tv.remote.service.DiscoveryService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bnq implements NsdManager.RegistrationListener {
    final /* synthetic */ DiscoveryService a;

    public bnq(DiscoveryService discoveryService) {
        this.a = discoveryService;
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public final void onRegistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
        ((cbs) DiscoveryService.a.g().j("com/google/android/tv/remote/service/DiscoveryService$NdsRegistrationListener", "onRegistrationFailed", 211, "DiscoveryService.java")).x("Failed to register (%d) %s", i, nsdServiceInfo);
        this.a.b = null;
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public final void onServiceRegistered(NsdServiceInfo nsdServiceInfo) {
        ((cbs) DiscoveryService.a.e().j("com/google/android/tv/remote/service/DiscoveryService$NdsRegistrationListener", "onServiceRegistered", 199, "DiscoveryService.java")).t("NDS Service registered: %s", nsdServiceInfo.getServiceName());
        this.a.b = nsdServiceInfo.getServiceName();
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public final void onServiceUnregistered(NsdServiceInfo nsdServiceInfo) {
        ((cbs) DiscoveryService.a.e().j("com/google/android/tv/remote/service/DiscoveryService$NdsRegistrationListener", "onServiceUnregistered", 205, "DiscoveryService.java")).t("NDS Service unregistered: %s", nsdServiceInfo.getServiceName());
        this.a.b = null;
    }

    @Override // android.net.nsd.NsdManager.RegistrationListener
    public final void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
        ((cbs) DiscoveryService.a.g().j("com/google/android/tv/remote/service/DiscoveryService$NdsRegistrationListener", "onUnregistrationFailed", 217, "DiscoveryService.java")).x("Failed to unregister (%d) %s", i, nsdServiceInfo);
        this.a.b = null;
    }
}
