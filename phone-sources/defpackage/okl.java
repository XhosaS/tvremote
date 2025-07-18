package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class okl extends ocg {
    public static final Parcelable.Creator<okl> CREATOR = new oee(16);
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final int g;
    public final int h;
    public final float i;

    public okl(float f, float f2, float f3, float f4, float f5, float f6, int i, int i2, float f7) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = i;
        this.h = i2;
        this.i = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof okl) {
            okl oklVar = (okl) obj;
            if (this.a == oklVar.a && this.b == oklVar.b && this.c == oklVar.c && this.d == oklVar.d && this.e == oklVar.e && this.f == oklVar.f && this.g == oklVar.g && this.h == oklVar.h && this.i == oklVar.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a), Float.valueOf(this.b), Float.valueOf(this.c), Float.valueOf(this.d), Float.valueOf(this.e), Float.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(this.h), Float.valueOf(this.i)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        float f = this.a;
        int iV = ocv.v(parcel);
        ocv.A(parcel, 1, f);
        ocv.A(parcel, 2, this.b);
        ocv.A(parcel, 3, this.c);
        ocv.A(parcel, 4, this.d);
        ocv.A(parcel, 5, this.e);
        ocv.A(parcel, 6, this.f);
        ocv.B(parcel, 7, this.g);
        ocv.B(parcel, 8, this.h);
        ocv.A(parcel, 9, this.i);
        ocv.x(parcel, iV);
    }
}
