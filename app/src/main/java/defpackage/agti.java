package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agti extends agts {
    final /* synthetic */ agvb a;
    final /* synthetic */ Object b;
    private int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agti(agsw agswVar, agvb agvbVar, Object obj) {
        super(agswVar);
        this.a = agvbVar;
        this.b = obj;
    }

    @Override // defpackage.agto
    protected final Object b(Object obj) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.c = 2;
            agpl.b(obj);
            return obj;
        }
        this.c = 1;
        agpl.b(obj);
        agvb agvbVar = this.a;
        agwk.b(agvbVar, 2);
        return agvbVar.a(this.b, this);
    }
}
