package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acf implements Parcelable {
    public static final Parcelable.Creator<acf> CREATOR = new av(16);
    private final int a;

    public acf(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof acf) && this.a == ((acf) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "DefaultLazyKey(index=" + this.a + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}
