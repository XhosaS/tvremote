package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class gqd implements coo {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ gqd(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, yil] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.coo
    public final Object a(com comVar) {
        if (this.c != 0) {
            ?? r0 = this.a;
            comVar.a(new gfe((yqe) r0.get(yqe.c), 7), gpc.a);
            return ykr.q(yoz.l(r0), null, 1, new uc((yjz) this.b, comVar, (yih) null, 15), 1);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        comVar.a(new gfe(atomicBoolean, 8), gpc.a);
        this.a.execute(new bd((Object) atomicBoolean, (Object) comVar, this.b, 11, (byte[]) null));
        return ygi.a;
    }
}
