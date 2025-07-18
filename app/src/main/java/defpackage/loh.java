package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.people.account.categories.ClassifyAccountTypeResult;
import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState;
import com.google.android.gms.people.cpg.CpgDocument;
import com.google.android.gms.people.cpg.callingcard.CallingCardRequestStatus;
import com.google.android.gms.people.cpg.callingcard.GetCallingCardResponse;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class loh extends eru implements loi {
    public loh() {
        super("com.google.android.gms.people.contactssync.internal.IContactsSyncServiceCallbacks");
    }

    @Override // defpackage.eru
    protected final boolean N(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                O(parcel);
                return true;
            case 2:
                O(parcel);
                return true;
            case 3:
                O(parcel);
                return true;
            case 4:
                O(parcel);
                return true;
            case 5:
                O(parcel);
                return true;
            case 6:
                O(parcel);
                return true;
            case 7:
                Status status = (Status) erv.a(parcel, Status.CREATOR);
                BackupAndSyncOptInState backupAndSyncOptInState = (BackupAndSyncOptInState) erv.a(parcel, BackupAndSyncOptInState.CREATOR);
                O(parcel);
                d(status, backupAndSyncOptInState);
                return true;
            case 8:
                O(parcel);
                return true;
            case 9:
                O(parcel);
                return true;
            case 10:
                parcel.createTypedArrayList(ClassifyAccountTypeResult.CREATOR);
                O(parcel);
                return true;
            case 11:
                O(parcel);
                return true;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                O(parcel);
                return true;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                parcel.readArrayList(erv.a);
                O(parcel);
                return true;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                O(parcel);
                return true;
            case 15:
                O(parcel);
                return true;
            case 16:
                parcel.readInt();
                O(parcel);
                return true;
            case 17:
                parcel.readArrayList(erv.a);
                O(parcel);
                return true;
            case 18:
                c();
                return true;
            case 19:
                Status status2 = (Status) erv.a(parcel, Status.CREATOR);
                O(parcel);
                f(status2);
                return true;
            case 20:
                O(parcel);
                return true;
            case 21:
                Status status3 = (Status) erv.a(parcel, Status.CREATOR);
                String string = parcel.readString();
                O(parcel);
                e(status3, string);
                return true;
            case 22:
                O(parcel);
                return true;
            case 23:
                parcel.createTypedArrayList(CpgDocument.CREATOR);
                O(parcel);
                return true;
            case 24:
                O(parcel);
                return true;
            case 25:
                parcel.createTypedArrayList(GetCallingCardResponse.CREATOR);
                O(parcel);
                return true;
            case 26:
                O(parcel);
                return true;
            case 27:
                parcel.createTypedArrayList(CallingCardRequestStatus.CREATOR);
                O(parcel);
                return true;
            default:
                return false;
        }
    }
}
