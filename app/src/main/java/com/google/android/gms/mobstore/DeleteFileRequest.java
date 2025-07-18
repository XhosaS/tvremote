package com.google.android.gms.mobstore;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kkx;
import defpackage.lmf;

/* compiled from: PG */
/* loaded from: classes.dex */
public class DeleteFileRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new lmf();
    public final Uri a;

    public DeleteFileRequest(Uri uri) {
        this.a = uri;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = kkx.a(parcel, 20293);
        kkx.q(parcel, 1, this.a, i);
        kkx.b(parcel, iA);
    }
}
