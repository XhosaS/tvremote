package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ktk extends ktz {
    public static final Parcelable.Creator<ktk> CREATOR = new geb(17);

    public ktk(ImmutableList immutableList, ieg iegVar, ieg iegVar2, ieg iegVar3, boolean z, boolean z2, int i, int i2, int i3) {
        super(immutableList, iegVar, iegVar2, iegVar3, z, z2, i, i2, i3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.b);
        ktw.i(parcel, this.c);
        ktw.i(parcel, this.d);
        ktw.i(parcel, this.e);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j);
    }
}
