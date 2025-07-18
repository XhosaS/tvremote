package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class abwv implements abyp {
    public static final abwv a = new abwv();

    private abwv() {
    }

    @Override // defpackage.abyp
    public final abyo a(Class cls) throws ClassNotFoundException {
        if (!abxd.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(String.valueOf(cls.getName())));
        }
        try {
            Class clsAsSubclass = cls.asSubclass(abxd.class);
            abxd abxdVar = (abxd) abxd.defaultInstanceMap.get(clsAsSubclass);
            if (abxdVar == null) {
                try {
                    Class.forName(clsAsSubclass.getName(), true, clsAsSubclass.getClassLoader());
                    abxdVar = (abxd) abxd.defaultInstanceMap.get(clsAsSubclass);
                } catch (ClassNotFoundException e) {
                    throw new IllegalStateException("Class initialization cannot fail.", e);
                }
            }
            if (abxdVar == null) {
                abxdVar = (abxd) ((abxd) acah.b(clsAsSubclass)).cM(6, null);
                if (abxdVar == null) {
                    throw new IllegalStateException();
                }
                abxd.defaultInstanceMap.put(clsAsSubclass, abxdVar);
            }
            return (abyo) abxdVar.cM(3, null);
        } catch (Exception e2) {
            throw new RuntimeException("Unable to get message info for ".concat(String.valueOf(cls.getName())), e2);
        }
    }

    @Override // defpackage.abyp
    public final boolean b(Class cls) {
        return abxd.class.isAssignableFrom(cls);
    }
}
