package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class nsw implements ntg {
    public final nsv a;
    public boolean b;
    public uao c;
    public ArrayList d;
    public ArrayList e;
    protected ArrayList f;
    public ArrayList g;
    public Set h;
    public String i;
    public String j;
    public final nte k;
    public final uhp l;
    public nte m;
    public boolean n;
    public int o;
    public final vty p;

    protected nsw(nsv nsvVar) {
        whn whnVar;
        vty vtyVar = (vty) whm.a.m();
        this.p = vtyVar;
        this.b = false;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.n = false;
        this.a = nsvVar;
        this.j = nsvVar.g;
        this.i = nsvVar.d;
        ntb ntbVar = nsvVar.e.getApplicationContext() instanceof ntb ? (ntb) nsvVar.e.getApplicationContext() : (ntb) ntd.a.get();
        nte nteVarA = ntbVar != null ? ntbVar.a() : null;
        if (nteVarA == null) {
            this.k = null;
        } else {
            whn whnVar2 = nteVarA.b;
            whn whnVar3 = whn.CPS_APP_PROCESS_GLOBAL_PROVIDER;
            if (whnVar2 == whnVar3 || whnVar2 == (whnVar = whn.NON_CPS_APP_PROCESS_GLOBAL_PROVIDER)) {
                this.k = nteVarA;
            } else {
                Log.e("AbstractLogEventBuilder", "The provided ProductIdOrigin " + whnVar2.toString() + " is not one of the process-level expected values: " + String.valueOf(whnVar3) + " or " + String.valueOf(whnVar));
                this.k = null;
            }
        }
        this.l = ntbVar != null ? ntbVar.b() : null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!vtyVar.b.A()) {
            vtyVar.u();
        }
        whm whmVar = (whm) vtyVar.b;
        whmVar.b |= 1;
        whmVar.c = jCurrentTimeMillis;
        long j = ((whm) vtyVar.b).c;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(TimeZone.getDefault().getOffset(j));
        if (!vtyVar.b.A()) {
            vtyVar.u();
        }
        whm whmVar2 = (whm) vtyVar.b;
        whmVar2.b |= 131072;
        whmVar2.g = seconds;
        if (osx.f(nsvVar.e)) {
            if (!vtyVar.b.A()) {
                vtyVar.u();
            }
            whm whmVar3 = (whm) vtyVar.b;
            whmVar3.b |= 8388608;
            whmVar3.i = true;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime != 0) {
            if (!vtyVar.b.A()) {
                vtyVar.u();
            }
            whm whmVar4 = (whm) vtyVar.b;
            whmVar4.b |= 2;
            whmVar4.d = jElapsedRealtime;
        }
    }

    public abstract nsw a();

    public abstract ntk b();

    public abstract onz c();

    public final void d(nte nteVar) {
        vty vtyVar = this.p;
        who whoVar = ((whm) vtyVar.b).m;
        if (whoVar == null) {
            whoVar = who.a;
        }
        vtw vtwVar = (vtw) whoVar.a(5, null);
        vtwVar.x(whoVar);
        vty vtyVar2 = (vty) vtwVar;
        whn whnVar = nteVar.b;
        if (!vtyVar2.b.A()) {
            vtyVar2.u();
        }
        who whoVar2 = (who) vtyVar2.b;
        whoVar2.d = whnVar.l;
        whoVar2.b |= 2;
        wdx wdxVar = whoVar2.c;
        if (wdxVar == null) {
            wdxVar = wdx.a;
        }
        vtw vtwVar2 = (vtw) wdxVar.a(5, null);
        vtwVar2.x(wdxVar);
        wdw wdwVar = ((wdx) vtwVar2.b).c;
        if (wdwVar == null) {
            wdwVar = wdw.a;
        }
        vtw vtwVar3 = (vtw) wdwVar.a(5, null);
        vtwVar3.x(wdwVar);
        int i = nteVar.a;
        if (!vtwVar3.b.A()) {
            vtwVar3.u();
        }
        wdw wdwVar2 = (wdw) vtwVar3.b;
        wdwVar2.b |= 1;
        wdwVar2.c = i;
        if (!vtwVar2.b.A()) {
            vtwVar2.u();
        }
        wdx wdxVar2 = (wdx) vtwVar2.b;
        wdw wdwVar3 = (wdw) vtwVar3.r();
        wdwVar3.getClass();
        wdxVar2.c = wdwVar3;
        wdxVar2.b |= 1;
        if (!vtyVar2.b.A()) {
            vtyVar2.u();
        }
        who whoVar3 = (who) vtyVar2.b;
        wdx wdxVar3 = (wdx) vtwVar2.r();
        wdxVar3.getClass();
        whoVar3.c = wdxVar3;
        whoVar3.b |= 1;
        who whoVar4 = (who) vtyVar2.r();
        if (!vtyVar.b.A()) {
            vtyVar.u();
        }
        whm whmVar = (whm) vtyVar.b;
        whoVar4.getClass();
        whmVar.m = whoVar4;
        whmVar.b |= 268435456;
    }

    public final void e(int[] iArr) {
        if (this.a.e()) {
            throw new IllegalArgumentException("addExperimentIds forbidden on deidentified logger");
        }
        if (iArr == null || (iArr.length) == 0) {
            return;
        }
        if (this.f == null) {
            this.f = new ArrayList();
        }
        for (int i : iArr) {
            this.f.add(Integer.valueOf(i));
        }
    }

    public final void f(String str) {
        if (this.a.e()) {
            throw new IllegalArgumentException("addMendelPackage forbidden on deidentified logger");
        }
        if (this.e == null) {
            this.e = new ArrayList();
        }
        this.e.add(str);
    }

    public final void g(String str) {
        if (!this.a.i.a(nto.ACCOUNT_NAME)) {
            throw new IllegalStateException("setUploadAccountName forbidden on deidentified logger");
        }
        this.i = str;
    }

    public final int h() {
        int i = this.o;
        if (i != 0) {
            return i;
        }
        return 1;
    }

    public final void i(int i) {
        vty vtyVar = this.p;
        if (!vtyVar.b.A()) {
            vtyVar.u();
        }
        whm whmVar = (whm) vtyVar.b;
        whm whmVar2 = whm.a;
        whmVar.b |= 32;
        whmVar.e = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AbstractLogEventBuilderuploadAccount: ");
        sb.append(this.i);
        sb.append(", logSourceName: ");
        sb.append(this.j);
        sb.append(", qosTier: ");
        sb.append(h() - 1);
        sb.append(", veMessage: ");
        sb.append(this.c);
        sb.append(", testCodes: ");
        ArrayList arrayList = this.d;
        sb.append(arrayList != null ? nsv.c(arrayList) : null);
        sb.append(", mendelPackages: ");
        ArrayList arrayList2 = this.e;
        sb.append(arrayList2 != null ? nsv.c(arrayList2) : null);
        sb.append(", experimentIds: ");
        ArrayList arrayList3 = this.f;
        sb.append(arrayList3 != null ? nsv.c(arrayList3) : null);
        sb.append(", experimentTokens: ");
        ArrayList arrayList4 = this.g;
        sb.append(arrayList4 != null ? nsv.c(arrayList4) : null);
        sb.append(", addPhenotype: true]");
        return sb.toString();
    }
}
