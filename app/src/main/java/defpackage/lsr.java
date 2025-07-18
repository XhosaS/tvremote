package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.presencemanager.PresentUser;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lsr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        String strL = null;
        String strL2 = null;
        String strL3 = null;
        int iB = 0;
        int iB2 = 0;
        long jE = 0;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    strL = kkw.l(parcel, i);
                    break;
                case 2:
                    jE = kkw.e(parcel, i);
                    break;
                case 3:
                    iB = kkw.b(parcel, i);
                    break;
                case 4:
                    iB2 = kkw.b(parcel, i);
                    break;
                case 5:
                    strL2 = kkw.l(parcel, i);
                    break;
                case 6:
                    strL3 = kkw.l(parcel, i);
                    break;
                default:
                    kkw.r(parcel, i);
                    break;
            }
        }
        kkw.p(parcel, iD);
        return new PresentUser(strL, jE, iB, iB2, strL2, strL3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PresentUser[i];
    }
}
