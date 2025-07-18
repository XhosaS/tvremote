package com.google.android.gms.cast;

import android.net.Network;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.nko;
import defpackage.nru;
import defpackage.nrv;
import defpackage.ocg;
import defpackage.ocv;
import defpackage.sew;
import j$.util.DesugarCollections;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CastDevice extends ocg implements ReflectedParcelable {
    public static final Parcelable.Creator<CastDevice> CREATOR = new nko();
    public final String a;
    final String b;
    public InetAddress c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final int h;
    public final String i;
    public final String j;
    public final int k;
    public final String l;
    public final byte[] m;
    public final String n;
    public final boolean o;
    public final Integer p;
    final Boolean q;
    final Network r;
    private final List s;
    private final nru t;
    private final sew u;

    public CastDevice(String str, String str2, String str3, String str4, String str5, int i, List list, int i2, int i3, String str6, String str7, int i4, String str8, byte[] bArr, String str9, boolean z, nru nruVar, Integer num, Boolean bool, Network network) {
        this.a = l(str);
        String strL = l(str2);
        this.b = strL;
        if (!TextUtils.isEmpty(strL)) {
            try {
                this.c = InetAddress.getByName(strL);
            } catch (UnknownHostException e) {
                e.getMessage();
            }
        }
        this.d = l(str3);
        this.e = l(str4);
        this.f = l(str5);
        this.g = i;
        this.s = list == null ? new ArrayList() : list;
        this.h = i3;
        this.i = l(str6);
        this.j = str7;
        this.k = i4;
        this.l = str8;
        this.m = bArr;
        this.n = str9;
        this.o = z;
        this.t = nruVar;
        this.p = num;
        this.q = bool;
        this.r = network;
        this.u = new sew(i2, null, null);
    }

    public static CastDevice c(Bundle bundle) {
        ClassLoader classLoader;
        if (bundle == null || (classLoader = CastDevice.class.getClassLoader()) == null) {
            return null;
        }
        bundle.setClassLoader(classLoader);
        return (CastDevice) bundle.getParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE");
    }

    private static String l(String str) {
        return str == null ? "" : str;
    }

    public final int a() {
        return this.u.a;
    }

    public final int b() {
        if (h()) {
            return 4;
        }
        if (i()) {
            return 3;
        }
        if (j()) {
            return 5;
        }
        return g(1) ? 2 : 1;
    }

    public final nru d() {
        nru nruVar = this.t;
        return (nruVar == null && j()) ? new nru(1, false, false, null, null, null, null, null, false, false) : nruVar;
    }

    public final String e() {
        String str = this.a;
        return str.startsWith("__cast_nearby__") ? str.substring(16) : str;
    }

    public final boolean equals(Object obj) {
        int i;
        int i2;
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CastDevice)) {
            return false;
        }
        CastDevice castDevice = (CastDevice) obj;
        if (nrv.i(this.a, castDevice.a) && nrv.i(this.c, castDevice.c) && nrv.i(this.e, castDevice.e) && nrv.i(this.d, castDevice.d)) {
            String str = this.f;
            String str2 = castDevice.f;
            if (nrv.i(str, str2) && (i = this.g) == (i2 = castDevice.g) && nrv.i(this.s, castDevice.s) && a() == castDevice.a() && this.h == castDevice.h && nrv.i(this.i, castDevice.i) && nrv.i(Integer.valueOf(this.k), Integer.valueOf(castDevice.k)) && nrv.i(this.l, castDevice.l) && nrv.i(this.j, castDevice.j) && nrv.i(str, str2) && i == i2 && ((((bArr = this.m) == null && castDevice.m == null) || Arrays.equals(bArr, castDevice.m)) && nrv.i(this.n, castDevice.n) && this.o == castDevice.o && nrv.i(d(), castDevice.d()))) {
                if (nrv.i(Boolean.valueOf(k()), Boolean.valueOf(castDevice.k() && nrv.i(this.r, castDevice.r)))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void f(Bundle bundle) {
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", this);
    }

    public final boolean g(int i) {
        return this.u.c(i);
    }

    public final boolean h() {
        return this.u.d();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final boolean i() {
        return this.u.e();
    }

    public final boolean j() {
        sew sewVar = this.u;
        return sewVar.e() || sewVar.f();
    }

    public final boolean k() {
        Boolean bool = this.q;
        if (bool != null) {
            return bool.booleanValue();
        }
        int i = this.h;
        return i != -1 && (i & 2) > 0;
    }

    public final String toString() {
        String strConcat = h() ? "[dynamic group]" : i() ? "[static group]" : j() ? "[speaker pair]" : "";
        if (this.u.c(262144)) {
            strConcat = strConcat.concat("[cast connect]");
        }
        return String.format(Locale.ROOT, "\"%s\" (%s) %s", nrv.d(this.d), this.a, strConcat);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iV = ocv.v(parcel);
        ocv.O(parcel, 2, str);
        ocv.O(parcel, 3, this.b);
        ocv.O(parcel, 4, this.d);
        ocv.O(parcel, 5, this.e);
        ocv.O(parcel, 6, this.f);
        ocv.B(parcel, 7, this.g);
        ocv.S(parcel, 8, DesugarCollections.unmodifiableList(this.s));
        ocv.B(parcel, 9, a());
        ocv.B(parcel, 10, this.h);
        ocv.O(parcel, 11, this.i);
        ocv.O(parcel, 12, this.j);
        ocv.B(parcel, 13, this.k);
        ocv.O(parcel, 14, this.l);
        ocv.F(parcel, 15, this.m);
        ocv.O(parcel, 16, this.n);
        ocv.y(parcel, 17, this.o);
        ocv.N(parcel, 18, d(), i);
        ocv.J(parcel, 19, this.p);
        ocv.D(parcel, 20, Boolean.valueOf(k()));
        ocv.N(parcel, 21, this.r, i);
        ocv.x(parcel, iV);
    }
}
