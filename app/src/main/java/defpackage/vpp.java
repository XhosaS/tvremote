package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vpp {
    private final agow a;
    private final vpo b;

    public vpp(agow agowVar, vpo vpoVar) {
        this.a = agowVar;
        this.b = vpoVar;
    }

    public final ujk a(wne wneVar, ueg uegVar) {
        yqw.M(true, "LamsConfig in ProtoDataStoreConfig must be used together with @LamsSync annotation");
        yqw.M(true, "Custom IOExecutor should not be used with a BlockingSafeProtoDataStore config");
        wnc wncVar = (wnc) wneVar;
        Executor executor = wncVar.h;
        if (executor == null) {
            executor = (Executor) this.a.a();
        }
        Executor executor2 = executor;
        zyd zydVarA = this.b.a(wneVar, executor2);
        ujk ujkVarA = umv.a(wncVar.a, zydVarA, wncVar.c, ExtensionRegistryLite.getGeneratedRegistry(), executor2, wncVar.f, uegVar);
        yyk yykVar = wncVar.e;
        if (!yykVar.isEmpty()) {
            ujkVarA.b(new ujj(yykVar, executor2));
        }
        return ujkVarA;
    }
}
