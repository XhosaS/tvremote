package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kkw implements Parcelable {
    public static final Parcelable.Creator<kkw> CREATOR = new geb(8);
    public final String a;
    public final String b;
    public final ImmutableList c;

    public kkw() {
        throw null;
    }

    public static kvw a() {
        kvw kvwVar = new kvw((char[]) null);
        kvwVar.e("");
        return kvwVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kkw) {
            kkw kkwVar = (kkw) obj;
            if (this.a.equals(kkwVar.a) && this.b.equals(kkwVar.b) && this.c.equals(kkwVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "Dimension{id=" + this.a + ", contentDescription=" + this.b + ", children=" + String.valueOf(this.c) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeList(this.c);
    }

    public kkw(String str, String str2, ImmutableList immutableList) {
        this.a = str;
        this.b = str2;
        this.c = immutableList;
    }
}
