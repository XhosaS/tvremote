package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zfr {
    public static final CopyOnWriteArraySet a = new CopyOnWriteArraySet();
    public static final Map b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r1 = zch.class.getPackage();
        String name = r1 != null ? r1.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(zch.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(zee.class.getName(), "okhttp.Http2");
        linkedHashMap.put(zcv.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        b = yfm.l(linkedHashMap);
    }
}
