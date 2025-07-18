package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.contactssync.model.DeviceContactsSyncSetting;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class loy implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        Account account = null;
        int iB = 0;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iB = kkw.b(parcel, i);
            } else if (c != 2) {
                kkw.r(parcel, i);
            } else {
                account = (Account) kkw.h(parcel, i, Account.CREATOR);
            }
        }
        kkw.p(parcel, iD);
        return new DeviceContactsSyncSetting(iB, account);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DeviceContactsSyncSetting[i];
    }
}
