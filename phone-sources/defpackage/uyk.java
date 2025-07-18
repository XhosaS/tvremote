package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum uyk implements vug {
    CLIENT_VALUE_UNKNOWN(0),
    CLIENT_VALUE_ACCOUNT_NAME(1);

    public final int c;

    uyk(int i) {
        this.c = i;
    }

    public static uyk b(int i) {
        if (i == 0) {
            return CLIENT_VALUE_UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return CLIENT_VALUE_ACCOUNT_NAME;
    }

    @Override // defpackage.vug
    public final int a() {
        return this.c;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.c);
    }
}
