package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class okm extends ocg {
    public static final Parcelable.Creator<okm> CREATOR = new oee(17);
    public final float a;
    public final float b;
    public final float c;

    public okm(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof okm) {
            okm okmVar = (okm) obj;
            if (this.a == okmVar.a && this.b == okmVar.b && this.c == okmVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a), Float.valueOf(this.b), Float.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        float f = this.a;
        int iV = ocv.v(parcel);
        ocv.A(parcel, 1, f);
        ocv.A(parcel, 2, this.b);
        ocv.A(parcel, 3, this.c);
        ocv.x(parcel, iV);
    }
}
