package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agtp implements agsw {
    public static final agtp a = new agtp();

    private agtp() {
    }

    @Override // defpackage.agsw
    public final void e(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // defpackage.agsw
    public final agte fr() {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
