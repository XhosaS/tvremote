package defpackage;

import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eha implements efj {
    public String a;
    private final CronetEngine b;
    private final Executor c;
    private final ghc d;

    public eha(CronetEngine cronetEngine, Executor executor) {
        cronetEngine.getClass();
        this.b = cronetEngine;
        this.c = executor;
        this.d = new ghc(null, null, null);
    }

    @Override // defpackage.eer
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final efn a() {
        return new ehd(this.b, this.c, this.a, this.d);
    }
}
