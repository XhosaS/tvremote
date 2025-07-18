package defpackage;

import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;

/* compiled from: PG */
/* loaded from: classes.dex */
class lbv implements Runnable {
    final /* synthetic */ ConditionalUserPropertyParcel a;
    final /* synthetic */ AppMetadata b;
    final /* synthetic */ lcl c;

    public lbv(lcl lclVar, ConditionalUserPropertyParcel conditionalUserPropertyParcel, AppMetadata appMetadata) {
        this.a = conditionalUserPropertyParcel;
        this.b = appMetadata;
        this.c = lclVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lih lihVar = this.c.a;
        lihVar.t();
        ConditionalUserPropertyParcel conditionalUserPropertyParcel = this.a;
        if (conditionalUserPropertyParcel.c.a() == null) {
            lihVar.L(conditionalUserPropertyParcel, this.b);
        } else {
            lihVar.U(conditionalUserPropertyParcel, this.b);
        }
    }
}
