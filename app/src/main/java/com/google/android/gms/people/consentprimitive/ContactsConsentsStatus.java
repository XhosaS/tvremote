package com.google.android.gms.people.consentprimitive;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kkx;
import defpackage.loe;
import defpackage.yqs;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ContactsConsentsStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new loe();
    public final ContactsConsentsCoarseStatus a;
    public final ContactsConsentsDetailedStatus b;
    public final ContactsConsentsConfig c;

    public ContactsConsentsStatus(ContactsConsentsCoarseStatus contactsConsentsCoarseStatus, ContactsConsentsDetailedStatus contactsConsentsDetailedStatus, ContactsConsentsConfig contactsConsentsConfig) {
        this.a = contactsConsentsCoarseStatus;
        this.b = contactsConsentsDetailedStatus;
        this.c = contactsConsentsConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactsConsentsStatus)) {
            return false;
        }
        ContactsConsentsStatus contactsConsentsStatus = (ContactsConsentsStatus) obj;
        return yqs.a(this.a, contactsConsentsStatus.a) && yqs.a(this.b, contactsConsentsStatus.b) && yqs.a(this.c, contactsConsentsStatus.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ContactsConsentsCoarseStatus contactsConsentsCoarseStatus = this.a;
        int iA = kkx.a(parcel, 20293);
        kkx.q(parcel, 1, contactsConsentsCoarseStatus, i);
        kkx.q(parcel, 2, this.b, i);
        kkx.q(parcel, 3, this.c, i);
        kkx.b(parcel, iA);
    }
}
