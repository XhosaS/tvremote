package com.google.android.gms.pseudonymous;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kki;
import defpackage.kkx;
import defpackage.lth;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PseudonymousIdToken extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new lth();
    public final String a;

    public PseudonymousIdToken(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PseudonymousIdToken) {
            return kki.a(this.a, ((PseudonymousIdToken) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "PseudonymousIdToken[" + this.a + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = kkx.a(parcel, 20293);
        kkx.r(parcel, 2, str);
        kkx.b(parcel, iA);
    }
}
