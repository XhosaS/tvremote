package defpackage;

import java.net.InetSocketAddress;
import java.util.concurrent.ScheduledExecutorService;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afmh extends affz {
    public ScheduledExecutorService a;
    public final CronetEngine b;
    public final afuv c;
    public final agad d = agae.a;
    public int e = 4194304;
    public boolean f;
    public int g;
    public boolean h;
    public int i;

    private afmh(String str, int i, CronetEngine cronetEngine) {
        this.c = new afuv(InetSocketAddress.createUnresolved(str, i), afrq.d(str, i), new afmd(this));
        this.b = cronetEngine;
    }

    public static afmh c(String str, int i, CronetEngine cronetEngine) {
        cronetEngine.getClass();
        return new afmh(str, i, cronetEngine);
    }

    @Override // defpackage.affz
    public final afhs b() {
        return this.c;
    }
}
