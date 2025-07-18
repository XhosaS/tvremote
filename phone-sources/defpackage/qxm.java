package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qxm implements Parcelable {
    public static final Parcelable.Creator<qxm> CREATOR = new ous(5);
    public final qxl a;
    public final vrr b;

    public qxm(qxl qxlVar, vrr vrrVar) {
        qxlVar.getClass();
        vrrVar.getClass();
        this.a = qxlVar;
        this.b = vrrVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qxm)) {
            return false;
        }
        qxm qxmVar = (qxm) obj;
        return yks.e(this.a, qxmVar.a) && this.b == qxmVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ActivityResultContext(actionData=" + this.a + ", dismissibility=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.b.ordinal());
    }
}
