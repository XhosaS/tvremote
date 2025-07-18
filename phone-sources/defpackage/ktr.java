package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ktr extends kvj {
    public static final Parcelable.Creator<ktr> CREATOR = new jbu(4);

    public ktr(ksy ksyVar, String str, Uri uri, Uri uri2, String str2, int i, ImmutableList immutableList, float f, float f2, lcu lcuVar, String str3, ieg iegVar, ieg iegVar2, boolean z, String str4, String str5, ImmutableList immutableList2, ImmutableList immutableList3, ImmutableList immutableList4, ImmutableList immutableList5, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, ieg iegVar3, ieg iegVar4) {
        super(ksyVar, str, uri, uri2, str2, i, immutableList, f, f2, lcuVar, str3, iegVar, iegVar2, z, str4, str5, immutableList2, immutableList3, immutableList4, immutableList5, z2, z3, z4, z5, z6, iegVar3, iegVar4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeString(this.e);
        parcel.writeInt(this.f);
        parcel.writeList(this.g);
        parcel.writeFloat(this.h);
        parcel.writeFloat(this.i);
        parcel.writeString(this.j.name());
        parcel.writeString(this.k);
        ktw.i(parcel, this.l);
        ktw.n(this.m, parcel);
        parcel.writeInt(this.n ? 1 : 0);
        parcel.writeString(this.o);
        parcel.writeString(this.p);
        parcel.writeList(this.q);
        parcel.writeList(this.r);
        parcel.writeList(this.s);
        parcel.writeList(this.t);
        parcel.writeInt(this.u ? 1 : 0);
        parcel.writeInt(this.v ? 1 : 0);
        parcel.writeInt(this.w ? 1 : 0);
        parcel.writeInt(this.x ? 1 : 0);
        parcel.writeInt(this.y ? 1 : 0);
        ktw.h(parcel, this.z);
        ktw.i(parcel, this.A);
    }
}
