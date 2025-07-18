package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alv extends ajh {
    public static final Parcelable.Creator CREATOR = new akz(5);
    final int a;
    public final aeq b;
    public final ajb c;

    public alv(int i, aeq aeqVar, ajb ajbVar) {
        this.a = i;
        this.b = aeqVar;
        this.c = ajbVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iH = qq.h(parcel);
        qq.m(parcel, 1, this.a);
        qq.t(parcel, 2, this.b, i);
        qq.t(parcel, 3, this.c, i);
        qq.j(parcel, iH);
    }
}
