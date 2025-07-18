package com.google.android.gms.auth.aang;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.jwy;
import defpackage.kkx;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class AccountWithAppRestrictionState extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new jwy();
    public final GoogleAccount a;
    public final AppRestrictionState b;

    public AccountWithAppRestrictionState(GoogleAccount googleAccount, AppRestrictionState appRestrictionState) {
        this.a = googleAccount;
        this.b = appRestrictionState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountWithAppRestrictionState)) {
            return false;
        }
        AccountWithAppRestrictionState accountWithAppRestrictionState = (AccountWithAppRestrictionState) obj;
        return this.a.equals(accountWithAppRestrictionState.a) && this.b.equals(accountWithAppRestrictionState.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return String.format("AccountWithAppRestrictionState{googleAccount=%s, appRestrictionState=%s}", this.a, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        GoogleAccount googleAccount = this.a;
        int iA = kkx.a(parcel, 20293);
        kkx.q(parcel, 1, googleAccount, i);
        kkx.q(parcel, 2, this.b, i);
        kkx.b(parcel, iA);
    }
}
