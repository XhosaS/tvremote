package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kts extends kvo {
    public static final Parcelable.Creator<kts> CREATOR = new jbu(5);

    public kts(String str, ieg iegVar, int i, int i2, long j, long j2, String str2, kvm kvmVar, kvn kvnVar, String str3, String str4, boolean z, int i3, ieg iegVar2) {
        super(str, iegVar, i, i2, j, j2, str2, kvmVar, kvnVar, str3, str4, z, i3, iegVar2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        kro kroVar = new kro(6);
        ieg iegVar = this.b;
        boolean zM = iegVar.m();
        parcel.writeByte(zM ? (byte) 1 : (byte) 0);
        if (zM) {
            parcel.writeInt(((Integer) kroVar.b(iegVar.g())).intValue());
        }
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeLong(this.e);
        parcel.writeLong(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h.name());
        parcel.writeString(this.i.name());
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        parcel.writeInt(this.l ? 1 : 0);
        parcel.writeInt(this.m);
        ktw.i(parcel, this.n);
    }
}
