package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.google.android.libraries.performance.primes.transmitter.clearcut.ClearcutMetricSnapshotTransmitter;
import java.io.File;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class awf implements cht {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ awf(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [cja, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [cja, java.lang.Object] */
    @Override // defpackage.cht
    public final cja a(Object obj) {
        int i = this.c;
        if (i == 0) {
            return ((awh) this.a).h.a(awh.m((cyf) obj, (awl) this.b));
        }
        boolean zA = true;
        if (i == 1) {
            ado adoVar = (ado) obj;
            ?? r0 = this.b;
            if (adoVar != null) {
                return r0;
            }
            cja cjaVar = ((adh) this.a).j;
            return cjaVar == null ? qm.K(null) : cjaVar;
        }
        if (i == 2) {
            azo azoVar = (azo) obj;
            clo cloVar = (clo) azoVar.a(5, null);
            cloVar.n(azoVar);
            clq clqVar = (clq) cloVar;
            if (!clqVar.b.A()) {
                clqVar.l();
            }
            Object obj2 = this.a;
            Object obj3 = this.b;
            azo azoVar2 = (azo) clqVar.b;
            azo azoVar3 = azo.a;
            obj3.getClass();
            azoVar2.c = (cym) obj3;
            azoVar2.b |= 1;
            bdl bdlVar = (bdl) obj2;
            return ((ClearcutMetricSnapshotTransmitter) bdlVar.e).a((Context) bdlVar.c, (azo) clqVar.i());
        }
        if (i != 3) {
            if (i == 4) {
                bcy bcyVar = (bcy) this.a;
                return ((asv) bcyVar.d.aL()).f(new bcx(bcyVar, (bda) this.b));
            }
            Object obj4 = this.a;
            bfz bfzVar = (bfz) obj4;
            bfzVar.c((Uri) qm.P(bfzVar.b), obj);
            Object obj5 = bfzVar.e;
            ?? r2 = this.b;
            synchronized (obj5) {
                ((bfz) obj4).f = r2;
            }
            return qm.K(obj);
        }
        int i2 = bcw.a;
        int i3 = bzs.d;
        bzo bzoVar = new bzo();
        Context context = ((bav) this.a).d;
        bzoVar.g(context);
        int i4 = apr.a;
        bzoVar.g(apr.a(context));
        bzs bzsVarF = bzoVar.f();
        int i5 = ((cax) bzsVarF).c;
        for (int i6 = 0; i6 < i5; i6++) {
            Object obj6 = this.b;
            File file = new File(String.valueOf(((Context) bzsVarF.get(i6)).getFilesDir()) + "/phenotype/shared/" + ((String) obj6));
            Log.i("PhenotypeAccountStore", "Removing snapshots for removed user");
            if (file.exists()) {
                zA = bcw.a(file);
            }
        }
        return zA ? ciw.a : new civ(new IOException("Unable to remove snapshots for removed user"));
    }
}
