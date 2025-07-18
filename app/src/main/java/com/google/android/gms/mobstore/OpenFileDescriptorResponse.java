package com.google.android.gms.mobstore;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kkx;
import defpackage.lna;

/* compiled from: PG */
/* loaded from: classes.dex */
public class OpenFileDescriptorResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new lna();
    public final ParcelFileDescriptor a;

    public OpenFileDescriptorResponse(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ParcelFileDescriptor parcelFileDescriptor = this.a;
        int iA = kkx.a(parcel, 20293);
        kkx.q(parcel, 1, parcelFileDescriptor, i | 1);
        kkx.b(parcel, iA);
    }
}
