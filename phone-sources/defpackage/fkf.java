package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fkf {
    public static final Pattern a = Pattern.compile("\\{([^}]*)\\}");
    public static final Pattern b = Pattern.compile(edt.R("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
    public static final Pattern c = Pattern.compile(edt.R("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
    public static final Pattern d = Pattern.compile("\\\\an(\\d+)");
}
