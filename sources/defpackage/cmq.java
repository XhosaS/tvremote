package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cmq implements cmx {
    public static final cmq a = new cmq(1);
    private final /* synthetic */ int b;

    public cmq(int i) {
        this.b = i;
    }

    @Override // defpackage.cmx
    public final cmw a(Class cls) throws ClassNotFoundException {
        if (this.b == 0) {
            throw new IllegalStateException("This should never be called.");
        }
        if (!clt.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(String.valueOf(cls.getName())));
        }
        try {
            Class clsAsSubclass = cls.asSubclass(clt.class);
            clt cltVar = (clt) clt.t.get(clsAsSubclass);
            if (cltVar == null) {
                try {
                    Class.forName(clsAsSubclass.getName(), true, clsAsSubclass.getClassLoader());
                    cltVar = (clt) clt.t.get(clsAsSubclass);
                } catch (ClassNotFoundException e) {
                    throw new IllegalStateException("Class initialization cannot fail.", e);
                }
            }
            if (cltVar == null) {
                cltVar = (clt) ((clt) cod.e(clsAsSubclass)).a(6, null);
                if (cltVar == null) {
                    throw new IllegalStateException();
                }
                clt.t.put(clsAsSubclass, cltVar);
            }
            return (cmw) cltVar.a(3, null);
        } catch (Exception e2) {
            throw new RuntimeException("Unable to get message info for ".concat(String.valueOf(cls.getName())), e2);
        }
    }

    @Override // defpackage.cmx
    public final boolean b(Class cls) {
        if (this.b != 0) {
            return clt.class.isAssignableFrom(cls);
        }
        return false;
    }
}
