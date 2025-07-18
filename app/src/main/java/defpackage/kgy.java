package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class kgy extends eru implements kgz {
    public kgy() {
        super("com.google.android.gms.common.api.internal.IStatusCallback");
    }

    @Override // defpackage.eru
    protected final boolean N(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) erv.a(parcel, Status.CREATOR);
        O(parcel);
        c(status);
        return true;
    }
}
