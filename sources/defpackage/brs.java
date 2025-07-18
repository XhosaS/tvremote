package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum brs {
    LEGACY((byte) 0, "legacy"),
    PTT((byte) 1, "PTT"),
    HTT((byte) 3, "HTT");

    final byte d;
    private final String f;

    brs(byte b, String str) {
        this.d = b;
        this.f = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f;
    }
}
