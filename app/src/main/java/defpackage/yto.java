package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
enum yto {
    STRONG,
    SOFT,
    WEAK;

    final yqg a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return yqe.a;
        }
        if (iOrdinal == 1 || iOrdinal == 2) {
            return yqf.a;
        }
        throw null;
    }
}
