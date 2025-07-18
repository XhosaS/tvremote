package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kvg implements Parcelable {
    public static final Parcelable.Creator<kvg> CREATOR = new jbu(12);
    private final int a;
    private final long b;

    public kvg(int i, long j) {
        this.a = i;
        this.b = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        kvg kvgVar = (kvg) obj;
        return this.a == kvgVar.a && this.b == kvgVar.b;
    }

    public final int hashCode() {
        long j = this.b;
        return (this.a * 31) + ((int) (j ^ (j >>> 32)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeLong(this.b);
    }

    public kvg(Parcel parcel) {
        int i = parcel.readInt();
        this.a = (i < 0 || i > 7) ? 0 : i;
        this.b = parcel.readLong();
    }
}
