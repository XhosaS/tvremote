package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wnh {
    public final wmy a;
    private final agow b;

    public wnh(agow agowVar, wmy wmyVar) {
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
        final Executor executor2 = executor;
        zyd zydVarG = zuz.g((zyd) wncVar.b.b(new yqi() { // from class: wnf
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                return zxn.l(wyo.b((zvh) obj), executor2);
            }
        }).e(zxn.h("")), wyo.a(new yqi() { // from class: wng
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                String str = (String) obj;
                str.getClass();
                StringBuilder sb = new StringBuilder();
                wnc wncVar2 = (wnc) wneVar;
                sb.append(wncVar2.a);
                sb.append(str);
                sb.append(".pb");
                return this.a.a.c(wncVar2.d, sb.toString());
            }
        }), executor2);
        ujk ujkVarA = umw.a(wncVar.a, zydVarG, wncVar.c, ExtensionRegistryLite.getGeneratedRegistry(), executor2, wncVar.f, uegVar);
        yyk yykVar = wncVar.e;
        if (!yykVar.isEmpty()) {
            ujkVarA.b(new ujj(yykVar, executor2));
        }
        return ujkVarA;
    }
}
