package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xdy implements xdx {

    @Deprecated
    public static final ryn a;

    @Deprecated
    public static final ryn b;

    static {
        rzy rzyVar = xdj.c;
        a = rzyVar.d("SystemTrayFeature__enable_html_tags", true);
        b = rzyVar.c("SystemTrayFeature__force_action_to_open_as_activity", "");
    }

    @Override // defpackage.xdx
    public final String a() {
        return (String) b.get();
    }

    @Override // defpackage.xdx
    public final boolean b() {
        return ((Boolean) a.get()).booleanValue();
    }
}
