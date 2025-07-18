package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class umd extends unm {
    public static final unm a = new umd();

    private umd() {
    }

    @Override // defpackage.unm
    public final /* synthetic */ unl a(ujm ujmVar, String str, Executor executor, ueg uegVar) {
        ExtensionRegistryLite generatedRegistry;
        uib uibVar = (uib) ujmVar;
        umz umzVar = uibVar.e;
        yqw.A(umzVar instanceof ulo);
        if (uibVar.f) {
            generatedRegistry = ExtensionRegistryLite.getGeneratedRegistry();
        } else {
            ExtensionRegistryLite extensionRegistryLite = ExtensionRegistryLite.a;
            abza abzaVar = abza.a;
            generatedRegistry = ExtensionRegistryLite.a;
        }
        return new umf(str, zxn.h(uibVar.a), new uof(uibVar.b, generatedRegistry), executor, uegVar, ((ulo) umzVar).a(), uibVar.c, new wuu());
    }

    @Override // defpackage.unm
    public final String b() {
        return "signal";
    }
}
