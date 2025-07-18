package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class wvm implements wwt {
    public final /* synthetic */ wwt a;
    public final /* synthetic */ wwt b;
    public final /* synthetic */ wwq c;

    public /* synthetic */ wvm(wwt wwtVar, wwt wwtVar2, wwq wwqVar) {
        this.a = wwtVar;
        this.b = wwtVar2;
        this.c = wwqVar;
    }

    @Override // defpackage.wwt, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
        wwt wwtVar = this.b;
        if (wwtVar != null) {
            wwtVar.close();
        }
        wum.g(wum.c(), this.c);
    }
}
