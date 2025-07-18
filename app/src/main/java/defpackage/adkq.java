package defpackage;

import com.google.protobuf.ExtensionRegistryLite;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adkq {
    private static volatile afil a;

    private adkq() {
    }

    public static adkp a(afen afenVar) {
        return new adkp(afenVar, afem.a.f(agen.a, agel.ASYNC));
    }

    public static afil b() {
        afil afilVarA;
        afil afilVar = a;
        if (afilVar != null) {
            return afilVar;
        }
        synchronized (adkq.class) {
            afilVarA = a;
            if (afilVarA == null) {
                afii afiiVarC = afil.c();
                afiiVarC.c = afik.BIDI_STREAMING;
                afiiVarC.d = afil.b("speech.s3.S3StubbyClientConnectorService", "S3Bidi");
                afiiVarC.e = true;
                adkb adkbVar = adkb.a;
                ExtensionRegistryLite extensionRegistryLite = agea.a;
                afiiVarC.a = new agdz(adkbVar);
                afiiVarC.b = new agdz(adkf.a);
                afilVarA = afiiVarC.a();
                a = afilVarA;
            }
        }
        return afilVarA;
    }
}
