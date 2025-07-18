package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
interface luo {
    public static final String a;
    public static final String[] b;

    static {
        int i = mei.a;
        a = "account = ? AND (" + mei.c("query") + " OR " + mei.c("query") + ") AND timestamp > ?";
        b = new String[]{"query"};
    }
}
