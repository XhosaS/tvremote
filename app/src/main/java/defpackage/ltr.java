package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.signin.internal.AuthAccountResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ltr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        Intent intent = null;
        int iB = 0;
        int iB2 = 0;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iB = kkw.b(parcel, i);
            } else if (c == 2) {
                iB2 = kkw.b(parcel, i);
            } else if (c != 3) {
                kkw.r(parcel, i);
            } else {
                intent = (Intent) kkw.h(parcel, i, Intent.CREATOR);
            }
        }
        kkw.p(parcel, iD);
        return new AuthAccountResult(iB, iB2, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AuthAccountResult[i];
    }
}
