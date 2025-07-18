package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dlt {
    public final int a;
    public final int b;
    public final czv c;
    private final dmd d;
    private final int e;

    protected dlt(czv czvVar) {
        if (czvVar == null) {
            throw new NullPointerException("treeDigest == null");
        }
        this.c = czvVar;
        deh dehVarB = dlk.b(czvVar);
        String strC = dehVarB.c();
        int iB = strC.equals("SHAKE128") ? 32 : strC.equals("SHAKE256") ? 64 : dehVarB.b();
        this.a = iB;
        int iCeil = (int) Math.ceil((iB * 8) / dnx.g(16));
        this.e = iCeil;
        int iFloor = iCeil + ((int) Math.floor(dnx.g(iCeil * 15) / dnx.g(16))) + 1;
        this.b = iFloor;
        dls dlsVar = (dls) dls.a.get(dls.a(dehVarB.c(), iB, iFloor));
        this.d = dlsVar;
        if (dlsVar == null) {
            throw new IllegalArgumentException("cannot find OID for digest algorithm: ".concat(dehVarB.c()));
        }
    }
}
