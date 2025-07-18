package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gpp extends fki {
    private final Throwable a;

    public gpp(Throwable th) {
        super((short[]) null);
        this.a = th;
    }

    public final String toString() {
        return "FAILURE (" + this.a.getMessage() + ")";
    }
}
