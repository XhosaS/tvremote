package com.google.android.gms.people.cpg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kkx;
import defpackage.lpe;
import defpackage.yqs;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class GroupContactOrder extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new lpe();
    public final String a;
    public final List b;
    public final long c;

    public GroupContactOrder(String str, List list, long j) {
        this.a = str;
        this.b = list;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            GroupContactOrder groupContactOrder = (GroupContactOrder) obj;
            if (yqs.a(this.a, groupContactOrder.a) && yqs.a(this.b, groupContactOrder.b) && this.c == groupContactOrder.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Long.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int iA = kkx.a(parcel, 20293);
        kkx.r(parcel, 1, str);
        List list = this.b;
        if (list != null) {
            int iA2 = kkx.a(parcel, 2);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeLong(((Long) list.get(i2)).longValue());
            }
            kkx.b(parcel, iA2);
        }
        kkx.g(parcel, 3, this.c);
        kkx.b(parcel, iA);
    }
}
