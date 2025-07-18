package defpackage;

import android.content.Context;
import android.util.Log;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ecr extends dru {
    public edf l;
    public WeakReference m;
    public dtu n;
    public final ecm o;

    /* JADX WARN: Illegal instructions before constructor call */
    public ecr(dru druVar) {
        Context context = druVar.a;
        String strJ = druVar.j();
        ohv ohvVarO = druVar.o();
        dzh dzhVarB = dzh.b(druVar.f);
        super(context, strJ, ohvVarO, null);
        this.f = dzhVarB;
        this.o = new ecm();
    }

    public static ecr q(ecr ecrVar, ecq ecqVar) {
        ecr ecrVar2 = new ecr(ecrVar);
        ecrVar2.l = ecrVar.l;
        ecrVar2.n = ecrVar.n;
        ecrVar2.m = new WeakReference(ecqVar);
        return ecrVar2;
    }

    @Override // defpackage.dru
    public final dtx e(int i, String str, dug dugVar) {
        WeakReference weakReference = this.m;
        ecq ecqVar = weakReference == null ? null : (ecq) weakReference.get();
        return new dtx(ecqVar == null ? "" : ecqVar.k, i, str, dugVar);
    }

    @Override // defpackage.dru
    public final String i() {
        ecq ecqVar = (ecq) this.m.get();
        if (ecqVar != null) {
            return ecqVar.k;
        }
        throw new IllegalStateException("getGlobalKey cannot be accessed from a SectionContext without a scope");
    }

    @Override // defpackage.dru
    public final void k(dxw dxwVar, String str) {
        ecq ecqVar = (ecq) this.m.get();
        edf edfVar = this.l;
        if (edfVar == null || ecqVar == null) {
            return;
        }
        if (ejr.a) {
            Log.d("SectionsDebug", "(" + this.l.hashCode() + ") updateStateAsync from " + dxwVar.getClass().getName());
        }
        edfVar.k(ecqVar.k, dxwVar, str);
    }

    @Override // defpackage.dru
    public final void l(dxw dxwVar, String str) {
        ecq ecqVar = (ecq) this.m.get();
        edf edfVar = this.l;
        if (edfVar == null || ecqVar == null) {
            return;
        }
        if (ejr.a) {
            Log.d("SectionsDebug", "(" + this.l.hashCode() + ") updateState from " + dxwVar.getClass().getName());
        }
        edfVar.j(ecqVar.k, dxwVar, str);
    }

    public final ecq p() {
        return (ecq) this.m.get();
    }
}
