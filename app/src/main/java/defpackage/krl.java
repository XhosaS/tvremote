package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.api.internal.ScionActivityInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class krl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        String strL = null;
        int iB = 0;
        Intent intent = null;
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
                intent = (Intent) kkw.h(parcel, i, Intent.CREATOR);
            }
        }
        kkw.p(parcel, iD);
        return new ScionActivityInfo(iB, strL, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ScionActivityInfo[i];
    }
}
