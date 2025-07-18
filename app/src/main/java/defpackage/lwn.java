package defpackage;

import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class lwn extends eru implements lwo {
    public lwn() {
        super("com.google.android.gms.usagereporting.internal.IUsageReportingOptInOptionsChangedListener");
    }

    @Override // defpackage.eru
    protected final boolean N(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        a();
        return true;
    }
}
