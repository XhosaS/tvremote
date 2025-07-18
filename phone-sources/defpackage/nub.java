package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.database.CursorWindow;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.BinderWrapper;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nub implements Parcelable.Creator {
    public static final nub a = new nub(12);
    private final /* synthetic */ int b;

    public nub(int i) {
        this.b = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        long jAa = -1;
        ArrayList arrayListAk = null;
        Bundle bundleAb = null;
        Uri uri = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        String strAh = null;
        String strAh2 = null;
        nwn nwnVar = null;
        String strAh3 = null;
        String strAh4 = null;
        PendingIntent pendingIntent = null;
        Intent intent = null;
        String strAh5 = null;
        int iX = 0;
        int iX2 = 0;
        int iX3 = 0;
        int iX4 = 0;
        int iX5 = 0;
        int iX6 = 0;
        int iX7 = 0;
        boolean zAn = false;
        int iX8 = 0;
        int iX9 = 0;
        boolean zAn2 = false;
        int iX10 = 0;
        switch (this.b) {
            case 0:
                int iZ = ocv.Z(parcel);
                int iX11 = 0;
                int iX12 = 0;
                while (parcel.dataPosition() < iZ) {
                    int i = parcel.readInt();
                    int iV = ocv.V(i);
                    if (iV == 1) {
                        iX = ocv.X(parcel, i);
                    } else if (iV == 2) {
                        iX11 = ocv.X(parcel, i);
                    } else if (iV != 3) {
                        ocv.am(parcel, i);
                    } else {
                        iX12 = ocv.X(parcel, i);
                    }
                }
                ocv.al(parcel, iZ);
                return new nua(iX, iX11, iX12);
            case 1:
                int iZ2 = ocv.Z(parcel);
                while (parcel.dataPosition() < iZ2) {
                    int i2 = parcel.readInt();
                    if (ocv.V(i2) != 1) {
                        ocv.am(parcel, i2);
                    } else {
                        arrayListAk = ocv.ak(parcel, i2, nuf.CREATOR);
                    }
                }
                ocv.al(parcel, iZ2);
                return new ntt(arrayListAk);
            case 2:
                int iZ3 = ocv.Z(parcel);
                int iX13 = 0;
                while (parcel.dataPosition() < iZ3) {
                    int i3 = parcel.readInt();
                    int iV2 = ocv.V(i3);
                    if (iV2 == 1) {
                        strAh5 = ocv.ah(parcel, i3);
                    } else if (iV2 == 2) {
                        iX10 = ocv.X(parcel, i3);
                    } else if (iV2 != 3) {
                        ocv.am(parcel, i3);
                    } else {
                        iX13 = ocv.X(parcel, i3);
                    }
                }
                ocv.al(parcel, iZ3);
                return new nuf(strAh5, iX10, iX13);
            case 3:
                int iZ4 = ocv.Z(parcel);
                while (parcel.dataPosition() < iZ4) {
                    int i4 = parcel.readInt();
                    if (ocv.V(i4) != 1) {
                        ocv.am(parcel, i4);
                    } else {
                        zAn2 = ocv.an(parcel, i4);
                    }
                }
                ocv.al(parcel, iZ4);
                return new nuj(zAn2);
            case 4:
                int iZ5 = ocv.Z(parcel);
                boolean zAn3 = true;
                String strAh6 = null;
                String strAh7 = null;
                String strAh8 = null;
                Integer numAf = null;
                int iX14 = 0;
                int iX15 = 0;
                boolean zAn4 = false;
                int iX16 = 0;
                boolean zAn5 = false;
                int iX17 = 0;
                while (parcel.dataPosition() < iZ5) {
                    int i5 = parcel.readInt();
                    switch (ocv.V(i5)) {
                        case 2:
                            strAh6 = ocv.ah(parcel, i5);
                            break;
                        case 3:
                            iX14 = ocv.X(parcel, i5);
                            break;
                        case 4:
                            iX15 = ocv.X(parcel, i5);
                            break;
                        case 5:
                            strAh7 = ocv.ah(parcel, i5);
                            break;
                        case 6:
                        default:
                            ocv.am(parcel, i5);
                            break;
                        case 7:
                            zAn3 = ocv.an(parcel, i5);
                            break;
                        case 8:
                            strAh8 = ocv.ah(parcel, i5);
                            break;
                        case 9:
                            zAn4 = ocv.an(parcel, i5);
                            break;
                        case 10:
                            iX16 = ocv.X(parcel, i5);
                            break;
                        case 11:
                            numAf = ocv.af(parcel, i5);
                            break;
                        case 12:
                            zAn5 = ocv.an(parcel, i5);
                            break;
                        case 13:
                            iX17 = ocv.X(parcel, i5);
                            break;
                    }
                }
                ocv.al(parcel, iZ5);
                return new nuk(strAh6, iX14, iX15, strAh7, zAn3, strAh8, zAn4, iX16, numAf, zAn5, iX17);
            case 5:
                int iZ6 = ocv.Z(parcel);
                while (parcel.dataPosition() < iZ6) {
                    int i6 = parcel.readInt();
                    if (ocv.V(i6) != 1) {
                        ocv.am(parcel, i6);
                    } else {
                        intent = (Intent) ocv.ad(parcel, i6, Intent.CREATOR);
                    }
                }
                ocv.al(parcel, iZ6);
                return new num(intent);
            case 6:
                return new nuo(parcel.readStrongBinder());
            case 7:
                int iZ7 = ocv.Z(parcel);
                String strAh9 = null;
                int iX18 = 0;
                while (parcel.dataPosition() < iZ7) {
                    int i7 = parcel.readInt();
                    int iV3 = ocv.V(i7);
                    if (iV3 == 1) {
                        iX9 = ocv.X(parcel, i7);
                    } else if (iV3 == 2) {
                        iX18 = ocv.X(parcel, i7);
                    } else if (iV3 == 3) {
                        pendingIntent = (PendingIntent) ocv.ad(parcel, i7, PendingIntent.CREATOR);
                    } else if (iV3 != 4) {
                        ocv.am(parcel, i7);
                    } else {
                        strAh9 = ocv.ah(parcel, i7);
                    }
                }
                ocv.al(parcel, iZ7);
                return new nve(iX9, iX18, pendingIntent, strAh9);
            case 8:
                int iZ8 = ocv.Z(parcel);
                while (parcel.dataPosition() < iZ8) {
                    int i8 = parcel.readInt();
                    int iV4 = ocv.V(i8);
                    if (iV4 == 1) {
                        strAh4 = ocv.ah(parcel, i8);
                    } else if (iV4 == 2) {
                        iX8 = ocv.X(parcel, i8);
                    } else if (iV4 != 3) {
                        ocv.am(parcel, i8);
                    } else {
                        jAa = ocv.aa(parcel, i8);
                    }
                }
                ocv.al(parcel, iZ8);
                return new nvg(strAh4, iX8, jAa);
            case 9:
                int iZ9 = ocv.Z(parcel);
                String strAh10 = null;
                IBinder iBinderAc = null;
                boolean zAn6 = false;
                boolean zAn7 = false;
                boolean zAn8 = false;
                boolean zAn9 = false;
                boolean zAn10 = false;
                while (parcel.dataPosition() < iZ9) {
                    int i9 = parcel.readInt();
                    switch (ocv.V(i9)) {
                        case 1:
                            strAh10 = ocv.ah(parcel, i9);
                            break;
                        case 2:
                            zAn6 = ocv.an(parcel, i9);
                            break;
                        case 3:
                            zAn7 = ocv.an(parcel, i9);
                            break;
                        case 4:
                            iBinderAc = ocv.ac(parcel, i9);
                            break;
                        case 5:
                            zAn8 = ocv.an(parcel, i9);
                            break;
                        case 6:
                            zAn9 = ocv.an(parcel, i9);
                            break;
                        case 7:
                        default:
                            ocv.am(parcel, i9);
                            break;
                        case 8:
                            zAn10 = ocv.an(parcel, i9);
                            break;
                    }
                }
                ocv.al(parcel, iZ9);
                return new nvv(strAh10, zAn6, zAn7, iBinderAc, zAn8, zAn9, zAn10);
            case 10:
                int iZ10 = ocv.Z(parcel);
                long jAa2 = -1;
                String strAh11 = null;
                boolean zAn11 = false;
                int iX19 = 0;
                int iX20 = 0;
                while (parcel.dataPosition() < iZ10) {
                    int i10 = parcel.readInt();
                    int iV5 = ocv.V(i10);
                    if (iV5 == 1) {
                        zAn11 = ocv.an(parcel, i10);
                    } else if (iV5 == 2) {
                        strAh11 = ocv.ah(parcel, i10);
                    } else if (iV5 == 3) {
                        iX19 = ocv.X(parcel, i10);
                    } else if (iV5 == 4) {
                        iX20 = ocv.X(parcel, i10);
                    } else if (iV5 != 5) {
                        ocv.am(parcel, i10);
                    } else {
                        jAa2 = ocv.aa(parcel, i10);
                    }
                }
                ocv.al(parcel, iZ10);
                return new nvw(zAn11, strAh11, iX19, iX20, jAa2);
            case 11:
                int iZ11 = ocv.Z(parcel);
                IBinder iBinderAc2 = null;
                boolean zAn12 = false;
                while (parcel.dataPosition() < iZ11) {
                    int i11 = parcel.readInt();
                    int iV6 = ocv.V(i11);
                    if (iV6 == 1) {
                        strAh3 = ocv.ah(parcel, i11);
                    } else if (iV6 == 2) {
                        iBinderAc2 = ocv.ac(parcel, i11);
                    } else if (iV6 == 3) {
                        zAn = ocv.an(parcel, i11);
                    } else if (iV6 != 4) {
                        ocv.am(parcel, i11);
                    } else {
                        zAn12 = ocv.an(parcel, i11);
                    }
                }
                ocv.al(parcel, iZ11);
                return new nvx(strAh3, iBinderAc2, zAn, zAn12);
            case 12:
                int iDataPosition = parcel.dataPosition();
                if (parcel.readInt() != -204102970) {
                    parcel.setDataPosition(iDataPosition - 4);
                    return nwl.a;
                }
                int iZ12 = ocv.Z(parcel);
                while (parcel.dataPosition() < iZ12) {
                    int i12 = parcel.readInt();
                    if (ocv.V(i12) != 1) {
                        ocv.am(parcel, i12);
                    } else {
                        nwnVar = (nwn) ocv.ad(parcel, i12, nwn.CREATOR);
                    }
                }
                ocv.al(parcel, iZ12);
                return new nwl(nwnVar);
            case 13:
                int iZ13 = ocv.Z(parcel);
                boolean zAn13 = true;
                int iX21 = 0;
                int iX22 = 0;
                while (parcel.dataPosition() < iZ13) {
                    int i13 = parcel.readInt();
                    int iV7 = ocv.V(i13);
                    if (iV7 == 1) {
                        iX7 = ocv.X(parcel, i13);
                    } else if (iV7 == 2) {
                        iX21 = ocv.X(parcel, i13);
                    } else if (iV7 == 3) {
                        iX22 = ocv.X(parcel, i13);
                    } else if (iV7 != 4) {
                        ocv.am(parcel, i13);
                    } else {
                        zAn13 = ocv.an(parcel, i13);
                    }
                }
                ocv.al(parcel, iZ13);
                return new nwn(iX7, iX21, iX22, zAn13);
            case 14:
                int iZ14 = ocv.Z(parcel);
                while (parcel.dataPosition() < iZ14) {
                    int i14 = parcel.readInt();
                    int iV8 = ocv.V(i14);
                    if (iV8 == 1) {
                        iX6 = ocv.X(parcel, i14);
                    } else if (iV8 != 2) {
                        ocv.am(parcel, i14);
                    } else {
                        strAh2 = ocv.ah(parcel, i14);
                    }
                }
                ocv.al(parcel, iZ14);
                return new Scope(iX6, strAh2);
            case 15:
                int iZ15 = ocv.Z(parcel);
                PendingIntent pendingIntent2 = null;
                nve nveVar = null;
                while (parcel.dataPosition() < iZ15) {
                    int i15 = parcel.readInt();
                    int iV9 = ocv.V(i15);
                    if (iV9 == 1) {
                        iX5 = ocv.X(parcel, i15);
                    } else if (iV9 == 2) {
                        strAh = ocv.ah(parcel, i15);
                    } else if (iV9 == 3) {
                        pendingIntent2 = (PendingIntent) ocv.ad(parcel, i15, PendingIntent.CREATOR);
                    } else if (iV9 != 4) {
                        ocv.am(parcel, i15);
                    } else {
                        nveVar = (nve) ocv.ad(parcel, i15, nve.CREATOR);
                    }
                }
                ocv.al(parcel, iZ15);
                return new Status(iX5, strAh, pendingIntent2, nveVar);
            case 16:
                int iZ16 = ocv.Z(parcel);
                int iX23 = 0;
                while (parcel.dataPosition() < iZ16) {
                    int i16 = parcel.readInt();
                    int iV10 = ocv.V(i16);
                    if (iV10 == 1) {
                        iX4 = ocv.X(parcel, i16);
                    } else if (iV10 == 2) {
                        parcelFileDescriptor = (ParcelFileDescriptor) ocv.ad(parcel, i16, ParcelFileDescriptor.CREATOR);
                    } else if (iV10 != 3) {
                        ocv.am(parcel, i16);
                    } else {
                        iX23 = ocv.X(parcel, i16);
                    }
                }
                ocv.al(parcel, iZ16);
                return new BitmapTeleporter(iX4, parcelFileDescriptor, iX23);
            case 17:
                int iZ17 = ocv.Z(parcel);
                String[] strArrAs = null;
                CursorWindow[] cursorWindowArr = null;
                Bundle bundleAb2 = null;
                int iX24 = 0;
                int iX25 = 0;
                while (parcel.dataPosition() < iZ17) {
                    int i17 = parcel.readInt();
                    int iV11 = ocv.V(i17);
                    if (iV11 == 1) {
                        strArrAs = ocv.as(parcel, i17);
                    } else if (iV11 == 2) {
                        cursorWindowArr = (CursorWindow[]) ocv.ar(parcel, i17, CursorWindow.CREATOR);
                    } else if (iV11 == 3) {
                        iX25 = ocv.X(parcel, i17);
                    } else if (iV11 == 4) {
                        bundleAb2 = ocv.ab(parcel, i17);
                    } else if (iV11 != 1000) {
                        ocv.am(parcel, i17);
                    } else {
                        iX24 = ocv.X(parcel, i17);
                    }
                }
                ocv.al(parcel, iZ17);
                DataHolder dataHolder = new DataHolder(iX24, strArrAs, cursorWindowArr, iX25, bundleAb2);
                dataHolder.c = new Bundle();
                int i18 = 0;
                while (true) {
                    String[] strArr = dataHolder.b;
                    if (i18 >= strArr.length) {
                        CursorWindow[] cursorWindowArr2 = dataHolder.d;
                        dataHolder.g = new int[cursorWindowArr2.length];
                        int numRows = 0;
                        for (int i19 = 0; i19 < cursorWindowArr2.length; i19++) {
                            dataHolder.g[i19] = numRows;
                            numRows += cursorWindowArr2[i19].getNumRows() - (numRows - cursorWindowArr2[i19].getStartPosition());
                        }
                        dataHolder.h = numRows;
                        return dataHolder;
                    }
                    dataHolder.c.putInt(strArr[i18], i18);
                    i18++;
                }
            case 18:
                int iZ18 = ocv.Z(parcel);
                int iX26 = 0;
                int iX27 = 0;
                while (parcel.dataPosition() < iZ18) {
                    int i20 = parcel.readInt();
                    int iV12 = ocv.V(i20);
                    if (iV12 == 1) {
                        iX3 = ocv.X(parcel, i20);
                    } else if (iV12 == 2) {
                        uri = (Uri) ocv.ad(parcel, i20, Uri.CREATOR);
                    } else if (iV12 == 3) {
                        iX26 = ocv.X(parcel, i20);
                    } else if (iV12 != 4) {
                        ocv.am(parcel, i20);
                    } else {
                        iX27 = ocv.X(parcel, i20);
                    }
                }
                ocv.al(parcel, iZ18);
                return new oak(iX3, uri, iX26, iX27);
            case 19:
                return new BinderWrapper(parcel);
            default:
                int iZ19 = ocv.Z(parcel);
                nvg[] nvgVarArr = null;
                oay oayVar = null;
                while (parcel.dataPosition() < iZ19) {
                    int i21 = parcel.readInt();
                    int iV13 = ocv.V(i21);
                    if (iV13 == 1) {
                        bundleAb = ocv.ab(parcel, i21);
                    } else if (iV13 == 2) {
                        nvgVarArr = (nvg[]) ocv.ar(parcel, i21, nvg.CREATOR);
                    } else if (iV13 == 3) {
                        iX2 = ocv.X(parcel, i21);
                    } else if (iV13 != 4) {
                        ocv.am(parcel, i21);
                    } else {
                        oayVar = (oay) ocv.ad(parcel, i21, oay.CREATOR);
                    }
                }
                ocv.al(parcel, iZ19);
                return new oax(bundleAb, nvgVarArr, iX2, oayVar);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.b) {
            case 0:
                return new nua[i];
            case 1:
                return new ntt[i];
            case 2:
                return new nuf[i];
            case 3:
                return new nuj[i];
            case 4:
                return new nuk[i];
            case 5:
                return new num[i];
            case 6:
                return new nuo[i];
            case 7:
                return new nve[i];
            case 8:
                return new nvg[i];
            case 9:
                return new nvv[i];
            case 10:
                return new nvw[i];
            case 11:
                return new nvx[i];
            case 12:
                return new nwl[i];
            case 13:
                return new nwn[i];
            case 14:
                return new Scope[i];
            case 15:
                return new Status[i];
            case 16:
                return new BitmapTeleporter[i];
            case 17:
                return new DataHolder[i];
            case 18:
                return new oak[i];
            case 19:
                return new BinderWrapper[i];
            default:
                return new oax[i];
        }
    }
}
