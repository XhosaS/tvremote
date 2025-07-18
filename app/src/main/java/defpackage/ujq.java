package defpackage;

import android.net.Uri;
import android.util.Pair;
import com.google.common.collect.Lists;
import com.google.protobuf.MessageLite;
import j$.util.Map;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Function$CC;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ujq {
    public final Executor a;
    public final ueg b;
    public final uig c;
    public final zvi d;
    public final Map e;
    private final Map f = new ConcurrentHashMap();

    public ujq(Executor executor, ueg uegVar, uig uigVar, Map map, uon uonVar) {
        zvi zviVar;
        executor.getClass();
        this.a = executor;
        uegVar.getClass();
        this.b = uegVar;
        this.c = uigVar;
        this.e = map;
        yqw.A(!map.isEmpty());
        if (uonVar != null) {
            int i = zjr.b;
            final umy umyVar = new umy(uonVar, zjy.a);
            zviVar = new zvi() { // from class: ujo
                @Override // defpackage.zvi
                public final zyd a(Object obj) {
                    final umy umyVar2 = umyVar;
                    final Uri uri = (Uri) obj;
                    return zuz.g(umyVar2.a.a(), new yqi() { // from class: umx
                        @Override // defpackage.yqi
                        public final Object apply(Object obj2) {
                            return umyVar2.b.a(String.valueOf(String.valueOf(uri)).concat(String.valueOf((String) obj2)), StandardCharsets.UTF_8).toString();
                        }
                    }, zwk.a);
                }
            };
        } else {
            zviVar = new zvi() { // from class: ujp
                @Override // defpackage.zvi
                public final zyd a(Object obj) {
                    return zxn.h("");
                }
            };
        }
        this.d = zviVar;
    }

    public final ujk a(final ujm ujmVar) {
        Function function = new Function() { // from class: ujn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo116andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ujm ujmVar2 = ujmVar;
                uib uibVar = (uib) ujmVar2;
                Uri uri = uibVar.a;
                yqw.F(uri.isHierarchical(), "Uri must be hierarchical: %s", uri);
                String strB = yqv.b(uri.getLastPathSegment());
                int iLastIndexOf = strB.lastIndexOf(46);
                String strSubstring = iLastIndexOf == -1 ? "" : strB.substring(iLastIndexOf + 1);
                ujq ujqVar = this.a;
                yqw.F(strSubstring.equals("pb"), "Uri extension must be .pb: %s", uri);
                yqw.B(uibVar.c != null, "Handler cannot be null");
                umz umzVar = uibVar.e;
                Map map = ujqVar.e;
                String strG = umzVar.g();
                unm unmVar = (unm) map.get(strG);
                yqw.F(unmVar != null, "No XDataStoreVariantFactory registered for ID %s", strG);
                String strB2 = yqv.b(uri.getLastPathSegment());
                int iLastIndexOf2 = strB2.lastIndexOf(46);
                if (iLastIndexOf2 != -1) {
                    strB2 = strB2.substring(0, iLastIndexOf2);
                }
                zyd zydVarH = zuz.h(zxn.h(uri), ujqVar.d, zwk.a);
                Executor executor = ujqVar.a;
                ujk ujkVar = new ujk(unmVar.a(ujmVar2, strB2, executor, ujqVar.b), ujqVar.c, zydVarH, false, unmVar.b());
                unmVar.c(ujmVar2);
                yyk yykVar = uibVar.d;
                if (!yykVar.isEmpty()) {
                    ujkVar.b(new ujj(yykVar, executor));
                }
                return Pair.create(ujkVar, ujmVar2);
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        };
        uib uibVar = (uib) ujmVar;
        Map map = this.f;
        Uri uri = uibVar.a;
        Pair pair = (Pair) Map.EL.computeIfAbsent(map, uri, function);
        ujk ujkVar = (ujk) pair.first;
        ujm ujmVar2 = (ujm) pair.second;
        if (ujmVar.equals(ujmVar2)) {
            return ujkVar;
        }
        MessageLite messageLite = uibVar.b;
        String strA = yro.a("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", messageLite.getClass().getSimpleName(), uri);
        yqw.F(uri.equals(ujmVar2.a()), strA, "uri");
        yqw.F(messageLite.equals(ujmVar2.e()), strA, "schema");
        yqw.F(uibVar.c.equals(ujmVar2.c()), strA, "handler");
        yqw.F(Lists.d(uibVar.d, ujmVar2.d()), strA, "migrations");
        yqw.F(uibVar.e.equals(ujmVar2.b()), strA, "variantConfig");
        yqw.F(uibVar.f == ujmVar2.f(), strA, "useGeneratedExtensionRegistry");
        ujmVar2.g();
        throw new IllegalArgumentException(yro.a(strA, "unknown"));
    }
}
