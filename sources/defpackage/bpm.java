package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpm {
    private final bue a;
    private final bpl b;

    public bpm(bue bueVar, String str) {
        this.a = bueVar;
        bpl bplVar = new bpl();
        this.b = bplVar;
        bueVar.b.openRemoteInputBridge(bplVar, str, 1, 1, 1);
    }

    public final void a() {
        this.a.b.closeInputBridge(this.b);
    }

    public final void b(int i) {
        this.a.b.sendKeyDown(this.b, i);
    }

    public final void c(int i) {
        this.a.b.sendKeyUp(this.b, i);
    }

    public final void d() {
        this.a.b.sendPointerSync(this.b);
    }

    protected final void finalize() {
        a();
    }
}
