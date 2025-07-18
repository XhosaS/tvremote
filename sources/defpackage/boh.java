package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class boh implements bop {
    public final /* synthetic */ bum a;
    private final /* synthetic */ int b;

    public /* synthetic */ boh(bum bumVar, int i) {
        this.b = i;
        this.a = bumVar;
    }

    @Override // defpackage.bop
    public final void a() {
        if (this.b != 0) {
            bum bumVar = this.a;
            bumVar.f(2, bumVar.c());
        } else {
            bum bumVar2 = this.a;
            bumVar2.f(1, bumVar2.c());
        }
    }
}
