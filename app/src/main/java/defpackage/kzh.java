package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.BatchUploadStatusParcel;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import com.google.android.gms.measurement.internal.ConsentParcel;
import com.google.android.gms.measurement.internal.EventParcel;
import com.google.android.gms.measurement.internal.UploadBatchesCriteria;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kzh extends ert implements kzj {
    public kzh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // defpackage.kzj
    public final void A(UserAttributeParcel userAttributeParcel, AppMetadata appMetadata) {
        Parcel parcelA = a();
        erv.b(parcelA, userAttributeParcel);
        erv.b(parcelA, appMetadata);
        J(2, parcelA);
    }

    @Override // defpackage.kzj
    public final void B(AppMetadata appMetadata, BatchUploadStatusParcel batchUploadStatusParcel) {
        Parcel parcelA = a();
        erv.b(parcelA, appMetadata);
        erv.b(parcelA, batchUploadStatusParcel);
        J(30, parcelA);
    }

    @Override // defpackage.kzj
    public final byte[] C(EventParcel eventParcel, String str) {
        Parcel parcelA = a();
        erv.b(parcelA, eventParcel);
        parcelA.writeString(str);
        Parcel parcelB = b(9, parcelA);
        byte[] bArrCreateByteArray = parcelB.createByteArray();
        parcelB.recycle();
        return bArrCreateByteArray;
    }

    @Override // defpackage.kzj
    public final void D(EventParcel eventParcel, String str) {
        throw null;
    }

    @Override // defpackage.kzj
    public final ConsentParcel e(AppMetadata appMetadata) {
        Parcel parcelA = a();
        erv.b(parcelA, appMetadata);
        Parcel parcelB = b(21, parcelA);
        ConsentParcel consentParcel = (ConsentParcel) erv.a(parcelB, ConsentParcel.CREATOR);
        parcelB.recycle();
        return consentParcel;
    }

    @Override // defpackage.kzj
    public final String f(AppMetadata appMetadata) {
        Parcel parcelA = a();
        erv.b(parcelA, appMetadata);
        Parcel parcelB = b(11, parcelA);
        String string = parcelB.readString();
        parcelB.recycle();
        return string;
    }

    @Override // defpackage.kzj
    public final List g(AppMetadata appMetadata, Bundle bundle) {
        throw null;
    }

    @Override // defpackage.kzj
    public final List h(AppMetadata appMetadata, boolean z) {
        throw null;
    }

    @Override // defpackage.kzj
    public final List i(String str, String str2, AppMetadata appMetadata) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        parcelA.writeString(str2);
        erv.b(parcelA, appMetadata);
        Parcel parcelB = b(16, parcelA);
        ArrayList arrayListCreateTypedArrayList = parcelB.createTypedArrayList(ConditionalUserPropertyParcel.CREATOR);
        parcelB.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.kzj
    public final List j(String str, String str2, String str3) {
        Parcel parcelA = a();
        parcelA.writeString(null);
        parcelA.writeString(str2);
        parcelA.writeString(str3);
        Parcel parcelB = b(17, parcelA);
        ArrayList arrayListCreateTypedArrayList = parcelB.createTypedArrayList(ConditionalUserPropertyParcel.CREATOR);
        parcelB.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.kzj
    public final List k(String str, String str2, boolean z, AppMetadata appMetadata) {
        Parcel parcelA = a();
        parcelA.writeString(str);
        parcelA.writeString(str2);
        ClassLoader classLoader = erv.a;
        parcelA.writeInt(z ? 1 : 0);
        erv.b(parcelA, appMetadata);
        Parcel parcelB = b(14, parcelA);
        ArrayList arrayListCreateTypedArrayList = parcelB.createTypedArrayList(UserAttributeParcel.CREATOR);
        parcelB.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.kzj
    public final List l(String str, String str2, String str3, boolean z) {
        Parcel parcelA = a();
        parcelA.writeString(null);
        parcelA.writeString(str2);
        parcelA.writeString(str3);
        ClassLoader classLoader = erv.a;
        parcelA.writeInt(z ? 1 : 0);
        Parcel parcelB = b(15, parcelA);
        ArrayList arrayListCreateTypedArrayList = parcelB.createTypedArrayList(UserAttributeParcel.CREATOR);
        parcelB.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // defpackage.kzj
    public final void m(AppMetadata appMetadata) {
        Parcel parcelA = a();
        erv.b(parcelA, appMetadata);
        J(27, parcelA);
    }

    @Override // defpackage.kzj
    public final void n(AppMetadata appMetadata) {
        Parcel parcelA = a();
        erv.b(parcelA, appMetadata);
        J(4, parcelA);
    }

    @Override // defpackage.kzj
    public final void o(AppMetadata appMetadata, UploadBatchesCriteria uploadBatchesCriteria, kzp kzpVar) {
        Parcel parcelA = a();
        erv.b(parcelA, appMetadata);
        erv.b(parcelA, uploadBatchesCriteria);
        erv.c(parcelA, kzpVar);
        J(29, parcelA);
    }

    @Override // defpackage.kzj
    public final void p(EventParcel eventParcel, AppMetadata appMetadata) {
        Parcel parcelA = a();
        erv.b(parcelA, eventParcel);
        erv.b(parcelA, appMetadata);
        J(1, parcelA);
    }

    @Override // defpackage.kzj
    public final void q(AppMetadata appMetadata, Bundle bundle, kzm kzmVar) {
        Parcel parcelA = a();
        erv.b(parcelA, appMetadata);
        erv.b(parcelA, bundle);
        erv.c(parcelA, kzmVar);
        J(31, parcelA);
    }

    @Override // defpackage.kzj
    public final void r(AppMetadata appMetadata) {
        Parcel parcelA = a();
        erv.b(parcelA, appMetadata);
        J(18, parcelA);
    }

    @Override // defpackage.kzj
    public final void s(ConditionalUserPropertyParcel conditionalUserPropertyParcel, AppMetadata appMetadata) {
        Parcel parcelA = a();
        erv.b(parcelA, conditionalUserPropertyParcel);
        erv.b(parcelA, appMetadata);
        J(12, parcelA);
    }

    @Override // defpackage.kzj
    public final void t(ConditionalUserPropertyParcel conditionalUserPropertyParcel) {
        throw null;
    }

    @Override // defpackage.kzj
    public final void u(AppMetadata appMetadata) {
        Parcel parcelA = a();
        erv.b(parcelA, appMetadata);
        J(20, parcelA);
    }

    @Override // defpackage.kzj
    public final void v(long j, String str, String str2, String str3) {
        Parcel parcelA = a();
        parcelA.writeLong(j);
        parcelA.writeString(str);
        parcelA.writeString(str2);
        parcelA.writeString(str3);
        J(10, parcelA);
    }

    @Override // defpackage.kzj
    public final void w(Bundle bundle, AppMetadata appMetadata) {
        Parcel parcelA = a();
        erv.b(parcelA, bundle);
        erv.b(parcelA, appMetadata);
        J(19, parcelA);
    }

    @Override // defpackage.kzj
    public final void x(AppMetadata appMetadata) {
        Parcel parcelA = a();
        erv.b(parcelA, appMetadata);
        J(26, parcelA);
    }

    @Override // defpackage.kzj
    public final void y(AppMetadata appMetadata) {
        Parcel parcelA = a();
        erv.b(parcelA, appMetadata);
        J(6, parcelA);
    }

    @Override // defpackage.kzj
    public final void z(AppMetadata appMetadata) {
        Parcel parcelA = a();
        erv.b(parcelA, appMetadata);
        J(25, parcelA);
    }
}
