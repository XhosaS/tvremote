package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class axt {
    public final crv a;

    static {
        cab.p("googleapis.com", "adwords.google.com", "m.google.com", "sandbox.google.com");
        Pattern.compile("(?:[^\\/]*\\/)([^;]*)");
        Pattern.compile("([^\\?]+)(\\?+)");
        Pattern.compile("((?:https?:\\/\\/|)[a-zA-Z0-9-_\\.]+(?::\\d+)?)(.*)?");
        Pattern.compile("(.*)(?<!https?:\\/)(?:\\/[\\w]+$)");
        Pattern.compile("(.*)(?<!https?:\\/)(?:\\/[\\w]+\\.[\\w]*$)");
        Pattern.compile("([a-zA-Z0-9-_]+)");
        Pattern.compile("\\b([0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3})(:\\d{1,5})?\\b");
    }

    public axt(crv crvVar) {
        this.a = crvVar;
    }
}
