package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum dvm {
    HINT_VISIBLE("HINT_VISIBLE"),
    HINT_INVISIBLE("HINT_INVISIBLE"),
    DESTROYED("DESTROYED");

    private final String e;

    dvm(String str) {
        this.e = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.e;
    }
}
