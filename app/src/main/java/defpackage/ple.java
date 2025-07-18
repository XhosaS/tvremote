package defpackage;

import java.util.EnumSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ple {
    public static final ple a;
    public static final ple b;
    public static final ple c;

    static {
        plc plcVarC = c();
        ((pky) plcVarC).a = yzq.o(EnumSet.noneOf(pld.class));
        plcVarC.b(false);
        a = plcVarC.a();
        plc plcVarC2 = c();
        ((pky) plcVarC2).a = yzq.o(EnumSet.of(pld.ANY));
        plcVarC2.b(true);
        b = plcVarC2.a();
        plc plcVarC3 = c();
        ((pky) plcVarC3).a = yzq.o(EnumSet.of(pld.ANY));
        plcVarC3.b(false);
        c = plcVarC3.a();
    }

    public static plc c() {
        pky pkyVar = new pky();
        pkyVar.b(false);
        return pkyVar;
    }

    public abstract yzq a();

    public abstract boolean b();
}
