package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpv {
    public static final int a(bsk bskVar) throws Exception {
        brj brjVarA = bskVar.a("SELECT changes()");
        try {
            brjVarA.l();
            int iB = (int) brjVarA.b(0);
            aguj.a(brjVarA, null);
            return iB;
        } finally {
        }
    }
}
