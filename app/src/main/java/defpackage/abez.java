package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum abez implements abxf {
    AUTOMATION_TYPE_UNSPECIFIED(0),
    AUTOMATION_TYPE_HOME_AWAY_ROUTINE(1),
    AUTOMATION_TYPE_CUSTOM_HOUSEHOLD_ROUTINE(2),
    AUTOMATION_TYPE_PERSONAL_ROUTINE(3),
    UNRECOGNIZED(-1);

    private final int g;

    abez(int i) {
        this.g = i;
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
