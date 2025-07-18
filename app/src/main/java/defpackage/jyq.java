package defpackage;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class jyq implements jzv {
    public final jyn a;
    public final aecc b;
    public boolean c;
    public zlv d;
    protected ArrayList e;
    protected ArrayList f;
    protected ArrayList g;
    protected ArrayList h;
    protected Set i;
    protected String j;
    public String k;
    public aece l;
    public final jzc m;
    public jzc n;
    public boolean o;

    protected jyq(jyn jynVar) {
        jzc jzcVarC;
        aech aechVar;
        aecd aecdVar = aecd.a;
        aecc aeccVar = new aecc();
        this.b = aeccVar;
        this.c = false;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.o = false;
        this.a = jynVar;
        this.k = jynVar.i;
        this.j = jynVar.e;
        jynVar.g.getApplicationContext();
        if (((ghs) jzb.a.get()) != null) {
            ght ghtVar = gkh.a;
            jzcVarC = jzc.c(105485385, aech.NON_CPS_APP_PROCESS_GLOBAL_PROVIDER);
        } else {
            jzcVarC = null;
        }
        if (jzcVarC == null) {
            this.m = null;
        } else {
            aech aechVar2 = ((jyr) jzcVarC).b;
            aech aechVar3 = aech.CPS_APP_PROCESS_GLOBAL_PROVIDER;
            if (aechVar2 == aechVar3 || aechVar2 == (aechVar = aech.NON_CPS_APP_PROCESS_GLOBAL_PROVIDER)) {
                this.m = jzcVarC;
            } else {
                Log.e("AbstractLogEventBuilder", "The provided ProductIdOrigin " + Integer.toString(aechVar2.l) + " is not one of the process-level expected values: " + String.valueOf(aechVar3) + " or " + String.valueOf(aechVar));
                this.m = null;
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if ((aeccVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            aeccVar.y();
        }
        aecd aecdVar2 = (aecd) aeccVar.b;
        aecdVar2.b |= 1;
        aecdVar2.c = jCurrentTimeMillis;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(TimeZone.getDefault().getOffset(((aecd) aeccVar.b).c));
        if ((aeccVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            aeccVar.y();
        }
        aecd aecdVar3 = (aecd) aeccVar.b;
        aecdVar3.b |= 131072;
        aecdVar3.g = seconds;
        if (mhv.g(jynVar.g)) {
            if ((aeccVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                aeccVar.y();
            }
            aecd aecdVar4 = (aecd) aeccVar.b;
            aecdVar4.b |= 8388608;
            aecdVar4.i = true;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime != 0) {
            if ((aeccVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                aeccVar.y();
            }
            aecd aecdVar5 = (aecd) aeccVar.b;
            aecdVar5.b |= 2;
            aecdVar5.d = jElapsedRealtime;
        }
    }

    public abstract jyq a();

    @Override // defpackage.jzv
    public final /* synthetic */ jzw b() {
        return this.a;
    }

    public abstract LogEventParcelable c();

    public abstract lvf d();

    public final aece e() {
        aece aeceVar = this.l;
        return aeceVar != null ? aeceVar : this.a.f;
    }

    @Override // defpackage.jzv
    public final String f() {
        return this.k;
    }

    @Override // defpackage.jzv
    public final String g() {
        return this.j;
    }

    @Override // defpackage.jzv
    public final List h() {
        return this.f;
    }

    @Override // defpackage.jzv
    public final void i(ExperimentTokens experimentTokens, Set set) {
        jyn jynVar = this.a;
        if (jynVar.d()) {
            throw new IllegalArgumentException("addExperimentTokens forbidden on deidentified logger");
        }
        if (this.i == null) {
            this.i = new HashSet();
        }
        this.i.addAll(set);
        if (jynVar.d()) {
            throw new IllegalArgumentException("addExperimentTokens forbidden on deidentified logger");
        }
        if (experimentTokens == null) {
            return;
        }
        if (this.h == null) {
            this.h = new ArrayList();
        }
        this.h.add(experimentTokens);
    }

    public final void j(jzc jzcVar) {
        aecc aeccVar = this.b;
        aeci aeciVar = ((aecd) aeccVar.b).l;
        if (aeciVar == null) {
            aeciVar = aeci.a;
        }
        aecf aecfVar = new aecf();
        aecfVar.B(aeciVar);
        jyr jyrVar = (jyr) jzcVar;
        aech aechVar = jyrVar.b;
        if ((aecfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            aecfVar.y();
        }
        aeci aeciVar2 = (aeci) aecfVar.b;
        aeciVar2.d = aechVar.l;
        aeciVar2.b |= 2;
        acpx acpxVar = aeciVar2.c;
        if (acpxVar == null) {
            acpxVar = acpx.a;
        }
        acpw acpwVar = new acpw();
        acpwVar.B(acpxVar);
        acpv acpvVar = ((acpx) acpwVar.b).c;
        if (acpvVar == null) {
            acpvVar = acpv.a;
        }
        acpu acpuVar = new acpu();
        acpuVar.B(acpvVar);
        int i = jyrVar.a;
        if ((acpuVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acpuVar.y();
        }
        acpv acpvVar2 = (acpv) acpuVar.b;
        acpvVar2.b |= 1;
        acpvVar2.c = i;
        if ((acpwVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            acpwVar.y();
        }
        acpx acpxVar2 = (acpx) acpwVar.b;
        acpv acpvVar3 = (acpv) acpuVar.v();
        acpvVar3.getClass();
        acpxVar2.c = acpvVar3;
        acpxVar2.b |= 1;
        if ((aecfVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            aecfVar.y();
        }
        aeci aeciVar3 = (aeci) aecfVar.b;
        acpx acpxVar3 = (acpx) acpwVar.v();
        acpxVar3.getClass();
        aeciVar3.c = acpxVar3;
        aeciVar3.b |= 1;
        aeci aeciVar4 = (aeci) aecfVar.v();
        if ((aeccVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            aeccVar.y();
        }
        aecd aecdVar = (aecd) aeccVar.b;
        aeciVar4.getClass();
        aecdVar.l = aeciVar4;
        aecdVar.b |= 268435456;
    }

    public final void k(int[] iArr) {
        if (this.a.d()) {
            throw new IllegalArgumentException("addExperimentIds forbidden on deidentified logger");
        }
        if (iArr == null || (iArr.length) == 0) {
            return;
        }
        if (this.g == null) {
            this.g = new ArrayList();
        }
        for (int i : iArr) {
            this.g.add(Integer.valueOf(i));
        }
    }

    public final void l(String str) {
        if (this.a.d()) {
            throw new IllegalArgumentException("addMendelPackage forbidden on deidentified logger");
        }
        if (this.f == null) {
            this.f = new ArrayList();
        }
        this.f.add(str);
    }

    public final void m(int i) {
        if (this.e == null) {
            this.e = new ArrayList();
        }
        this.e.add(Integer.valueOf(i));
    }

    public final void n(String str) {
        if (this.a.d()) {
            throw new IllegalStateException("setZwiebackCookieOverride forbidden on deidentified logger");
        }
        aecc aeccVar = this.b;
        if ((aeccVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            aeccVar.y();
        }
        aecd aecdVar = (aecd) aeccVar.b;
        aecd aecdVar2 = aecd.a;
        str.getClass();
        aecdVar.b |= 16777216;
        aecdVar.j = str;
    }

    public final void o(String str) {
        if (!this.a.k.d.contains(kad.ACCOUNT_NAME)) {
            throw new IllegalStateException("setUploadAccountName forbidden on deidentified logger");
        }
        this.j = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AbstractLogEventBuilderuploadAccount: ");
        sb.append(this.j);
        sb.append(", logSourceName: ");
        sb.append(this.k);
        sb.append(", qosTier: ");
        sb.append(e().f);
        sb.append(", veMessage: ");
        sb.append(this.d);
        sb.append(", testCodes: ");
        ArrayList arrayList = this.e;
        sb.append(arrayList != null ? jyn.b(arrayList) : null);
        sb.append(", mendelPackages: ");
        ArrayList arrayList2 = this.f;
        sb.append(arrayList2 != null ? jyn.b(arrayList2) : null);
        sb.append(", experimentIds: ");
        ArrayList arrayList3 = this.g;
        sb.append(arrayList3 != null ? jyn.b(arrayList3) : null);
        sb.append(", experimentTokens: ");
        ArrayList arrayList4 = this.h;
        sb.append(arrayList4 != null ? jyn.b(arrayList4) : null);
        sb.append(", addPhenotype: true]");
        return sb.toString();
    }
}
