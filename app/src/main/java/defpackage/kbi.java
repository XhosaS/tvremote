package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.clearcut.internal.LogVerifierResultParcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kbi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        boolean zS = false;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            if (((char) i) != 1) {
                kkw.r(parcel, i);
            } else {
                zS = kkw.s(parcel, i);
            }
        }
        kkw.p(parcel, iD);
        return new LogVerifierResultParcelable(zS);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LogVerifierResultParcelable[i];
    }
}
