package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aadr {
    public static final aadr a = new aadr("SHA1");
    public static final aadr b = new aadr("SHA256");
    public static final aadr c = new aadr("SHA512");
    public final String d;

    private aadr(String str) {
        this.d = str;
    }

    public final String toString() {
        return this.d;
    }
}
