package defpackage;

import java.util.Set;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jte implements jvc {
    public static final /* synthetic */ int a = 0;
    private static final yzq b = yzq.q("http", "https");
    private final CronetEngine c;
    private final Executor d;

    public jte(CronetEngine cronetEngine, Executor executor) {
        this.c = cronetEngine;
        this.d = executor;
    }

    @Override // defpackage.jvc
    public final Set a() {
        return b;
    }

    @Override // defpackage.jvc
    public final jtd b(String str) {
        zyu zyuVar = new zyu();
        return new jtd(this.c.newUrlRequestBuilder(str, new jsz(zyuVar), this.d), zyuVar);
    }
}
