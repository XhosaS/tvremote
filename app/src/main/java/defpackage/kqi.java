package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdisync.internal.SyncResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class kqi extends eru implements kqj {
    public kqi() {
        super("com.google.android.gms.mdisync.internal.IMdiSyncCallbacks");
    }

    @Override // defpackage.eru
    protected final boolean N(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) erv.a(parcel, Status.CREATOR);
        SyncResult syncResult = (SyncResult) erv.a(parcel, SyncResult.CREATOR);
        O(parcel);
        a(status, syncResult);
        return true;
    }
}
