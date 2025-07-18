package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xni implements xnh {

    @Deprecated
    public static final ryn a;

    @Deprecated
    public static final ryn b;

    @Deprecated
    public static final ryn c;
    public final Context d;

    static {
        rzy rzyVar = xhf.b;
        a = rzyVar.d("XrpcCachingFeature__enabled", true);
        b = rzyVar.b("XrpcCachingFeature__memoryCacheByteSize", 1048576L);
        c = rzyVar.b("XrpcCachingFeature__persistentCacheByteSize", 1048576L);
    }

    public xni(Context context) {
        this.d = context;
    }
}
