package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum fwl implements abxf {
    HOTWORD_CONSENT_UNSPECIFIED(0),
    HOTWORD_CONSENT_SPECIFIED_FOR_NO_USER(1),
    HOTWORD_CONSENT_ACCEPTED(2),
    HOTWORD_CONSENT_DENIED(3),
    UNRECOGNIZED(-1);

    private final int g;

    fwl(int i) {
        this.g = i;
    }

    public static fwl b(int i) {
        if (i == 0) {
            return HOTWORD_CONSENT_UNSPECIFIED;
        }
        if (i == 1) {
            return HOTWORD_CONSENT_SPECIFIED_FOR_NO_USER;
        }
        if (i == 2) {
            return HOTWORD_CONSENT_ACCEPTED;
        }
        if (i != 3) {
            return null;
        }
        return HOTWORD_CONSENT_DENIED;
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
