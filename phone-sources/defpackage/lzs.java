package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class lzs implements idy, idf {
    final /* synthetic */ lzt a;
    private final uof b;

    public lzs(lzt lztVar, uof uofVar) {
        this.a = lztVar;
        this.b = uofVar;
    }

    @Override // defpackage.idf
    public final /* synthetic */ Object b(Object obj) {
        if (!((lqn) obj).a) {
            return ieg.b;
        }
        lzt lztVar = this.a;
        lztVar.a.e(this.b, icz.a, new mfm());
        return ieg.f(kvk.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [idy, java.lang.Object] */
    @Override // defpackage.idy
    public final /* synthetic */ void c(Object obj) {
        ((ieg) obj).c(this).n(this.a.b.a);
    }
}
