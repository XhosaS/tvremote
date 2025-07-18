package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum adzk implements abxf {
    SETUP_SKIP_NONE(0),
    SETUP_WIZARD_WRONG_CALLING_PACKAGE(1),
    SETUP_WIZARD_BACKWARD_DIRECTION(2),
    SETUP_WIZARD_FORWARD_DIRECTION_AGAIN(3),
    SETUP_WIZARD_NO_NETWORK_CONNECTION(4),
    SETUP_ALREADY_DONE(5),
    UNSUPPORTED_LOCALE(6),
    ERROR(7),
    SETUP_BLOCKED_BY_EXISTING_INSTANCE(8);

    public final int j;

    adzk(int i) {
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
