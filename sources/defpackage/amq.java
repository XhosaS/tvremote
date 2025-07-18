package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amq extends ajh {
    public static final Parcelable.Creator CREATOR = new akz(8);
    public final boolean a;
    public final int b;

    public amq(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iH = qq.h(parcel);
        qq.k(parcel, 2, this.a);
        qq.m(parcel, 3, this.b);
        qq.j(parcel, iH);
    }
}
