package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class sbg {
    public sbi b;

    protected abstract Object b();

    public final Object e() {
        sbi sbiVar = this.b;
        if (sbiVar != null) {
            return sbiVar.a(b());
        }
        throw new IllegalStateException("Required field 'stager' was not set.");
    }
}
