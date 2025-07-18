package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akq extends ajh {
    public static final Parcelable.Creator CREATOR = new afi(17);
    public final byte[] a;

    public akq(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iH = qq.h(parcel);
        qq.p(parcel, 2, this.a);
        qq.j(parcel, iH);
    }
}
