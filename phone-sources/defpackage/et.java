package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class et implements Parcelable {
    public static final Parcelable.Creator<et> CREATOR = new av(10);
    public final Object b;
    public eb c;
    public final Object a = new Object();
    public glk d = null;

    public et(Object obj, eb ebVar) {
        this.b = obj;
        this.c = ebVar;
    }

    public final eb a() {
        eb ebVar;
        synchronized (this.a) {
            ebVar = this.c;
        }
        return ebVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof et)) {
            return false;
        }
        et etVar = (et) obj;
        Object obj2 = this.b;
        if (obj2 == null) {
            return etVar.b == null;
        }
        Object obj3 = etVar.b;
        if (obj3 == null) {
            return false;
        }
        return obj2.equals(obj3);
    }

    public final int hashCode() {
        Object obj = this.b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, java.lang.Object] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
    }
}
