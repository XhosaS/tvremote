package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mxb extends mxo {
    public static final mxp a = new mxp();
    public static final Parcelable.Creator<mxb> CREATOR = new mur(6);

    public mxb(ImmutableList immutableList, mxe mxeVar, boolean z, ieg iegVar, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(immutableList, mxeVar, z, iegVar, z2, z3, z4, z5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        mxp.c(this.b, parcel);
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.d ? 1 : 0);
        ktw.n(this.e, parcel);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
    }
}
