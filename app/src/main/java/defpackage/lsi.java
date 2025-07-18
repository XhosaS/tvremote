package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class lsi extends eru implements lsj {
    public lsi() {
        super("com.google.android.gms.phenotype.internal.IGetStorageInfoCallbacks");
    }

    @Override // defpackage.eru
    protected final boolean N(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        Status status = (Status) erv.a(parcel, Status.CREATOR);
        byte[] bArrCreateByteArray = parcel.createByteArray();
        O(parcel);
        c(status, bArrCreateByteArray);
        return true;
    }
}
