package defpackage;

import java.io.Serializable;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agyu implements Serializable {
    public final Pattern a;

    public agyu(Pattern pattern) {
        this.a = pattern;
    }

    private final Object writeReplace() {
        Pattern pattern = this.a;
        String strPattern = pattern.pattern();
        strPattern.getClass();
        return new agyt(strPattern, pattern.flags());
    }

    public final String a(CharSequence charSequence, String str) {
        String strReplaceAll = this.a.matcher(charSequence).replaceAll(str);
        strReplaceAll.getClass();
        return strReplaceAll;
    }

    public final boolean b(CharSequence charSequence) {
        return this.a.matcher(charSequence).find();
    }

    public final boolean c(CharSequence charSequence) {
        return this.a.matcher(charSequence).matches();
    }

    public final String toString() {
        String string = this.a.toString();
        string.getClass();
        return string;
    }

    public agyu(String str) {
        Pattern patternCompile = Pattern.compile(str);
        patternCompile.getClass();
        this.a = patternCompile;
    }
}
