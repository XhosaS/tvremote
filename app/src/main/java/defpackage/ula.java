package defpackage;

import android.net.Uri;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ula extends unm {
    static final yrp a = yru.a(new yrp() { // from class: ukz
        @Override // defpackage.yrp
        public final Object eV() {
            int i = ula.b;
            System.loadLibrary("mappedcountercacheversionjni");
            return null;
        }
    });
    public static final /* synthetic */ int b = 0;
    private final ulb c;

    public ula(ulb ulbVar) {
        this.c = ulbVar;
    }

    @Override // defpackage.unm
    public final /* synthetic */ unl a(ujm ujmVar, String str, Executor executor, ueg uegVar) {
        ExtensionRegistryLite generatedRegistry;
        uib uibVar = (uib) ujmVar;
        if (uibVar.f) {
            generatedRegistry = ExtensionRegistryLite.getGeneratedRegistry();
        } else {
            ExtensionRegistryLite extensionRegistryLite = ExtensionRegistryLite.a;
            abza abzaVar = abza.a;
            generatedRegistry = ExtensionRegistryLite.a;
        }
        uof uofVar = new uof(uibVar.b, generatedRegistry);
        yqw.A(uibVar.e instanceof ukk);
        Uri uri = uibVar.a;
        return new uld(str, zxn.h(uri), uofVar, executor, uegVar, uibVar.c, false, this.c, new wuu());
    }

    @Override // defpackage.unm
    public final String b() {
        return "mmap";
    }
}
