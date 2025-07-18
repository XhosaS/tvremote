package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.tv.remote.service.AutoValue_AudioStream;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akz implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public akz(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        ArrayList arrayListJ = null;
        ArrayList arrayListJ2 = null;
        aeq aeqVar = null;
        aja ajaVar = null;
        ArrayList arrayListI = null;
        Intent intent = null;
        int iA = 0;
        boolean zN = false;
        boolean zN2 = false;
        boolean zN3 = false;
        int iA2 = 0;
        int iA3 = 0;
        switch (this.a) {
            case 0:
                int iC = qq.C(parcel);
                int iA4 = 0;
                while (parcel.dataPosition() < iC) {
                    int i = parcel.readInt();
                    int iZ = qq.z(i);
                    if (iZ == 1) {
                        iA = qq.A(parcel, i);
                    } else if (iZ != 2) {
                        qq.M(parcel, i);
                    } else {
                        iA4 = qq.A(parcel, i);
                    }
                }
                qq.K(parcel, iC);
                return new aky(iA, iA4);
            case 1:
                int iC2 = qq.C(parcel);
                while (parcel.dataPosition() < iC2) {
                    int i2 = parcel.readInt();
                    if (qq.z(i2) != 2) {
                        qq.M(parcel, i2);
                    } else {
                        arrayListJ = qq.J(parcel, i2, akw.CREATOR);
                    }
                }
                qq.K(parcel, iC2);
                return new akx(arrayListJ);
            case 2:
                int iC3 = qq.C(parcel);
                int iA5 = 0;
                while (parcel.dataPosition() < iC3) {
                    int i3 = parcel.readInt();
                    int iZ2 = qq.z(i3);
                    if (iZ2 == 1) {
                        iA3 = qq.A(parcel, i3);
                    } else if (iZ2 == 2) {
                        iA5 = qq.A(parcel, i3);
                    } else if (iZ2 != 3) {
                        qq.M(parcel, i3);
                    } else {
                        intent = (Intent) qq.G(parcel, i3, Intent.CREATOR);
                    }
                }
                qq.K(parcel, iC3);
                return new alp(iA3, iA5, intent);
            case 3:
                int iC4 = qq.C(parcel);
                String strH = null;
                while (parcel.dataPosition() < iC4) {
                    int i4 = parcel.readInt();
                    int iZ3 = qq.z(i4);
                    if (iZ3 == 1) {
                        arrayListI = qq.I(parcel, i4);
                    } else if (iZ3 != 2) {
                        qq.M(parcel, i4);
                    } else {
                        strH = qq.H(parcel, i4);
                    }
                }
                qq.K(parcel, iC4);
                return new als(arrayListI, strH);
            case 4:
                int iC5 = qq.C(parcel);
                while (parcel.dataPosition() < iC5) {
                    int i5 = parcel.readInt();
                    int iZ4 = qq.z(i5);
                    if (iZ4 == 1) {
                        iA2 = qq.A(parcel, i5);
                    } else if (iZ4 != 2) {
                        qq.M(parcel, i5);
                    } else {
                        ajaVar = (aja) qq.G(parcel, i5, aja.CREATOR);
                    }
                }
                qq.K(parcel, iC5);
                return new alu(iA2, ajaVar);
            case 5:
                int iC6 = qq.C(parcel);
                int iA6 = 0;
                ajb ajbVar = null;
                while (parcel.dataPosition() < iC6) {
                    int i6 = parcel.readInt();
                    int iZ5 = qq.z(i6);
                    if (iZ5 == 1) {
                        iA6 = qq.A(parcel, i6);
                    } else if (iZ5 == 2) {
                        aeqVar = (aeq) qq.G(parcel, i6, aeq.CREATOR);
                    } else if (iZ5 != 3) {
                        qq.M(parcel, i6);
                    } else {
                        ajbVar = (ajb) qq.G(parcel, i6, ajb.CREATOR);
                    }
                }
                qq.K(parcel, iC6);
                return new alv(iA6, aeqVar, ajbVar);
            case 6:
                int iC7 = qq.C(parcel);
                String strH2 = null;
                byte[] bArrO = null;
                ArrayList arrayList = null;
                while (parcel.dataPosition() < iC7) {
                    int i7 = parcel.readInt();
                    int iZ6 = qq.z(i7);
                    if (iZ6 == 1) {
                        strH2 = qq.H(parcel, i7);
                    } else if (iZ6 == 2) {
                        bArrO = qq.O(parcel, i7);
                    } else if (iZ6 != 3) {
                        qq.M(parcel, i7);
                    } else {
                        int iB = qq.B(parcel, i7);
                        int iDataPosition = parcel.dataPosition();
                        if (iB == 0) {
                            arrayList = null;
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            int i8 = parcel.readInt();
                            for (int i9 = 0; i9 < i8; i9++) {
                                arrayList2.add(Integer.valueOf(parcel.readInt()));
                            }
                            parcel.setDataPosition(iDataPosition + iB);
                            arrayList = arrayList2;
                        }
                    }
                }
                qq.K(parcel, iC7);
                return new amo(strH2, bArrO, arrayList);
            case 7:
                int iC8 = qq.C(parcel);
                boolean zN4 = false;
                while (parcel.dataPosition() < iC8) {
                    int i10 = parcel.readInt();
                    int iZ7 = qq.z(i10);
                    if (iZ7 == 1) {
                        arrayListJ2 = qq.J(parcel, i10, amo.CREATOR);
                    } else if (iZ7 == 2) {
                        zN3 = qq.N(parcel, i10);
                    } else if (iZ7 != 3) {
                        qq.M(parcel, i10);
                    } else {
                        zN4 = qq.N(parcel, i10);
                    }
                }
                qq.K(parcel, iC8);
                return new amp(arrayListJ2, zN3, zN4);
            case 8:
                int iC9 = qq.C(parcel);
                int iA7 = 0;
                while (parcel.dataPosition() < iC9) {
                    int i11 = parcel.readInt();
                    int iZ8 = qq.z(i11);
                    if (iZ8 == 2) {
                        zN2 = qq.N(parcel, i11);
                    } else if (iZ8 != 3) {
                        qq.M(parcel, i11);
                    } else {
                        iA7 = qq.A(parcel, i11);
                    }
                }
                qq.K(parcel, iC9);
                return new amq(zN2, iA7);
            case 9:
                int iC10 = qq.C(parcel);
                boolean zN5 = false;
                int iA8 = 0;
                while (parcel.dataPosition() < iC10) {
                    int i12 = parcel.readInt();
                    int iZ9 = qq.z(i12);
                    if (iZ9 == 2) {
                        zN = qq.N(parcel, i12);
                    } else if (iZ9 == 3) {
                        zN5 = qq.N(parcel, i12);
                    } else if (iZ9 != 4) {
                        qq.M(parcel, i12);
                    } else {
                        iA8 = qq.A(parcel, i12);
                    }
                }
                qq.K(parcel, iC10);
                return new amw(zN, zN5, iA8);
            case 10:
                int iC11 = qq.C(parcel);
                ArrayList arrayListI2 = null;
                String strH3 = null;
                int iA9 = 0;
                boolean zN6 = false;
                int iA10 = 0;
                boolean zN7 = false;
                while (parcel.dataPosition() < iC11) {
                    int i13 = parcel.readInt();
                    switch (qq.z(i13)) {
                        case 2:
                            iA9 = qq.A(parcel, i13);
                            break;
                        case 3:
                            zN6 = qq.N(parcel, i13);
                            break;
                        case 4:
                            arrayListI2 = qq.I(parcel, i13);
                            break;
                        case 5:
                            iA10 = qq.A(parcel, i13);
                            break;
                        case 6:
                            strH3 = qq.H(parcel, i13);
                            break;
                        case 7:
                            zN7 = qq.N(parcel, i13);
                            break;
                        default:
                            qq.M(parcel, i13);
                            break;
                    }
                }
                qq.K(parcel, iC11);
                return new anc(iA9, zN6, arrayListI2, iA10, strH3, zN7);
            case 11:
                return new bed(parcel);
            case 12:
                return new bip(parcel);
            case 13:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) parcel.readTypedObject(ParcelFileDescriptor.CREATOR);
                bmq bmqVar = new bmq();
                bmqVar.a = parcelFileDescriptor;
                bmqVar.c(parcel.readInt());
                bmqVar.b(parcel.readInt());
                bmqVar.e(parcel.readInt());
                parcel.readInt();
                if (parcelFileDescriptor == null) {
                    bmqVar.b = new acj(parcel.readStrongBinder(), "com.google.android.tv.remote.service.IndirectParcelFileDescriptor");
                    bmqVar.d(parcel.readInt());
                } else {
                    bmqVar.d(0);
                }
                return bmqVar.a();
            default:
                try {
                    byte[] bArrCreateByteArray = parcel.createByteArray();
                    cli cliVar = cli.a;
                    cni cniVar = cni.a;
                    clt cltVarQ = clt.q(buk.a, bArrCreateByteArray, 0, bArrCreateByteArray.length, cli.a);
                    clt.B(cltVarQ);
                    return new bun((buk) cltVarQ);
                } catch (cmh unused) {
                    return null;
                }
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new aky[i];
            case 1:
                return new akx[i];
            case 2:
                return new alp[i];
            case 3:
                return new als[i];
            case 4:
                return new alu[i];
            case 5:
                return new alv[i];
            case 6:
                return new amo[i];
            case 7:
                return new amp[i];
            case 8:
                return new amq[i];
            case 9:
                return new amw[i];
            case 10:
                return new anc[i];
            case 11:
                return new bed[i];
            case 12:
                return new bip[i];
            case 13:
                return new AutoValue_AudioStream[i];
            default:
                return new bun[i];
        }
    }
}
