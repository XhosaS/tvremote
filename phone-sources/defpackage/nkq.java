package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nkq extends ocg {
    public static final Parcelable.Creator<nkq> CREATOR = new nhv(18);
    public final float a;
    public final float b;
    public final float c;

    public nkq(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nkq)) {
            return false;
        }
        nkq nkqVar = (nkq) obj;
        return this.a == nkqVar.a && this.b == nkqVar.b && this.c == nkqVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a), Float.valueOf(this.b), Float.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        float f = this.a;
        int iV = ocv.v(parcel);
        ocv.A(parcel, 2, f);
        ocv.A(parcel, 3, this.b);
        ocv.A(parcel, 4, this.c);
        ocv.x(parcel, iV);
    }
}
