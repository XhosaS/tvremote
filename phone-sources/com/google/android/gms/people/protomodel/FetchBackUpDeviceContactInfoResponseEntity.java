package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.a;
import defpackage.ocg;
import defpackage.ocv;
import defpackage.oeg;
import defpackage.oli;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FetchBackUpDeviceContactInfoResponseEntity extends ocg implements Parcelable {
    public static final Parcelable.Creator<FetchBackUpDeviceContactInfoResponseEntity> CREATOR = new oeg(9);
    private final List a;
    private List b;

    public FetchBackUpDeviceContactInfoResponseEntity(List list) {
        this.a = list;
    }

    public final List a() {
        List list;
        if (this.b == null && (list = this.a) != null) {
            this.b = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.b.add((oli) it.next());
            }
        }
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FetchBackUpDeviceContactInfoResponseEntity)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return a.Q(a(), ((FetchBackUpDeviceContactInfoResponseEntity) obj).a());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV = ocv.v(parcel);
        ocv.S(parcel, 2, a());
        ocv.x(parcel, iV);
    }
}
