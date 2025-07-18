package defpackage;

import android.content.Context;
import android.net.nsd.NsdManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tkw extends tkr {
    public static final tui a = tui.l("com/google/android/tv/remote/support/discovery/SystemNsdAgent");
    private final NsdManager b;
    private final String c = "_androidtvremote2._tcp.";
    private tkv d;

    public tkw(Context context) {
        this.b = (NsdManager) context.getSystemService("servicediscovery");
    }

    @Override // defpackage.tkr
    public final void a(tkq tkqVar) {
        ((tug) ((tug) a.b()).j("com/google/android/tv/remote/support/discovery/SystemNsdAgent", "startDiscovery", 30, "SystemNsdAgent.java")).v("startDiscovery %s", this.c);
        tkv tkvVar = this.d;
        if (tkvVar != null) {
            tkvVar.a();
        }
        tkv tkvVar2 = new tkv(this.b, tkqVar);
        this.d = tkvVar2;
        tkvVar2.a.discoverServices("_androidtvremote2._tcp.", 1, tkvVar2);
    }

    @Override // defpackage.tkr
    public final void b() {
        ((tug) ((tug) a.b()).j("com/google/android/tv/remote/support/discovery/SystemNsdAgent", "stopDiscovery", 40, "SystemNsdAgent.java")).s("stopDiscovery");
        tkv tkvVar = this.d;
        if (tkvVar != null) {
            tkvVar.a();
            this.d = null;
        }
    }
}
