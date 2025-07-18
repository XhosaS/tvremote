package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kfc;
import defpackage.kkx;
import defpackage.ltw;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RecordConsentByConsentResultResponse extends AbstractSafeParcelable implements kfc {
    public static final Parcelable.Creator CREATOR = new ltw();
    public final List a;
    public final String b;

    public RecordConsentByConsentResultResponse(List list, String str) {
        this.a = list;
        this.b = str;
    }

    @Override // defpackage.kfc
    public final Status b() {
        return this.b != null ? Status.a : Status.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int iA = kkx.a(parcel, 20293);
        kkx.t(parcel, 1, list);
        kkx.r(parcel, 2, this.b);
        kkx.b(parcel, iA);
    }
}
