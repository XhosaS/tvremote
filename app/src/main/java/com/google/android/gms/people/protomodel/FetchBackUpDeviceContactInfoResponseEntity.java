package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kki;
import defpackage.kkx;
import defpackage.lqm;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FetchBackUpDeviceContactInfoResponseEntity extends AbstractSafeParcelable implements FetchBackUpDeviceContactInfoResponse {
    public static final Parcelable.Creator CREATOR = new lqm();
    private final List a;
    private List b;

    public FetchBackUpDeviceContactInfoResponseEntity(List list) {
        this.a = list;
    }

    @Override // com.google.android.gms.people.protomodel.FetchBackUpDeviceContactInfoResponse
    public final List a() {
        List list;
        if (this.b == null && (list = this.a) != null) {
            this.b = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.b.add((BackedUpContactsPerDevice) it.next());
            }
        }
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FetchBackUpDeviceContactInfoResponse)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return kki.a(a(), ((FetchBackUpDeviceContactInfoResponse) obj).a());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = kkx.a(parcel, 20293);
        kkx.v(parcel, 2, a());
        kkx.b(parcel, iA);
    }
}
