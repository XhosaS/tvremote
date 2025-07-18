package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bci<T> extends bdr<T> implements Parcelable {
    public static final Parcelable.Creator<bci<Object>> CREATOR = new bch();

    public bci(Object obj, bds bdsVar) {
        super(obj, bdsVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(a());
        bds bdsVar = ((bdr) this).a;
        if (yks.e(bdsVar, bcz.b)) {
            i2 = 0;
        } else if (yks.e(bdsVar, bcz.c)) {
            i2 = 1;
        } else {
            if (!yks.e(bdsVar, bcz.a)) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }
}
