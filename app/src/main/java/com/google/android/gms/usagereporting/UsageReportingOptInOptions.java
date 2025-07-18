package com.google.android.gms.usagereporting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kkx;
import defpackage.lwk;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class UsageReportingOptInOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new lwk();
    public final int a;
    public final boolean b;
    public final List c;
    public final int d;
    public final String e;
    public final boolean f;

    public UsageReportingOptInOptions(int i, boolean z, List list, int i2, String str, boolean z2) {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.a = i;
        this.b = z;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.d = i2;
        this.e = str;
        this.f = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = kkx.a(parcel, 20293);
        kkx.f(parcel, 2, this.a);
        kkx.c(parcel, 3, this.b);
        kkx.t(parcel, 4, this.c);
        kkx.f(parcel, 5, this.d);
        kkx.r(parcel, 6, this.e);
        kkx.c(parcel, 7, this.f);
        kkx.b(parcel, iA);
    }
}
