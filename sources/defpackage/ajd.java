package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajd extends ajh {
    public static final Parcelable.Creator CREATOR = new afi(13);
    public final int a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;

    public ajd(int i, boolean z, boolean z2, int i2, int i3) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = i2;
        this.e = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iH = qq.h(parcel);
        qq.m(parcel, 1, i2);
        qq.k(parcel, 2, this.b);
        qq.k(parcel, 3, this.c);
        qq.m(parcel, 4, this.d);
        qq.m(parcel, 5, this.e);
        qq.j(parcel, iH);
    }
}
