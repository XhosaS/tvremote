package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nmc extends ocg {
    public static final Parcelable.Creator<nmc> CREATOR = new nld(10);
    public final String a;
    public final String b;

    public nmc(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static nmc a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new nmc(nrv.e(jSONObject, "adTagUrl"), nrv.e(jSONObject, "adsResponse"));
    }

    public final JSONObject b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.a;
            if (str != null) {
                jSONObject.put("adTagUrl", str);
            }
            String str2 = this.b;
            if (str2 != null) {
                jSONObject.put("adsResponse", str2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nmc)) {
            return false;
        }
        nmc nmcVar = (nmc) obj;
        return nrv.i(this.a, nmcVar.a) && nrv.i(this.b, nmcVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iV = ocv.v(parcel);
        ocv.O(parcel, 2, str);
        ocv.O(parcel, 3, this.b);
        ocv.x(parcel, iV);
    }
}
