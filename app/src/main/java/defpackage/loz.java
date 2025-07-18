package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.contactssync.model.ExtendedSyncStatus;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class loz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        int iB = 0;
        int iB2 = 0;
        int iB3 = 0;
        int iB4 = 0;
        int iB5 = 0;
        int iB6 = 0;
        int iB7 = 0;
        long jE = 0;
        String strL = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    iB = kkw.b(parcel, i);
                    break;
                case 3:
                    strL = kkw.l(parcel, i);
                    break;
                case 4:
                    jE = kkw.e(parcel, i);
                    break;
                case 5:
                    iB2 = kkw.b(parcel, i);
                    break;
                case 6:
                    iB3 = kkw.b(parcel, i);
                    break;
                case 7:
                    iB4 = kkw.b(parcel, i);
                    break;
                case '\b':
                    iB5 = kkw.b(parcel, i);
                    break;
                case '\t':
                    iB6 = kkw.b(parcel, i);
                    break;
                case '\n':
                    iB7 = kkw.b(parcel, i);
                    break;
                default:
                    kkw.r(parcel, i);
                    break;
            }
        }
        kkw.p(parcel, iD);
        return new ExtendedSyncStatus(iB, strL, jE, iB2, iB3, iB4, iB5, iB6, iB7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ExtendedSyncStatus[i];
    }
}
