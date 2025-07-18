package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ugg extends ugi {
    final /* synthetic */ ugj a;
    private final ufv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ugg(ugj ugjVar, ufv ufvVar, Executor executor) {
        super(ugjVar, executor);
        this.a = ugjVar;
        this.c = ufvVar;
    }

    @Override // defpackage.uhn
    public final /* bridge */ /* synthetic */ Object a() {
        uhp uhpVarA = this.c.a();
        uhpVarA.getClass();
        return uhpVarA;
    }

    @Override // defpackage.uhn
    public final String b() {
        return this.c.toString();
    }

    @Override // defpackage.ugi
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        this.a.ev((uhp) obj);
    }
}
