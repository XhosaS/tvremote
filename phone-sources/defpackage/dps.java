package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dps implements dpy {
    public static final dps a = new dps(1);
    private final /* synthetic */ int b;

    public dps(int i) {
        this.b = i;
    }

    @Override // defpackage.dpy
    public final dpx a(Class cls) throws ClassNotFoundException {
        if (this.b == 0) {
            throw new IllegalStateException("This should never be called.");
        }
        if (!dpf.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(String.valueOf(cls.getName())));
        }
        try {
            Class clsAsSubclass = cls.asSubclass(dpf.class);
            dpf dpfVarE = dpf.defaultInstanceMap.get(clsAsSubclass);
            if (dpfVarE == null) {
                try {
                    Class.forName(clsAsSubclass.getName(), true, clsAsSubclass.getClassLoader());
                    dpfVarE = dpf.defaultInstanceMap.get(clsAsSubclass);
                } catch (ClassNotFoundException e) {
                    throw new IllegalStateException("Class initialization cannot fail.", e);
                }
            }
            if (dpfVarE == null) {
                dpfVarE = ((dpf) dra.e(clsAsSubclass)).e();
                if (dpfVarE == null) {
                    throw new IllegalStateException();
                }
                dpf.defaultInstanceMap.put(clsAsSubclass, dpfVarE);
            }
            return (dpx) dpfVarE.a(3);
        } catch (Exception e2) {
            throw new RuntimeException("Unable to get message info for ".concat(String.valueOf(cls.getName())), e2);
        }
    }

    @Override // defpackage.dpy
    public final boolean b(Class cls) {
        if (this.b != 0) {
            return dpf.class.isAssignableFrom(cls);
        }
        return false;
    }
}
