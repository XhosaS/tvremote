package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ukg extends unm {
    private final unm a;

    public ukg(unm unmVar) {
        this.a = unmVar;
    }

    @Override // defpackage.unm
    public final /* synthetic */ unl a(ujm ujmVar, String str, Executor executor, ueg uegVar) {
        ExtensionRegistryLite generatedRegistry;
        uib uibVar = (uib) ujmVar;
        umz umzVar = uibVar.e;
        yqw.A(umzVar instanceof uif);
        if (uibVar.f) {
            generatedRegistry = ExtensionRegistryLite.getGeneratedRegistry();
        } else {
            ExtensionRegistryLite extensionRegistryLite = ExtensionRegistryLite.a;
            abza abzaVar = abza.a;
            generatedRegistry = ExtensionRegistryLite.a;
        }
        ExtensionRegistryLite extensionRegistryLite2 = generatedRegistry;
        uif uifVar = (uif) umzVar;
        uia uiaVar = new uia(ujmVar);
        umz umzVarB = uifVar.b();
        if (umzVarB == null) {
            throw new NullPointerException("Null variantConfig");
        }
        uiaVar.c = umzVarB;
        ukf ukfVar = new ukf(this.a.a(uiaVar.a(), str, executor, uegVar), uifVar.f(), uifVar.a(), uifVar.e(), uifVar.h(), uifVar.i(), extensionRegistryLite2);
        yqt yqtVarC = uifVar.c();
        yqt yqtVarD = uifVar.d();
        if (yqtVarC.g() && yqtVarD.g()) {
            ukfVar.f = yqtVarC;
            ukfVar.g = yqtVarD;
        }
        return new uki(ukfVar);
    }

    @Override // defpackage.unm
    public final String b() {
        return "lams";
    }

    @Override // defpackage.unm
    public final void c(ujm ujmVar) {
        umz umzVar = ((uib) ujmVar).e;
        yqw.A(umzVar instanceof uif);
        throw null;
    }
}
