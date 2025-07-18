package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cok {
    static final cok a = new cok(null);
    volatile cok next;
    volatile Thread thread;

    public cok(byte[] bArr) {
    }

    final void a(cok cokVar) {
        col.b.a(this, cokVar);
    }

    public cok() {
        col.b.b(this, Thread.currentThread());
    }
}
