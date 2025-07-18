package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mzf extends mzl {
    public static final mzh a = new mzh();
    public static final Parcelable.Creator<mzf> CREATOR = new mur(10);

    public mzf(ImmutableList immutableList, mzm mzmVar, tst tstVar) {
        super(immutableList, mzmVar, tstVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        mzh.c(this.b, parcel);
        parcel.writeParcelable(this.c, i);
        parcel.writeSerializable(this.d);
    }
}
