package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fds extends agtq {
    /* synthetic */ Object a;
    final /* synthetic */ fdw b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fds(fdw fdwVar, agsw agswVar) {
        super(agswVar);
        this.b = fdwVar;
    }

    @Override // defpackage.agto
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
