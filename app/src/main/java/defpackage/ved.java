package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public enum ved implements abxf {
    TRANSCRIPT_TYPE_UNSPECIFIED(0),
    ONLINE(1),
    OFFLINE(2),
    FINAL(3);

    public final int e;

    ved(int i) {
        this.e = i;
    }

    public static ved b(int i) {
        if (i == 0) {
            return TRANSCRIPT_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return ONLINE;
        }
        if (i == 2) {
            return OFFLINE;
        }
        if (i != 3) {
            return null;
        }
        return FINAL;
    }

    @Override // defpackage.abxf
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
