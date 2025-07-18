package com.google.android.gms.people.consentprimitive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kkx;
import defpackage.lob;
import defpackage.yqs;
import defpackage.yyk;
import defpackage.zcg;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ContactsConsentsCoarseStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new lob();
    public final boolean a;
    public final boolean b;
    public final String c;
    public final boolean d;
    private final List e;
    private final List f;
    private final List g;

    public ContactsConsentsCoarseStatus(boolean z, boolean z2, List list, List list2, String str, boolean z3, List list3) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.e = list;
        this.f = list2;
        this.d = z3;
        this.g = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactsConsentsCoarseStatus)) {
            return false;
        }
        ContactsConsentsCoarseStatus contactsConsentsCoarseStatus = (ContactsConsentsCoarseStatus) obj;
        return this.a == contactsConsentsCoarseStatus.a && this.b == contactsConsentsCoarseStatus.b && yqs.a(this.f, contactsConsentsCoarseStatus.f) && yqs.a(this.e, contactsConsentsCoarseStatus.e) && yqs.a(this.c, contactsConsentsCoarseStatus.c) && this.d == contactsConsentsCoarseStatus.d && yqs.a(this.g, contactsConsentsCoarseStatus.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b), this.e, this.f, this.c, Boolean.valueOf(this.d), this.g});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        yyk yykVarJ;
        boolean z = this.a;
        int iA = kkx.a(parcel, 20293);
        kkx.c(parcel, 1, z);
        kkx.c(parcel, 2, this.b);
        List list = this.e;
        if (list == null) {
            int i2 = yyk.e;
            yykVarJ = zcg.b;
        } else {
            yykVarJ = yyk.j(list);
        }
        kkx.v(parcel, 3, yykVarJ);
        List list2 = this.f;
        kkx.v(parcel, 4, list2 == null ? zcg.b : yyk.j(list2));
        kkx.r(parcel, 5, this.c);
        kkx.c(parcel, 6, this.d);
        List list3 = this.g;
        kkx.v(parcel, 7, list3 == null ? zcg.b : yyk.j(list3));
        kkx.b(parcel, iA);
    }
}
