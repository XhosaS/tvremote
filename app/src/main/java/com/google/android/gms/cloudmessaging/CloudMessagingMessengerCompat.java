package com.google.android.gms.cloudmessaging;

import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.kbm;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CloudMessagingMessengerCompat implements Parcelable {
    public static final Parcelable.Creator CREATOR = new kbm();
    public final Messenger a;

    public CloudMessagingMessengerCompat(IBinder iBinder) {
        this.a = new Messenger(iBinder);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            try {
                return this.a.getBinder().equals(((CloudMessagingMessengerCompat) obj).a.getBinder());
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.getBinder().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.a.getBinder());
    }
}
