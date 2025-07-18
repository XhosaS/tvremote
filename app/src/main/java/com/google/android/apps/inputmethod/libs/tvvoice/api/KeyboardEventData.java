package com.google.android.apps.inputmethod.libs.tvvoice.api;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.a;
import defpackage.abvw;
import defpackage.abvz;
import defpackage.abwa;
import defpackage.abza;
import defpackage.esi;
import defpackage.esk;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class KeyboardEventData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new esi();
    public final esk a;

    public KeyboardEventData(esk eskVar) {
        this.a = eskVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA;
        esk eskVar = this.a;
        try {
            int i2 = eskVar.memoizedSerializedSize;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iA = abza.a.a(eskVar.getClass()).a(eskVar);
                if (iA < 0) {
                    throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                }
            } else {
                iA = i2 & Integer.MAX_VALUE;
                if (iA == Integer.MAX_VALUE) {
                    iA = abza.a.a(eskVar.getClass()).a(eskVar);
                    if (iA < 0) {
                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                    }
                    eskVar.memoizedSerializedSize = (Integer.MIN_VALUE & eskVar.memoizedSerializedSize) | iA;
                }
            }
            byte[] bArr = new byte[iA];
            boolean z = abvz.e;
            abvw abvwVar = new abvw(bArr, 0, iA);
            abza.a.a(eskVar.getClass()).m(eskVar, abwa.a(abvwVar));
            abvwVar.K();
            parcel.writeByteArray(bArr);
        } catch (IOException e) {
            throw new RuntimeException(a.u(eskVar, " to a byte array threw an IOException (should never happen)."), e);
        }
    }
}
