package com.google.android.gms.feedback;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kkx;
import defpackage.knb;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FileTeleporter extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new knb();
    final ParcelFileDescriptor a;
    final String b;
    final String c;

    public FileTeleporter(ParcelFileDescriptor parcelFileDescriptor, String str, String str2) {
        this.a = parcelFileDescriptor;
        this.b = str;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ParcelFileDescriptor parcelFileDescriptor = this.a;
        if (parcelFileDescriptor == null) {
            throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel.");
        }
        int iA = kkx.a(parcel, 20293);
        kkx.q(parcel, 2, parcelFileDescriptor, i);
        kkx.r(parcel, 3, this.b);
        kkx.r(parcel, 4, this.c);
        kkx.b(parcel, iA);
    }
}
