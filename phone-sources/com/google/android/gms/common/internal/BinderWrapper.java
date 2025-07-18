package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.nub;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class BinderWrapper implements Parcelable {
    public static final Parcelable.Creator<BinderWrapper> CREATOR = new nub(19);
    private final IBinder a;

    public BinderWrapper(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.a);
    }

    public BinderWrapper(Parcel parcel) {
        this.a = parcel.readStrongBinder();
    }
}
