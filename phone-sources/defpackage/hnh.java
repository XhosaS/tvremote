package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hnh implements hws {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public hnh(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [cuj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [cuj, java.lang.Object] */
    @Override // defpackage.hws
    public final /* synthetic */ Object a() {
        if (this.b != 0) {
            nuh nuhVar = (nuh) this.a;
            return new hmz((hni) nuhVar.c, nuhVar.b);
        }
        lkt lktVar = (lkt) this.a;
        Object obj = lktVar.c;
        Object obj2 = lktVar.a;
        Object obj3 = lktVar.f;
        Object obj4 = lktVar.b;
        return new hnn((hpd) obj, (hpd) obj2, (hpd) obj3, (moz) obj4, (moz) lktVar.d, lktVar.e);
    }
}
