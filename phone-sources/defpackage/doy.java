package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class doy {
    public static final cws a = new cws();
    private static final cws b;

    static {
        dqh dqhVar = dqh.a;
        cws cwsVar = null;
        try {
            cwsVar = (cws) Class.forName("androidx.glance.appwidget.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = cwsVar;
    }

    static cws a() {
        cws cwsVar = b;
        if (cwsVar != null) {
            return cwsVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
