package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nmd extends ocg {
    public static final Parcelable.Creator<nmd> CREATOR;
    public final int a;
    public final int b;
    public final int c;

    static {
        new nsf("VideoInfo");
        CREATOR = new nld(11);
    }

    public nmd(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nmd)) {
            return false;
        }
        nmd nmdVar = (nmd) obj;
        return this.b == nmdVar.b && this.a == nmdVar.a && this.c == nmdVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.a), Integer.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.B(parcel, 2, this.a);
        ocv.B(parcel, 3, this.b);
        ocv.B(parcel, 4, this.c);
        ocv.x(parcel, iV);
    }
}
