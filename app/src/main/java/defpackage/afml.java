package defpackage;

import android.util.Log;
import io.grpc.Status;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import org.chromium.net.BidirectionalStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
class afml extends afrt {
    public static final /* synthetic */ int i = 0;
    public final Object a;
    public final Collection b;
    public boolean c;
    public boolean d;
    public Status e;
    public boolean f;
    public boolean g;
    final /* synthetic */ afmm h;
    private int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afml(afmm afmmVar, int i2, afzw afzwVar, Object obj, agae agaeVar) {
        super(i2, afzwVar, agaeVar);
        this.h = afmmVar;
        this.b = new ArrayList();
        this.d = false;
        this.a = obj;
    }

    @Override // defpackage.afvd
    public final void a(int i2) {
        afmm afmmVar = this.h;
        afmmVar.k.getClass();
        int i3 = this.t - i2;
        this.t = i3;
        if (i3 != 0 || this.f) {
            return;
        }
        if (Log.isLoggable("grpc-java-cronet", 2)) {
            Log.v("grpc-java-cronet", "BidirectionalStream.read");
        }
        afmmVar.k.read(ByteBuffer.allocateDirect(4096));
    }

    @Override // defpackage.afvd
    public final void b(Throwable th) {
        c(Status.b(th), true, new afih());
    }

    @Override // defpackage.afrt
    protected final void c(Status status, boolean z, afih afihVar) {
        BidirectionalStream bidirectionalStream = this.h.k;
        bidirectionalStream.getClass();
        bidirectionalStream.cancel();
        j(status, afof.PROCESSED, z, afihVar);
    }

    @Override // defpackage.afmz
    protected final void d() {
        super.d();
    }

    @Override // defpackage.afnc
    public final void e(Runnable runnable) {
        synchronized (this.a) {
            runnable.run();
        }
    }

    public final void f(ByteBuffer byteBuffer) {
        this.t += byteBuffer.remaining();
        afwn afwnVar = afwr.a;
        super.p(new afwq(byteBuffer), false);
    }
}
