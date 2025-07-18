package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sev implements Parcelable {
    public static final Parcelable.Creator<sev> CREATOR = new ous(18);
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

    public sev() {
        throw null;
    }

    public static seu a() {
        seu seuVar = new seu();
        seuVar.c("");
        seuVar.f(0);
        seuVar.e(0);
        seuVar.b(ImmutableList.of());
        seuVar.i(false);
        seuVar.g(false);
        return seuVar;
    }

    @Deprecated
    public static sev b(String str, String str2, String str3, String str4, List list) {
        seu seuVarA = a();
        seuVarA.h(str);
        seuVarA.j(str2);
        seuVarA.d(str3);
        seuVarA.k(str4);
        seuVarA.b(list);
        return seuVarA.a();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sev) {
            sev sevVar = (sev) obj;
            if (this.a.equals(sevVar.a) && this.b.equals(sevVar.b) && this.c.equals(sevVar.c) && this.d == sevVar.d && this.e == sevVar.e && this.f.equals(sevVar.f) && this.g.equals(sevVar.g) && this.h.equals(sevVar.h) && this.i == sevVar.i && this.j == sevVar.j) {
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

    public sev(String str, String str2, String str3, int i, int i2, String str4, String str5, ImmutableList immutableList, boolean z, boolean z2) {
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
