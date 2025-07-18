package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eur implements Parcelable {
    public static final Parcelable.Creator<eur> CREATOR = new dyy(6);
    public final int a;

    public eur(int i) {
        this.a = (i & 2) != 0 ? i | 1 : i;
    }

    public final int a(Context context) {
        Intent intentRegisterReceiver;
        int intExtra;
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        int i = 0;
        if (e()) {
            Object systemService = context.getSystemService("connectivity");
            systemService.getClass();
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected() || (activeNetwork = connectivityManager.getActiveNetwork()) == null) {
                i = this.a & 3;
            } else {
                try {
                    networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                } catch (SecurityException unused) {
                }
                if (networkCapabilities != null) {
                    if (networkCapabilities.hasCapability(16)) {
                        if (g() && connectivityManager.isActiveNetworkMetered()) {
                            i = 2;
                        }
                    }
                }
                i = this.a & 3;
            }
        }
        if (c() && ((intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"))) == null || ((intExtra = intentRegisterReceiver.getIntExtra("status", -1)) != 2 && intExtra != 5))) {
            i |= 8;
        }
        if (d()) {
            Object systemService2 = context.getSystemService("power");
            systemService2.getClass();
            if (!((PowerManager) systemService2).isDeviceIdleMode()) {
                i |= 4;
            }
        }
        return (!f() || context.registerReceiver(null, new IntentFilter("android.intent.action.DEVICE_STORAGE_LOW")) == null) ? i : i | 16;
    }

    public final eur b(int i) {
        int i2 = this.a;
        int i3 = i & i2;
        return i3 == i2 ? this : new eur(i3);
    }

    public final boolean c() {
        return (this.a & 8) != 0;
    }

    public final boolean d() {
        return (this.a & 4) != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return (this.a & 1) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.a == ((eur) obj).a;
    }

    public final boolean f() {
        return (this.a & 16) != 0;
    }

    public final boolean g() {
        return (this.a & 2) != 0;
    }

    public final int hashCode() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}
