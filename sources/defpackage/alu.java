package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alu extends ajh {
    public static final Parcelable.Creator CREATOR = new akz(4);
    final int a;
    final aja b;

    public alu(int i, aja ajaVar) {
        this.a = i;
        this.b = ajaVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iH = qq.h(parcel);
        qq.m(parcel, 1, this.a);
        qq.t(parcel, 2, this.b, i);
        qq.j(parcel, iH);
    }
}
