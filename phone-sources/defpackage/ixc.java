package defpackage;

import com.google.android.apps.play.movies.common.service.pinning.PinBroadcastReceiver;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ixc implements ixb {
    private final iea a;
    private final iea b;
    private final lie c;
    private final mta d;

    public ixc(iea ieaVar, iea ieaVar2, mta mtaVar, lie lieVar) {
        this.a = ieaVar;
        this.b = ieaVar2;
        this.d = mtaVar;
        this.c = lieVar;
    }

    @Override // defpackage.ixb
    public final void a(by byVar, ksy ksyVar, String str) {
        ieg iegVarA = ((ldy) this.a).a();
        iegVarA.getClass();
        if (iegVarA.l()) {
            return;
        }
        kuj kujVarA = ((kuk) this.b.a()).a(ksyVar);
        cr supportFragmentManager = byVar.getSupportFragmentManager();
        supportFragmentManager.getClass();
        ksn ksnVar = (ksn) iegVarA.g();
        if (kujVarA.i()) {
            mta.f(byVar, supportFragmentManager, ksyVar, kujVarA, false);
            return;
        }
        if (kujVarA.j()) {
            PinBroadcastReceiver.c(byVar, ksnVar, ksyVar.b);
            this.d.c(byVar, supportFragmentManager, ksnVar, ksyVar);
            this.c.G(false);
        } else if (kujVarA.g()) {
            mta.g(byVar, supportFragmentManager, ksyVar, str, null, kujVarA);
        } else {
            this.d.c(byVar, supportFragmentManager, ksnVar, ksyVar);
            this.c.G(false);
        }
    }
}
