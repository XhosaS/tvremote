package defpackage;

import android.location.Location;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class kpb extends eru implements kpc {
    public kpb() {
        super("com.google.android.gms.location.ILocationListener");
    }

    @Override // defpackage.eru
    protected final boolean N(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            Location location = (Location) erv.a(parcel, Location.CREATOR);
            O(parcel);
            e(location);
        } else {
            if (i != 2) {
                return false;
            }
            f();
        }
        return true;
    }
}
