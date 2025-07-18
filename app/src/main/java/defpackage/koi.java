package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.libs.identity.ClientIdentity;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class koi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        String strL = null;
        String strL2 = null;
        String strL3 = null;
        ArrayList arrayListO = null;
        ClientIdentity clientIdentity = null;
        int iB = 0;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iB = kkw.b(parcel, i);
            } else if (c == 3) {
                strL = kkw.l(parcel, i);
            } else if (c == 4) {
                strL2 = kkw.l(parcel, i);
            } else if (c == 6) {
                strL3 = kkw.l(parcel, i);
            } else if (c == 7) {
                clientIdentity = (ClientIdentity) kkw.h(parcel, i, ClientIdentity.CREATOR);
            } else if (c != '\b') {
                kkw.r(parcel, i);
            } else {
                arrayListO = kkw.o(parcel, i, Feature.CREATOR);
            }
        }
        kkw.p(parcel, iD);
        strL.getClass();
        return new ClientIdentity(iB, strL, strL2, strL3, arrayListO, clientIdentity);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ClientIdentity[i];
    }
}
