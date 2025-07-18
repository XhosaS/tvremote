package com.google.android.gms.mobstore;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kkx;
import defpackage.lnb;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RenameRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new lnb();
    public final Uri a;
    public final Uri b;

    public RenameRequest(Uri uri, Uri uri2) {
        this.a = uri;
        this.b = uri2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = kkx.a(parcel, 20293);
        kkx.q(parcel, 1, this.a, i);
        kkx.q(parcel, 2, this.b, i);
        kkx.b(parcel, iA);
    }
}
