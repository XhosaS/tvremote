package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class njw extends ocg {
    public static final Parcelable.Creator<njw> CREATOR = new nhv(13);
    public final String a;
    public final String b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;
    public String g;
    public final String h;
    public final String i;
    public final long j;
    public final String k;
    public final nmc l;
    public JSONObject m;

    public njw(String str, String str2, long j, String str3, String str4, String str5, String str6, String str7, String str8, long j2, String str9, nmc nmcVar) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = j2;
        this.k = str9;
        this.l = nmcVar;
        if (TextUtils.isEmpty(str6)) {
            this.m = new JSONObject();
            return;
        }
        try {
            this.m = new JSONObject(this.g);
        } catch (JSONException e) {
            Log.w("AdBreakClipInfo", String.format(Locale.ROOT, "Error creating AdBreakClipInfo: %s", e.getMessage()));
            this.g = null;
            this.m = new JSONObject();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof njw)) {
            return false;
        }
        njw njwVar = (njw) obj;
        return nrv.i(this.a, njwVar.a) && nrv.i(this.b, njwVar.b) && this.c == njwVar.c && nrv.i(this.d, njwVar.d) && nrv.i(this.e, njwVar.e) && nrv.i(this.f, njwVar.f) && nrv.i(this.g, njwVar.g) && nrv.i(this.h, njwVar.h) && nrv.i(this.i, njwVar.i) && this.j == njwVar.j && nrv.i(this.k, njwVar.k) && nrv.i(this.l, njwVar.l);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Long.valueOf(this.c), this.d, this.e, this.f, this.g, this.h, this.i, Long.valueOf(this.j), this.k, this.l});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iV = ocv.v(parcel);
        ocv.O(parcel, 2, str);
        ocv.O(parcel, 3, this.b);
        ocv.C(parcel, 4, this.c);
        ocv.O(parcel, 5, this.d);
        ocv.O(parcel, 6, this.e);
        ocv.O(parcel, 7, this.f);
        ocv.O(parcel, 8, this.g);
        ocv.O(parcel, 9, this.h);
        ocv.O(parcel, 10, this.i);
        ocv.C(parcel, 11, this.j);
        ocv.O(parcel, 12, this.k);
        ocv.N(parcel, 13, this.l, i);
        ocv.x(parcel, iV);
    }
}
