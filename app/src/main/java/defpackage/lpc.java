package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.cpg.ActionPreference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lpc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        long jE = 0;
        int iB = 0;
        int iB2 = 0;
        int iB3 = 0;
        String strL = null;
        String strL2 = null;
        String strL3 = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    strL = kkw.l(parcel, i);
                    break;
                case 2:
                    iB = kkw.b(parcel, i);
                    break;
                case 3:
                    iB2 = kkw.b(parcel, i);
                    break;
                case 4:
                    strL2 = kkw.l(parcel, i);
                    break;
                case 5:
                    strL3 = kkw.l(parcel, i);
                    break;
                case 6:
                    iB3 = kkw.b(parcel, i);
                    break;
                case 7:
                    jE = kkw.e(parcel, i);
                    break;
                default:
                    kkw.r(parcel, i);
                    break;
            }
        }
        kkw.p(parcel, iD);
        return new ActionPreference(strL, iB, iB2, strL2, strL3, iB3, jE);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ActionPreference[i];
    }
}
