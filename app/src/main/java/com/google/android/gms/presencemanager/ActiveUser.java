package com.google.android.gms.presencemanager;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kki;
import defpackage.kkx;
import defpackage.lso;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ActiveUser extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new lso();
    public final IBinder a;

    public ActiveUser(IBinder iBinder) {
        this.a = iBinder;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ActiveUser)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return kki.a(this.a, ((ActiveUser) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder = this.a;
        int iA = kkx.a(parcel, 20293);
        kkx.l(parcel, 1, iBinder);
        kkx.b(parcel, iA);
    }
}
