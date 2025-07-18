package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum fwx implements abxf {
    PROFILE_LOCK_UNSPECIFIED(0),
    PROFILE_LOCK_NO_LOCK(1),
    PROFILE_LOCK_LOCKED(2),
    PROFILE_LOCK_LOCKED_UNLOCKED(3),
    UNRECOGNIZED(-1);

    private final int g;

    fwx(int i) {
        this.g = i;
    }

    public static fwx b(int i) {
        if (i == 0) {
            return PROFILE_LOCK_UNSPECIFIED;
        }
        if (i == 1) {
            return PROFILE_LOCK_NO_LOCK;
        }
        if (i == 2) {
            return PROFILE_LOCK_LOCKED;
        }
        if (i != 3) {
            return null;
        }
        return PROFILE_LOCK_LOCKED_UNLOCKED;
    }

    @Override // defpackage.abxf
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.g;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.g);
    }
}
