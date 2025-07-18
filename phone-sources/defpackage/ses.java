package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ses implements Parcelable {
    public static final Parcelable.Creator<ses> CREATOR = new ous(16);
    public final String a;
    public final String b;
    public final ImmutableList c;

    public ses() {
        throw null;
    }

    @Deprecated
    public static ses a(String str, List list) {
        xwk xwkVarB = b();
        xwkVarB.e(str);
        xwkVarB.c(list);
        return xwkVarB.b();
    }

    public static xwk b() {
        xwk xwkVar = new xwk();
        xwkVar.d("");
        return xwkVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ses) {
            ses sesVar = (ses) obj;
            if (this.a.equals(sesVar.a) && this.b.equals(sesVar.b) && this.c.equals(sesVar.c)) {
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

    public ses(String str, String str2, ImmutableList immutableList) {
        this.a = str;
        this.b = str2;
        this.c = immutableList;
    }
}
