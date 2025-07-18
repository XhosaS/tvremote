package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.consentprimitive.ContactsConsentsCoarseStatus;
import com.google.android.gms.people.consentprimitive.ContactsConsentsConfig;
import com.google.android.gms.people.consentprimitive.ContactsConsentsDetailedStatus;
import com.google.android.gms.people.consentprimitive.ContactsConsentsStatus;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class loe implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        ContactsConsentsCoarseStatus contactsConsentsCoarseStatus = null;
        ContactsConsentsDetailedStatus contactsConsentsDetailedStatus = null;
        ContactsConsentsConfig contactsConsentsConfig = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                contactsConsentsCoarseStatus = (ContactsConsentsCoarseStatus) kkw.h(parcel, i, ContactsConsentsCoarseStatus.CREATOR);
            } else if (c == 2) {
                contactsConsentsDetailedStatus = (ContactsConsentsDetailedStatus) kkw.h(parcel, i, ContactsConsentsDetailedStatus.CREATOR);
            } else if (c != 3) {
                kkw.r(parcel, i);
            } else {
                contactsConsentsConfig = (ContactsConsentsConfig) kkw.h(parcel, i, ContactsConsentsConfig.CREATOR);
            }
        }
        kkw.p(parcel, iD);
        return new ContactsConsentsStatus(contactsConsentsCoarseStatus, contactsConsentsDetailedStatus, contactsConsentsConfig);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ContactsConsentsStatus[i];
    }
}
