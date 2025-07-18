package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aahx {
    public static final yyk a;
    public static final yyk b;
    private static final yyk c;

    static {
        yzq.u("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire");
        a = yyk.t("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");
        c = yyk.q("auto", "app", "am");
        b = yyk.p("_r", "_dbg");
        yyf yyfVar = new yyf(4);
        yyfVar.a(lcw.a, 15);
        yyfVar.a(lcw.b, 15);
        yyfVar.f();
        yyk.p("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }

    public static boolean a() {
        return !c.contains("fcm");
    }
}
