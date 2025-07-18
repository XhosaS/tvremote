package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.ocg;
import defpackage.ocv;
import defpackage.odt;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ClientAppContext extends ocg implements ReflectedParcelable {
    public static final Parcelable.Creator<ClientAppContext> CREATOR = new odt(19);
    final int a;
    public final String b;
    public final String c;
    public final boolean d;

    @Deprecated
    public final int e;
    public final String f;

    public ClientAppContext(int i, String str, String str2, boolean z, int i2, String str3) {
        this.a = i;
        ocv.aF(str);
        this.b = str;
        if (str2 != null && !str2.isEmpty() && !str2.startsWith("0p:")) {
            Log.w("NearbyMessages", String.format(Locale.US, "ClientAppContext: 0P identifier(%s) without 0P prefix(%s)", str2, "0p:"));
            str2 = "0p:".concat(str2);
        }
        this.c = str2;
        this.d = z;
        this.e = i2;
        this.f = str3;
    }

    private static boolean a(String str, String str2) {
        return TextUtils.isEmpty(str) ? TextUtils.isEmpty(str2) : str.equals(str2);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClientAppContext)) {
            return false;
        }
        ClientAppContext clientAppContext = (ClientAppContext) obj;
        return a(this.b, clientAppContext.b) && a(this.c, clientAppContext.c) && this.d == clientAppContext.d && a(this.f, clientAppContext.f) && this.e == clientAppContext.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, Boolean.valueOf(this.d), this.f, Integer.valueOf(this.e)});
    }

    public final String toString() {
        return String.format(Locale.US, "{realClientPackageName: %s, zeroPartyIdentifier: %s, useRealClientApiKey: %b, apiKey: %s, callingContext: %d}", this.b, this.c, Boolean.valueOf(this.d), this.f, Integer.valueOf(this.e));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.B(parcel, 1, this.a);
        ocv.O(parcel, 2, this.b);
        ocv.O(parcel, 3, this.c);
        ocv.y(parcel, 4, this.d);
        ocv.B(parcel, 5, this.e);
        ocv.O(parcel, 6, this.f);
        ocv.x(parcel, iV);
    }

    public ClientAppContext(String str, int i) {
        this(1, str, null, false, i, null);
    }
}
