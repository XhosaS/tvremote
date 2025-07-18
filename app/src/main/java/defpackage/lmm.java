package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mobstore.OpenFileDescriptorResponse;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class lmm extends eru implements lmn {
    public lmm() {
        super("com.google.android.gms.mobstore.IMobStoreFileCallbacks");
    }

    @Override // defpackage.eru
    protected final boolean N(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            Status status = (Status) erv.a(parcel, Status.CREATOR);
            OpenFileDescriptorResponse openFileDescriptorResponse = (OpenFileDescriptorResponse) erv.a(parcel, OpenFileDescriptorResponse.CREATOR);
            O(parcel);
            c(status, openFileDescriptorResponse);
        } else if (i == 2) {
            Status status2 = (Status) erv.a(parcel, Status.CREATOR);
            O(parcel);
            a(status2);
        } else {
            if (i != 3) {
                return false;
            }
            Status status3 = (Status) erv.a(parcel, Status.CREATOR);
            O(parcel);
            d(status3);
        }
        return true;
    }
}
