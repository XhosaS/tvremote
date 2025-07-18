package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nhp extends ocg {
    public static final Parcelable.Creator<nhp> CREATOR = new mur(18);
    public final nia a;
    public final nhs b;

    public nhp(nia niaVar, nhs nhsVar) {
        this.a = niaVar;
        this.b = nhsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nhp)) {
            return false;
        }
        nhp nhpVar = (nhp) obj;
        return this.a.equals(nhpVar.a) && this.b.equals(nhpVar.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return String.format("AccountWithAppRestrictionState{googleAccount=%s, appRestrictionState=%s}", this.a, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        nia niaVar = this.a;
        int iV = ocv.v(parcel);
        ocv.N(parcel, 1, niaVar, i);
        ocv.N(parcel, 2, this.b, i);
        ocv.x(parcel, iV);
    }
}
