package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oib extends ocg {
    public static final Parcelable.Creator<oib> CREATOR = new odt(14);
    public int a;

    private oib() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof oib) {
            return a.Q(Integer.valueOf(this.a), Integer.valueOf(((oib) obj).a));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.B(parcel, 1, this.a);
        ocv.x(parcel, iV);
    }

    public oib(int i) {
        this.a = i;
    }
}
