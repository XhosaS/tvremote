package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class abak {
    public static final abak a = new abak("", "", false);
    public final String b;
    public final String c;
    public final boolean d;

    static {
        new abak("\n", "  ", true);
    }

    private abak(String str, String str2, boolean z) {
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.b = str;
        this.c = str2;
        this.d = z;
    }
}
