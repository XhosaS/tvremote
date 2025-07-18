package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mdisync.CallerInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kqd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        long jE = 0;
        String strL = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                strL = kkw.l(parcel, i);
            } else if (c != 2) {
                kkw.r(parcel, i);
            } else {
                jE = kkw.e(parcel, i);
            }
        }
        kkw.p(parcel, iD);
        return new CallerInfo(strL, jE);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CallerInfo[i];
    }
}
