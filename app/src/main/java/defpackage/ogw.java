package defpackage;

import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import j$.util.Collection;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.nio.ByteBuffer;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ogw {
    /* JADX WARN: Type inference failed for: r1v12, types: [com.google.protobuf.MessageLite, java.lang.Object] */
    public static MessageLite a(yyk yykVar, abyy abyyVar, ExtensionRegistryLite extensionRegistryLite) {
        Stream streamFilter = Collection.EL.stream(yykVar).filter(new Predicate() { // from class: ogv
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            public final /* synthetic */ Predicate negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((ByteBuffer) obj).remaining() > 0;
            }
        });
        int i = yyk.e;
        yyk yykVar2 = (yyk) streamFilter.collect(ywk.a);
        if (yykVar2.isEmpty()) {
            return abyyVar.e(new byte[0], extensionRegistryLite);
        }
        int i2 = abvt.g;
        int i3 = abvs.a;
        return b(!acah.b ? abvt.K(new abxw(yykVar2), 4096) : abvt.P(yykVar2), abyyVar, extensionRegistryLite);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.MessageLite, java.lang.Object] */
    public static MessageLite b(abvt abvtVar, abyy abyyVar, ExtensionRegistryLite extensionRegistryLite) {
        ?? C = abyyVar.c(abvtVar, extensionRegistryLite);
        abvtVar.z(0);
        return C;
    }
}
