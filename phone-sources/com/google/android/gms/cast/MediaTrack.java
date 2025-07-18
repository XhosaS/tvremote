package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.nld;
import defpackage.nrv;
import defpackage.ocg;
import defpackage.oct;
import defpackage.ocv;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class MediaTrack extends ocg implements ReflectedParcelable {
    public static final Parcelable.Creator<MediaTrack> CREATOR = new nld(8);
    public final long a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final List h;
    String i;
    public final JSONObject j;

    public MediaTrack(long j, int i, String str, String str2, String str3, String str4, int i2, List list, JSONObject jSONObject) {
        this.a = j;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = i2;
        this.h = list;
        this.j = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaTrack)) {
            return false;
        }
        MediaTrack mediaTrack = (MediaTrack) obj;
        JSONObject jSONObject = this.j;
        boolean z = jSONObject == null;
        JSONObject jSONObject2 = mediaTrack.j;
        if (z != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || oct.a(jSONObject, jSONObject2)) && this.a == mediaTrack.a && this.b == mediaTrack.b && nrv.i(this.c, mediaTrack.c) && nrv.i(this.d, mediaTrack.d) && nrv.i(this.e, mediaTrack.e) && nrv.i(this.f, mediaTrack.f) && this.g == mediaTrack.g && nrv.i(this.h, mediaTrack.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Integer.valueOf(this.b), this.c, this.d, this.e, this.f, Integer.valueOf(this.g), this.h, String.valueOf(this.j)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.j;
        this.i = jSONObject == null ? null : jSONObject.toString();
        int iV = ocv.v(parcel);
        ocv.C(parcel, 2, this.a);
        ocv.B(parcel, 3, this.b);
        ocv.O(parcel, 4, this.c);
        ocv.O(parcel, 5, this.d);
        ocv.O(parcel, 6, this.e);
        ocv.O(parcel, 7, this.f);
        ocv.B(parcel, 8, this.g);
        ocv.Q(parcel, 9, this.h);
        ocv.O(parcel, 10, this.i);
        ocv.x(parcel, iV);
    }
}
