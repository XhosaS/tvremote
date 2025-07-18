package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aif extends ajh {
    public static final Parcelable.Creator CREATOR = new afi(7);
    Bundle a;
    aes[] b;
    int c;
    public aig d;

    public aif() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iH = qq.h(parcel);
        qq.o(parcel, 1, this.a);
        qq.x(parcel, 2, this.b, i);
        qq.m(parcel, 3, this.c);
        qq.t(parcel, 4, this.d, i);
        qq.j(parcel, iH);
    }

    public aif(Bundle bundle, aes[] aesVarArr, int i, aig aigVar) {
        this.a = bundle;
        this.b = aesVarArr;
        this.c = i;
        this.d = aigVar;
    }
}
