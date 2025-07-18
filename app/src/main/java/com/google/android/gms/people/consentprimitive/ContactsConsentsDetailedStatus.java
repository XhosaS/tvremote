package com.google.android.gms.people.consentprimitive;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kkx;
import defpackage.lod;
import defpackage.yqs;
import defpackage.yyn;
import defpackage.yyr;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ContactsConsentsDetailedStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new lod();
    public final int a;
    public final Bundle b;

    public ContactsConsentsDetailedStatus(int i, Bundle bundle) {
        this.a = i;
        this.b = bundle;
    }

    public final yyr a() {
        yyn yynVar = new yyn(4);
        Bundle bundle = this.b;
        for (String str : bundle.keySet()) {
            yynVar.c(new Account(str, "com.google"), Integer.valueOf(bundle.getInt(str)));
        }
        return yynVar.a(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactsConsentsDetailedStatus)) {
            return false;
        }
        ContactsConsentsDetailedStatus contactsConsentsDetailedStatus = (ContactsConsentsDetailedStatus) obj;
        return this.a == contactsConsentsDetailedStatus.a && yqs.a(a(), contactsConsentsDetailedStatus.a());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), a()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int iA = kkx.a(parcel, 20293);
        kkx.f(parcel, 1, i2);
        kkx.i(parcel, 2, this.b);
        kkx.b(parcel, iA);
    }
}
