package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oez {
    private final Object a = new Object();
    private volatile Object b;

    public final Object a(oey oeyVar) {
        if (this.b == null) {
            synchronized (this.a) {
                if (this.b == null) {
                    this.b = oeyVar.a();
                }
            }
        }
        return this.b;
    }
}
