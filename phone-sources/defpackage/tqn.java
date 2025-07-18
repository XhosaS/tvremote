package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tqn extends tqo {
    public static final tqo a;
    static final tqo b;

    static {
        tqo tqoVarB = new tqn(null, new ko(0)).b();
        a = tqoVarB;
        tqn tqnVar = new tqn(tqoVarB, new ko());
        sss sssVar = tqo.e;
        sij.x(!tqnVar.d, "Can't mutate after handing to trace");
        sij.x(true ^ tqnVar.e(sssVar), "Key already present");
        tqnVar.c.put(sssVar, true);
        b = tqnVar.b();
    }

    public tqn(tqo tqoVar, ko koVar) {
        super(tqoVar, koVar);
    }
}
