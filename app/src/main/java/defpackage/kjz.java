package defpackage;

import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class kjz extends eru implements kka {
    public kjz() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    @Override // defpackage.eru
    protected final boolean N(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            kme kmeVarE = e();
            parcel2.writeNoException();
            erv.c(parcel2, kmeVarE);
        } else {
            if (i != 2) {
                return false;
            }
            int iD = d();
            parcel2.writeNoException();
            parcel2.writeInt(iD);
        }
        return true;
    }
}
