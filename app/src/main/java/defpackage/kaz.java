package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class kaz extends eru implements kba {
    public kaz() {
        super("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
    }

    @Override // defpackage.eru
    protected final boolean N(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                Status status = (Status) erv.a(parcel, Status.CREATOR);
                O(parcel);
                d(status);
                return true;
            case 2:
                O(parcel);
                e();
                return true;
            case 3:
                parcel.readLong();
                O(parcel);
                i();
                return true;
            case 4:
                O(parcel);
                j();
                return true;
            case 5:
                parcel.readLong();
                O(parcel);
                f();
                return true;
            case 6:
                O(parcel);
                g();
                return true;
            case 7:
                O(parcel);
                h();
                return true;
            case 8:
                Status status2 = (Status) erv.a(parcel, Status.CREATOR);
                O(parcel);
                c(status2);
                return true;
            default:
                return false;
        }
    }
}
