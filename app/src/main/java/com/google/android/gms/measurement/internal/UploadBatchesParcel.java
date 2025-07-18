package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kkx;
import defpackage.lhs;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class UploadBatchesParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new lhs();
    public final List a;

    public UploadBatchesParcel(List list) {
        this.a = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = kkx.a(parcel, 20293);
        kkx.v(parcel, 1, this.a);
        kkx.b(parcel, iA);
    }
}
