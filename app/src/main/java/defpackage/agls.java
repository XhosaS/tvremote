package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agls implements agfs {
    private final aglr a;

    public agls(aglr aglrVar) {
        this.a = aglrVar;
    }

    @Override // defpackage.agfs
    public final void c(Object obj) {
        this.a.lazySet(obj);
    }

    @Override // defpackage.agfs
    public final void d(aggi aggiVar) {
        aghd.c(this.a.c, aggiVar);
    }

    @Override // defpackage.agfs
    public final void fe(Throwable th) {
        aglr aglrVar = this.a;
        aghd.e(aglrVar.b);
        aglrVar.a.fe(th);
    }

    @Override // defpackage.agfs
    public final void a() {
    }
}
