package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajf extends ajh {
    public static final Parcelable.Creator CREATOR = new afi(14);
    public final int a;
    public List b;

    public ajf(int i, List list) {
        this.a = i;
        this.b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iH = qq.h(parcel);
        qq.m(parcel, 1, i2);
        qq.y(parcel, 2, this.b);
        qq.j(parcel, iH);
    }
}
