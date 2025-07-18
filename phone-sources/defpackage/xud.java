package defpackage;

import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.concurrent.Executor;
import org.chromium.net.BidirectionalStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xud extends xuj {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0);

    @Deprecated
    static final xpx b = new xpx("cronet-annotation", null);
    public static final xpx c = new xpx("cronet-annotations", null);
    public final String d;
    public final String e;
    public final ybs f;
    public final Executor g;
    public final xsm h;
    public final xuf i;
    public final Runnable j;
    public BidirectionalStream k;
    public final boolean l;
    public final Object m;
    public final Collection n;
    public final xuc o;
    public xtx p;
    private final xub u;

    public xud(String str, String str2, Executor executor, xsm xsmVar, xuf xufVar, Runnable runnable, Object obj, int i, xsq xsqVar, ybs ybsVar, xpy xpyVar, ybx ybxVar) {
        super(new ydg(1), ybsVar, ybxVar, xsmVar, xpyVar);
        this.u = new xub(this);
        this.d = str;
        this.e = str2;
        this.f = ybsVar;
        this.g = executor;
        this.h = xsmVar;
        this.i = xufVar;
        this.j = runnable;
        this.l = xsqVar.a == xsp.UNARY;
        this.m = xpyVar.g(b);
        this.n = (Collection) xpyVar.g(c);
        this.o = new xuc(this, i, ybsVar, obj, ybxVar);
        t();
    }

    @Override // defpackage.xvk
    public final xpv a() {
        return xpv.a;
    }

    @Override // defpackage.xuj
    protected final /* synthetic */ xui b() {
        return this.u;
    }

    @Override // defpackage.xuj, defpackage.xum
    protected final /* synthetic */ xul c() {
        return this.o;
    }

    public final void d(xtk xtkVar) {
        this.i.d(this, xtkVar);
    }

    public final void e(ByteBuffer byteBuffer, boolean z, boolean z2) {
        BidirectionalStream bidirectionalStream = this.k;
        if (bidirectionalStream == null) {
            return;
        }
        bidirectionalStream.write(byteBuffer, z);
        if (z2) {
            this.k.flush();
        }
    }

    @Override // defpackage.xuj
    protected final /* synthetic */ xul f() {
        return this.o;
    }
}
