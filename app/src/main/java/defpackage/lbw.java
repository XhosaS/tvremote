package defpackage;

import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;

/* compiled from: PG */
/* loaded from: classes.dex */
class lbw implements Runnable {
    final /* synthetic */ ConditionalUserPropertyParcel a;
    final /* synthetic */ lcl b;

    public lbw(lcl lclVar, ConditionalUserPropertyParcel conditionalUserPropertyParcel) {
        this.a = conditionalUserPropertyParcel;
        this.b = lclVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lih lihVar = this.b.a;
        lihVar.t();
        ConditionalUserPropertyParcel conditionalUserPropertyParcel = this.a;
        if (conditionalUserPropertyParcel.c.a() == null) {
            String str = conditionalUserPropertyParcel.a;
            kkk.k(str);
            AppMetadata appMetadataI = lihVar.i(str);
            if (appMetadataI != null) {
                lihVar.L(conditionalUserPropertyParcel, appMetadataI);
                return;
            }
            return;
        }
        String str2 = conditionalUserPropertyParcel.a;
        kkk.k(str2);
        AppMetadata appMetadataI2 = lihVar.i(str2);
        if (appMetadataI2 != null) {
            lihVar.U(conditionalUserPropertyParcel, appMetadataI2);
        }
    }
}
