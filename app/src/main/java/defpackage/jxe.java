package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.aang.GetAccountsRequest;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jxe implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        boolean zS = false;
        String strL = null;
        ArrayList arrayListN = null;
        ArrayList arrayListN2 = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                strL = kkw.l(parcel, i);
            } else if (c == 2) {
                arrayListN = kkw.n(parcel, i);
            } else if (c == 3) {
                arrayListN2 = kkw.n(parcel, i);
            } else if (c != 4) {
                kkw.r(parcel, i);
            } else {
                zS = kkw.s(parcel, i);
            }
        }
        kkw.p(parcel, iD);
        return new GetAccountsRequest(strL, arrayListN, arrayListN2, zS);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetAccountsRequest[i];
    }
}
