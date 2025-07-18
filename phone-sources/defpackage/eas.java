package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eas implements Comparable<eas>, Parcelable {
    public static final Parcelable.Creator<eas> CREATOR = new dyy(2);
    public static final String a = edt.Z(0);
    public static final String b = edt.Z(1);
    public static final String c = edt.Z(2);
    public final int d;
    public final int e;
    public final int f;

    public eas(int i, int i2, int i3) {
        this.d = i;
        this.e = i2;
        this.f = i3;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(eas easVar) {
        eas easVar2 = easVar;
        int i = this.d - easVar2.d;
        if (i != 0) {
            return i;
        }
        int i2 = this.e - easVar2.e;
        return i2 == 0 ? this.f - easVar2.f : i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            eas easVar = (eas) obj;
            if (this.d == easVar.d && this.e == easVar.e && this.f == easVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.d * 31) + this.e) * 31) + this.f;
    }

    public final String toString() {
        return this.d + "." + this.e + "." + this.f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
    }

    public eas(int i, int i2) {
        this(0, i, i2);
    }

    public eas(Parcel parcel) {
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
    }
}
