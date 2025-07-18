package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wnj {
    public final wmy a;
    private final agow b;

    public wnj(agow agowVar, wmy wmyVar) {
        this.b = agowVar;
        this.a = wmyVar;
    }

    public final ujk a(final wne wneVar, ueg uegVar) {
        yqw.M(true, "LamsConfig in ProtoDataStoreConfig must be used together with @LamsSync annotation");
        yqw.M(true, "Custom IOExecutor should not be used with a BlockingSafeProtoDataStore config");
        wnc wncVar = (wnc) wneVar;
        Executor executor = wncVar.h;
        if (executor == null) {
            executor = (Executor) this.b.a();
        }
        Executor executor2 = executor;
        zyd zydVarK = zxn.k(wyo.i(new Callable() { // from class: wni
            @Override // java.util.concurrent.Callable
            public final Object call() {
                wnc wncVar2 = (wnc) wneVar;
                return this.a.a.c(wncVar2.d, wncVar2.a.concat(".pb"));
            }
        }), executor2);
        ujk ujkVarA = umv.a(wncVar.a, zydVarK, wncVar.c, ExtensionRegistryLite.getGeneratedRegistry(), executor2, wncVar.f, uegVar);
        yyk yykVar = wncVar.e;
        if (!yykVar.isEmpty()) {
            ujkVarA.b(new ujj(yykVar, executor2));
        }
        return ujkVarA;
    }
}
