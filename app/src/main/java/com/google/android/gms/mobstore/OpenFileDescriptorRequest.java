package com.google.android.gms.mobstore;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kkx;
import defpackage.lmz;

/* compiled from: PG */
/* loaded from: classes.dex */
public class OpenFileDescriptorRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new lmz();
    public final Uri a;
    public final int b;

    public OpenFileDescriptorRequest(Uri uri, int i) {
        this.a = uri;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = kkx.a(parcel, 20293);
        kkx.q(parcel, 1, this.a, i);
        kkx.f(parcel, 2, this.b);
        kkx.b(parcel, iA);
    }
}
