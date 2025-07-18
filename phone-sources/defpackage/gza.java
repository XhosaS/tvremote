package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gza implements Parcelable {
    public static final Parcelable.Creator<gza> CREATOR = new geb(4);
    public final String a;
    public final Map b;

    public gza(String str, Map map) {
        str.getClass();
        this.a = str;
        this.b = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gza)) {
            return false;
        }
        gza gzaVar = (gza) obj;
        return yks.e(this.a, gzaVar.a) && yks.e(this.b, gzaVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Key(key=" + this.a + ", extras=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        Map map = this.b;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }
}
