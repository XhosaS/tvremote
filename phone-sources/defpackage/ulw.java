package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ulw extends ifk implements IInterface {
    public ulw() {
        super("com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
    }

    public void a(Status status, ulq ulqVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ifk
    protected final boolean k(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            Status status = (Status) ifl.a(parcel, Status.CREATOR);
            ulq ulqVar = (ulq) ifl.a(parcel, ulq.CREATOR);
            ifl.b(parcel);
            a(status, ulqVar);
            return true;
        }
        if (i != 2) {
            return false;
        }
        ifl.b(parcel);
        throw new UnsupportedOperationException();
    }
}
