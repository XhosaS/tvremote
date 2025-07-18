package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aig extends ajh {
    public static final Parcelable.Creator CREATOR = new afi(8);
    public final ajd a;
    public final boolean b;
    public final boolean c;
    public final int[] d;
    public final int e;
    public final int[] f;

    public aig(ajd ajdVar, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.a = ajdVar;
        this.b = z;
        this.c = z2;
        this.d = iArr;
        this.e = i;
        this.f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ajd ajdVar = this.a;
        int iH = qq.h(parcel);
        qq.t(parcel, 1, ajdVar, i);
        qq.k(parcel, 2, this.b);
        qq.k(parcel, 3, this.c);
        qq.s(parcel, 4, this.d);
        qq.m(parcel, 5, this.e);
        qq.s(parcel, 6, this.f);
        qq.j(parcel, iH);
    }
}
