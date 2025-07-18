package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dfm {
    public static final cyg a;
    public static final cyg b;

    static {
        dfp dfpVar = dfp.a;
        cyg cygVar = null;
        try {
            cygVar = (cyg) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = cygVar;
        b = new cyg();
    }
}
