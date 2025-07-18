package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;
import com.google.android.gms.pseudonymous.SessionZwiebackToken;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ltj extends eru implements ltk {
    public ltj() {
        super("com.google.android.gms.pseudonymous.internal.IPseudonymousIdCallbacks");
    }

    @Override // defpackage.eru
    protected final boolean N(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            Status status = (Status) erv.a(parcel, Status.CREATOR);
            PseudonymousIdToken pseudonymousIdToken = (PseudonymousIdToken) erv.a(parcel, PseudonymousIdToken.CREATOR);
            O(parcel);
            c(status, pseudonymousIdToken);
        } else if (i == 2) {
            O(parcel);
            g();
        } else if (i == 3) {
            parcel.readLong();
            O(parcel);
            d();
        } else if (i == 4) {
            parcel.createTypedArrayList(SessionZwiebackToken.CREATOR);
            O(parcel);
            e();
        } else {
            if (i != 5) {
                return false;
            }
            O(parcel);
            f();
        }
        return true;
    }
}
