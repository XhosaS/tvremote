package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nhs extends ocg {
    public static final Parcelable.Creator<nhs> CREATOR = new mur(17);
    public final boolean a;
    public final boolean b;

    public nhs(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nhs)) {
            return false;
        }
        nhs nhsVar = (nhs) obj;
        return this.a == nhsVar.a && this.b == nhsVar.b;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), Boolean.valueOf(this.b));
    }

    public final String toString() {
        return String.format("AppRestrictionState{isRestricted=%b, isAccountHidden=%b}", Boolean.valueOf(this.a), Boolean.valueOf(this.b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int iV = ocv.v(parcel);
        ocv.y(parcel, 1, z);
        ocv.y(parcel, 2, this.b);
        ocv.x(parcel, iV);
    }
}
