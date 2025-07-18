package defpackage;

import android.os.Parcel;
import com.google.android.gms.location.internal.FusedLocationProviderResult;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class kpj extends eru implements kpk {
    public kpj() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    @Override // defpackage.eru
    protected final boolean N(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            FusedLocationProviderResult fusedLocationProviderResult = (FusedLocationProviderResult) erv.a(parcel, FusedLocationProviderResult.CREATOR);
            O(parcel);
            e(fusedLocationProviderResult);
        } else {
            if (i != 2) {
                return false;
            }
            f();
        }
        return true;
    }
}
