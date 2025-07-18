package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class oy implements Runnable {
    final /* synthetic */ oz a;

    public oy(oz ozVar) {
        this.a = ozVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oz ozVar = this.a;
        nu nuVar = ozVar.e;
        if (nuVar == null || !nuVar.isAttachedToWindow() || ozVar.e.getCount() <= ozVar.e.getChildCount()) {
            return;
        }
        ozVar.e.getChildCount();
        ozVar.q.setInputMethodMode(2);
        ozVar.s();
    }
}
