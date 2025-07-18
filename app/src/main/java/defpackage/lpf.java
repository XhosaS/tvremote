package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.cpg.callingcard.CallingCardFontData;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lpf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        float fA = 0.0f;
        float fA2 = 0.0f;
        float fA3 = 0.0f;
        float fA4 = 0.0f;
        float fA5 = 0.0f;
        float fA6 = 0.0f;
        float fA7 = 0.0f;
        int iB = 0;
        int iB2 = 0;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    fA = kkw.a(parcel, i);
                    break;
                case 2:
                    fA2 = kkw.a(parcel, i);
                    break;
                case 3:
                    fA3 = kkw.a(parcel, i);
                    break;
                case 4:
                    fA4 = kkw.a(parcel, i);
                    break;
                case 5:
                    fA5 = kkw.a(parcel, i);
                    break;
                case 6:
                    fA6 = kkw.a(parcel, i);
                    break;
                case 7:
                    iB = kkw.b(parcel, i);
                    break;
                case '\b':
                    iB2 = kkw.b(parcel, i);
                    break;
                case '\t':
                    fA7 = kkw.a(parcel, i);
                    break;
                default:
                    kkw.r(parcel, i);
                    break;
            }
        }
        kkw.p(parcel, iD);
        return new CallingCardFontData(fA, fA2, fA3, fA4, fA5, fA6, iB, iB2, fA7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CallingCardFontData[i];
    }
}
