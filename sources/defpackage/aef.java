package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aef extends ajh {
    public static final Parcelable.Creator CREATOR = new e(16);
    public final int a;
    public final int b;
    public final int c;

    public aef(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iH = qq.h(parcel);
        qq.m(parcel, 1, i2);
        qq.m(parcel, 2, this.b);
        qq.m(parcel, 3, this.c);
        qq.j(parcel, iH);
    }
}
