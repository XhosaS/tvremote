package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nuj extends ocg {
    public static final Parcelable.Creator<nuj> CREATOR = new nub(3);
    public final boolean a;

    public nuj(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nuj) && this.a == ((nuj) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a)});
    }

    public final String toString() {
        return "LogVerifierResultParcelable[" + this.a + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.y(parcel, 1, this.a);
        ocv.x(parcel, iV);
    }
}
