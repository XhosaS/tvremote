package defpackage;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ynj implements Serializable {
    private final Pattern a;

    public ynj(Pattern pattern) {
        this.a = pattern;
    }

    public static /* synthetic */ aafi g(ynj ynjVar, CharSequence charSequence) {
        charSequence.getClass();
        Matcher matcher = ynjVar.a.matcher(charSequence);
        matcher.getClass();
        return yks.i(matcher, 0, charSequence);
    }

    private final Object writeReplace() {
        Pattern pattern = this.a;
        String strPattern = pattern.pattern();
        strPattern.getClass();
        return new yni(strPattern, pattern.flags());
    }

    public final String a() {
        String strPattern = this.a.pattern();
        strPattern.getClass();
        return strPattern;
    }

    public final boolean b(CharSequence charSequence) {
        return this.a.matcher(charSequence).find();
    }

    public final boolean c(CharSequence charSequence) {
        charSequence.getClass();
        return this.a.matcher(charSequence).matches();
    }

    public final String d(CharSequence charSequence) {
        String strReplaceAll = this.a.matcher(charSequence).replaceAll("");
        strReplaceAll.getClass();
        return strReplaceAll;
    }

    public final String e(CharSequence charSequence) {
        charSequence.getClass();
        String strReplaceFirst = this.a.matcher(charSequence).replaceFirst("");
        strReplaceFirst.getClass();
        return strReplaceFirst;
    }

    public final aafi f(CharSequence charSequence) {
        charSequence.getClass();
        Matcher matcher = this.a.matcher(charSequence);
        matcher.getClass();
        if (matcher.matches()) {
            return new aafi(matcher, charSequence);
        }
        return null;
    }

    public final String toString() {
        String string = this.a.toString();
        string.getClass();
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ynj(String str) {
        Pattern patternCompile = Pattern.compile(str);
        patternCompile.getClass();
        this(patternCompile);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ynj(String str, byte[] bArr) {
        Pattern patternCompile = Pattern.compile(str, 66);
        patternCompile.getClass();
        this(patternCompile);
    }
}
