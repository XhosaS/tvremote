package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.phenotype.Flag;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lre implements Parcelable.Creator {
    public static boolean a(int i) {
        return i == 0;
    }

    public static boolean b(Object obj) {
        return obj == null;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        boolean zS = false;
        int iB = 0;
        int iB2 = 0;
        int iB3 = 0;
        String strL = null;
        String strL2 = null;
        byte[] bArrT = null;
        double d = 0.0d;
        long jE = 0;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    strL = kkw.l(parcel, i);
                    break;
                case 3:
                    jE = kkw.e(parcel, i);
                    break;
                case 4:
                    zS = kkw.s(parcel, i);
                    break;
                case 5:
                    kkw.q(parcel, i, 8);
                    d = parcel.readDouble();
                    break;
                case 6:
                    strL2 = kkw.l(parcel, i);
                    break;
                case 7:
                    bArrT = kkw.t(parcel, i);
                    break;
                case '\b':
                    iB = kkw.b(parcel, i);
                    break;
                case '\t':
                    iB2 = kkw.b(parcel, i);
                    break;
                case '\n':
                    iB3 = kkw.b(parcel, i);
                    break;
                default:
                    kkw.r(parcel, i);
                    break;
            }
        }
        kkw.p(parcel, iD);
        return new Flag(strL, jE, zS, d, strL2, bArrT, iB, iB2, iB3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Flag[i];
    }
}
