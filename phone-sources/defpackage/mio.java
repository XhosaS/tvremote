package defpackage;

import android.app.Activity;
import com.google.android.apps.play.movies.common.service.pinning.PinBroadcastReceiver;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mio implements icv {
    private final ieh a;
    private final cr b;
    private final ieh c;
    private final ieh d;
    private final lie e;
    private final mta f;

    public mio(ieh iehVar, cr crVar, ieh iehVar2, ieh iehVar3, mta mtaVar, lie lieVar) {
        this.a = iehVar;
        this.b = crVar;
        this.c = iehVar2;
        this.d = iehVar3;
        this.f = mtaVar;
        this.e = lieVar;
    }

    @Override // defpackage.icv
    public final /* synthetic */ void a(Object obj, Object obj2) {
        ksy ksyVar = (ksy) obj;
        String str = (String) obj2;
        kuj kujVarA = ((kuk) this.d.a()).a(ksyVar);
        ieg iegVarA = ((ldy) this.c).a();
        if (iegVarA.m()) {
            Activity activity = (Activity) this.a.a();
            ksn ksnVar = (ksn) iegVarA.g();
            if (kujVarA.i()) {
                mta.f(activity, this.b, ksyVar, kujVarA, false);
                return;
            }
            if (kujVarA.j()) {
                PinBroadcastReceiver.c(activity, ksnVar, ksyVar.b);
                this.f.c(activity, this.b, ksnVar, ksyVar);
                this.e.G(false);
            } else if (kujVarA.g()) {
                mta.g(activity, this.b, ksyVar, str, null, kujVarA);
            } else {
                this.f.c(activity, this.b, ksnVar, ksyVar);
                this.e.G(false);
            }
        }
    }
}
