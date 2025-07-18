package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class omd implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public omd(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        uwi uwiVar;
        String str;
        boolean zAn = false;
        boolean zAn2 = false;
        boolean zAn3 = false;
        boolean zAn4 = false;
        int iX = 0;
        int iX2 = 0;
        int iX3 = 0;
        int iX4 = 0;
        ArrayList arrayListAk = null;
        vkoVar = null;
        vko vkoVar = null;
        ArrayList arrayListAk2 = null;
        nve nveVar = null;
        oby obyVar = null;
        ArrayList arrayListAj = null;
        Intent intent = null;
        String strAh = null;
        String strAh2 = null;
        switch (this.a) {
            case 0:
                int iZ = ocv.Z(parcel);
                while (parcel.dataPosition() < iZ) {
                    int i = parcel.readInt();
                    if (ocv.V(i) != 2) {
                        ocv.am(parcel, i);
                    } else {
                        arrayListAk = ocv.ak(parcel, i, omb.CREATOR);
                    }
                }
                ocv.al(parcel, iZ);
                return new omc(arrayListAk);
            case 1:
                int iZ2 = ocv.Z(parcel);
                String strAh3 = null;
                oma omaVar = null;
                while (parcel.dataPosition() < iZ2) {
                    int i2 = parcel.readInt();
                    int iV = ocv.V(i2);
                    if (iV == 2) {
                        strAh2 = ocv.ah(parcel, i2);
                    } else if (iV == 3) {
                        strAh3 = ocv.ah(parcel, i2);
                    } else if (iV == 4) {
                        omaVar = (oma) ocv.ad(parcel, i2, oma.CREATOR);
                    } else if (iV != 5) {
                        ocv.am(parcel, i2);
                    } else {
                        zAn = ocv.an(parcel, i2);
                    }
                }
                ocv.al(parcel, iZ2);
                return new omb(strAh2, strAh3, omaVar, zAn);
            case 2:
                int iZ3 = ocv.Z(parcel);
                int iX5 = 0;
                while (parcel.dataPosition() < iZ3) {
                    int i3 = parcel.readInt();
                    int iV2 = ocv.V(i3);
                    if (iV2 == 1) {
                        iX4 = ocv.X(parcel, i3);
                    } else if (iV2 != 2) {
                        ocv.am(parcel, i3);
                    } else {
                        iX5 = ocv.X(parcel, i3);
                    }
                }
                ocv.al(parcel, iZ3);
                return new ome(iX4, iX5);
            case 3:
                int iZ4 = ocv.Z(parcel);
                while (parcel.dataPosition() < iZ4) {
                    int i4 = parcel.readInt();
                    if (ocv.V(i4) != 2) {
                        ocv.am(parcel, i4);
                    } else {
                        strAh = ocv.ah(parcel, i4);
                    }
                }
                ocv.al(parcel, iZ4);
                return new omv(strAh);
            case 4:
                return new omw(parcel);
            case 5:
                int iZ5 = ocv.Z(parcel);
                int iX6 = 0;
                while (parcel.dataPosition() < iZ5) {
                    int i5 = parcel.readInt();
                    int iV3 = ocv.V(i5);
                    if (iV3 == 1) {
                        iX3 = ocv.X(parcel, i5);
                    } else if (iV3 == 2) {
                        iX6 = ocv.X(parcel, i5);
                    } else if (iV3 != 3) {
                        ocv.am(parcel, i5);
                    } else {
                        intent = (Intent) ocv.ad(parcel, i5, Intent.CREATOR);
                    }
                }
                ocv.al(parcel, iZ5);
                return new onf(iX3, iX6, intent);
            case 6:
                int iZ6 = ocv.Z(parcel);
                String strAh4 = null;
                while (parcel.dataPosition() < iZ6) {
                    int i6 = parcel.readInt();
                    int iV4 = ocv.V(i6);
                    if (iV4 == 1) {
                        arrayListAj = ocv.aj(parcel, i6);
                    } else if (iV4 != 2) {
                        ocv.am(parcel, i6);
                    } else {
                        strAh4 = ocv.ah(parcel, i6);
                    }
                }
                ocv.al(parcel, iZ6);
                return new oni(arrayListAj, strAh4);
            case 7:
                int iZ7 = ocv.Z(parcel);
                while (parcel.dataPosition() < iZ7) {
                    int i7 = parcel.readInt();
                    int iV5 = ocv.V(i7);
                    if (iV5 == 1) {
                        iX2 = ocv.X(parcel, i7);
                    } else if (iV5 != 2) {
                        ocv.am(parcel, i7);
                    } else {
                        obyVar = (oby) ocv.ad(parcel, i7, oby.CREATOR);
                    }
                }
                ocv.al(parcel, iZ7);
                return new onk(iX2, obyVar);
            case 8:
                int iZ8 = ocv.Z(parcel);
                obz obzVar = null;
                while (parcel.dataPosition() < iZ8) {
                    int i8 = parcel.readInt();
                    int iV6 = ocv.V(i8);
                    if (iV6 == 1) {
                        iX = ocv.X(parcel, i8);
                    } else if (iV6 == 2) {
                        nveVar = (nve) ocv.ad(parcel, i8, nve.CREATOR);
                    } else if (iV6 != 3) {
                        ocv.am(parcel, i8);
                    } else {
                        obzVar = (obz) ocv.ad(parcel, i8, obz.CREATOR);
                    }
                }
                ocv.al(parcel, iZ8);
                return new onl(iX, nveVar, obzVar);
            case 9:
                int iZ9 = ocv.Z(parcel);
                String strAh5 = null;
                byte[] bArrAo = null;
                ArrayList arrayList = null;
                while (parcel.dataPosition() < iZ9) {
                    int i9 = parcel.readInt();
                    int iV7 = ocv.V(i9);
                    if (iV7 == 1) {
                        strAh5 = ocv.ah(parcel, i9);
                    } else if (iV7 == 2) {
                        bArrAo = ocv.ao(parcel, i9);
                    } else if (iV7 != 3) {
                        ocv.am(parcel, i9);
                    } else {
                        int iY = ocv.Y(parcel, i9);
                        int iDataPosition = parcel.dataPosition();
                        if (iY == 0) {
                            arrayList = null;
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            int i10 = parcel.readInt();
                            for (int i11 = 0; i11 < i10; i11++) {
                                arrayList2.add(Integer.valueOf(parcel.readInt()));
                            }
                            parcel.setDataPosition(iDataPosition + iY);
                            arrayList = arrayList2;
                        }
                    }
                }
                ocv.al(parcel, iZ9);
                return new oog(strAh5, bArrAo, arrayList);
            case 10:
                int iZ10 = ocv.Z(parcel);
                boolean zAn5 = false;
                while (parcel.dataPosition() < iZ10) {
                    int i12 = parcel.readInt();
                    int iV8 = ocv.V(i12);
                    if (iV8 == 1) {
                        arrayListAk2 = ocv.ak(parcel, i12, oog.CREATOR);
                    } else if (iV8 == 2) {
                        zAn4 = ocv.an(parcel, i12);
                    } else if (iV8 != 3) {
                        ocv.am(parcel, i12);
                    } else {
                        zAn5 = ocv.an(parcel, i12);
                    }
                }
                ocv.al(parcel, iZ10);
                return new ooh(arrayListAk2, zAn4, zAn5);
            case 11:
                int iZ11 = ocv.Z(parcel);
                int iX7 = 0;
                while (parcel.dataPosition() < iZ11) {
                    int i13 = parcel.readInt();
                    int iV9 = ocv.V(i13);
                    if (iV9 == 2) {
                        zAn3 = ocv.an(parcel, i13);
                    } else if (iV9 != 3) {
                        ocv.am(parcel, i13);
                    } else {
                        iX7 = ocv.X(parcel, i13);
                    }
                }
                ocv.al(parcel, iZ11);
                return new ooi(zAn3, iX7);
            case 12:
                int iZ12 = ocv.Z(parcel);
                boolean zAn6 = false;
                int iX8 = 0;
                while (parcel.dataPosition() < iZ12) {
                    int i14 = parcel.readInt();
                    int iV10 = ocv.V(i14);
                    if (iV10 == 2) {
                        zAn2 = ocv.an(parcel, i14);
                    } else if (iV10 == 3) {
                        zAn6 = ocv.an(parcel, i14);
                    } else if (iV10 != 4) {
                        ocv.am(parcel, i14);
                    } else {
                        iX8 = ocv.X(parcel, i14);
                    }
                }
                ocv.al(parcel, iZ12);
                return new ooo(zAn2, zAn6, iX8);
            case 13:
                int iZ13 = ocv.Z(parcel);
                int iX9 = 0;
                boolean zAn7 = false;
                int iX10 = 0;
                boolean zAn8 = false;
                ArrayList arrayListAj2 = null;
                String strAh6 = null;
                while (parcel.dataPosition() < iZ13) {
                    int i15 = parcel.readInt();
                    switch (ocv.V(i15)) {
                        case 2:
                            iX9 = ocv.X(parcel, i15);
                            break;
                        case 3:
                            zAn7 = ocv.an(parcel, i15);
                            break;
                        case 4:
                            arrayListAj2 = ocv.aj(parcel, i15);
                            break;
                        case 5:
                            iX10 = ocv.X(parcel, i15);
                            break;
                        case 6:
                            strAh6 = ocv.ah(parcel, i15);
                            break;
                        case 7:
                            zAn8 = ocv.an(parcel, i15);
                            break;
                        default:
                            ocv.am(parcel, i15);
                            break;
                    }
                }
                ocv.al(parcel, iZ13);
                return new oou(iX9, zAn7, arrayListAj2, iX10, strAh6, zAn8);
            case 14:
                return new oro(parcel);
            case 15:
                return new otp(parcel);
            case 16:
                String string = parcel.readString();
                try {
                    uwiVar = (uwi) vxr.g(parcel, uwi.a, vtp.a());
                } catch (vuq e) {
                    ((tvk) ((tvk) ((tvk) oyd.a.f()).i(e)).j("com/google/android/libraries/internal/growth/growthkit/internal/common/PromoContext$1", "createFromParcel", (char) 131, "PromoContext.java")).s("Failed to read promotion from parcel");
                    uwiVar = null;
                }
                long j = parcel.readLong();
                tvn tvnVar = oyd.a;
                ImmutableMap.Builder builder = new ImmutableMap.Builder();
                int i16 = parcel.readInt();
                for (int i17 = 0; i17 < i16; i17++) {
                    builder.put(uxv.b(parcel.readInt()), (Intent) parcel.readParcelable(Intent.class.getClassLoader()));
                }
                ImmutableMap immutableMapBuildOrThrow = builder.buildOrThrow();
                String string2 = parcel.readString();
                if (parcel.readInt() > 0) {
                    try {
                        vkoVar = (vko) vxr.g(parcel, vko.a, vtp.a());
                        str = string2;
                    } catch (vuq e2) {
                        str = string2;
                        ((tvk) ((tvk) ((tvk) oyd.a.f()).i(e2)).j("com/google/android/libraries/internal/growth/growthkit/internal/common/PromoContext$1", "createFromParcel", (char) 147, "PromoContext.java")).s("Failed to read versioned identifier from parcel");
                    }
                } else {
                    str = string2;
                }
                oyc oycVarA = oyd.a();
                oycVarA.a = string;
                oycVarA.c(uwiVar);
                oycVarA.d(j);
                oycVarA.b(immutableMapBuildOrThrow);
                oycVarA.b = vkoVar;
                oycVarA.c = str;
                return oycVarA.a();
            case 17:
                return new phc(parcel);
            case 18:
                return new prd(parcel);
            case 19:
                parcel.getClass();
                return new qpw(parcel.readString());
            default:
                parcel.getClass();
                return new qpx(parcel.readString(), parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new omc[i];
            case 1:
                return new omb[i];
            case 2:
                return new ome[i];
            case 3:
                return new omv[i];
            case 4:
                return new omw[i];
            case 5:
                return new onf[i];
            case 6:
                return new oni[i];
            case 7:
                return new onk[i];
            case 8:
                return new onl[i];
            case 9:
                return new oog[i];
            case 10:
                return new ooh[i];
            case 11:
                return new ooi[i];
            case 12:
                return new ooo[i];
            case 13:
                return new oou[i];
            case 14:
                return new oro[i];
            case 15:
                return new otp[i];
            case 16:
                return new oyd[i];
            case 17:
                return new phc[i];
            case 18:
                return new prd[i];
            case 19:
                return new qpw[i];
            default:
                return new qpx[i];
        }
    }
}
