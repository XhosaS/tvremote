package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nwn extends ocg {
    public static final Parcelable.Creator<nwn> CREATOR = new nub(13);
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;

    public nwn(int i, int i2, int i3, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nwn)) {
            return false;
        }
        nwn nwnVar = (nwn) obj;
        return this.a == nwnVar.a && this.b == nwnVar.b && this.c == nwnVar.c && this.d == nwnVar.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Boolean.valueOf(this.d)});
    }

    public final String toString() {
        return "ComplianceOptions{callerProductId=" + this.a + ", dataOwnerProductId=" + this.b + ", processingReason=" + this.c + ", isUserData=" + this.d + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iV = ocv.v(parcel);
        ocv.B(parcel, 1, i2);
        ocv.B(parcel, 2, this.b);
        ocv.B(parcel, 3, this.c);
        ocv.y(parcel, 4, this.d);
        ocv.x(parcel, iV);
    }
}
