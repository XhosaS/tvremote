package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zcg {
    public static final Pattern a = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final Pattern b = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    public final String c;

    public zcg(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zcg) && yks.e(((zcg) obj).c, this.c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return this.c;
    }
}
