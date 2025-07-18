package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ktq extends ksm {
    public static final kvq Q = new kvq();
    public static final kvr R = new kvr();
    public static final kvs S = new kvs();
    public static final Parcelable.Creator<ktq> CREATOR = new jbu(3);

    public ktq(ieg iegVar, String str, String str2, ksy ksyVar, String str3, ieg iegVar2, String str4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, int i, Uri uri, Uri uri2, String str5, int i2, float f, long j, int i3, ImmutableList immutableList, float f2, lcu lcuVar, String str6, String str7, ImmutableList immutableList2, ImmutableList immutableList3, ImmutableList immutableList4, ImmutableList immutableList5, ImmutableList immutableList6, ImmutableList immutableList7, ieg iegVar3, ImmutableList immutableList8, ImmutableList immutableList9, ieg iegVar4, boolean z10, ieg iegVar5, ieg iegVar6) {
        super(iegVar, str, str2, ksyVar, str3, iegVar2, str4, z, z2, z3, z4, z5, z6, z7, z8, z9, i, uri, uri2, str5, i2, f, j, i3, immutableList, f2, lcuVar, str6, str7, immutableList2, immutableList3, immutableList4, immutableList5, immutableList6, immutableList7, iegVar3, immutableList8, immutableList9, iegVar4, z10, iegVar5, iegVar6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ktw.i(parcel, this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeParcelable(this.d, i);
        parcel.writeString(this.e);
        ktw.i(parcel, this.f);
        parcel.writeString(this.g);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeInt(this.l ? 1 : 0);
        parcel.writeInt(this.m ? 1 : 0);
        parcel.writeInt(this.n ? 1 : 0);
        parcel.writeInt(this.o ? 1 : 0);
        parcel.writeInt(this.p ? 1 : 0);
        parcel.writeInt(this.q);
        parcel.writeParcelable(this.r, i);
        parcel.writeParcelable(this.s, i);
        parcel.writeString(this.t);
        parcel.writeInt(this.u);
        parcel.writeFloat(this.v);
        parcel.writeLong(this.w);
        parcel.writeInt(this.x);
        kvq.c(this.y, parcel);
        parcel.writeFloat(this.z);
        parcel.writeString(this.A.name());
        parcel.writeString(this.B);
        parcel.writeString(this.C);
        parcel.writeStringList(this.D);
        parcel.writeStringList(this.E);
        parcel.writeStringList(this.F);
        parcel.writeStringList(this.G);
        kvq.c(this.H, parcel);
        kvq.c(this.I, parcel);
        ktw.i(parcel, this.J);
        kvr.c(this.K, parcel);
        kvs.c(this.L, parcel);
        ktw.n(this.M, parcel);
        parcel.writeInt(this.N ? 1 : 0);
        ktw.h(parcel, this.O);
        ktw.h(parcel, this.P);
    }
}
