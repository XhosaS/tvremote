package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kki;
import defpackage.kkx;
import defpackage.lql;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class EmailEntity extends AbstractSafeParcelable implements Email {
    public static final Parcelable.Creator CREATOR = new lql();
    public final PersonFieldMetadataEntity a;
    public final String b;

    public EmailEntity(PersonFieldMetadataEntity personFieldMetadataEntity, String str) {
        this.a = personFieldMetadataEntity;
        this.b = str;
    }

    @Override // com.google.android.gms.people.protomodel.Email
    public final PersonFieldMetadata a() {
        return this.a;
    }

    @Override // com.google.android.gms.people.protomodel.Email
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Email)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Email email = (Email) obj;
        return kki.a(a(), email.a()) && kki.a(b(), email.b());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a(), b()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PersonFieldMetadataEntity personFieldMetadataEntity = this.a;
        int iA = kkx.a(parcel, 20293);
        kkx.q(parcel, 2, personFieldMetadataEntity, i);
        kkx.r(parcel, 3, this.b);
        kkx.b(parcel, iA);
    }
}
