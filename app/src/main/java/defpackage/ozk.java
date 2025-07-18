package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ozk extends ozl {
    private static final zdy a = zdy.h("com/google/android/libraries/home/homegraph/foyer/FoyerHomedProtoEntity");
    private final String b;

    public ozk(ozi oziVar, String str) {
        super(oziVar);
        this.b = str;
    }

    public final oyi j() {
        String str = this.b;
        if (str == null) {
            return null;
        }
        oyi oyiVarQ = this.f.q(str);
        if (oyiVarQ == null) {
            ((zdv) a.a(pai.a).q("com/google/android/libraries/home/homegraph/foyer/FoyerHomedProtoEntity", "getParentHome", 16, "FoyerHomedProtoEntity.kt")).u("Home not found for entity");
        }
        return oyiVarQ;
    }
}
