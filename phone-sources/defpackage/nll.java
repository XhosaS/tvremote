package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nll extends ocg {
    public static final Parcelable.Creator<nll> CREATOR = new nld(7);
    public MediaInfo a;
    public int b;
    public boolean c;
    public double d;
    public double e;
    public double f;
    public long[] g;
    String h;
    public JSONObject i;

    public nll(MediaInfo mediaInfo, int i, boolean z, double d, double d2, double d3, long[] jArr, String str) {
        this.a = mediaInfo;
        this.b = i;
        this.c = z;
        this.d = d;
        this.e = d2;
        this.f = d3;
        this.g = jArr;
        this.h = str;
        if (str == null) {
            this.i = null;
            return;
        }
        try {
            this.i = new JSONObject(this.h);
        } catch (JSONException unused) {
            this.i = null;
            this.h = null;
        }
    }

    public final boolean a(JSONObject jSONObject) throws JSONException {
        boolean z;
        long[] jArr;
        boolean z2;
        int i;
        boolean z3 = false;
        if (jSONObject.has("media")) {
            this.a = new MediaInfo(jSONObject.getJSONObject("media"));
            z = true;
        } else {
            z = false;
        }
        if (jSONObject.has("itemId") && this.b != (i = jSONObject.getInt("itemId"))) {
            this.b = i;
            z = true;
        }
        if (jSONObject.has("autoplay") && this.c != (z2 = jSONObject.getBoolean("autoplay"))) {
            this.c = z2;
            z = true;
        }
        double dOptDouble = jSONObject.optDouble("startTime");
        if (Double.isNaN(dOptDouble) != Double.isNaN(this.d) || (!Double.isNaN(dOptDouble) && Math.abs(dOptDouble - this.d) > 1.0E-7d)) {
            this.d = dOptDouble;
            z = true;
        }
        if (jSONObject.has("playbackDuration")) {
            double d = jSONObject.getDouble("playbackDuration");
            if (Math.abs(d - this.e) > 1.0E-7d) {
                this.e = d;
                z = true;
            }
        }
        if (jSONObject.has("preloadTime")) {
            double d2 = jSONObject.getDouble("preloadTime");
            if (Math.abs(d2 - this.f) > 1.0E-7d) {
                this.f = d2;
                z = true;
            }
        }
        if (jSONObject.has("activeTrackIds")) {
            JSONArray jSONArray = jSONObject.getJSONArray("activeTrackIds");
            int length = jSONArray.length();
            jArr = new long[length];
            for (int i2 = 0; i2 < length; i2++) {
                jArr[i2] = jSONArray.getLong(i2);
            }
            long[] jArr2 = this.g;
            if (jArr2 == null || jArr2.length != length) {
                z3 = true;
                break;
            }
            for (int i3 = 0; i3 < length; i3++) {
                if (this.g[i3] != jArr[i3]) {
                    z3 = true;
                    break;
                }
            }
        } else {
            jArr = null;
        }
        if (z3) {
            this.g = jArr;
            z = true;
        }
        if (!jSONObject.has("customData")) {
            return z;
        }
        this.i = jSONObject.getJSONObject("customData");
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nll)) {
            return false;
        }
        nll nllVar = (nll) obj;
        JSONObject jSONObject = this.i;
        boolean z = jSONObject == null;
        JSONObject jSONObject2 = nllVar.i;
        if (z != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || oct.a(jSONObject, jSONObject2)) && nrv.i(this.a, nllVar.a) && this.b == nllVar.b && this.c == nllVar.c && ((Double.isNaN(this.d) && Double.isNaN(nllVar.d)) || this.d == nllVar.d) && this.e == nllVar.e && this.f == nllVar.f && Arrays.equals(this.g, nllVar.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Boolean.valueOf(this.c), Double.valueOf(this.d), Double.valueOf(this.e), Double.valueOf(this.f), Integer.valueOf(Arrays.hashCode(this.g)), String.valueOf(this.i)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.i;
        this.h = jSONObject == null ? null : jSONObject.toString();
        int iV = ocv.v(parcel);
        ocv.N(parcel, 2, this.a, i);
        ocv.B(parcel, 3, this.b);
        ocv.y(parcel, 4, this.c);
        ocv.z(parcel, 5, this.d);
        ocv.z(parcel, 6, this.e);
        ocv.z(parcel, 7, this.f);
        ocv.K(parcel, 8, this.g);
        ocv.O(parcel, 9, this.h);
        ocv.x(parcel, iV);
    }

    public nll(JSONObject jSONObject) throws JSONException {
        this(null, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        a(jSONObject);
    }
}
