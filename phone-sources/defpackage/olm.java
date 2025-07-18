package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class olm extends ocg implements Parcelable {
    public static final Parcelable.Creator<olm> CREATOR = new oeg(10);
    public final olo a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public olm(olo oloVar, String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = oloVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof olm)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        olm olmVar = (olm) obj;
        return a.Q(this.a, olmVar.a) && a.Q(this.b, olmVar.b) && a.Q(this.c, olmVar.c) && a.Q(this.d, olmVar.d) && a.Q(this.e, olmVar.e) && a.Q(this.f, olmVar.f) && a.Q(this.g, olmVar.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        olo oloVar = this.a;
        int iV = ocv.v(parcel);
        ocv.N(parcel, 2, oloVar, i);
        ocv.O(parcel, 3, this.b);
        ocv.O(parcel, 4, this.g);
        ocv.O(parcel, 5, this.d);
        ocv.O(parcel, 6, this.e);
        ocv.O(parcel, 7, this.f);
        ocv.O(parcel, 17, this.c);
        ocv.x(parcel, iV);
    }
}
