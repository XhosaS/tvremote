package defpackage;

import android.os.Parcel;
import com.google.android.gms.measurement.internal.TriggerUriParcel;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class kzl extends eru implements kzm {
    public kzl() {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }

    @Override // defpackage.eru
    protected final boolean N(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(TriggerUriParcel.CREATOR);
        O(parcel);
        e(arrayListCreateTypedArrayList);
        return true;
    }
}
