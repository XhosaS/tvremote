package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aghx extends aghw {
    @Override // defpackage.agfs
    public final void c(Object obj) {
        if (this.a == null) {
            this.a = obj;
            this.c.dispose();
            countDown();
        }
    }

    @Override // defpackage.agfs
    public final void fe(Throwable th) {
        if (this.a == null) {
            this.b = th;
        }
        countDown();
    }
}
