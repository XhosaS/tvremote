package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.presencemanager.ActiveUser;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class lss extends eru implements lst {
    public lss() {
        super("com.google.android.gms.presencemanager.internal.IPresenceManagerPresenceReportCallback");
    }

    @Override // defpackage.eru
    protected final boolean N(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Status status = (Status) erv.a(parcel, Status.CREATOR);
        ActiveUser activeUser = (ActiveUser) erv.a(parcel, ActiveUser.CREATOR);
        O(parcel);
        a(status, activeUser);
        return true;
    }
}
