package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class wf extends wk {
    final /* synthetic */ wg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wf(wg wgVar) {
        super(wgVar.c);
        this.a = wgVar;
    }

    @Override // defpackage.wk
    protected final Object a(int i) {
        return this.a.b[i];
    }

    @Override // defpackage.wk
    protected final void b(int i) {
        this.a.b(i);
    }
}
