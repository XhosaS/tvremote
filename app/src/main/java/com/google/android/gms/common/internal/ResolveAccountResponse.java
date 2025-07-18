package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kjw;
import defpackage.kki;
import defpackage.kkn;
import defpackage.kkx;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ResolveAccountResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new kkn();
    final int a;
    final IBinder b;
    public final ConnectionResult c;
    public final boolean d;
    public final boolean e;

    public ResolveAccountResponse(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.a = i;
        this.b = iBinder;
        this.c = connectionResult;
        this.d = z;
        this.e = z2;
    }

    public final kjw a() {
        IBinder iBinder = this.b;
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        return iInterfaceQueryLocalInterface instanceof kjw ? (kjw) iInterfaceQueryLocalInterface : new kjw(iBinder);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResolveAccountResponse)) {
            return false;
        }
        ResolveAccountResponse resolveAccountResponse = (ResolveAccountResponse) obj;
        return this.c.equals(resolveAccountResponse.c) && kki.a(a(), resolveAccountResponse.a());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = kkx.a(parcel, 20293);
        kkx.f(parcel, 1, this.a);
        kkx.l(parcel, 2, this.b);
        kkx.q(parcel, 3, this.c, i);
        kkx.c(parcel, 4, this.d);
        kkx.c(parcel, 5, this.e);
        kkx.b(parcel, iA);
    }
}
