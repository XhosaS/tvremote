package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kki;
import defpackage.kkx;
import defpackage.lqk;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class DeviceVersionEntity extends AbstractSafeParcelable implements DeviceVersion {
    public static final Parcelable.Creator CREATOR = new lqk();
    public final Integer a;

    public DeviceVersionEntity(Integer num) {
        this.a = num;
    }

    @Override // com.google.android.gms.people.protomodel.DeviceVersion
    public final Integer a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DeviceVersion)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return kki.a(a(), ((DeviceVersion) obj).a());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.a;
        int iA = kkx.a(parcel, 20293);
        kkx.o(parcel, 2, num);
        kkx.b(parcel, iA);
    }
}
