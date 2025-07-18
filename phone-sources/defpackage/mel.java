package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.telephony.TelephonyManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mel implements mem {
    private ConnectivityManager a;
    private final xbw b;
    private volatile ids c;
    private final idb d = new krk(this, 7, null);
    private final idb e = new krk(this, 6, null);
    private TelephonyManager f;
    private final Context g;

    public mel(Context context, xbw xbwVar) {
        this.g = context;
        this.b = xbwVar;
    }

    private final ConnectivityManager i() {
        if (this.a == null) {
            this.a = (ConnectivityManager) this.g.getSystemService("connectivity");
        }
        return this.a;
    }

    private final synchronized ids j() {
        if (this.c == null) {
            this.c = new iem(this.g, "android.net.conn.CONNECTIVITY_CHANGE");
        }
        return this.c;
    }

    private final boolean k() {
        if (Build.VERSION.SDK_INT < 28) {
            return false;
        }
        vuj vujVar = ((xmg) this.b.b()).a().b;
        if (this.f == null) {
            this.f = (TelephonyManager) this.g.getSystemService("phone");
        }
        return vujVar.contains(Integer.valueOf(this.f.getSimCarrierId()));
    }

    private final int m() {
        NetworkCapabilities networkCapabilities;
        try {
            Network activeNetwork = i().getActiveNetwork();
            if (activeNetwork == null || (networkCapabilities = i().getNetworkCapabilities(activeNetwork)) == null) {
                return 1;
            }
            if (networkCapabilities.hasCapability(11)) {
                return 4;
            }
            return networkCapabilities.hasCapability(25) ? 3 : 2;
        } catch (SecurityException unused) {
            krd.c("SecurityException in gathering Network Metering Type for API>=30.");
            return 1;
        }
    }

    @Override // defpackage.mem
    public final idb a() {
        return this.e;
    }

    @Override // defpackage.mem
    public final idb b() {
        return this.d;
    }

    @Override // defpackage.mem
    public final boolean c() {
        return i().getNetworkInfo(0) != null;
    }

    @Override // defpackage.mem
    public final boolean d() {
        return g().j();
    }

    @Override // defpackage.mem
    public final boolean e() {
        xbw xbwVar = this.b;
        int iM = !((xmg) xbwVar.b()).b() ? 1 : Build.VERSION.SDK_INT >= 30 ? m() : true != i().isActiveNetworkMetered() ? 4 : 2;
        if (((xmg) xbwVar.b()).b()) {
            return iM == 4 || iM == 3;
        }
        return false;
    }

    @Override // defpackage.ids
    public final void ea(iej iejVar) {
        j().ea(iejVar);
    }

    @Override // defpackage.ids
    public final void ee(iej iejVar) {
        j().ee(iejVar);
    }

    @Override // defpackage.mem
    public final boolean f() {
        if (Build.VERSION.SDK_INT < 30 || !((xmg) this.b.b()).b()) {
            krd.e("UnmeteredMobileData. User API is lower then 30 or flag is not enabled.");
            return false;
        }
        int iM = m();
        krd.e("UnmeteredMobileData. Meteredness type is ".concat(jwq.L(iM)));
        boolean z = iM == 4 || iM == 3;
        krd.e("UnmeteredMobileData. Meteredness type = " + jwq.L(iM) + ", isItFastNetwork=" + g().h() + ", isCarrierIdEligible=" + k());
        return g().h() && z && k();
    }

    @Override // defpackage.mem
    public final xqr g() {
        return new xqr(i().getActiveNetworkInfo(), ((xmg) this.b.b()).b());
    }
}
