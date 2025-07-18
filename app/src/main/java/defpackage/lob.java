package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.consentprimitive.ContactsConsentsCoarseStatus;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lob implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        ArrayList arrayListO = null;
        ArrayList arrayListO2 = null;
        ArrayList arrayListO3 = null;
        boolean zS = false;
        boolean zS2 = false;
        boolean zS3 = false;
        String strL = "";
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    zS = kkw.s(parcel, i);
                    break;
                case 2:
                    zS2 = kkw.s(parcel, i);
                    break;
                case 3:
                    arrayListO = kkw.o(parcel, i, Account.CREATOR);
                    break;
                case 4:
                    arrayListO2 = kkw.o(parcel, i, Account.CREATOR);
                    break;
                case 5:
                    strL = kkw.l(parcel, i);
                    break;
                case 6:
                    zS3 = kkw.s(parcel, i);
                    break;
                case 7:
                    arrayListO3 = kkw.o(parcel, i, Account.CREATOR);
                    break;
                default:
                    kkw.r(parcel, i);
                    break;
            }
        }
        kkw.p(parcel, iD);
        return new ContactsConsentsCoarseStatus(zS, zS2, arrayListO, arrayListO2, strL, zS3, arrayListO3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ContactsConsentsCoarseStatus[i];
    }
}
