package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.kkx;
import defpackage.lex;
import defpackage.lhr;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class UploadBatchesCriteria extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new lhr();
    public final List a;

    public UploadBatchesCriteria(List list) {
        this.a = list;
    }

    public static UploadBatchesCriteria a(lex... lexVarArr) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(lexVarArr[0].g));
        return new UploadBatchesCriteria(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = kkx.a(parcel, 20293);
        kkx.n(parcel, 1, this.a);
        kkx.b(parcel, iA);
    }
}
