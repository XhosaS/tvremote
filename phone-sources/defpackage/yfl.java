package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yfl {
    public static final /* synthetic */ int a = 0;

    static {
        Object obj;
        Class<?> cls;
        yfk yfkVar;
        try {
            cls = Class.forName("io.perfmark.impl.SecretPerfMarkImpl$PerfMarkImpl");
            obj = null;
        } catch (Throwable th) {
            obj = th;
            cls = null;
        }
        if (cls != null) {
            try {
                yfkVar = (yfk) cls.asSubclass(yfk.class).getConstructor(yfm.class).newInstance(yfk.a);
            } catch (Throwable th2) {
                obj = th2;
            }
        } else {
            yfkVar = null;
        }
        if (yfkVar == null) {
            new yfk(yfk.a);
        }
        if (obj != null) {
            try {
                if (Boolean.getBoolean("io.perfmark.PerfMark.debug")) {
                    Class<?> cls2 = Class.forName("java.util.logging.Logger");
                    Object objInvoke = cls2.getMethod("getLogger", String.class).invoke(null, yfl.class.getName());
                    Class<?> cls3 = Class.forName("java.util.logging.Level");
                    cls2.getMethod("log", cls3, String.class, Throwable.class).invoke(objInvoke, cls3.getField("FINE").get(null), "Error during PerfMark.<clinit>", obj);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private yfl() {
    }
}
