package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zwg extends zwi {
    final /* synthetic */ zwj a;
    private final zvh c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zwg(zwj zwjVar, zvh zvhVar, Executor executor) {
        super(zwjVar, executor);
        this.a = zwjVar;
        this.c = zvhVar;
    }

    @Override // defpackage.zyb
    public final /* bridge */ /* synthetic */ Object a() {
        zyd zydVarA = this.c.a();
        zydVarA.getClass();
        return zydVarA;
    }

    @Override // defpackage.zyb
    public final String b() {
        return this.c.toString();
    }

    @Override // defpackage.zwi
    public final /* synthetic */ void c(Object obj) {
        this.a.eZ((zyd) obj);
    }
}
