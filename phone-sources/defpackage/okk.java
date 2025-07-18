package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class okk extends ocg {
    public static final Parcelable.Creator<okk> CREATOR = new oee(15);
    public final String a;
    public final List b;
    public final long c;

    public okk(String str, List list, long j) {
        this.a = str;
        this.b = list;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            okk okkVar = (okk) obj;
            if (a.Q(this.a, okkVar.a) && a.Q(this.b, okkVar.b) && this.c == okkVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Long.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iV = ocv.v(parcel);
        ocv.O(parcel, 1, str);
        ocv.L(parcel, 2, this.b);
        ocv.C(parcel, 3, this.c);
        ocv.x(parcel, iV);
    }
}
