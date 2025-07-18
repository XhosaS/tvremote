package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.UserAttributeParcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lil implements Parcelable.Creator {
    public static void a(UserAttributeParcel userAttributeParcel, Parcel parcel) {
        int iA = kkx.a(parcel, 20293);
        kkx.f(parcel, 1, userAttributeParcel.a);
        kkx.r(parcel, 2, userAttributeParcel.b);
        kkx.g(parcel, 3, userAttributeParcel.c);
        kkx.p(parcel, 4, userAttributeParcel.d);
        kkx.r(parcel, 6, userAttributeParcel.e);
        kkx.r(parcel, 7, userAttributeParcel.f);
        Double d = userAttributeParcel.g;
        if (d != null) {
            kkx.e(parcel, 8, 8);
            parcel.writeDouble(d.doubleValue());
        }
        kkx.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        String strL = null;
        Long lK = null;
        Float fValueOf = null;
        String strL2 = null;
        String strL3 = null;
        Double dValueOf = null;
        long jE = 0;
        int iB = 0;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iB = kkw.b(parcel, i);
                    break;
                case 2:
                    strL = kkw.l(parcel, i);
                    break;
                case 3:
                    jE = kkw.e(parcel, i);
                    break;
                case 4:
                    lK = kkw.k(parcel, i);
                    break;
                case 5:
                    int iC = kkw.c(parcel, i);
                    if (iC != 0) {
                        kkw.y(parcel, iC, 4);
                        fValueOf = Float.valueOf(parcel.readFloat());
                        break;
                    } else {
                        fValueOf = null;
                        break;
                    }
                case 6:
                    strL2 = kkw.l(parcel, i);
                    break;
                case 7:
                    strL3 = kkw.l(parcel, i);
                    break;
                case '\b':
                    int iC2 = kkw.c(parcel, i);
                    if (iC2 != 0) {
                        kkw.y(parcel, iC2, 8);
                        dValueOf = Double.valueOf(parcel.readDouble());
                        break;
                    } else {
                        dValueOf = null;
                        break;
                    }
                default:
                    kkw.r(parcel, i);
                    break;
            }
        }
        kkw.p(parcel, iD);
        return new UserAttributeParcel(iB, strL, jE, lK, fValueOf, strL2, strL3, dValueOf);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new UserAttributeParcel[i];
    }
}
