package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lwk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        int iB = 0;
        boolean zS = false;
        int iB2 = 0;
        boolean zS2 = false;
        ArrayList arrayListN = null;
        String strL = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    iB = kkw.b(parcel, i);
                    break;
                case 3:
                    zS = kkw.s(parcel, i);
                    break;
                case 4:
                    arrayListN = kkw.n(parcel, i);
                    break;
                case 5:
                    iB2 = kkw.b(parcel, i);
                    break;
                case 6:
                    strL = kkw.l(parcel, i);
                    break;
                case 7:
                    zS2 = kkw.s(parcel, i);
                    break;
                default:
                    kkw.r(parcel, i);
                    break;
            }
        }
        kkw.p(parcel, iD);
        return new UsageReportingOptInOptions(iB, zS, arrayListN, iB2, strL, zS2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new UsageReportingOptInOptions[i];
    }
}
