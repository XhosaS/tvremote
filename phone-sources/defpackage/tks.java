package defpackage;

import android.content.Context;
import android.net.NetworkRequest;
import android.support.v7.appcompat.R;
import java.net.InetAddress;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tks extends tkr {
    public static final tui a = tui.l("com/google/android/tv/remote/support/discovery/LegacyNsdAgent");
    private final String b = "_androidtvremote2._tcp.local.";
    private final tlf c;
    private ulp d;

    public tks(Context context) {
        this.c = new tlf(context);
    }

    public static tkx c(tli tliVar) {
        return new tkx((InetAddress) tliVar.a, tliVar.d, tliVar.b, tliVar.c, tliVar.e);
    }

    @Override // defpackage.tkr
    public final void a(tkq tkqVar) {
        tui tuiVar = a;
        ((tug) ((tug) tuiVar.b()).j("com/google/android/tv/remote/support/discovery/LegacyNsdAgent", "startDiscovery", 99, "LegacyNsdAgent.java")).B("Starting discovery for service type %s with listener %s", this.b, tkqVar);
        if (this.d != null) {
            b();
        }
        this.d = new ulp(tkqVar, (byte[]) null);
        tug tugVar = (tug) ((tug) tuiVar.b()).j("com/google/android/tv/remote/support/discovery/LegacyNsdAgent", "startDiscovery", R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, "LegacyNsdAgent.java");
        tlf tlfVar = this.c;
        tugVar.v("Starting scanner %s", tlfVar);
        ulp ulpVar = this.d;
        List list = tlfVar.c;
        synchronized (list) {
            if (list.contains(ulpVar)) {
                throw new IllegalArgumentException("the same listener cannot be added twice");
            }
            list.add(ulpVar);
        }
        if (tlfVar.g) {
            return;
        }
        tlfVar.g = true;
        if (tlfVar.e != 1) {
            tlfVar.e = 1;
            for (ulp ulpVar2 : tlfVar.a()) {
                ((tug) ((tug) tuiVar.b()).j("com/google/android/tv/remote/support/discovery/LegacyNsdAgent$LegacyListener", "onScanStateChanged", 35, "LegacyNsdAgent.java")).s("Scan started");
                ((tkq) ulpVar2.a).d();
            }
        }
        if (tlfVar.f == null) {
            tlfVar.f = new tky(tlfVar);
            tlfVar.a.registerNetworkCallback(new NetworkRequest.Builder().addTransportType(3).addTransportType(1).build(), tlfVar.f);
            tlfVar.d = tkz.h();
        }
        tlfVar.d();
    }

    @Override // defpackage.tkr
    public final void b() {
        ((tug) ((tug) a.b()).j("com/google/android/tv/remote/support/discovery/LegacyNsdAgent", "stopDiscovery", R.styleable.AppCompatTheme_tooltipForegroundColor, "LegacyNsdAgent.java")).s("Stopping discovery");
        if (this.d != null) {
            tlf tlfVar = this.c;
            if (tlfVar.g) {
                tky tkyVar = tlfVar.f;
                if (tkyVar != null) {
                    tlfVar.a.unregisterNetworkCallback(tkyVar);
                    tlfVar.f = null;
                    tlfVar.d = null;
                }
                tlfVar.f();
                tlfVar.g = false;
            }
            ulp ulpVar = this.d;
            List list = tlfVar.c;
            synchronized (list) {
                list.remove(ulpVar);
            }
            this.c.b();
            this.d = null;
        }
    }
}
