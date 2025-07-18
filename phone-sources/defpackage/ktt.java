package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ktt extends kwl {
    public static final kvu a = new kvu();
    public static final kvq b = new kvq();
    public static final kvt c = new kvt();
    public static final Parcelable.Creator<ktt> CREATOR = new jbu(6);

    public ktt(ksy ksyVar, String str, Uri uri, float f, ieg iegVar, ImmutableList immutableList, ImmutableList immutableList2, String str2, ksy ksyVar2, String str3, Uri uri2, ieg iegVar2, boolean z, ImmutableList immutableList3) {
        super(ksyVar, str, uri, f, iegVar, immutableList, immutableList2, str2, ksyVar2, str3, uri2, iegVar2, z, immutableList3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.d, i);
        parcel.writeString(this.e);
        parcel.writeParcelable(this.f, i);
        parcel.writeFloat(this.g);
        ktw.i(parcel, this.h);
        kvu.c(this.i, parcel);
        kvq.c(this.j, parcel);
        parcel.writeString(this.k);
        parcel.writeParcelable(this.l, i);
        parcel.writeString(this.m);
        parcel.writeParcelable(this.n, i);
        ktw.n(this.o, parcel);
        parcel.writeInt(this.p ? 1 : 0);
        kvt.c(this.q, parcel);
    }
}
