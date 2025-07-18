package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sgu implements Comparable<sgu>, Parcelable {
    public static final Parcelable.Creator<sgu> CREATOR = new ous(19);
    public final String a;
    public final long b;
    public final int c;

    public sgu(String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(sgu sguVar) {
        return this.a.compareTo(sguVar.a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sgu) {
            return this.a.equals(((sgu) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeLong(this.b);
        parcel.writeInt(this.c);
    }

    public sgu(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readLong();
        this.c = parcel.readInt();
    }
}
