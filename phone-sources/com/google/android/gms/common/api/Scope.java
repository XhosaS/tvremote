package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.nub;
import defpackage.ocg;
import defpackage.ocv;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class Scope extends ocg implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new nub(14);
    final int a;
    public final String b;

    public Scope(int i, String str) {
        ocv.aE(str, "scopeUri must not be null or empty");
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.b.equals(((Scope) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.B(parcel, 1, this.a);
        ocv.O(parcel, 2, this.b);
        ocv.x(parcel, iV);
    }

    public Scope(String str) {
        this(1, str);
    }
}
