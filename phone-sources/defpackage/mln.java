package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mln extends mmd {
    public static final Parcelable.Creator<mln> CREATOR = new jbu(18);

    public mln(boolean z, ieg iegVar, ieg iegVar2, ieg iegVar3, ieg iegVar4, ieg iegVar5, boolean z2, boolean z3, int i, boolean z4) {
        super(z, iegVar, iegVar2, iegVar3, iegVar4, iegVar5, z2, z3, i, z4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        ktw.i(parcel, this.b);
        krh.n(this.c, parcel);
        ktw.i(parcel, this.d);
        krh.n(this.e, parcel);
        ktw.i(parcel, this.f);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeString(mnu.r(this.j));
        parcel.writeInt(this.i ? 1 : 0);
    }
}
