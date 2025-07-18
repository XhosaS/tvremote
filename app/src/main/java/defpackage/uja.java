package defpackage;

import android.net.Uri;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uja extends unm {
    public static final unm a = new uja();

    private uja() {
    }

    @Override // defpackage.unm
    public final /* synthetic */ unl a(ujm ujmVar, String str, Executor executor, ueg uegVar) {
        ExtensionRegistryLite generatedRegistry;
        uib uibVar = (uib) ujmVar;
        yqw.A(uibVar.e instanceof uip);
        if (uibVar.f) {
            generatedRegistry = ExtensionRegistryLite.getGeneratedRegistry();
        } else {
            ExtensionRegistryLite extensionRegistryLite = ExtensionRegistryLite.a;
            abza abzaVar = abza.a;
            generatedRegistry = ExtensionRegistryLite.a;
        }
        uof uofVar = new uof(uibVar.b, generatedRegistry);
        Uri uri = uibVar.a;
        return new ujd(str, zxn.h(uri), uofVar, executor, uegVar, uibVar.c, new wuu());
    }

    @Override // defpackage.unm
    public final String b() {
        return "multiproc";
    }
}
