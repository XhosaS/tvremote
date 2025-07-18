package defpackage;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.util.Pair;
import com.google.common.collect.Collections2;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tku implements NsdManager.ResolveListener {
    final /* synthetic */ tkv a;
    private boolean b;

    public tku(tkv tkvVar, boolean z) {
        this.a = tkvVar;
        this.b = z;
    }

    private final void a() {
        tkv tkvVar = this.a;
        ArrayDeque arrayDeque = tkvVar.c;
        if (arrayDeque.isEmpty()) {
            tkvVar.d = false;
            return;
        }
        Pair pair = (Pair) arrayDeque.remove();
        this.b = ((Boolean) pair.second).booleanValue();
        tkvVar.a.resolveService((NsdServiceInfo) pair.first, this);
    }

    @Override // android.net.nsd.NsdManager.ResolveListener
    public final void onResolveFailed(NsdServiceInfo nsdServiceInfo, int i) {
        if (this.a.e) {
            ((tug) ((tug) tkw.a.g()).j("com/google/android/tv/remote/support/discovery/SystemNsdAgent$NsdDiscoveryListener$NsdResolveListener", "onResolveFailed", 138, "SystemNsdAgent.java")).t("Service resolution has failed after service discovery was stopped: %d", i);
        } else {
            ((tug) ((tug) tkw.a.g()).j("com/google/android/tv/remote/support/discovery/SystemNsdAgent$NsdDiscoveryListener$NsdResolveListener", "onResolveFailed", 142, "SystemNsdAgent.java")).z("Service Resolve failed %s: %d", nsdServiceInfo, i);
            a();
        }
    }

    @Override // android.net.nsd.NsdManager.ResolveListener
    public final void onServiceResolved(NsdServiceInfo nsdServiceInfo) {
        tkv tkvVar = this.a;
        if (tkvVar.e) {
            tui tuiVar = tkw.a;
            if (((tug) tuiVar.b()).I()) {
                ((tug) ((tug) tuiVar.g()).j("com/google/android/tv/remote/support/discovery/SystemNsdAgent$NsdDiscoveryListener$NsdResolveListener", "onServiceResolved", 150, "SystemNsdAgent.java")).v("Service resolved after service discovery was stopped %s", nsdServiceInfo);
                return;
            }
            return;
        }
        tkx tkxVar = new tkx(nsdServiceInfo.getHost(), nsdServiceInfo.getPort(), nsdServiceInfo.getServiceType(), nsdServiceInfo.getServiceName(), Collections2.transform(nsdServiceInfo.getAttributes().entrySet(), new rke(18)));
        ((tug) ((tug) tkw.a.c()).j("com/google/android/tv/remote/support/discovery/SystemNsdAgent$NsdDiscoveryListener$NsdResolveListener", "onServiceResolved", 156, "SystemNsdAgent.java")).v("Service Resolved %s", tkxVar);
        if (this.b) {
            tkvVar.b.a(tkxVar);
        } else {
            tkvVar.b.b(tkxVar);
        }
        a();
    }
}
