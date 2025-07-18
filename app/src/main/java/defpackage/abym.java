package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abym {
    public final Object a(Object obj, Object obj2) {
        abyl abylVarA = (abyl) obj;
        abyl abylVar = (abyl) obj2;
        if (!abylVar.isEmpty()) {
            if (!abylVarA.b) {
                abylVarA = abylVarA.a();
            }
            abylVarA.b();
            if (!abylVar.isEmpty()) {
                abylVarA.putAll(abylVar);
            }
        }
        return abylVarA;
    }

    public final boolean b(Object obj) {
        return !((abyl) obj).b;
    }
}
