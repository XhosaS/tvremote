package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bns extends btc {
    final /* synthetic */ bnt a;
    private final bug b;

    public bns(bnt bntVar, bug bugVar) {
        this.a = bntVar;
        this.b = bugVar;
    }

    private final void g(boolean z) {
        ((cbs) bnt.a.e().j("com/google/android/tv/remote/service/FmrFeature$ClientMessageHandler", "triggerFindMyRemote", 124, "FmrFeature.java")).p("Triggering FMR");
        this.a.b.sendBroadcast(new Intent("com.google.android.tv.FIND_MY_REMOTE").putExtra("activate", z ? 1 : 0).putExtra("reason", "VIRTUAL_REMOTE").setFlags(268435488), "com.google.android.tv.permission.FIND_MY_REMOTE");
        clo cloVarO = buz.a.o();
        if (!cloVarO.b.A()) {
            cloVarO.l();
        }
        buz buzVar = (buz) cloVarO.b;
        buzVar.b |= 1;
        buzVar.c = true;
        buz buzVar2 = (buz) cloVarO.i();
        bug bugVar = this.b;
        clo cloVarO2 = bvw.a.o();
        if (!cloVarO2.b.A()) {
            cloVarO2.l();
        }
        bvw bvwVar = (bvw) cloVarO2.b;
        buzVar2.getClass();
        bvwVar.c = buzVar2;
        bvwVar.b = 70;
        bugVar.d((bvw) cloVarO2.i());
    }

    @Override // defpackage.btc
    public final int a() {
        if (this.a.b.getPackageManager().queryBroadcastReceivers(new Intent("com.google.android.tv.FIND_MY_REMOTE"), 0).isEmpty()) {
            ((cbs) bnt.a.e().j("com/google/android/tv/remote/service/FmrFeature$ClientMessageHandler", "getProvidedFeatures", 74, "FmrFeature.java")).p("FMR is not enabled");
            return 0;
        }
        ((cbs) bnt.a.e().j("com/google/android/tv/remote/service/FmrFeature$ClientMessageHandler", "getProvidedFeatures", 78, "FmrFeature.java")).p("FMR is enabled");
        return 2048;
    }

    @Override // defpackage.btc
    public final void b(int i) {
        if (i(buy.FIND_MY_REMOTE, i)) {
            this.a.a(this.b);
        }
    }

    @Override // defpackage.btc
    public final void c(int i, int i2) {
        buy buyVar = buy.FIND_MY_REMOTE;
        if (h(buyVar, i, i2)) {
            if (i(buyVar, i2)) {
                this.a.d(this.b);
            } else {
                this.a.a(this.b);
            }
        }
    }

    @Override // defpackage.btc
    public final boolean d(bux buxVar) {
        if (buxVar.b != 70) {
            return false;
        }
        int iZ = ii.Z(((bva) buxVar.c).b);
        if (iZ == 0) {
            iZ = 1;
        }
        if (awc.d(iZ).equals("ACTIVATE")) {
            ((cbs) bnt.a.e().j("com/google/android/tv/remote/service/FmrFeature$ClientMessageHandler", "handleMessage", 102, "FmrFeature.java")).p("Activating FMR");
            g(true);
        } else {
            int iZ2 = ii.Z((buxVar.b == 70 ? (bva) buxVar.c : bva.a).b);
            if (iZ2 == 0) {
                iZ2 = 1;
            }
            if (awc.d(iZ2).equals("DEACTIVATE")) {
                ((cbs) bnt.a.e().j("com/google/android/tv/remote/service/FmrFeature$ClientMessageHandler", "handleMessage", 105, "FmrFeature.java")).p("DeActivating FMR");
                g(false);
            }
        }
        return true;
    }

    @Override // defpackage.btc
    public final boolean e(int i, bsw bswVar) {
        return true;
    }

    @Override // defpackage.btc
    public final void f(bxj bxjVar) {
    }
}
