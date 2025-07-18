package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ktu extends kwn {
    public static final Parcelable.Creator<ktu> CREATOR = new jbu(7);

    public ktu(ieg iegVar, String str, String str2, ksy ksyVar, Uri uri, float f, String str3, Uri uri2, float f2, float f3, lcu lcuVar, String str4, String str5, boolean z, boolean z2, int i, ImmutableList immutableList, ImmutableList immutableList2, ieg iegVar2, ImmutableList immutableList3) {
        super(iegVar, str, str2, ksyVar, uri, f, str3, uri2, f2, f3, lcuVar, str4, str5, z, z2, i, immutableList, immutableList2, iegVar2, immutableList3);
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
        parcel.writeParcelable(this.e, i);
        parcel.writeFloat(this.f);
        parcel.writeString(this.g);
        parcel.writeParcelable(this.h, i);
        parcel.writeFloat(this.i);
        parcel.writeFloat(this.j);
        parcel.writeString(this.k.name());
        parcel.writeString(this.l);
        parcel.writeString(this.m);
        parcel.writeInt(this.n ? 1 : 0);
        parcel.writeInt(this.o ? 1 : 0);
        parcel.writeInt(this.p);
        parcel.writeList(this.q);
        parcel.writeList(this.r);
        ktw.h(parcel, this.s);
        parcel.writeList(this.t);
    }
}
