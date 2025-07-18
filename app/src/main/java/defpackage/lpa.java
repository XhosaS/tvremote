package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.contactssync.model.BackupSyncContactInfo;
import com.google.android.gms.people.contactssync.model.GetBackupSyncSuggestionResponse;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lpa implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        String strL = null;
        int iB = 0;
        BackupSyncContactInfo backupSyncContactInfo = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iB = kkw.b(parcel, i);
            } else if (c == 2) {
                strL = kkw.l(parcel, i);
            } else if (c != 3) {
                kkw.r(parcel, i);
            } else {
                backupSyncContactInfo = (BackupSyncContactInfo) kkw.h(parcel, i, BackupSyncContactInfo.CREATOR);
            }
        }
        kkw.p(parcel, iD);
        return new GetBackupSyncSuggestionResponse(iB, strL, backupSyncContactInfo);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetBackupSyncSuggestionResponse[i];
    }
}
