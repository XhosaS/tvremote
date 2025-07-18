package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oig extends ocg {
    public static final Parcelable.Creator<oig> CREATOR = new odt(16);
    public String a;
    public oid b;

    public oig() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof oig) {
            oig oigVar = (oig) obj;
            if (a.Q(this.a, oigVar.a) && a.Q(this.b, oigVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.O(parcel, 1, this.a);
        ocv.N(parcel, 2, this.b, i);
        ocv.x(parcel, iV);
    }

    public oig(String str, oid oidVar) {
        this.a = str;
        this.b = oidVar;
    }
}
