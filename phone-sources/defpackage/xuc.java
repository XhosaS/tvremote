package defpackage;

import android.support.v7.widget.RecyclerView;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import org.chromium.net.BidirectionalStream;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class xuc extends xxf {
    public static final /* synthetic */ int i = 0;
    public final Object a;
    public final Collection b;
    public boolean c;
    public boolean d;
    public xtk e;
    public boolean f;
    public boolean g;
    final /* synthetic */ xud h;
    private int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xuc(xud xudVar, int i2, ybs ybsVar, Object obj, ybx ybxVar) {
        super(i2, ybsVar, ybxVar);
        this.h = xudVar;
        this.b = new ArrayList();
        this.d = false;
        this.a = obj;
    }

    static /* bridge */ /* synthetic */ void f(xuc xucVar, ByteBuffer byteBuffer) {
        xucVar.u += byteBuffer.remaining();
        yaf yafVar = yaj.a;
        super.n(new yai(byteBuffer), false);
    }

    @Override // defpackage.xzf
    public final void a(int i2) {
        BidirectionalStream bidirectionalStream = this.h.k;
        bidirectionalStream.getClass();
        int i3 = this.u - i2;
        this.u = i3;
        if (i3 != 0 || this.f) {
            return;
        }
        bidirectionalStream.read(ByteBuffer.allocateDirect(RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT));
    }

    @Override // defpackage.xzf
    public final void b(Throwable th) throws Throwable {
        c(xtk.c(th), true, new xsm());
    }

    @Override // defpackage.xxf
    protected final void c(xtk xtkVar, boolean z, xsm xsmVar) throws Throwable {
        BidirectionalStream bidirectionalStream = this.h.k;
        bidirectionalStream.getClass();
        bidirectionalStream.cancel();
        k(xtkVar, z, xsmVar);
    }

    @Override // defpackage.xul
    protected final void d() {
        super.d();
    }

    @Override // defpackage.xuo
    public final void e(Runnable runnable) {
        synchronized (this.a) {
            runnable.run();
        }
    }
}
