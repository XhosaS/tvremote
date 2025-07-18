package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.BatchUploadStatusParcel;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import com.google.android.gms.measurement.internal.ConsentParcel;
import com.google.android.gms.measurement.internal.EventParcel;
import com.google.android.gms.measurement.internal.UploadBatchesCriteria;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface kzj extends IInterface {
    void A(UserAttributeParcel userAttributeParcel, AppMetadata appMetadata);

    void B(AppMetadata appMetadata, BatchUploadStatusParcel batchUploadStatusParcel);

    byte[] C(EventParcel eventParcel, String str);

    void D(EventParcel eventParcel, String str);

    ConsentParcel e(AppMetadata appMetadata);

    String f(AppMetadata appMetadata);

    List g(AppMetadata appMetadata, Bundle bundle);

    List h(AppMetadata appMetadata, boolean z);

    List i(String str, String str2, AppMetadata appMetadata);

    List j(String str, String str2, String str3);

    List k(String str, String str2, boolean z, AppMetadata appMetadata);

    List l(String str, String str2, String str3, boolean z);

    void m(AppMetadata appMetadata);

    void n(AppMetadata appMetadata);

    void o(AppMetadata appMetadata, UploadBatchesCriteria uploadBatchesCriteria, kzp kzpVar);

    void p(EventParcel eventParcel, AppMetadata appMetadata);

    void q(AppMetadata appMetadata, Bundle bundle, kzm kzmVar);

    void r(AppMetadata appMetadata);

    void s(ConditionalUserPropertyParcel conditionalUserPropertyParcel, AppMetadata appMetadata);

    void t(ConditionalUserPropertyParcel conditionalUserPropertyParcel);

    void u(AppMetadata appMetadata);

    void v(long j, String str, String str2, String str3);

    void w(Bundle bundle, AppMetadata appMetadata);

    void x(AppMetadata appMetadata);

    void y(AppMetadata appMetadata);

    void z(AppMetadata appMetadata);
}
