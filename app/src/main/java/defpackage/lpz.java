package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.internal.SyncStatus;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lpz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        long jE = 0;
        String strL = null;
        int iB = 0;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 2) {
                iB = kkw.b(parcel, i);
            } else if (c == 3) {
                strL = kkw.l(parcel, i);
            } else if (c != 4) {
                kkw.r(parcel, i);
            } else {
                jE = kkw.e(parcel, i);
            }
        }
        kkw.p(parcel, iD);
        return new SyncStatus(iB, strL, jE);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SyncStatus[i];
    }
}
