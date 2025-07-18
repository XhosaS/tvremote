package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oho extends ocg {
    public static final Parcelable.Creator<oho> CREATOR = new odt(8);
    public final String a;
    public final List b;

    public oho(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof oho) {
            oho ohoVar = (oho) obj;
            if (a.Q(this.a, ohoVar.a) && a.Q(this.b, ohoVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b});
    }

    public final String toString() {
        return String.format("DctDevice:<endpointId: %s, deviceDataElements: %s>", this.a, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iV = ocv.v(parcel);
        ocv.O(parcel, 1, str);
        ocv.S(parcel, 2, this.b);
        ocv.x(parcel, iV);
    }
}
