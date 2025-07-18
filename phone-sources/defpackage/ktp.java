package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ktp extends kuo {
    public static final kvr a = new kvr();
    public static final kvs b = new kvs();
    public static final Parcelable.Creator<ktp> CREATOR = new jbu(2);

    public ktp(ksy ksyVar, String str, String str2, Uri uri, float f, ieg iegVar, List list, String str3, String str4, int i, int i2, String str5, String str6, String str7, Uri uri2, Uri uri3, String str8, long j, String str9, boolean z, ImmutableList immutableList, ImmutableList immutableList2, ieg iegVar2, boolean z2, String str10) {
        super(ksyVar, str, str2, uri, f, iegVar, list, str3, str4, i, i2, str5, str6, str7, uri2, uri3, str8, j, str9, z, immutableList, immutableList2, iegVar2, z2, str10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.c, i);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeParcelable(this.f, i);
        parcel.writeFloat(this.g);
        ktw.i(parcel, this.h);
        parcel.writeList(this.i);
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
        parcel.writeString(this.n);
        parcel.writeString(this.o);
        parcel.writeString(this.p);
        parcel.writeParcelable(this.q, i);
        parcel.writeParcelable(this.r, i);
        parcel.writeString(this.s);
        parcel.writeLong(this.t);
        parcel.writeString(this.u);
        parcel.writeInt(this.v ? 1 : 0);
        kvr.c(this.w, parcel);
        kvs.c(this.x, parcel);
        ktw.n(this.y, parcel);
        parcel.writeInt(this.z ? 1 : 0);
        parcel.writeString(this.A);
    }
}
