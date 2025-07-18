package com.google.android.apps.tvsearch.results.suggestion;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.a;
import defpackage.abvw;
import defpackage.abvz;
import defpackage.abwa;
import defpackage.abza;
import defpackage.acjc;
import defpackage.gkk;
import defpackage.hsv;
import defpackage.pan;
import defpackage.xaq;
import defpackage.xub;
import defpackage.xuo;
import defpackage.zpk;
import j$.util.Optional;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SuggestionChipItem implements Parcelable, gkk {
    public static final Parcelable.Creator CREATOR = new hsv();
    public final String a;
    public final String b;
    public final xaq c;
    public xuo d;
    public xub e;
    public final pan f;

    public SuggestionChipItem(String str, String str2, xaq xaqVar, int i) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = xaqVar;
        pan panVar = new pan(i);
        panVar.f();
        this.f = panVar;
    }

    @Override // defpackage.gkk
    public final int a() {
        xaq xaqVar = this.c;
        if (xaqVar == null || (xaqVar.b & 1) == 0) {
            return (xaqVar == null || (xaqVar.b & 64) == 0) ? 1 : 2;
        }
        return 2;
    }

    @Override // defpackage.gkk
    public final Optional b() {
        return Optional.ofNullable(this.d);
    }

    @Override // defpackage.gkk
    public final Optional c() {
        return Optional.ofNullable(this.e);
    }

    @Override // defpackage.gkk
    public final String d() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(xuo xuoVar) {
        this.d = xuoVar;
        if ((xuoVar.b & 16) != 0) {
            pan panVar = this.f;
            acjc acjcVar = xuoVar.g;
            if (acjcVar == null) {
                acjcVar = acjc.a;
            }
            panVar.d(acjcVar);
        }
    }

    public final void f(xub xubVar) {
        this.e = xubVar;
        if ((xubVar.b & 16) != 0) {
            pan panVar = this.f;
            acjc acjcVar = xubVar.g;
            if (acjcVar == null) {
                acjcVar = acjc.a;
            }
            panVar.d(acjcVar);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA;
        int iA2;
        int iA3;
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        xaq xaqVar = this.c;
        if (xaqVar != null) {
            parcel.writeInt(1);
            try {
                int i2 = xaqVar.memoizedSerializedSize;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    iA3 = abza.a.a(xaqVar.getClass()).a(xaqVar);
                    if (iA3 < 0) {
                        throw new IllegalStateException(a.b(iA3, "serialized size must be non-negative, was "));
                    }
                } else {
                    iA3 = i2 & Integer.MAX_VALUE;
                    if (iA3 == Integer.MAX_VALUE) {
                        iA3 = abza.a.a(xaqVar.getClass()).a(xaqVar);
                        if (iA3 < 0) {
                            throw new IllegalStateException(a.b(iA3, "serialized size must be non-negative, was "));
                        }
                        xaqVar.memoizedSerializedSize = (xaqVar.memoizedSerializedSize & Integer.MIN_VALUE) | iA3;
                    }
                }
                byte[] bArr = new byte[iA3];
                boolean z = abvz.e;
                abvw abvwVar = new abvw(bArr, 0, iA3);
                abza.a.a(xaqVar.getClass()).m(xaqVar, abwa.a(abvwVar));
                abvwVar.K();
                parcel.writeByteArray(bArr);
            } catch (IOException e) {
                throw new RuntimeException(a.z(" to a byte array threw an IOException (should never happen).", xaqVar), e);
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(((zpk) this.f.a.b).d);
        xuo xuoVar = this.d;
        if (xuoVar != null) {
            parcel.writeInt(1);
            try {
                int i3 = xuoVar.memoizedSerializedSize;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    iA2 = abza.a.a(xuoVar.getClass()).a(xuoVar);
                    if (iA2 < 0) {
                        throw new IllegalStateException(a.b(iA2, "serialized size must be non-negative, was "));
                    }
                } else {
                    iA2 = i3 & Integer.MAX_VALUE;
                    if (iA2 == Integer.MAX_VALUE) {
                        iA2 = abza.a.a(xuoVar.getClass()).a(xuoVar);
                        if (iA2 < 0) {
                            throw new IllegalStateException(a.b(iA2, "serialized size must be non-negative, was "));
                        }
                        xuoVar.memoizedSerializedSize = (xuoVar.memoizedSerializedSize & Integer.MIN_VALUE) | iA2;
                    }
                }
                byte[] bArr2 = new byte[iA2];
                boolean z2 = abvz.e;
                abvw abvwVar2 = new abvw(bArr2, 0, iA2);
                abza.a.a(xuoVar.getClass()).m(xuoVar, abwa.a(abvwVar2));
                abvwVar2.K();
                parcel.writeByteArray(bArr2);
            } catch (IOException e2) {
                throw new RuntimeException(a.z(" to a byte array threw an IOException (should never happen).", xuoVar), e2);
            }
        } else {
            parcel.writeInt(0);
        }
        xub xubVar = this.e;
        if (xubVar == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        try {
            int i4 = xubVar.memoizedSerializedSize;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                iA = abza.a.a(xubVar.getClass()).a(xubVar);
                if (iA < 0) {
                    throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                }
            } else {
                iA = i4 & Integer.MAX_VALUE;
                if (iA == Integer.MAX_VALUE) {
                    iA = abza.a.a(xubVar.getClass()).a(xubVar);
                    if (iA < 0) {
                        throw new IllegalStateException(a.b(iA, "serialized size must be non-negative, was "));
                    }
                    xubVar.memoizedSerializedSize = (xubVar.memoizedSerializedSize & Integer.MIN_VALUE) | iA;
                }
            }
            byte[] bArr3 = new byte[iA];
            boolean z3 = abvz.e;
            abvw abvwVar3 = new abvw(bArr3, 0, iA);
            abza.a.a(xubVar.getClass()).m(xubVar, abwa.a(abvwVar3));
            abvwVar3.K();
            parcel.writeByteArray(bArr3);
        } catch (IOException e3) {
            throw new RuntimeException(a.z(" to a byte array threw an IOException (should never happen).", xubVar), e3);
        }
    }
}
