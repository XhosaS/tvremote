package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lth implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        String strL = null;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            if (((char) i) != 2) {
                kkw.r(parcel, i);
            } else {
                strL = kkw.l(parcel, i);
            }
        }
        kkw.p(parcel, iD);
        return new PseudonymousIdToken(strL);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PseudonymousIdToken[i];
    }
}
