package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.nld;
import defpackage.nrv;
import defpackage.ocg;
import defpackage.ocv;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MediaError extends ocg implements ReflectedParcelable {
    public static final Parcelable.Creator<MediaError> CREATOR = new nld(0);
    public final String a;
    public final long b;
    public final Integer c;
    public final String d;
    String e;
    private final JSONObject f;

    public MediaError(String str, long j, Integer num, String str2, JSONObject jSONObject) {
        this.a = str;
        this.b = j;
        this.c = num;
        this.d = str2;
        this.f = jSONObject;
    }

    public static MediaError a(JSONObject jSONObject) {
        return new MediaError(jSONObject.optString("type", "ERROR"), jSONObject.optLong("requestId"), jSONObject.has("detailedErrorCode") ? Integer.valueOf(jSONObject.optInt("detailedErrorCode")) : null, nrv.e(jSONObject, "reason"), jSONObject.has("customData") ? jSONObject.optJSONObject("customData") : null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.f;
        this.e = jSONObject == null ? null : jSONObject.toString();
        int iV = ocv.v(parcel);
        ocv.O(parcel, 2, this.a);
        ocv.C(parcel, 3, this.b);
        ocv.J(parcel, 4, this.c);
        ocv.O(parcel, 5, this.d);
        ocv.O(parcel, 6, this.e);
        ocv.x(parcel, iV);
    }
}
