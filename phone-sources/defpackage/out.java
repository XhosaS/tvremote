package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class out implements Parcelable {
    public static final ous CREATOR = new ous(0);
    public static final out a = new out("", new our("", ouq.a));
    public final String b;
    public final our c;

    public out(String str, our ourVar) {
        this.b = str;
        this.c = ourVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof out)) {
            return false;
        }
        out outVar = (out) obj;
        return yks.e(this.b, outVar.b) && yks.e(this.c, outVar.c);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "PlayerMetadata(title=" + this.b + ", playId=" + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.b);
        our ourVar = this.c;
        parcel.writeString(ourVar.a);
        parcel.writeInt(ourVar.b.ordinal());
    }
}
