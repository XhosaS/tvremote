package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ser implements Parcelable {
    public static final Parcelable.Creator<ser> CREATOR = new ous(15);
    public final String a;
    public final List b;
    public final Set c;

    public ser() {
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
        if (obj instanceof ser) {
            ser serVar = (ser) obj;
            if (this.a.equals(serVar.a) && this.b.equals(serVar.b) && this.c.equals(serVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        Set set = this.c;
        return "DataTree{id=" + this.a + ", dimensions=" + this.b.toString() + ", exclusionSets=" + set.toString() + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeList(this.b);
        parcel.writeList(new ArrayList(this.c));
    }

    public ser(String str, List list, Set set) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.a = str;
        if (list == null) {
            throw new NullPointerException("Null dimensions");
        }
        this.b = list;
        if (set == null) {
            throw new NullPointerException("Null exclusionSets");
        }
        this.c = set;
    }
}
