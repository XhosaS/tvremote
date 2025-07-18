package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class wxu extends wwp {
    final /* synthetic */ wwq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wxu(wvx wvxVar, wwq wwqVar) {
        super(wvxVar);
        this.b = wwqVar;
    }

    @Override // defpackage.wwp, defpackage.wwt, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
        wwq wwqVar = this.b;
        if (wwqVar != null) {
            wum.g(wum.c(), wwqVar);
        }
    }
}
