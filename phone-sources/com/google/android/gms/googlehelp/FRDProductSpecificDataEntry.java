package com.google.android.gms.googlehelp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.a;
import defpackage.obd;
import defpackage.ocg;
import defpackage.ocv;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FRDProductSpecificDataEntry extends ocg implements ReflectedParcelable {
    public static final Parcelable.Creator<FRDProductSpecificDataEntry> CREATOR = new obd(11);
    final int a;
    final int b;
    final List c;
    final List d;
    final List e;
    final List f;
    final byte[][] g;
    final Boolean h;

    public FRDProductSpecificDataEntry(int i, int i2, List list, List list2, List list3, List list4, byte[][] bArr, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = list;
        this.d = list2;
        this.e = list3;
        this.f = list4;
        this.g = bArr;
        this.h = Boolean.valueOf(z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FRDProductSpecificDataEntry)) {
            return false;
        }
        FRDProductSpecificDataEntry fRDProductSpecificDataEntry = (FRDProductSpecificDataEntry) obj;
        return this.a == fRDProductSpecificDataEntry.a && this.b == fRDProductSpecificDataEntry.b && a.Q(this.c, fRDProductSpecificDataEntry.c) && a.Q(this.d, fRDProductSpecificDataEntry.d) && a.Q(this.e, fRDProductSpecificDataEntry.e) && a.Q(this.f, fRDProductSpecificDataEntry.f) && Arrays.equals(this.g, fRDProductSpecificDataEntry.g) && a.Q(this.h, fRDProductSpecificDataEntry.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), this.c, this.d, this.e, this.f, Integer.valueOf(Arrays.deepHashCode(this.g)), this.h});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.B(parcel, 2, this.a);
        ocv.B(parcel, 3, this.b);
        ocv.Q(parcel, 4, this.c);
        ocv.L(parcel, 5, this.d);
        ocv.Q(parcel, 6, this.e);
        ocv.L(parcel, 7, this.f);
        ocv.G(parcel, 8, this.g);
        ocv.D(parcel, 9, this.h);
        ocv.x(parcel, iV);
    }
}
