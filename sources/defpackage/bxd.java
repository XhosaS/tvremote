package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxd extends bxe {
    public static final bxe a;
    static final bxe b;

    static {
        bxe bxeVarB = new bxd(null, new mi(0)).b();
        a = bxeVarB;
        bxd bxdVar = new bxd(bxeVarB, new mi());
        awn awnVar = bxe.e;
        bdq.k(!bxdVar.d, "Can't mutate after handing to trace");
        bdq.k(true ^ bxdVar.e(awnVar), "Key already present");
        bxdVar.c.put(awnVar, true);
        b = bxdVar.b();
    }

    public bxd(bxe bxeVar, mi miVar) {
        super(bxeVar, miVar);
    }
}
