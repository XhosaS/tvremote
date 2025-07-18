package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum zod implements abxf {
    CLIENT_ACCOUNT_STATE_UNKNOWN(0),
    CLIENT_ACCOUNT_STATE_NONE(1),
    CLIENT_ACCOUNT_STATE_GAIA(2),
    CLIENT_ACCOUNT_STATE_GAIA_NO_NAME(3),
    CLIENT_ACCOUNT_STATE_PSEUDONYMOUS(4),
    CLIENT_ACCOUNT_STATE_PSEUDONYMOUS_NO_ZWIEBACK(5),
    CLIENT_ACCOUNT_STATE_DEIDENTIFIED(6),
    CLIENT_ACCOUNT_STATE_UNEXPECTED_ACCOUNT_TYPE(7),
    CLIENT_ACCOUNT_STATE_ERROR(8);

    public final int j;

    zod(int i) {
        this.j = i;
    }

    @Override // defpackage.abxf
    public final int a() {
        return this.j;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.j);
    }
}
