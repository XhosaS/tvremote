package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class jyb extends eru implements jyc {
    public jyb() {
        super("com.google.android.gms.auth.account.data.IGetStringValueCallback");
    }

    @Override // defpackage.eru
    protected final boolean N(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        Status status = (Status) erv.a(parcel, Status.CREATOR);
        String string = parcel.readString();
        O(parcel);
        M(status, string);
        return true;
    }
}
