package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kki;
import defpackage.kkx;
import defpackage.lqp;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class PersonFieldMetadataEntity extends AbstractSafeParcelable implements PersonFieldMetadata {
    public static final Parcelable.Creator CREATOR = new lqp();
    public final Integer a;
    public final Boolean b;

    public PersonFieldMetadataEntity(Integer num, Boolean bool) {
        this.a = num;
        this.b = bool;
    }

    @Override // com.google.android.gms.people.protomodel.PersonFieldMetadata
    public final Boolean a() {
        return this.b;
    }

    @Override // com.google.android.gms.people.protomodel.PersonFieldMetadata
    public final Integer b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PersonFieldMetadata)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        PersonFieldMetadata personFieldMetadata = (PersonFieldMetadata) obj;
        return kki.a(b(), personFieldMetadata.b()) && kki.a(a(), personFieldMetadata.a());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{b(), a()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.a;
        int iA = kkx.a(parcel, 20293);
        kkx.o(parcel, 3, num);
        kkx.h(parcel, 4, this.b);
        kkx.b(parcel, iA);
    }
}
