package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.MethodInvocation;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kkg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iD = kkw.d(parcel);
        int iB = -1;
        int iB2 = 0;
        int iB3 = 0;
        int iB4 = 0;
        int iB5 = 0;
        String strL = null;
        String strL2 = null;
        long jE = 0;
        long jE2 = 0;
        while (parcel.dataPosition() < iD) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iB2 = kkw.b(parcel, i);
                    break;
                case 2:
                    iB3 = kkw.b(parcel, i);
                    break;
                case 3:
                    iB4 = kkw.b(parcel, i);
                    break;
                case 4:
                    jE = kkw.e(parcel, i);
                    break;
                case 5:
                    jE2 = kkw.e(parcel, i);
                    break;
                case 6:
                    strL = kkw.l(parcel, i);
                    break;
                case 7:
                    strL2 = kkw.l(parcel, i);
                    break;
                case '\b':
                    iB5 = kkw.b(parcel, i);
                    break;
                case '\t':
                    iB = kkw.b(parcel, i);
                    break;
                default:
                    kkw.r(parcel, i);
                    break;
            }
        }
        kkw.p(parcel, iD);
        return new MethodInvocation(iB2, iB3, iB4, jE, jE2, strL, strL2, iB5, iB);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MethodInvocation[i];
    }
}
