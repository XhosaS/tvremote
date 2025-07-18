package defpackage;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.support.v7.appcompat.R;
import android.util.Pair;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tkv implements NsdManager.DiscoveryListener {
    public static final /* synthetic */ int f = 0;
    public final NsdManager a;
    public final tkq b;
    public final ArrayDeque c = new ArrayDeque();
    public boolean d;
    public boolean e;

    public tkv(NsdManager nsdManager, tkq tkqVar) {
        this.a = nsdManager;
        this.b = tkqVar;
    }

    private final void b(NsdServiceInfo nsdServiceInfo, boolean z) {
        if (this.d) {
            ((tug) ((tug) tkw.a.c()).j("com/google/android/tv/remote/support/discovery/SystemNsdAgent$NsdDiscoveryListener", "resolveService", R.styleable.AppCompatTheme_windowActionBarOverlay, "SystemNsdAgent.java")).v("Service is queued %s", nsdServiceInfo);
            this.c.add(Pair.create(nsdServiceInfo, Boolean.valueOf(z)));
        } else {
            this.d = true;
            this.a.resolveService(nsdServiceInfo, new tku(this, z));
        }
    }

    final void a() {
        this.e = true;
        this.a.stopServiceDiscovery(this);
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onDiscoveryStarted(String str) {
        ((tug) ((tug) tkw.a.b()).j("com/google/android/tv/remote/support/discovery/SystemNsdAgent$NsdDiscoveryListener", "onDiscoveryStarted", 83, "SystemNsdAgent.java")).v("onDiscoveryStarted %s", str);
        this.b.d();
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onDiscoveryStopped(String str) {
        ((tug) ((tug) tkw.a.b()).j("com/google/android/tv/remote/support/discovery/SystemNsdAgent$NsdDiscoveryListener", "onDiscoveryStopped", 89, "SystemNsdAgent.java")).v("onDiscoveryStarted %s", str);
        this.b.e();
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onServiceFound(NsdServiceInfo nsdServiceInfo) {
        ((tug) ((tug) tkw.a.c()).j("com/google/android/tv/remote/support/discovery/SystemNsdAgent$NsdDiscoveryListener", "onServiceFound", 95, "SystemNsdAgent.java")).v("onServiceFound %s", nsdServiceInfo);
        b(nsdServiceInfo, true);
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onServiceLost(NsdServiceInfo nsdServiceInfo) {
        ((tug) ((tug) tkw.a.c()).j("com/google/android/tv/remote/support/discovery/SystemNsdAgent$NsdDiscoveryListener", "onServiceLost", 101, "SystemNsdAgent.java")).v("onServiceLost %s", nsdServiceInfo);
        b(nsdServiceInfo, false);
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onStartDiscoveryFailed(String str, int i) {
        ((tug) ((tug) tkw.a.g()).j("com/google/android/tv/remote/support/discovery/SystemNsdAgent$NsdDiscoveryListener", "onStartDiscoveryFailed", 72, "SystemNsdAgent.java")).z("Start Discovery failed for service %s: %d", str, i);
        this.b.f();
    }

    @Override // android.net.nsd.NsdManager.DiscoveryListener
    public final void onStopDiscoveryFailed(String str, int i) {
        ((tug) ((tug) tkw.a.g()).j("com/google/android/tv/remote/support/discovery/SystemNsdAgent$NsdDiscoveryListener", "onStopDiscoveryFailed", 78, "SystemNsdAgent.java")).z("Stop Discovery failed for service %s: %d", str, i);
    }
}
