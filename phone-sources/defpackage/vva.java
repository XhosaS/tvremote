package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vva implements vvh {
    public static final vva a = new vva(1);
    private final /* synthetic */ int b;

    public vva(int i) {
        this.b = i;
    }

    @Override // defpackage.vvh
    public final vvg a(Class cls) throws ClassNotFoundException {
        if (this.b == 0) {
            throw new IllegalStateException("This should never be called.");
        }
        if (!vuc.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(String.valueOf(cls.getName())));
        }
        try {
            Class clsAsSubclass = cls.asSubclass(vuc.class);
            vuc vucVar = (vuc) vuc.N.get(clsAsSubclass);
            if (vucVar == null) {
                try {
                    Class.forName(clsAsSubclass.getName(), true, clsAsSubclass.getClassLoader());
                    vucVar = (vuc) vuc.N.get(clsAsSubclass);
                } catch (ClassNotFoundException e) {
                    throw new IllegalStateException("Class initialization cannot fail.", e);
                }
            }
            if (vucVar == null) {
                vucVar = (vuc) ((vuc) vwl.g(clsAsSubclass)).a(6, null);
                if (vucVar == null) {
                    throw new IllegalStateException();
                }
                vuc.N.put(clsAsSubclass, vucVar);
            }
            return (vvg) vucVar.a(3, null);
        } catch (Exception e2) {
            throw new RuntimeException("Unable to get message info for ".concat(String.valueOf(cls.getName())), e2);
        }
    }

    @Override // defpackage.vvh
    public final boolean b(Class cls) {
        if (this.b != 0) {
            return vuc.class.isAssignableFrom(cls);
        }
        return false;
    }
}
