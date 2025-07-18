package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lov implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        String strL = null;
        String[] strArrW = null;
        int iB = 0;
        int[] iArrU = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                strL = kkw.l(parcel, i);
            } else if (c == 2) {
                iArrU = kkw.u(parcel, i);
            } else if (c == 4) {
                iB = kkw.b(parcel, i);
            } else if (c != 5) {
                kkw.r(parcel, i);
            } else {
                strArrW = kkw.w(parcel, i);
            }
        }
        kkw.p(parcel, iD);
        return new BackupAndSyncOptInState(strL, iArrU, iB, strArrW);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new BackupAndSyncOptInState[i];
    }
}
