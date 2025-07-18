package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class chv extends chx {
    final /* synthetic */ chy a;
    private final chs c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chv(chy chyVar, chs chsVar, Executor executor) {
        super(chyVar, executor);
        this.a = chyVar;
        this.c = chsVar;
    }

    @Override // defpackage.ciy
    public final /* bridge */ /* synthetic */ Object a() {
        return this.c.a();
    }

    @Override // defpackage.ciy
    public final String b() {
        return this.c.toString();
    }

    @Override // defpackage.chx
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        this.a.e((cja) obj);
    }
}
