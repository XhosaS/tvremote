package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kup implements Parcelable {
    public static final Parcelable.Creator<kup> CREATOR = new jbu(11);
    public final kuf a;
    public final int b;
    public final int c;
    private final int d;

    public kup(kuf kufVar, int i, int i2, int i3) {
        this.a = kufVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final int a() {
        return this.b + this.c + this.d;
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
        kup kupVar = (kup) obj;
        if (this.b == kupVar.b && this.c == kupVar.c && this.d == kupVar.d) {
            return this.a.equals(kupVar.a);
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }

    public kup(Parcel parcel) {
        this.a = (kuf) parcel.readParcelable(kuf.class.getClassLoader());
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
    }
}
