package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.appcompat.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class npl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = ocv.Z(parcel);
        int iX = 0;
        int iX2 = 0;
        int iX3 = 0;
        int iX4 = 0;
        int iX5 = 0;
        int iX6 = 0;
        int iX7 = 0;
        int iX8 = 0;
        int iX9 = 0;
        int iX10 = 0;
        int iX11 = 0;
        int iX12 = 0;
        int iX13 = 0;
        int iX14 = 0;
        int iX15 = 0;
        int iX16 = 0;
        int iX17 = 0;
        int iX18 = 0;
        int iX19 = 0;
        int iX20 = 0;
        int iX21 = 0;
        int iX22 = 0;
        int iX23 = 0;
        int iX24 = 0;
        int iX25 = 0;
        int iX26 = 0;
        int iX27 = 0;
        boolean zAn = false;
        boolean zAn2 = false;
        ArrayList arrayListAj = null;
        int[] iArrAp = null;
        String strAh = null;
        IBinder iBinderAc = null;
        long jAa = 0;
        while (parcel.dataPosition() < iZ) {
            int i = parcel.readInt();
            switch (ocv.V(i)) {
                case 2:
                    arrayListAj = ocv.aj(parcel, i);
                    break;
                case 3:
                    iArrAp = ocv.ap(parcel, i);
                    break;
                case 4:
                    jAa = ocv.aa(parcel, i);
                    break;
                case 5:
                    strAh = ocv.ah(parcel, i);
                    break;
                case 6:
                    iX = ocv.X(parcel, i);
                    break;
                case 7:
                    iX2 = ocv.X(parcel, i);
                    break;
                case 8:
                    iX3 = ocv.X(parcel, i);
                    break;
                case 9:
                    iX4 = ocv.X(parcel, i);
                    break;
                case 10:
                    iX5 = ocv.X(parcel, i);
                    break;
                case 11:
                    iX6 = ocv.X(parcel, i);
                    break;
                case 12:
                    iX7 = ocv.X(parcel, i);
                    break;
                case 13:
                    iX8 = ocv.X(parcel, i);
                    break;
                case 14:
                    iX9 = ocv.X(parcel, i);
                    break;
                case 15:
                    iX10 = ocv.X(parcel, i);
                    break;
                case 16:
                    iX11 = ocv.X(parcel, i);
                    break;
                case 17:
                    iX12 = ocv.X(parcel, i);
                    break;
                case 18:
                    iX13 = ocv.X(parcel, i);
                    break;
                case 19:
                    iX14 = ocv.X(parcel, i);
                    break;
                case 20:
                    iX15 = ocv.X(parcel, i);
                    break;
                case 21:
                    iX16 = ocv.X(parcel, i);
                    break;
                case 22:
                    iX17 = ocv.X(parcel, i);
                    break;
                case 23:
                    iX18 = ocv.X(parcel, i);
                    break;
                case 24:
                    iX19 = ocv.X(parcel, i);
                    break;
                case 25:
                    iX20 = ocv.X(parcel, i);
                    break;
                case 26:
                    iX21 = ocv.X(parcel, i);
                    break;
                case 27:
                    iX22 = ocv.X(parcel, i);
                    break;
                case 28:
                    iX23 = ocv.X(parcel, i);
                    break;
                case 29:
                    iX24 = ocv.X(parcel, i);
                    break;
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                    iX25 = ocv.X(parcel, i);
                    break;
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                    iX26 = ocv.X(parcel, i);
                    break;
                case 32:
                    iX27 = ocv.X(parcel, i);
                    break;
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                    iBinderAc = ocv.ac(parcel, i);
                    break;
                case 34:
                    zAn = ocv.an(parcel, i);
                    break;
                case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                    zAn2 = ocv.an(parcel, i);
                    break;
                default:
                    ocv.am(parcel, i);
                    break;
            }
        }
        ocv.al(parcel, iZ);
        return new npk(arrayListAj, iArrAp, jAa, strAh, iX, iX2, iX3, iX4, iX5, iX6, iX7, iX8, iX9, iX10, iX11, iX12, iX13, iX14, iX15, iX16, iX17, iX18, iX19, iX20, iX21, iX22, iX23, iX24, iX25, iX26, iX27, iBinderAc, zAn, zAn2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new npk[i];
    }
}
