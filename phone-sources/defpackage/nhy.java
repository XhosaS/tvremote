package defpackage;

import android.net.Network;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nhy extends ocg {
    public static final Parcelable.Creator<nhy> CREATOR = new nhv(3);
    public final nia a;
    public final String b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;
    public final int g;
    public final String h;
    public final boolean i;
    public final byte[] j;
    public final String k;
    public final boolean l;
    public final Network m;

    public nhy(nia niaVar, String str, List list, List list2, List list3, List list4, int i, String str2, boolean z, byte[] bArr, String str3, boolean z2, Network network) {
        this.a = niaVar;
        this.b = str;
        this.c = list;
        this.d = list2;
        this.e = list3;
        this.f = list4;
        this.g = i;
        this.h = str2;
        this.i = z;
        this.j = bArr;
        this.k = str3;
        this.l = z2;
        this.m = network;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        nia niaVar = this.a;
        int iV = ocv.v(parcel);
        ocv.N(parcel, 1, niaVar, i);
        ocv.O(parcel, 2, this.b);
        ocv.Q(parcel, 3, this.c);
        ocv.Q(parcel, 4, this.d);
        ocv.Q(parcel, 5, this.e);
        ocv.Q(parcel, 6, this.f);
        ocv.B(parcel, 7, this.g);
        ocv.O(parcel, 8, this.h);
        ocv.y(parcel, 9, this.i);
        ocv.F(parcel, 10, this.j);
        ocv.O(parcel, 11, this.k);
        ocv.y(parcel, 12, this.l);
        ocv.N(parcel, 13, this.m, i);
        ocv.x(parcel, iV);
    }
}
