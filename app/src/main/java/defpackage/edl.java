package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class edl {
    private final dtu a;

    public edl(dtu dtuVar) {
        this.a = dtuVar;
    }

    public final ejm a(Object obj, int i) {
        int i2 = edj.s;
        edr edrVar = new edr();
        edrVar.a = i;
        edrVar.b = obj;
        dtu dtuVar = this.a;
        ejm ejmVarN = (ejm) dtuVar.b.n().x(dtuVar, edrVar);
        if (ejmVarN == null) {
            dsr.b(2, "RenderInfo has returned null. Returning ComponentRenderInfo.createEmpty() as default.");
            ejmVarN = efk.n();
        }
        boolean z = ebc.a;
        return ejmVarN;
    }
}
