package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dew {
    public static final cyf a;
    public static final cyf b;

    static {
        dfp dfpVar = dfp.a;
        cyf cyfVar = null;
        try {
            cyfVar = (cyf) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = cyfVar;
        b = new cyf();
    }
}
