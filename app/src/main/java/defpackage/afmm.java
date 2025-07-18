package defpackage;

import android.util.Log;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.concurrent.Executor;
import org.chromium.net.BidirectionalStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class afmm extends afmw {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0);

    @Deprecated
    static final afel b = new afel("cronet-annotation", null);
    public static final afel c = new afel("cronet-annotations", null);
    public final String d;
    public final String e;
    public final afzw f;
    public final Executor g;
    public final afih h;
    public final afmp i;
    public final Runnable j;
    public BidirectionalStream k;
    public final boolean l;
    public final Object m;
    public final Collection n;
    public final afml o;
    public afmf p;
    private final afmk u;

    public afmm(String str, String str2, Executor executor, afih afihVar, afmp afmpVar, Runnable runnable, Object obj, int i, afil afilVar, afzw afzwVar, afem afemVar, agae agaeVar) {
        super(new afmr(), afzwVar, agaeVar, afihVar, afemVar);
        this.u = new afmk(this);
        this.d = str;
        this.e = str2;
        this.f = afzwVar;
        this.g = executor;
        this.h = afihVar;
        this.i = afmpVar;
        this.j = runnable;
        this.l = afilVar.a == afik.UNARY;
        this.m = afemVar.h(b);
        this.n = (Collection) afemVar.h(c);
        this.o = new afml(this, i, afzwVar, obj, agaeVar);
        j().n();
    }

    @Override // defpackage.afoe
    public final afeh a() {
        return afeh.a;
    }

    @Override // defpackage.afmw
    protected final /* synthetic */ afmt b() {
        return this.u;
    }

    @Override // defpackage.afmw
    protected final /* synthetic */ afmv g() {
        return this.o;
    }

    @Override // defpackage.afmw, defpackage.afna
    public final /* synthetic */ afmz j() {
        return this.o;
    }

    public final void k(ByteBuffer byteBuffer, boolean z, boolean z2) {
        if (this.k == null) {
            return;
        }
        if (Log.isLoggable("grpc-java-cronet", 2)) {
            Log.v("grpc-java-cronet", "BidirectionalStream.write");
        }
        this.k.write(byteBuffer, z);
        if (z2) {
            if (Log.isLoggable("grpc-java-cronet", 2)) {
                Log.v("grpc-java-cronet", "BidirectionalStream.flush");
            }
            this.k.flush();
        }
    }
}
