package defpackage;

import com.google.protobuf.MessageLite;
import io.grpc.Status;
import io.grpc.StatusException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aauy {
    public static afer b(agow agowVar) {
        return new aaux(new aauw(agowVar), MessageLite.class, MessageLite.class);
    }

    public static void c(afil afilVar, Class cls, boolean z) throws StatusException {
        Class<?> cls2;
        boolean z2;
        try {
            cls2 = ((agdz) (z ? afilVar.d : afilVar.e)).c.getClass();
            z2 = false;
        } catch (ClassCastException unused) {
            cls2 = Object.class;
            z2 = true;
        }
        if (cls.isAssignableFrom(cls2)) {
            return;
        }
        String str = true != z ? "response" : "request";
        String str2 = afilVar.b;
        throw Status.k.withDescription("AsyncClientInterceptor: The " + str + " message type of method " + str2 + " (" + cls2.getName() + (true != z2 ? "" : ", assumed because method doesn't use ReflectableMarshaller") + ") must be a subclass of " + cls.toString()).asException();
    }
}
