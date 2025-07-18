package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ohn extends ocg {
    public static final Parcelable.Creator<ohn> CREATOR = new odt(7);
    public int a;
    public int b;
    public int c;
    public boolean d;

    private ohn() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ohn) {
            ohn ohnVar = (ohn) obj;
            if (a.Q(Integer.valueOf(this.a), Integer.valueOf(ohnVar.a)) && a.Q(Integer.valueOf(this.b), Integer.valueOf(ohnVar.b)) && a.Q(Integer.valueOf(this.c), Integer.valueOf(ohnVar.c)) && a.Q(Boolean.valueOf(this.d), Boolean.valueOf(ohnVar.d))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Boolean.valueOf(this.d)});
    }

    public final String toString() {
        return "UwbRangingData{rawDistance=" + this.a + ", rawAngleOfArrivalAzimuth=" + this.b + ", rawAngleOfArrivalPolar=" + this.c + ", isValidAngleOfArrivalData=" + this.d + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.B(parcel, 1, this.a);
        ocv.B(parcel, 2, this.b);
        ocv.B(parcel, 3, this.c);
        ocv.y(parcel, 4, this.d);
        ocv.x(parcel, iV);
    }

    public ohn(int i, int i2, int i3, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
    }
}
