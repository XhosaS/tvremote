package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hjz {
    public static final void a(bq bqVar) {
        bqs bqsVarEe = bqVar.ee();
        if (bqsVarEe != null) {
            if (bqsVarEe instanceof hjy) {
                ((hjy) bqsVarEe).aB(bqVar);
            } else if (feo.b(bqsVarEe, hjy.class)) {
                ((hjy) feo.a(bqsVarEe)).aB(bqVar);
            }
        }
    }
}
