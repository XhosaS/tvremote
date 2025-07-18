package defpackage;

import com.google.android.gms.measurement.internal.EventParcel;

/* compiled from: PG */
/* loaded from: classes.dex */
class lcg implements Runnable {
    final /* synthetic */ EventParcel a;
    final /* synthetic */ String b;
    final /* synthetic */ lcl c;

    public lcg(lcl lclVar, EventParcel eventParcel, String str) {
        this.a = eventParcel;
        this.b = str;
        this.c = lclVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lih lihVar = this.c.a;
        lihVar.t();
        lihVar.F(this.a, this.b);
    }
}
