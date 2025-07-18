package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum adzh implements abxf {
    LATENCY_SETUP_UNKNOWN(0),
    LATENCY_SETUP_FIRST_SCREEN(1),
    AUTH_CHECK(2),
    FETCH_EXISTING_SETTINGS(3),
    PROCESS_EXISTING_SETTINGS(4),
    LOAD_EXPERIMENTS_CONFIG(5),
    LOAD_EXPERIMENTS_CONFIG_TIMEOUT(6),
    PROCESS_ASSISTANT_SUPPORTED_BIT(7),
    HOMEGRAPH_LOAD_LATENCY(8);

    public final int j;

    adzh(int i) {
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
