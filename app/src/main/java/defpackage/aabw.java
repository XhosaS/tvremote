package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class aabw {
    public final Map a;
    public final Map b;

    public aabw(aabu aabuVar) {
        this.a = new HashMap(aabuVar.a);
        this.b = new HashMap(aabuVar.b);
    }

    public final Object a(zzn zznVar, Class cls) throws GeneralSecurityException {
        aabv aabvVar = new aabv(zznVar.getClass(), cls);
        Map map = this.a;
        if (map.containsKey(aabvVar)) {
            return ((aabs) map.get(aabvVar)).a(zznVar);
        }
        throw new GeneralSecurityException(a.t(aabvVar, "No PrimitiveConstructor for ", " available, see https://developers.google.com/tink/faq/registration_errors"));
    }
}
