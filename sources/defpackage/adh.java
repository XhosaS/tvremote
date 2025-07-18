package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adh {
    public final adg a;
    protected boolean b;
    public ArrayList c;
    public ArrayList d;
    public ArrayList e;
    public Set f;
    public String g;
    public final String h;
    public final adn i;
    public final cja j;
    public boolean k;
    public final cmz l;
    public apm m;
    public final clq n;

    public adh(adj adjVar, cmz cmzVar) {
        clq clqVar = (clq) cor.a.o();
        this.n = clqVar;
        this.b = false;
        this.c = null;
        this.d = null;
        this.e = null;
        this.k = false;
        this.a = adjVar;
        this.h = adjVar.g;
        this.g = null;
        adl adlVar = adjVar.e.getApplicationContext() instanceof adl ? (adl) adjVar.e.getApplicationContext() : (adl) adm.a.get();
        adn adnVarA = adlVar != null ? adlVar.a() : null;
        if (adnVarA == null) {
            this.i = null;
        } else if (adnVarA.b() == 2 || adnVarA.b() == 3) {
            this.i = adnVarA;
        } else {
            int iB = adnVarA.b();
            String string = iB != 0 ? Integer.toString(iB - 1) : "null";
            Log.e("AbstractLogEventBuilder", "The provided ProductIdOrigin " + string + " is not one of the process-level expected values: " + Integer.toString(2 - 1) + " or " + Integer.toString(3 - 1));
            this.i = null;
        }
        this.j = adlVar != null ? adlVar.b() : null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!clqVar.b.A()) {
            clqVar.l();
        }
        cor corVar = (cor) clqVar.b;
        corVar.b |= 1;
        corVar.c = jCurrentTimeMillis;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(TimeZone.getDefault().getOffset(((cor) clqVar.b).c));
        if (!clqVar.b.A()) {
            clqVar.l();
        }
        cor corVar2 = (cor) clqVar.b;
        corVar2.b |= 131072;
        corVar2.h = seconds;
        if (apr.f(adjVar.e)) {
            if (!clqVar.b.A()) {
                clqVar.l();
            }
            cor corVar3 = (cor) clqVar.b;
            corVar3.b |= 8388608;
            corVar3.i = true;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime != 0) {
            if (!clqVar.b.A()) {
                clqVar.l();
            }
            cor corVar4 = (cor) clqVar.b;
            corVar4.b |= 2;
            corVar4.e = jElapsedRealtime;
        }
        this.l = cmzVar;
    }

    public final void a(adn adnVar) {
        clq clqVar = this.n;
        cos cosVar = ((cor) clqVar.b).l;
        if (cosVar == null) {
            cosVar = cos.a;
        }
        clo cloVar = (clo) cosVar.a(5, null);
        cloVar.n(cosVar);
        clq clqVar2 = (clq) cloVar;
        int iB = adnVar.b();
        if (!clqVar2.b.A()) {
            clqVar2.l();
        }
        cos cosVar2 = (cos) clqVar2.b;
        int i = iB - 1;
        if (iB == 0) {
            throw null;
        }
        cosVar2.e = i;
        cosVar2.b |= 2;
        coq coqVar = cosVar2.c;
        if (coqVar == null) {
            coqVar = coq.a;
        }
        clo cloVar2 = (clo) coqVar.a(5, null);
        cloVar2.n(coqVar);
        cop copVar = ((coq) cloVar2.b).c;
        if (copVar == null) {
            copVar = cop.a;
        }
        clo cloVar3 = (clo) copVar.a(5, null);
        cloVar3.n(copVar);
        int iA = adnVar.a();
        if (!cloVar3.b.A()) {
            cloVar3.l();
        }
        cop copVar2 = (cop) cloVar3.b;
        copVar2.b |= 1;
        copVar2.c = iA;
        if (!cloVar2.b.A()) {
            cloVar2.l();
        }
        coq coqVar2 = (coq) cloVar2.b;
        cop copVar3 = (cop) cloVar3.i();
        copVar3.getClass();
        coqVar2.c = copVar3;
        coqVar2.b |= 1;
        if (!clqVar2.b.A()) {
            clqVar2.l();
        }
        cos cosVar3 = (cos) clqVar2.b;
        coq coqVar3 = (coq) cloVar2.i();
        coqVar3.getClass();
        cosVar3.c = coqVar3;
        cosVar3.b |= 1;
        cos cosVar4 = (cos) clqVar2.i();
        if (!clqVar.b.A()) {
            clqVar.l();
        }
        cor corVar = (cor) clqVar.b;
        cosVar4.getClass();
        corVar.l = cosVar4;
        corVar.b |= 268435456;
    }

    public final ami b() {
        cja cjaVarH;
        Object objA;
        if (this.b) {
            throw new IllegalStateException("do not reuse LogEventBuilder");
        }
        int i = 1;
        this.b = true;
        adg adgVar = this.a;
        adz adzVar = new adz(((adj) adgVar).f, 0);
        if (this.k) {
            Log.e("AbstractLogEventBuilder", "resolveComplianceData should not be invoked more than once per log.");
            cjaVarH = ciw.a;
        } else {
            this.k = true;
            adn adnVar = this.i;
            if ((adnVar != null && adnVar.b() == 2) || adnVar != null) {
                a(adnVar);
            }
            if (adgVar.c()) {
                cjaVarH = ciw.a;
            } else {
                cja cjaVarK = qm.K(null);
                awf awfVar = new awf(this, cjaVarK, i);
                chz chzVar = chz.a;
                cjaVarH = chk.h(chk.i(cjaVarK, awfVar, chzVar), new adz(this, i), chzVar);
            }
        }
        if (!cjaVarH.isDone() || cjaVarH.isCancelled()) {
            adx adxVar = new adx((byte[]) null, (byte[]) null);
            adx adxVar2 = new adx((adx) adxVar.a);
            apt aptVar = new apt(adxVar2, cjaVarH, adxVar);
            chz chzVar2 = chz.a;
            qm.Q(cjaVarH, aptVar, chzVar2);
            objA = ((ami) adxVar2.a).a(chzVar2, new alf(adzVar, this, i));
        } else {
            try {
                dnx.bI(cjaVarH);
                objA = adzVar.a(this);
            } catch (RuntimeException | ExecutionException unused) {
            }
        }
        return (ami) objA;
    }

    public final void c(int[] iArr) {
        if (this.a.c()) {
            throw new IllegalArgumentException("addExperimentIds forbidden on deidentified logger");
        }
        if (iArr.length == 0) {
            return;
        }
        if (this.d == null) {
            this.d = new ArrayList();
        }
        for (int i : iArr) {
            this.d.add(Integer.valueOf(i));
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AbstractLogEventBuilderuploadAccount: ");
        sb.append(this.g);
        sb.append(", logSourceName: ");
        sb.append(this.h);
        sb.append(", qosTier: 0, veMessage: null, testCodes: null, mendelPackages: ");
        ArrayList arrayList = this.c;
        sb.append(arrayList != null ? adg.a(arrayList) : null);
        sb.append(", experimentIds: ");
        ArrayList arrayList2 = this.d;
        sb.append(arrayList2 != null ? adg.a(arrayList2) : null);
        sb.append(", experimentTokens: ");
        ArrayList arrayList3 = this.e;
        sb.append(arrayList3 != null ? adg.a(arrayList3) : null);
        sb.append(", addPhenotype: true]");
        return sb.toString();
    }
}
