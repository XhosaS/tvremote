package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.consentprimitive.ContactsConsentsDetailedStatus;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lod implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        Bundle bundleF = null;
        int iB = 0;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iB = kkw.b(parcel, i);
            } else if (c != 2) {
                kkw.r(parcel, i);
            } else {
                bundleF = kkw.f(parcel, i);
            }
        }
        kkw.p(parcel, iD);
        return new ContactsConsentsDetailedStatus(iB, bundleF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ContactsConsentsDetailedStatus[i];
    }
}
