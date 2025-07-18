package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kky implements Parcelable {
    public static final Parcelable.Creator<kky> CREATOR = new geb(10);
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;
    public final ImmutableList h;
    public final boolean i;
    public final boolean j;

    public kky() {
        throw null;
    }

    public static seu a() {
        seu seuVar = new seu();
        seuVar.p("");
        seuVar.s(0);
        seuVar.r(0);
        seuVar.o(ImmutableList.of());
        seuVar.v(false);
        seuVar.t(false);
        return seuVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kky) {
            kky kkyVar = (kky) obj;
            if (this.a.equals(kkyVar.a) && this.b.equals(kkyVar.b) && this.c.equals(kkyVar.c) && this.d == kkyVar.d && this.e == kkyVar.e && this.f.equals(kkyVar.f) && this.g.equals(kkyVar.g) && this.h.equals(kkyVar.h) && this.i == kkyVar.i && this.j == kkyVar.j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003) ^ (true == this.j ? 1231 : 1237);
    }

    public final String toString() {
        return "Tag{id=" + this.a + ", name=" + this.b + ", contentDescription=" + this.c + ", drawableRes=" + this.d + ", drawableColorRes=" + this.e + ", dimensionId=" + this.f + ", parentId=" + this.g + ", children=" + String.valueOf(this.h) + ", isKnob=" + this.i + ", excludeFromAnalytics=" + this.j + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeList(this.h);
        parcel.writeByte(this.i ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.j ? (byte) 1 : (byte) 0);
    }

    public kky(String str, String str2, String str3, int i, int i2, String str4, String str5, ImmutableList immutableList, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = i2;
        this.f = str4;
        this.g = str5;
        this.h = immutableList;
        this.i = z;
        this.j = z2;
    }
}
