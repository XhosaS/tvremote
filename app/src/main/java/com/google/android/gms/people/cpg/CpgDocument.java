package com.google.android.gms.people.cpg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kkx;
import defpackage.lpd;
import defpackage.yqs;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class CpgDocument extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new lpd();
    public final int a;
    public final GroupContactOrder b;
    public final ActionPreference c;

    public CpgDocument(int i, GroupContactOrder groupContactOrder, ActionPreference actionPreference) {
        this.a = i;
        this.b = groupContactOrder;
        this.c = actionPreference;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            CpgDocument cpgDocument = (CpgDocument) obj;
            if (this.a == cpgDocument.a && yqs.a(this.b, cpgDocument.b) && yqs.a(this.c, cpgDocument.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iA = kkx.a(parcel, 20293);
        kkx.f(parcel, 1, i2);
        kkx.q(parcel, 2, this.b, i);
        kkx.q(parcel, 3, this.c, i);
        kkx.b(parcel, iA);
    }
}
