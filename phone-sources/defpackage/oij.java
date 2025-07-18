package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oij extends ocg {
    public static final Parcelable.Creator<oij> CREATOR = new odt(17);
    public long a;
    public Uri b;
    public String c;

    public oij() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof oij) {
            oij oijVar = (oij) obj;
            if (a.Q(Long.valueOf(this.a), Long.valueOf(oijVar.a)) && a.Q(this.b, oijVar.b) && a.Q(this.c, oijVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.C(parcel, 1, this.a);
        ocv.N(parcel, 2, this.b, i);
        ocv.O(parcel, 3, this.c);
        ocv.x(parcel, iV);
    }

    public oij(long j, Uri uri, String str) {
        this.a = j;
        this.b = uri;
        this.c = str;
    }
}
