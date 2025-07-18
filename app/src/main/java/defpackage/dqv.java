package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dqv extends dqw {
    public volatile boolean a;

    @Override // defpackage.dqw
    public final void a() {
        if (this.a) {
            throw new IllegalStateException("Already released");
        }
    }
}
