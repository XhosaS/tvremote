package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kkx;
import defpackage.lqw;

/* compiled from: PG */
/* loaded from: classes.dex */
public class DogfoodsToken extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new lqw();
    public final byte[] a;

    public DogfoodsToken(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = kkx.a(parcel, 20293);
        kkx.j(parcel, 2, this.a);
        kkx.b(parcel, iA);
    }
}
