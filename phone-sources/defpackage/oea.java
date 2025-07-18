package defpackage;

import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oea implements Parcelable.Creator {
    public static void a(odz odzVar, Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.O(parcel, 2, odzVar.a);
        ocv.E(parcel, 3, odzVar.b);
        ocv.O(parcel, 5, odzVar.c);
        ocv.N(parcel, 6, odzVar.d, i);
        ocv.O(parcel, 7, odzVar.e);
        ocv.N(parcel, 8, odzVar.f, i);
        ocv.O(parcel, 9, odzVar.g);
        ocv.S(parcel, 10, odzVar.h);
        ocv.y(parcel, 11, odzVar.i);
        ocv.N(parcel, 12, odzVar.j, i);
        ocv.N(parcel, 13, odzVar.k, i);
        ocv.y(parcel, 14, odzVar.l);
        ocv.N(parcel, 15, odzVar.m, i);
        ocv.O(parcel, 16, odzVar.n);
        ocv.y(parcel, 17, odzVar.o);
        ocv.C(parcel, 18, odzVar.p);
        ocv.y(parcel, 19, odzVar.q);
        ocv.O(parcel, 20, odzVar.r);
        ocv.N(parcel, 21, odzVar.s, i);
        ocv.x(parcel, iV);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = ocv.Z(parcel);
        String strAh = null;
        Bundle bundleAb = null;
        String strAh2 = null;
        ApplicationErrorReport applicationErrorReport = null;
        String strAh3 = null;
        BitmapTeleporter bitmapTeleporter = null;
        String strAh4 = null;
        ArrayList arrayListAk = null;
        oeh oehVar = null;
        oec oecVar = null;
        Bitmap bitmap = null;
        String strAh5 = null;
        String strAh6 = null;
        ods odsVar = null;
        boolean zAn = false;
        boolean zAn2 = false;
        boolean zAn3 = false;
        boolean zAn4 = false;
        long jAa = 0;
        while (parcel.dataPosition() < iZ) {
            int i = parcel.readInt();
            switch (ocv.V(i)) {
                case 2:
                    strAh = ocv.ah(parcel, i);
                    break;
                case 3:
                    bundleAb = ocv.ab(parcel, i);
                    break;
                case 4:
                default:
                    ocv.am(parcel, i);
                    break;
                case 5:
                    strAh2 = ocv.ah(parcel, i);
                    break;
                case 6:
                    applicationErrorReport = (ApplicationErrorReport) ocv.ad(parcel, i, ApplicationErrorReport.CREATOR);
                    break;
                case 7:
                    strAh3 = ocv.ah(parcel, i);
                    break;
                case 8:
                    bitmapTeleporter = (BitmapTeleporter) ocv.ad(parcel, i, BitmapTeleporter.CREATOR);
                    break;
                case 9:
                    strAh4 = ocv.ah(parcel, i);
                    break;
                case 10:
                    arrayListAk = ocv.ak(parcel, i, oeb.CREATOR);
                    break;
                case 11:
                    zAn = ocv.an(parcel, i);
                    break;
                case 12:
                    oehVar = (oeh) ocv.ad(parcel, i, oeh.CREATOR);
                    break;
                case 13:
                    oecVar = (oec) ocv.ad(parcel, i, oec.CREATOR);
                    break;
                case 14:
                    zAn2 = ocv.an(parcel, i);
                    break;
                case 15:
                    bitmap = (Bitmap) ocv.ad(parcel, i, Bitmap.CREATOR);
                    break;
                case 16:
                    strAh5 = ocv.ah(parcel, i);
                    break;
                case 17:
                    zAn3 = ocv.an(parcel, i);
                    break;
                case 18:
                    jAa = ocv.aa(parcel, i);
                    break;
                case 19:
                    zAn4 = ocv.an(parcel, i);
                    break;
                case 20:
                    strAh6 = ocv.ah(parcel, i);
                    break;
                case 21:
                    odsVar = (ods) ocv.ad(parcel, i, ods.CREATOR);
                    break;
            }
        }
        ocv.al(parcel, iZ);
        return new odz(strAh, bundleAb, strAh2, applicationErrorReport, strAh3, bitmapTeleporter, strAh4, arrayListAk, zAn, oehVar, oecVar, zAn2, bitmap, strAh5, zAn3, jAa, zAn4, strAh6, odsVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new odz[i];
    }
}
