package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class gk extends gj {
    final /* synthetic */ gm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gk(gm gmVar) {
        super(gmVar);
        this.b = gmVar;
    }

    @Override // defpackage.gj
    public final void a(int i) {
        super/*android.widget.TextView*/.setFirstBaselineToTopHeight(i);
    }

    @Override // defpackage.gj
    public final void b(int i) {
        super/*android.widget.TextView*/.setLastBaselineToBottomHeight(i);
    }
}
