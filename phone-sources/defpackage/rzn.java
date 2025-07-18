package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rzn implements ttm {
    boolean a;
    Object b;
    final /* synthetic */ ttm c;

    public rzn(ttm ttmVar) {
        this.c = ttmVar;
    }

    @Override // defpackage.ttm
    public final Object get() {
        if (this.a) {
            return this.b;
        }
        Object obj = this.c.get();
        this.b = obj;
        this.a = true;
        return obj;
    }
}
