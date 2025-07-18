package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.BatchUploadStatusParcel;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import com.google.android.gms.measurement.internal.ConsentParcel;
import com.google.android.gms.measurement.internal.EventParcel;
import com.google.android.gms.measurement.internal.UploadBatchesCriteria;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
import java.util.List;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class kzi extends eru implements kzj {
    public kzi() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // defpackage.eru
    protected final boolean N(int i, Parcel parcel, Parcel parcel2) {
        kzp kznVar = null;
        kzm kzkVar = null;
        switch (i) {
            case 1:
                EventParcel eventParcel = (EventParcel) erv.a(parcel, EventParcel.CREATOR);
                AppMetadata appMetadata = (AppMetadata) erv.a(parcel, AppMetadata.CREATOR);
                O(parcel);
                p(eventParcel, appMetadata);
                parcel2.writeNoException();
                return true;
            case 2:
                UserAttributeParcel userAttributeParcel = (UserAttributeParcel) erv.a(parcel, UserAttributeParcel.CREATOR);
                AppMetadata appMetadata2 = (AppMetadata) erv.a(parcel, AppMetadata.CREATOR);
                O(parcel);
                A(userAttributeParcel, appMetadata2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            case 28:
            default:
                return false;
            case 4:
                AppMetadata appMetadata3 = (AppMetadata) erv.a(parcel, AppMetadata.CREATOR);
                O(parcel);
                n(appMetadata3);
                parcel2.writeNoException();
                return true;
            case 5:
                EventParcel eventParcel2 = (EventParcel) erv.a(parcel, EventParcel.CREATOR);
                String string = parcel.readString();
                parcel.readString();
                O(parcel);
                D(eventParcel2, string);
                parcel2.writeNoException();
                return true;
            case 6:
                AppMetadata appMetadata4 = (AppMetadata) erv.a(parcel, AppMetadata.CREATOR);
                O(parcel);
                y(appMetadata4);
                parcel2.writeNoException();
                return true;
            case 7:
                AppMetadata appMetadata5 = (AppMetadata) erv.a(parcel, AppMetadata.CREATOR);
                boolean zD = erv.d(parcel);
                O(parcel);
                List listH = h(appMetadata5, zD);
                parcel2.writeNoException();
                parcel2.writeTypedList(listH);
                return true;
            case 9:
                EventParcel eventParcel3 = (EventParcel) erv.a(parcel, EventParcel.CREATOR);
                String string2 = parcel.readString();
                O(parcel);
                byte[] bArrC = C(eventParcel3, string2);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrC);
                return true;
            case 10:
                long j = parcel.readLong();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                O(parcel);
                v(j, string3, string4, string5);
                parcel2.writeNoException();
                return true;
            case 11:
                AppMetadata appMetadata6 = (AppMetadata) erv.a(parcel, AppMetadata.CREATOR);
                O(parcel);
                String strF = f(appMetadata6);
                parcel2.writeNoException();
                parcel2.writeString(strF);
                return true;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                ConditionalUserPropertyParcel conditionalUserPropertyParcel = (ConditionalUserPropertyParcel) erv.a(parcel, ConditionalUserPropertyParcel.CREATOR);
                AppMetadata appMetadata7 = (AppMetadata) erv.a(parcel, AppMetadata.CREATOR);
                O(parcel);
                s(conditionalUserPropertyParcel, appMetadata7);
                parcel2.writeNoException();
                return true;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ConditionalUserPropertyParcel conditionalUserPropertyParcel2 = (ConditionalUserPropertyParcel) erv.a(parcel, ConditionalUserPropertyParcel.CREATOR);
                O(parcel);
                t(conditionalUserPropertyParcel2);
                parcel2.writeNoException();
                return true;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                boolean zD2 = erv.d(parcel);
                AppMetadata appMetadata8 = (AppMetadata) erv.a(parcel, AppMetadata.CREATOR);
                O(parcel);
                List listK = k(string6, string7, zD2, appMetadata8);
                parcel2.writeNoException();
                parcel2.writeTypedList(listK);
                return true;
            case 15:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                boolean zD3 = erv.d(parcel);
                O(parcel);
                List listL = l(string8, string9, string10, zD3);
                parcel2.writeNoException();
                parcel2.writeTypedList(listL);
                return true;
            case 16:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                AppMetadata appMetadata9 = (AppMetadata) erv.a(parcel, AppMetadata.CREATOR);
                O(parcel);
                List listI = i(string11, string12, appMetadata9);
                parcel2.writeNoException();
                parcel2.writeTypedList(listI);
                return true;
            case 17:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                O(parcel);
                List listJ = j(string13, string14, string15);
                parcel2.writeNoException();
                parcel2.writeTypedList(listJ);
                return true;
            case 18:
                AppMetadata appMetadata10 = (AppMetadata) erv.a(parcel, AppMetadata.CREATOR);
                O(parcel);
                r(appMetadata10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) erv.a(parcel, Bundle.CREATOR);
                AppMetadata appMetadata11 = (AppMetadata) erv.a(parcel, AppMetadata.CREATOR);
                O(parcel);
                w(bundle, appMetadata11);
                parcel2.writeNoException();
                return true;
            case 20:
                AppMetadata appMetadata12 = (AppMetadata) erv.a(parcel, AppMetadata.CREATOR);
                O(parcel);
                u(appMetadata12);
                parcel2.writeNoException();
                return true;
            case 21:
                AppMetadata appMetadata13 = (AppMetadata) erv.a(parcel, AppMetadata.CREATOR);
                O(parcel);
                ConsentParcel consentParcelE = e(appMetadata13);
                parcel2.writeNoException();
                if (consentParcelE == null) {
                    parcel2.writeInt(0);
                } else {
                    parcel2.writeInt(1);
                    kua.a(consentParcelE, parcel2);
                }
                return true;
            case 24:
                AppMetadata appMetadata14 = (AppMetadata) erv.a(parcel, AppMetadata.CREATOR);
                Bundle bundle2 = (Bundle) erv.a(parcel, Bundle.CREATOR);
                O(parcel);
                List listG = g(appMetadata14, bundle2);
                parcel2.writeNoException();
                parcel2.writeTypedList(listG);
                return true;
            case 25:
                AppMetadata appMetadata15 = (AppMetadata) erv.a(parcel, AppMetadata.CREATOR);
                O(parcel);
                z(appMetadata15);
                parcel2.writeNoException();
                return true;
            case 26:
                AppMetadata appMetadata16 = (AppMetadata) erv.a(parcel, AppMetadata.CREATOR);
                O(parcel);
                x(appMetadata16);
                parcel2.writeNoException();
                return true;
            case 27:
                AppMetadata appMetadata17 = (AppMetadata) erv.a(parcel, AppMetadata.CREATOR);
                O(parcel);
                m(appMetadata17);
                parcel2.writeNoException();
                return true;
            case 29:
                AppMetadata appMetadata18 = (AppMetadata) erv.a(parcel, AppMetadata.CREATOR);
                UploadBatchesCriteria uploadBatchesCriteria = (UploadBatchesCriteria) erv.a(parcel, UploadBatchesCriteria.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    kznVar = iInterfaceQueryLocalInterface instanceof kzp ? (kzp) iInterfaceQueryLocalInterface : new kzn(strongBinder);
                }
                O(parcel);
                o(appMetadata18, uploadBatchesCriteria, kznVar);
                parcel2.writeNoException();
                return true;
            case 30:
                AppMetadata appMetadata19 = (AppMetadata) erv.a(parcel, AppMetadata.CREATOR);
                BatchUploadStatusParcel batchUploadStatusParcel = (BatchUploadStatusParcel) erv.a(parcel, BatchUploadStatusParcel.CREATOR);
                O(parcel);
                B(appMetadata19, batchUploadStatusParcel);
                parcel2.writeNoException();
                return true;
            case 31:
                AppMetadata appMetadata20 = (AppMetadata) erv.a(parcel, AppMetadata.CREATOR);
                Bundle bundle3 = (Bundle) erv.a(parcel, Bundle.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    kzkVar = iInterfaceQueryLocalInterface2 instanceof kzm ? (kzm) iInterfaceQueryLocalInterface2 : new kzk(strongBinder2);
                }
                O(parcel);
                q(appMetadata20, bundle3, kzkVar);
                parcel2.writeNoException();
                return true;
        }
    }
}
