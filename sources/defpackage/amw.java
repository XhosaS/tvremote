package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amw extends ajh {
    public static final Parcelable.Creator CREATOR = new akz(9);
    public final boolean a;
    public final boolean b;
    public final int c;

    public amw(boolean z, boolean z2, int i) {
        this.a = z;
        this.b = z2;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iH = qq.h(parcel);
        qq.k(parcel, 2, this.a);
        qq.k(parcel, 3, this.b);
        qq.m(parcel, 4, this.c);
        qq.j(parcel, iH);
    }
}
