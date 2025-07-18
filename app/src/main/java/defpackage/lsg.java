package defpackage;

import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class lsg extends eru implements lsh {
    public lsg() {
        super("com.google.android.gms.phenotype.internal.IFlagUpdateListener");
    }

    @Override // defpackage.eru
    protected final boolean N(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        O(parcel);
        c(bArrCreateByteArray);
        return true;
    }
}
