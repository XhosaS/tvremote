package com.google.android.katniss.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.a;
import defpackage.abvw;
import defpackage.abvz;
import defpackage.abwa;
import defpackage.abza;
import defpackage.lxp;
import defpackage.lxs;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class UserAssistantSettings implements Parcelable {
    public static final Parcelable.Creator CREATOR = new lxs();
    private final lxp a;

    public UserAssistantSettings(lxp lxpVar) {
        this.a = lxpVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserAssistantSettings)) {
            return false;
        }
        lxp lxpVar = this.a;
        lxp lxpVar2 = ((UserAssistantSettings) obj).a;
        if (lxpVar == lxpVar2) {
            return true;
        }
        if (lxpVar2 != null && lxpVar.getClass() == lxpVar2.getClass()) {
            return abza.a.a(lxpVar.getClass()).k(lxpVar, lxpVar2);
        }
        return false;
    }

    public final int hashCode() {
        lxp lxpVar = this.a;
        if ((lxpVar.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            return abza.a.a(lxpVar.getClass()).b(lxpVar);
        }
        int i = lxpVar.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iB = abza.a.a(lxpVar.getClass()).b(lxpVar);
        lxpVar.memoizedHashCode = iB;
        return iB;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA;
        lxp lxpVar = this.a;
        try {
            int i2 = lxpVar.memoizedSerializedSize;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iA = abza.a.a(lxpVar.getClass()).a(lxpVar);
                if (iA < 0) {
                    throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                }
            } else {
                iA = i2 & Integer.MAX_VALUE;
                if (iA == Integer.MAX_VALUE) {
                    iA = abza.a.a(lxpVar.getClass()).a(lxpVar);
                    if (iA < 0) {
                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                    }
                    lxpVar.memoizedSerializedSize = (Integer.MIN_VALUE & lxpVar.memoizedSerializedSize) | iA;
                }
            }
            byte[] bArr = new byte[iA];
            boolean z = abvz.e;
            abvw abvwVar = new abvw(bArr, 0, iA);
            abza.a.a(lxpVar.getClass()).m(lxpVar, abwa.a(abvwVar));
            abvwVar.K();
            parcel.writeByteArray(bArr);
        } catch (IOException e) {
            throw new RuntimeException(a.u(lxpVar, " to a byte array threw an IOException (should never happen)."), e);
        }
    }
}
