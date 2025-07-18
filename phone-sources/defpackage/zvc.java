package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zvc {
    public final int a;
    public final int b;
    public final zjb c;
    private final zvm d;
    private final int e;

    protected zvc(zjb zjbVar) {
        if (zjbVar == null) {
            throw new NullPointerException("treeDigest == null");
        }
        this.c = zjbVar;
        znp znpVarB = zut.b(zjbVar);
        String strC = znpVarB.c();
        int iB = strC.equals("SHAKE128") ? 32 : strC.equals("SHAKE256") ? 64 : znpVarB.b();
        this.a = iB;
        int iCeil = (int) Math.ceil((iB * 8) / vxr.bu(16));
        this.e = iCeil;
        int iFloor = iCeil + ((int) Math.floor(vxr.bu(iCeil * 15) / vxr.bu(16))) + 1;
        this.b = iFloor;
        zvb zvbVar = (zvb) zvb.a.get(zvb.a(znpVarB.c(), iB, iFloor));
        this.d = zvbVar;
        if (zvbVar == null) {
            throw new IllegalArgumentException("cannot find OID for digest algorithm: ".concat(znpVarB.c()));
        }
    }
}
