package defpackage;

import java.net.InetSocketAddress;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xty extends xqu {
    public final CronetEngine a;
    public final xyx b;
    public boolean d;
    public int e;
    public boolean f;
    public int g;
    public final upo h = ybx.i;
    public int c = 4194304;

    public xty(String str, int i, CronetEngine cronetEngine) {
        this.b = new xyx(InetSocketAddress.createUnresolved(str, i), xxc.d(str, i), new yco(this, 1));
        this.a = cronetEngine;
    }

    @Override // defpackage.xqu
    public final wbb aa() {
        return this.b;
    }
}
