package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zbu {
    static boolean a(zbp zbpVar, Object obj) {
        if (obj == zbpVar) {
            return true;
        }
        if (obj instanceof zbp) {
            zbp zbpVar2 = (zbp) obj;
            if (zbpVar.size() == zbpVar2.size() && zbpVar.j().size() == zbpVar2.j().size()) {
                for (zbo zboVar : zbpVar2.j()) {
                    if (zbpVar.a(zboVar.b()) != zboVar.a()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
