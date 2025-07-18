package defpackage;

import android.bluetooth.BluetoothDevice;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.nearby.messages.internal.ClientAppContext;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class odt implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public odt(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        long jAa = 0;
        int iX = 0;
        byte[] bArrAo = null;
        ClientAppContext clientAppContext = null;
        Uri uri = null;
        String strAh = null;
        String strAh2 = null;
        byte[] bArrAo2 = null;
        String strAh3 = null;
        Uri uri2 = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        Uri uri3 = null;
        Uri uri4 = null;
        switch (this.a) {
            case 0:
                int iZ = ocv.Z(parcel);
                String strAh4 = null;
                String strAh5 = null;
                String strAh6 = null;
                String strAh7 = null;
                String strAh8 = null;
                Bundle bundleAb = null;
                while (parcel.dataPosition() < iZ) {
                    int i = parcel.readInt();
                    switch (ocv.V(i)) {
                        case 2:
                            strAh4 = ocv.ah(parcel, i);
                            break;
                        case 3:
                            strAh5 = ocv.ah(parcel, i);
                            break;
                        case 4:
                            strAh6 = ocv.ah(parcel, i);
                            break;
                        case 5:
                            strAh7 = ocv.ah(parcel, i);
                            break;
                        case 6:
                            strAh8 = ocv.ah(parcel, i);
                            break;
                        case 7:
                            bundleAb = ocv.ab(parcel, i);
                            break;
                        default:
                            ocv.am(parcel, i);
                            break;
                    }
                }
                ocv.al(parcel, iZ);
                return new ods(strAh4, strAh5, strAh6, strAh7, strAh8, bundleAb);
            case 1:
                int iZ2 = ocv.Z(parcel);
                while (parcel.dataPosition() < iZ2) {
                    int i2 = parcel.readInt();
                    if (ocv.V(i2) != 1) {
                        ocv.am(parcel, i2);
                    } else {
                        bArrAo = ocv.ao(parcel, i2);
                    }
                }
                ocv.al(parcel, iZ2);
                return new ogs(bArrAo);
            case 2:
                int iZ3 = ocv.Z(parcel);
                while (parcel.dataPosition() < iZ3) {
                    int i3 = parcel.readInt();
                    if (ocv.V(i3) != 1) {
                        ocv.am(parcel, i3);
                    } else {
                        uri4 = (Uri) ocv.ad(parcel, i3, Uri.CREATOR);
                    }
                }
                ocv.al(parcel, iZ3);
                return new ogt(uri4);
            case 3:
                int iZ4 = ocv.Z(parcel);
                while (parcel.dataPosition() < iZ4) {
                    int i4 = parcel.readInt();
                    int iV = ocv.V(i4);
                    if (iV == 1) {
                        uri3 = (Uri) ocv.ad(parcel, i4, Uri.CREATOR);
                    } else if (iV != 2) {
                        ocv.am(parcel, i4);
                    } else {
                        iX = ocv.X(parcel, i4);
                    }
                }
                ocv.al(parcel, iZ4);
                return new ohf(uri3, iX);
            case 4:
                int iZ5 = ocv.Z(parcel);
                while (parcel.dataPosition() < iZ5) {
                    int i5 = parcel.readInt();
                    if (ocv.V(i5) != 1) {
                        ocv.am(parcel, i5);
                    } else {
                        parcelFileDescriptor = (ParcelFileDescriptor) ocv.ad(parcel, i5, ParcelFileDescriptor.CREATOR);
                    }
                }
                ocv.al(parcel, iZ5);
                return new ohg(parcelFileDescriptor);
            case 5:
                int iZ6 = ocv.Z(parcel);
                Uri uri5 = null;
                while (parcel.dataPosition() < iZ6) {
                    int i6 = parcel.readInt();
                    int iV2 = ocv.V(i6);
                    if (iV2 == 1) {
                        uri2 = (Uri) ocv.ad(parcel, i6, Uri.CREATOR);
                    } else if (iV2 != 2) {
                        ocv.am(parcel, i6);
                    } else {
                        uri5 = (Uri) ocv.ad(parcel, i6, Uri.CREATOR);
                    }
                }
                ocv.al(parcel, iZ6);
                return new ohh(uri2, uri5);
            case 6:
                int iZ7 = ocv.Z(parcel);
                int iX2 = 0;
                String strAh9 = null;
                byte[] bArrAo3 = null;
                byte[] bArrAo4 = null;
                byte[] bArrAo5 = null;
                while (parcel.dataPosition() < iZ7) {
                    int i7 = parcel.readInt();
                    int iV3 = ocv.V(i7);
                    if (iV3 == 1) {
                        strAh9 = ocv.ah(parcel, i7);
                    } else if (iV3 == 2) {
                        bArrAo3 = ocv.ao(parcel, i7);
                    } else if (iV3 == 3) {
                        bArrAo4 = ocv.ao(parcel, i7);
                    } else if (iV3 == 4) {
                        bArrAo5 = ocv.ao(parcel, i7);
                    } else if (iV3 != 5) {
                        ocv.am(parcel, i7);
                    } else {
                        iX2 = ocv.X(parcel, i7);
                    }
                }
                ocv.al(parcel, iZ7);
                return new ohm(strAh9, bArrAo3, bArrAo4, bArrAo5, iX2);
            case 7:
                int iZ8 = ocv.Z(parcel);
                int iX3 = 0;
                int iX4 = 0;
                boolean zAn = false;
                while (parcel.dataPosition() < iZ8) {
                    int i8 = parcel.readInt();
                    int iV4 = ocv.V(i8);
                    if (iV4 == 1) {
                        iX = ocv.X(parcel, i8);
                    } else if (iV4 == 2) {
                        iX3 = ocv.X(parcel, i8);
                    } else if (iV4 == 3) {
                        iX4 = ocv.X(parcel, i8);
                    } else if (iV4 != 4) {
                        ocv.am(parcel, i8);
                    } else {
                        zAn = ocv.an(parcel, i8);
                    }
                }
                ocv.al(parcel, iZ8);
                return new ohn(iX, iX3, iX4, zAn);
            case 8:
                int iZ9 = ocv.Z(parcel);
                ArrayList arrayListAk = null;
                while (parcel.dataPosition() < iZ9) {
                    int i9 = parcel.readInt();
                    int iV5 = ocv.V(i9);
                    if (iV5 == 1) {
                        strAh3 = ocv.ah(parcel, i9);
                    } else if (iV5 != 2) {
                        ocv.am(parcel, i9);
                    } else {
                        arrayListAk = ocv.ak(parcel, i9, ohp.CREATOR);
                    }
                }
                ocv.al(parcel, iZ9);
                return new oho(strAh3, arrayListAk);
            case 9:
                int iZ10 = ocv.Z(parcel);
                int iX5 = 0;
                while (parcel.dataPosition() < iZ10) {
                    int i10 = parcel.readInt();
                    int iV6 = ocv.V(i10);
                    if (iV6 == 1) {
                        iX = ocv.X(parcel, i10);
                    } else if (iV6 == 2) {
                        iX5 = ocv.X(parcel, i10);
                    } else if (iV6 != 3) {
                        ocv.am(parcel, i10);
                    } else {
                        bArrAo2 = ocv.ao(parcel, i10);
                    }
                }
                ocv.al(parcel, iZ10);
                return new ohp(iX, iX5, bArrAo2);
            case 10:
                int iZ11 = ocv.Z(parcel);
                while (parcel.dataPosition() < iZ11) {
                    ocv.am(parcel, parcel.readInt());
                }
                ocv.al(parcel, iZ11);
                return new ohq();
            case 11:
                int iZ12 = ocv.Z(parcel);
                int iX6 = 0;
                int iX7 = 0;
                String strAh10 = null;
                ohn ohnVar = null;
                ohm ohmVar = null;
                oho ohoVar = null;
                while (parcel.dataPosition() < iZ12) {
                    int i11 = parcel.readInt();
                    switch (ocv.V(i11)) {
                        case 1:
                            strAh10 = ocv.ah(parcel, i11);
                            break;
                        case 2:
                            iX6 = ocv.X(parcel, i11);
                            break;
                        case 3:
                            ohnVar = (ohn) ocv.ad(parcel, i11, ohn.CREATOR);
                            break;
                        case 4:
                            iX7 = ocv.X(parcel, i11);
                            break;
                        case 5:
                            ohmVar = (ohm) ocv.ad(parcel, i11, ohm.CREATOR);
                            break;
                        case 6:
                            ohoVar = (oho) ocv.ad(parcel, i11, oho.CREATOR);
                            break;
                        default:
                            ocv.am(parcel, i11);
                            break;
                    }
                }
                ocv.al(parcel, iZ12);
                return new ohy(strAh10, iX6, ohnVar, iX7, ohmVar, ohoVar);
            case 12:
                int iZ13 = ocv.Z(parcel);
                int iX8 = 0;
                String strAh11 = null;
                String strAh12 = null;
                String strAh13 = null;
                BluetoothDevice bluetoothDevice = null;
                byte[] bArrAo6 = null;
                ohm ohmVar2 = null;
                oho ohoVar2 = null;
                while (parcel.dataPosition() < iZ13) {
                    int i12 = parcel.readInt();
                    switch (ocv.V(i12)) {
                        case 1:
                            strAh11 = ocv.ah(parcel, i12);
                            break;
                        case 2:
                            strAh12 = ocv.ah(parcel, i12);
                            break;
                        case 3:
                            strAh13 = ocv.ah(parcel, i12);
                            break;
                        case 4:
                            bluetoothDevice = (BluetoothDevice) ocv.ad(parcel, i12, BluetoothDevice.CREATOR);
                            break;
                        case 5:
                            bArrAo6 = ocv.ao(parcel, i12);
                            break;
                        case 6:
                            iX8 = ocv.X(parcel, i12);
                            break;
                        case 7:
                            ohmVar2 = (ohm) ocv.ad(parcel, i12, ohm.CREATOR);
                            break;
                        case 8:
                            ohoVar2 = (oho) ocv.ad(parcel, i12, oho.CREATOR);
                            break;
                        default:
                            ocv.am(parcel, i12);
                            break;
                    }
                }
                ocv.al(parcel, iZ13);
                return new ohz(strAh11, strAh12, strAh13, bluetoothDevice, bArrAo6, iX8, ohmVar2, ohoVar2);
            case 13:
                int iZ14 = ocv.Z(parcel);
                ohm ohmVar3 = null;
                oho ohoVar3 = null;
                while (parcel.dataPosition() < iZ14) {
                    int i13 = parcel.readInt();
                    int iV7 = ocv.V(i13);
                    if (iV7 == 1) {
                        strAh2 = ocv.ah(parcel, i13);
                    } else if (iV7 == 2) {
                        iX = ocv.X(parcel, i13);
                    } else if (iV7 == 3) {
                        ohmVar3 = (ohm) ocv.ad(parcel, i13, ohm.CREATOR);
                    } else if (iV7 != 4) {
                        ocv.am(parcel, i13);
                    } else {
                        ohoVar3 = (oho) ocv.ad(parcel, i13, oho.CREATOR);
                    }
                }
                ocv.al(parcel, iZ14);
                return new oia(strAh2, iX, ohmVar3, ohoVar3);
            case 14:
                int iZ15 = ocv.Z(parcel);
                while (parcel.dataPosition() < iZ15) {
                    int i14 = parcel.readInt();
                    if (ocv.V(i14) != 1) {
                        ocv.am(parcel, i14);
                    } else {
                        iX = ocv.X(parcel, i14);
                    }
                }
                ocv.al(parcel, iZ15);
                return new oib(iX);
            case 15:
                int iZ16 = ocv.Z(parcel);
                long jAa2 = 0;
                byte[] bArrAo7 = null;
                ParcelFileDescriptor parcelFileDescriptor2 = null;
                Uri uri6 = null;
                while (parcel.dataPosition() < iZ16) {
                    int i15 = parcel.readInt();
                    int iV8 = ocv.V(i15);
                    if (iV8 == 1) {
                        bArrAo7 = ocv.ao(parcel, i15);
                    } else if (iV8 == 2) {
                        parcelFileDescriptor2 = (ParcelFileDescriptor) ocv.ad(parcel, i15, ParcelFileDescriptor.CREATOR);
                    } else if (iV8 == 3) {
                        jAa2 = ocv.aa(parcel, i15);
                    } else if (iV8 != 4) {
                        ocv.am(parcel, i15);
                    } else {
                        uri6 = (Uri) ocv.ad(parcel, i15, Uri.CREATOR);
                    }
                }
                ocv.al(parcel, iZ16);
                return new oif(bArrAo7, parcelFileDescriptor2, jAa2, uri6);
            case 16:
                int iZ17 = ocv.Z(parcel);
                oid oidVar = null;
                while (parcel.dataPosition() < iZ17) {
                    int i16 = parcel.readInt();
                    int iV9 = ocv.V(i16);
                    if (iV9 == 1) {
                        strAh = ocv.ah(parcel, i16);
                    } else if (iV9 != 2) {
                        ocv.am(parcel, i16);
                    } else {
                        oidVar = (oid) ocv.ad(parcel, i16, oid.CREATOR);
                    }
                }
                ocv.al(parcel, iZ17);
                return new oig(strAh, oidVar);
            case 17:
                int iZ18 = ocv.Z(parcel);
                String strAh14 = null;
                while (parcel.dataPosition() < iZ18) {
                    int i17 = parcel.readInt();
                    int iV10 = ocv.V(i17);
                    if (iV10 == 1) {
                        jAa = ocv.aa(parcel, i17);
                    } else if (iV10 == 2) {
                        uri = (Uri) ocv.ad(parcel, i17, Uri.CREATOR);
                    } else if (iV10 != 3) {
                        ocv.am(parcel, i17);
                    } else {
                        strAh14 = ocv.ah(parcel, i17);
                    }
                }
                ocv.al(parcel, iZ18);
                return new oij(jAa, uri, strAh14);
            case 18:
                int iZ19 = ocv.Z(parcel);
                long jAa3 = 0;
                boolean zAn2 = false;
                boolean zAn3 = false;
                String strAh15 = null;
                byte[][] bArrAt = null;
                oif[] oifVarArr = null;
                oid[] oidVarArr = null;
                while (parcel.dataPosition() < iZ19) {
                    int i18 = parcel.readInt();
                    switch (ocv.V(i18)) {
                        case 1:
                            zAn2 = ocv.an(parcel, i18);
                            break;
                        case 2:
                            jAa3 = ocv.aa(parcel, i18);
                            break;
                        case 3:
                            strAh15 = ocv.ah(parcel, i18);
                            break;
                        case 4:
                            bArrAt = ocv.at(parcel, i18);
                            break;
                        case 5:
                            oifVarArr = (oif[]) ocv.ar(parcel, i18, oif.CREATOR);
                            break;
                        case 6:
                            zAn3 = ocv.an(parcel, i18);
                            break;
                        case 7:
                            oidVarArr = (oid[]) ocv.ar(parcel, i18, oid.CREATOR);
                            break;
                        default:
                            ocv.am(parcel, i18);
                            break;
                    }
                }
                ocv.al(parcel, iZ19);
                return new oik(zAn2, jAa3, strAh15, bArrAt, oifVarArr, zAn3, oidVarArr);
            case 19:
                int iZ20 = ocv.Z(parcel);
                int iX9 = 0;
                boolean zAn4 = false;
                int iX10 = 0;
                String strAh16 = null;
                String strAh17 = null;
                String strAh18 = null;
                while (parcel.dataPosition() < iZ20) {
                    int i19 = parcel.readInt();
                    switch (ocv.V(i19)) {
                        case 1:
                            iX9 = ocv.X(parcel, i19);
                            break;
                        case 2:
                            strAh16 = ocv.ah(parcel, i19);
                            break;
                        case 3:
                            strAh17 = ocv.ah(parcel, i19);
                            break;
                        case 4:
                            zAn4 = ocv.an(parcel, i19);
                            break;
                        case 5:
                            iX10 = ocv.X(parcel, i19);
                            break;
                        case 6:
                            strAh18 = ocv.ah(parcel, i19);
                            break;
                        default:
                            ocv.am(parcel, i19);
                            break;
                    }
                }
                ocv.al(parcel, iZ20);
                return new ClientAppContext(iX9, strAh16, strAh17, zAn4, iX10, strAh18);
            default:
                int iZ21 = ocv.Z(parcel);
                int iX11 = 0;
                while (parcel.dataPosition() < iZ21) {
                    int i20 = parcel.readInt();
                    int iV11 = ocv.V(i20);
                    if (iV11 == 1) {
                        iX = ocv.X(parcel, i20);
                    } else if (iV11 == 2) {
                        clientAppContext = (ClientAppContext) ocv.ad(parcel, i20, ClientAppContext.CREATOR);
                    } else if (iV11 != 3) {
                        ocv.am(parcel, i20);
                    } else {
                        iX11 = ocv.X(parcel, i20);
                    }
                }
                ocv.al(parcel, iZ21);
                return new oim(iX, clientAppContext, iX11);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ods[i];
            case 1:
                return new ogs[i];
            case 2:
                return new ogt[i];
            case 3:
                return new ohf[i];
            case 4:
                return new ohg[i];
            case 5:
                return new ohh[i];
            case 6:
                return new ohm[i];
            case 7:
                return new ohn[i];
            case 8:
                return new oho[i];
            case 9:
                return new ohp[i];
            case 10:
                return new ohq[i];
            case 11:
                return new ohy[i];
            case 12:
                return new ohz[i];
            case 13:
                return new oia[i];
            case 14:
                return new oib[i];
            case 15:
                return new oif[i];
            case 16:
                return new oig[i];
            case 17:
                return new oij[i];
            case 18:
                return new oik[i];
            case 19:
                return new ClientAppContext[i];
            default:
                return new oim[i];
        }
    }
}
