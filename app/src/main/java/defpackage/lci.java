package defpackage;

import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.UserAttributeParcel;

/* compiled from: PG */
/* loaded from: classes.dex */
class lci implements Runnable {
    final /* synthetic */ UserAttributeParcel a;
    final /* synthetic */ AppMetadata b;
    final /* synthetic */ lcl c;

    public lci(lcl lclVar, UserAttributeParcel userAttributeParcel, AppMetadata appMetadata) {
        this.a = userAttributeParcel;
        this.b = appMetadata;
        this.c = lclVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lih lihVar = this.c.a;
        lihVar.t();
        UserAttributeParcel userAttributeParcel = this.a;
        if (userAttributeParcel.a() == null) {
            lihVar.N(userAttributeParcel.b, this.b);
        } else {
            lihVar.Y(userAttributeParcel, this.b);
        }
    }
}
