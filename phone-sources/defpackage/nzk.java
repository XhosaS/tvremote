package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class nzk extends ifk implements nzl {
    public nzk() {
        super("com.google.android.gms.common.api.internal.IStatusCallback");
    }

    @Override // defpackage.ifk
    protected final boolean k(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) ifl.a(parcel, Status.CREATOR);
        ifl.b(parcel);
        a(status);
        return true;
    }
}
