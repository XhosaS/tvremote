package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class knj extends eru implements knk {
    public knj() {
        super("com.google.android.gms.homegraph.internal.IHgsIdCallbacks");
    }

    @Override // defpackage.eru
    protected final boolean N(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) erv.a(parcel, Status.CREATOR);
        String string = parcel.readString();
        O(parcel);
        a(status, string);
        return true;
    }
}
