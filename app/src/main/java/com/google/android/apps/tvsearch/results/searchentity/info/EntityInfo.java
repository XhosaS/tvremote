package com.google.android.apps.tvsearch.results.searchentity.info;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.a;
import defpackage.abvw;
import defpackage.abvz;
import defpackage.abwa;
import defpackage.abza;
import defpackage.adwo;
import defpackage.adyf;
import defpackage.agvy;
import defpackage.hoi;
import defpackage.zdy;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class EntityInfo implements Parcelable {
    public final String b;
    public final String c;
    public final adyf d;
    public final adwo e;
    public final String f;
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/results/searchentity/info/EntityInfo");
    public static final Parcelable.Creator CREATOR = new hoi();

    public EntityInfo(String str, String str2, adyf adyfVar, adwo adwoVar, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.b = str;
        this.c = str2;
        this.d = adyfVar;
        this.e = adwoVar;
        this.f = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EntityInfo)) {
            return false;
        }
        EntityInfo entityInfo = (EntityInfo) obj;
        return agvy.c(this.b, entityInfo.b) && agvy.c(this.c, entityInfo.c) && agvy.c(this.d, entityInfo.d) && agvy.c(this.e, entityInfo.e) && agvy.c(this.f, entityInfo.f);
    }

    public final int hashCode() {
        int iB;
        int iHashCode = (this.b.hashCode() * 31) + this.c.hashCode();
        adyf adyfVar = this.d;
        int iB2 = 0;
        if (adyfVar == null) {
            iB = 0;
        } else if ((adyfVar.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            iB = abza.a.a(adyfVar.getClass()).b(adyfVar);
        } else {
            int iB3 = adyfVar.memoizedHashCode;
            if (iB3 == 0) {
                iB3 = abza.a.a(adyfVar.getClass()).b(adyfVar);
                adyfVar.memoizedHashCode = iB3;
            }
            iB = iB3;
        }
        int i = ((iHashCode * 31) + iB) * 31;
        adwo adwoVar = this.e;
        if (adwoVar != null) {
            if ((adwoVar.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
                iB2 = abza.a.a(adwoVar.getClass()).b(adwoVar);
            } else {
                iB2 = adwoVar.memoizedHashCode;
                if (iB2 == 0) {
                    iB2 = abza.a.a(adwoVar.getClass()).b(adwoVar);
                    adwoVar.memoizedHashCode = iB2;
                }
            }
        }
        return ((i + iB2) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "EntityInfo(title=" + this.b + ", subtitle=" + this.c + ", knowledgeMetadata=" + this.d + ", appMetaData=" + this.e + ", knowledgePanelDescription=" + this.f + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA;
        int iA2;
        parcel.getClass();
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        adyf adyfVar = this.d;
        if (adyfVar == null) {
            parcel.writeInt(0);
        } else {
            try {
                int i2 = adyfVar.memoizedSerializedSize;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    iA = abza.a.a(adyfVar.getClass()).a(adyfVar);
                    if (iA < 0) {
                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                    }
                } else {
                    iA = i2 & Integer.MAX_VALUE;
                    if (iA == Integer.MAX_VALUE) {
                        iA = abza.a.a(adyfVar.getClass()).a(adyfVar);
                        if (iA < 0) {
                            throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                        }
                        adyfVar.memoizedSerializedSize = (adyfVar.memoizedSerializedSize & Integer.MIN_VALUE) | iA;
                    }
                }
                byte[] bArr = new byte[iA];
                boolean z = abvz.e;
                abvw abvwVar = new abvw(bArr, 0, iA);
                abza.a.a(adyfVar.getClass()).m(adyfVar, abwa.a(abvwVar));
                abvwVar.K();
                parcel.writeInt(iA);
                parcel.writeByteArray(bArr);
            } catch (IOException e) {
                throw new RuntimeException(a.z(" to a byte array threw an IOException (should never happen).", adyfVar), e);
            }
        }
        adwo adwoVar = this.e;
        if (adwoVar == null) {
            parcel.writeInt(0);
        } else {
            try {
                int i3 = adwoVar.memoizedSerializedSize;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    iA2 = abza.a.a(adwoVar.getClass()).a(adwoVar);
                    if (iA2 < 0) {
                        throw new IllegalStateException(a.b(iA2, "serialized size must be non-negative, was "));
                    }
                } else {
                    int i4 = i3 & Integer.MAX_VALUE;
                    if (i4 == Integer.MAX_VALUE) {
                        iA2 = abza.a.a(adwoVar.getClass()).a(adwoVar);
                        if (iA2 < 0) {
                            throw new IllegalStateException(a.b(iA2, "serialized size must be non-negative, was "));
                        }
                        adwoVar.memoizedSerializedSize = (adwoVar.memoizedSerializedSize & Integer.MIN_VALUE) | iA2;
                    } else {
                        iA2 = i4;
                    }
                }
                byte[] bArr2 = new byte[iA2];
                boolean z2 = abvz.e;
                abvw abvwVar2 = new abvw(bArr2, 0, iA2);
                abza.a.a(adwoVar.getClass()).m(adwoVar, abwa.a(abvwVar2));
                abvwVar2.K();
                parcel.writeInt(iA2);
                parcel.writeByteArray(bArr2);
            } catch (IOException e2) {
                throw new RuntimeException(a.z(" to a byte array threw an IOException (should never happen).", adwoVar), e2);
            }
        }
        parcel.writeString(this.f);
    }
}
