package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yiu implements yih {
    public static final yiu a = new yiu();

    private yiu() {
    }

    @Override // defpackage.yih
    public final yil getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // defpackage.yih
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
