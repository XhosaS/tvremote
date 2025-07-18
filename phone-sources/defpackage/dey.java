package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dey implements dff {
    public static final dey a = new dey(1);
    private final /* synthetic */ int b;

    public dey(int i) {
        this.b = i;
    }

    @Override // defpackage.dff
    public final dfe a(Class cls) throws ClassNotFoundException {
        if (this.b == 0) {
            throw new IllegalStateException("This should never be called.");
        }
        if (!dek.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(String.valueOf(cls.getName())));
        }
        try {
            Class clsAsSubclass = cls.asSubclass(dek.class);
            dek dekVarE = dek.defaultInstanceMap.get(clsAsSubclass);
            if (dekVarE == null) {
                try {
                    Class.forName(clsAsSubclass.getName(), true, clsAsSubclass.getClassLoader());
                    dekVarE = dek.defaultInstanceMap.get(clsAsSubclass);
                } catch (ClassNotFoundException e) {
                    throw new IllegalStateException("Class initialization cannot fail.", e);
                }
            }
            if (dekVarE == null) {
                dekVarE = ((dek) dgf.e(clsAsSubclass)).e();
                if (dekVarE == null) {
                    throw new IllegalStateException();
                }
                dek.defaultInstanceMap.put(clsAsSubclass, dekVarE);
            }
            return (dfe) dekVarE.a(3);
        } catch (Exception e2) {
            throw new RuntimeException("Unable to get message info for ".concat(String.valueOf(cls.getName())), e2);
        }
    }

    @Override // defpackage.dff
    public final boolean b(Class cls) {
        if (this.b != 0) {
            return dek.class.isAssignableFrom(cls);
        }
        return false;
    }
}
