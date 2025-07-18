package defpackage;

import com.google.common.collect.ImmutableSet;
import j$.util.DesugarTimeZone;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Set;
import java.util.TimeZone;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ota implements aagc {
    public static final ImmutableSet a = ImmutableSet.copyOf(TimeZone.getAvailableIDs());
    private static final TimeZone b = DesugarTimeZone.getTimeZone("UTC");
    private static final ConcurrentHashMap c = new ConcurrentHashMap();

    @Override // defpackage.aagc
    public final Set a() {
        return a;
    }

    @Override // defpackage.aagc
    public final aabs b(String str) {
        if (str == null) {
            return aabs.b;
        }
        boolean z = false;
        if (otb.a && (str.startsWith("+") || str.startsWith("-"))) {
            str = "GMT".concat(str);
            z = true;
        }
        ConcurrentHashMap concurrentHashMap = c;
        aabs aabsVar = (aabs) concurrentHashMap.get(str);
        if (aabsVar != null) {
            return aabsVar;
        }
        TimeZone timeZone = DesugarTimeZone.getTimeZone(str);
        aabs oszVar = (timeZone == null || timeZone.hasSameRules(b)) ? aabs.b : new osz(timeZone, z);
        aabs aabsVar2 = (aabs) concurrentHashMap.putIfAbsent(str, oszVar);
        return aabsVar2 != null ? aabsVar2 : oszVar;
    }
}
