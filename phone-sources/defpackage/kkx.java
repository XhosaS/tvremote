package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kkx implements Parcelable {
    public static final Parcelable.Creator<kkx> CREATOR = new geb(9);
    public final Set a;

    public kkx() {
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kkx) {
            return this.a.equals(((kkx) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ExclusionSet{tagIds=" + this.a.toString() + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(new ArrayList(this.a));
    }

    public kkx(Set set) {
        if (set == null) {
            throw new NullPointerException("Null tagIds");
        }
        this.a = set;
    }
}
