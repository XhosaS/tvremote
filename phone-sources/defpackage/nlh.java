package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.Arrays;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nlh extends ocg {
    public final MediaInfo b;
    public final nlk c;
    public final Boolean d;
    public final long e;
    public final double f;
    public final long[] g;
    String h;
    public final JSONObject i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final long n;
    public static final nsf a = new nsf("MediaLoadRequestData");
    public static final Parcelable.Creator<nlh> CREATOR = new nld(3);

    public nlh(MediaInfo mediaInfo, nlk nlkVar, Boolean bool, long j, double d, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j2) {
        this.b = mediaInfo;
        this.c = nlkVar;
        this.d = bool;
        this.e = j;
        this.f = d;
        this.g = jArr;
        this.i = jSONObject;
        this.j = str;
        this.k = str2;
        this.l = str3;
        this.m = str4;
        this.n = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nlh)) {
            return false;
        }
        nlh nlhVar = (nlh) obj;
        return oct.a(this.i, nlhVar.i) && a.Q(this.b, nlhVar.b) && a.Q(this.c, nlhVar.c) && a.Q(this.d, nlhVar.d) && this.e == nlhVar.e && this.f == nlhVar.f && Arrays.equals(this.g, nlhVar.g) && a.Q(this.j, nlhVar.j) && a.Q(this.k, nlhVar.k) && a.Q(this.l, nlhVar.l) && a.Q(this.m, nlhVar.m) && this.n == nlhVar.n;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, Long.valueOf(this.e), Double.valueOf(this.f), this.g, String.valueOf(this.i), this.j, this.k, this.l, this.m, Long.valueOf(this.n)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        JSONObject jSONObject = this.i;
        this.h = jSONObject == null ? null : jSONObject.toString();
        int iV = ocv.v(parcel);
        ocv.N(parcel, 2, this.b, i);
        ocv.N(parcel, 3, this.c, i);
        ocv.D(parcel, 4, this.d);
        ocv.C(parcel, 5, this.e);
        ocv.z(parcel, 6, this.f);
        ocv.K(parcel, 7, this.g);
        ocv.O(parcel, 8, this.h);
        ocv.O(parcel, 9, this.j);
        ocv.O(parcel, 10, this.k);
        ocv.O(parcel, 11, this.l);
        ocv.O(parcel, 12, this.m);
        ocv.C(parcel, 13, this.n);
        ocv.x(parcel, iV);
    }
}
