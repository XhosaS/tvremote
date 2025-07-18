package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zzo {
    public static final zzo a = new zzo("ENABLED");
    public static final zzo b = new zzo("DISABLED");
    public static final zzo c = new zzo("DESTROYED");
    private final String d;

    private zzo(String str) {
        this.d = str;
    }

    public final String toString() {
        return this.d;
    }
}
