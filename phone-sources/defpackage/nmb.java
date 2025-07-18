package defpackage;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nmb extends ocg {
    public static final Parcelable.Creator<nmb> CREATOR = new nld(9);
    public float a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public String i;
    public int j;
    public int k;
    String l;
    public JSONObject m;

    public nmb() {
        this(1.0f, 0, 0, -1, 0, -1, 0, 0, null, -1, -1, null);
    }

    public static final int a(String str) throws NumberFormatException {
        if (str != null && str.length() == 9 && str.charAt(0) == '#') {
            try {
                return Color.argb(Integer.parseInt(str.substring(7, 9), 16), Integer.parseInt(str.substring(1, 3), 16), Integer.parseInt(str.substring(3, 5), 16), Integer.parseInt(str.substring(5, 7), 16));
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    public static final String b(int i) {
        return String.format("#%02X%02X%02X%02X", Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Integer.valueOf(Color.alpha(i)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nmb)) {
            return false;
        }
        nmb nmbVar = (nmb) obj;
        JSONObject jSONObject = this.m;
        boolean z = jSONObject == null;
        JSONObject jSONObject2 = nmbVar.m;
        if (z != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || oct.a(jSONObject, jSONObject2)) && this.a == nmbVar.a && this.b == nmbVar.b && this.c == nmbVar.c && this.d == nmbVar.d && this.e == nmbVar.e && this.f == nmbVar.f && this.g == nmbVar.g && this.h == nmbVar.h && nrv.i(this.i, nmbVar.i) && this.j == nmbVar.j && this.k == nmbVar.k;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h), this.i, Integer.valueOf(this.j), Integer.valueOf(this.k), String.valueOf(this.m)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.m;
        this.l = jSONObject == null ? null : jSONObject.toString();
        int iV = ocv.v(parcel);
        ocv.A(parcel, 2, this.a);
        ocv.B(parcel, 3, this.b);
        ocv.B(parcel, 4, this.c);
        ocv.B(parcel, 5, this.d);
        ocv.B(parcel, 6, this.e);
        ocv.B(parcel, 7, this.f);
        ocv.B(parcel, 8, this.g);
        ocv.B(parcel, 9, this.h);
        ocv.O(parcel, 10, this.i);
        ocv.B(parcel, 11, this.j);
        ocv.B(parcel, 12, this.k);
        ocv.O(parcel, 13, this.l);
        ocv.x(parcel, iV);
    }

    public nmb(float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, String str, int i8, int i9, String str2) {
        this.a = f;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = str;
        this.j = i8;
        this.k = i9;
        this.l = str2;
        if (str2 == null) {
            this.m = null;
            return;
        }
        try {
            this.m = new JSONObject(this.l);
        } catch (JSONException unused) {
            this.m = null;
            this.l = null;
        }
    }
}
