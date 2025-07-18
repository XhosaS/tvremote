package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kki;
import defpackage.kkx;
import defpackage.lqn;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class NameEntity extends AbstractSafeParcelable implements Name {
    public static final Parcelable.Creator CREATOR = new lqn();
    public final PersonFieldMetadataEntity a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public NameEntity(PersonFieldMetadataEntity personFieldMetadataEntity, String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = personFieldMetadataEntity;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }

    @Override // com.google.android.gms.people.protomodel.Name
    public final PersonFieldMetadata a() {
        return this.a;
    }

    @Override // com.google.android.gms.people.protomodel.Name
    public final String b() {
        return this.b;
    }

    @Override // com.google.android.gms.people.protomodel.Name
    public final String c() {
        return this.e;
    }

    @Override // com.google.android.gms.people.protomodel.Name
    public final String d() {
        return this.g;
    }

    @Override // com.google.android.gms.people.protomodel.Name
    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Name)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Name name = (Name) obj;
        return kki.a(a(), name.a()) && kki.a(b(), name.b()) && kki.a(g(), name.g()) && kki.a(e(), name.e()) && kki.a(c(), name.c()) && kki.a(f(), name.f()) && kki.a(d(), name.d());
    }

    @Override // com.google.android.gms.people.protomodel.Name
    public final String f() {
        return this.f;
    }

    @Override // com.google.android.gms.people.protomodel.Name
    public final String g() {
        return this.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a(), b(), g(), e(), c(), f(), d()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        PersonFieldMetadataEntity personFieldMetadataEntity = this.a;
        int iA = kkx.a(parcel, 20293);
        kkx.q(parcel, 2, personFieldMetadataEntity, i);
        kkx.r(parcel, 3, this.b);
        kkx.r(parcel, 4, this.g);
        kkx.r(parcel, 5, this.d);
        kkx.r(parcel, 6, this.e);
        kkx.r(parcel, 7, this.f);
        kkx.r(parcel, 17, this.c);
        kkx.b(parcel, iA);
    }
}
