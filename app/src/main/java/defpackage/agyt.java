package defpackage;

import java.io.Serializable;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agyt implements Serializable {
    private static final long serialVersionUID = 0;
    private final String a;
    private final int b;

    public agyt(String str, int i) {
        this.a = str;
        this.b = i;
    }

    private final Object readResolve() {
        Pattern patternCompile = Pattern.compile(this.a, this.b);
        patternCompile.getClass();
        return new agyu(patternCompile);
    }
}
