package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dee {
    public static final cwt a = new cwt();
    private static final cwt b;

    static {
        dfp dfpVar = dfp.a;
        cwt cwtVar = null;
        try {
            cwtVar = (cwt) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = cwtVar;
    }

    static cwt a() {
        cwt cwtVar = b;
        if (cwtVar != null) {
            return cwtVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
