package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum whn implements vug {
    NOT_SET(0),
    CPS_APP_PROCESS_GLOBAL_PROVIDER(1),
    NON_CPS_APP_PROCESS_GLOBAL_PROVIDER(2),
    LOGGER_OVERRIDE_PROVIDER(3),
    LOGGER_DEFERRING_PROVIDER(4),
    EVENT_OVERRIDE(5),
    EVENT_DEFERRING(6),
    LOG_SOURCE_MAPPED(7),
    SERVER_INFRASTRUCTURE(8),
    LOG_REQUEST_SETTER_WEB(9),
    PRIVACY_CONTEXT_RESOLVER(10);

    public final int l;

    whn(int i) {
        this.l = i;
    }

    @Override // defpackage.vug
    public final int a() {
        return this.l;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.l);
    }
}
