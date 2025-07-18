package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dwu {
    private static final dhf a = new dhf(null);

    public static final yow a(dwt dwtVar) {
        dxn dxnVar;
        yil yilVarI;
        synchronized (a) {
            dxnVar = (dxn) dwtVar.s("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (dxnVar == null) {
                try {
                    yot yotVar = ypk.a;
                    yilVarI = yxi.a.i();
                } catch (IllegalStateException | yfv unused) {
                    yilVarI = yim.a;
                }
                dxn dxnVar2 = new dxn(yilVarI.plus(new yqy(null)));
                dwtVar.t("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", dxnVar2);
                dxnVar = dxnVar2;
            }
        }
        return dxnVar;
    }
}
