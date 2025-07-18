package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class cgz implements Runnable {
    public final /* synthetic */ cha a;

    public /* synthetic */ cgz(cha chaVar) {
        this.a = chaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cha chaVar = this.a;
        if (chaVar.g != 0) {
            cbx cbxVarC = cbx.c();
            String str = cha.a;
            ckp ckpVar = chaVar.d;
            Objects.toString(ckpVar);
            cbxVarC.a(str, "Already started work for ".concat(ckpVar.toString()));
            return;
        }
        chaVar.g = 1;
        cbx cbxVarC2 = cbx.c();
        String str2 = cha.a;
        ckp ckpVar2 = chaVar.d;
        Objects.toString(ckpVar2);
        cbxVarC2.a(str2, "onAllConstraintsMet for ".concat(ckpVar2.toString()));
        chf chfVar = chaVar.e;
        if (!chfVar.d.h(chaVar.l)) {
            chaVar.a();
            return;
        }
        coc cocVar = chfVar.c;
        synchronized (cocVar.e) {
            cbx.c().a(coc.a, "Starting timer for " + ckpVar2);
            cocVar.a(ckpVar2);
            cob cobVar = new cob(cocVar, ckpVar2);
            cocVar.c.put(ckpVar2, cobVar);
            cocVar.d.put(ckpVar2, chaVar);
            cocVar.b.b(600000L, cobVar);
        }
    }
}
