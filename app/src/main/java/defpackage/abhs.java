package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abhs {
    public static volatile afil a;
    private static volatile afil b;

    private abhs() {
    }

    public static afil a() {
        afil afilVarA;
        afil afilVar = b;
        if (afilVar != null) {
            return afilVar;
        }
        synchronized (abhs.class) {
            afilVarA = b;
            if (afilVarA == null) {
                afii afiiVarC = afil.c();
                afiiVarC.c = afik.UNARY;
                afiiVarC.d = afil.b("google.internal.home.foyer.v1.StructuresService", "GetHomeGraph");
                afiiVarC.e = true;
                abgm abgmVar = abgm.b;
                ExtensionRegistryLite extensionRegistryLite = agea.a;
                afiiVarC.a = new agdz(abgmVar);
                afiiVarC.b = new agdz(abgq.a);
                afilVarA = afiiVarC.a();
                b = afilVarA;
            }
        }
        return afilVarA;
    }
}
