package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class okr extends ocg {
    public static final Parcelable.Creator<okr> CREATOR = new oeg(2);
    public final okp a;
    public final int b;
    public final Uri c;
    public final String d;
    public final oko e;

    public okr(okp okpVar, int i, Uri uri, String str, oko okoVar) {
        this.a = okpVar;
        this.b = i;
        this.c = uri;
        this.d = str;
        this.e = okoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof okr) {
            okr okrVar = (okr) obj;
            if (a.Q(this.a, okrVar.a) && this.b == okrVar.b && a.Q(this.c, okrVar.c) && a.Q(this.d, okrVar.d) && a.Q(this.e, okrVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c, this.d, this.e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        okp okpVar = this.a;
        int iV = ocv.v(parcel);
        ocv.N(parcel, 1, okpVar, i);
        ocv.B(parcel, 2, this.b);
        ocv.N(parcel, 3, this.c, i);
        ocv.O(parcel, 4, this.d);
        ocv.N(parcel, 5, this.e, i);
        ocv.x(parcel, iV);
    }
}
