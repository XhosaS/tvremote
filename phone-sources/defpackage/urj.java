package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class urj implements utj {
    public final urz e;
    public xsm f;
    public xsm g;
    public vvj h;
    public utz i;
    public uqg j;
    private final Executor n;
    private uhq o;
    public static final tvn a = tvn.n("xRPC");
    private static final xsj m = sij.ac(upx.e);
    static final xsj b = sij.ac(upy.b);
    static final byte[] c = upy.a.h();
    public static final xpx d = new xpx("ClientInterceptorCacheDirective", uqg.DEFAULT_CACHE_OK_IF_VALID);
    public long k = -1;
    public List l = ImmutableList.of();
    private boolean p = false;

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, urz] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public urj(uri uriVar) {
        this.e = uriVar.a;
        this.n = uriVar.b;
    }

    private static final xsm a() {
        xsm xsmVar = new xsm();
        xsmVar.h(b, c);
        return xsmVar;
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, vvj] */
    @Override // defpackage.utj
    public final utv b() {
        try {
            tst tstVar = (tst) sfy.J(this.o);
            if (tstVar == null) {
                ((tvk) ((tvk) a.f()).j("com/google/frameworks/client/data/android/cache/CachingClientInterceptor", "continueRequestMessageProcessing", 186, "CachingClientInterceptor.java")).s("RpcCache returned null instead of Optional#absent()");
                return utv.a;
            }
            if (tstVar.g()) {
                xsm xsmVar = this.f;
                Object obj = ((aafi) tstVar.c()).c;
                for (String str : ((xsm) obj).e()) {
                    if (str.endsWith("-bin")) {
                        xsg xsgVar = xsm.b;
                        int i = xsj.c;
                        xsf xsfVar = new xsf(str, xsgVar);
                        Iterable iterableB = xsmVar.b(xsfVar);
                        if (iterableB != null) {
                            xsh xshVar = new xsh((xsi) iterableB);
                            xsh xshVar2 = new xsh((xsi) ((xsm) obj).b(xsfVar));
                            while (xshVar2.hasNext()) {
                                byte[] bArr = (byte[]) xshVar2.next();
                                if (xshVar.hasNext() && Arrays.equals(bArr, (byte[]) xshVar.next())) {
                                }
                            }
                        }
                    } else {
                        xse xseVar = xsm.c;
                        int i2 = xsj.c;
                        xsd xsdVar = new xsd(str, xseVar);
                        ImmutableList immutableListCopyOf = ImmutableList.copyOf(((xsm) obj).b(xsdVar));
                        Iterable iterableB2 = xsmVar.b(xsdVar);
                        if (iterableB2 != null && immutableListCopyOf.equals(ImmutableList.copyOf(iterableB2))) {
                        }
                    }
                }
                boolean z = true;
                sij.x(!this.i.d.getAndSet(true), "Already recorded cache hit.");
                this.p = true;
                utu utuVar = new utu((xsm) ((aafi) tstVar.c()).b, a(), ((aafi) tstVar.c()).a);
                if (utuVar.c == null) {
                    z = false;
                }
                sij.x(z, "Must set exactly one of responseMessage or responseStream");
                return new utv(3, utuVar, null, null, null);
            }
            if (!this.j.equals(uqg.CACHE_ONLY) && !this.j.equals(uqg.VALID_CACHE_ONLY)) {
                return utv.a;
            }
            xth xthVar = xth.FAILED_PRECONDITION;
            List list = xtk.a;
            return utv.b(xthVar.a().e("Required value come from cache, but no cached value was found"), a());
        } catch (ExecutionException e) {
            ((tvk) ((tvk) ((tvk) a.f()).i(e.getCause())).j("com/google/frameworks/client/data/android/cache/CachingClientInterceptor", "continueRequestMessageProcessing", (char) 208, "CachingClientInterceptor.java")).s("Failed to read from cache");
            return e.getCause() instanceof ClassCastException ? utv.b(xtk.j, new xsm()) : utv.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.utj
    public final void e(upq upqVar) {
        Iterable iterableB;
        this.g = new xsm();
        this.g.g((xsm) upqVar.b);
        xsm xsmVar = this.g;
        xsj xsjVar = m;
        if (!xsmVar.i(xsjVar) || (iterableB = this.g.b(xsjVar)) == null) {
            return;
        }
        ImmutableList immutableListCopyOf = ImmutableList.copyOf(iterableB);
        if (immutableListCopyOf.size() != 1) {
            ((tvk) ((tvk) a.f()).j("com/google/frameworks/client/data/android/cache/CachingClientInterceptor", "startResponseHeaderProcessing", kwx.JSON3, "CachingClientInterceptor.java")).t("Expected a single value for extension, got: %d", immutableListCopyOf.size());
            return;
        }
        try {
            upx upxVar = (upx) ((vtw) upx.a.m().g((byte[]) immutableListCopyOf.get(0), vtp.a())).r();
            if ((upxVar.b & 1) != 0) {
                long j = upxVar.c;
                if (j > 0) {
                    this.k = TimeUnit.SECONDS.toMillis(j);
                    vun vunVar = upxVar.d;
                    ImmutableList.Builder builder = ImmutableList.builder();
                    Iterator<E> it = vunVar.iterator();
                    while (it.hasNext()) {
                        builder.add((ImmutableList.Builder) ((String) it.next()).toLowerCase(Locale.ROOT));
                    }
                    this.l = builder.build();
                }
            }
        } catch (vuq e) {
            ((tvk) ((tvk) ((tvk) a.f()).i(e)).j("com/google/frameworks/client/data/android/cache/CachingClientInterceptor", "startResponseHeaderProcessing", (char) 297, "CachingClientInterceptor.java")).s("Could not parse server ttl");
        }
    }

    @Override // defpackage.utj
    public final utv f(upq upqVar) {
        this.h = (vvj) upqVar.b;
        uhq uhqVar = new uhq(new grz(this, upqVar, 19, null));
        this.o = uhqVar;
        this.n.execute(uhqVar);
        return utv.c(this.o);
    }

    @Override // defpackage.utj
    public final /* synthetic */ utv g(vvd vvdVar) {
        return utv.a;
    }

    @Override // defpackage.utj
    public final utv h(vvd vvdVar) {
        Object obj = vvdVar.a;
        sij.x(((xsq) obj).a.equals(xsp.UNARY), "Caching interceptor only supports unary RPCs");
        xpy xpyVar = (xpy) vvdVar.d;
        utz utzVar = (utz) xpyVar.g(utz.b);
        utzVar.getClass();
        this.i = utzVar;
        uqg uqgVar = (uqg) xpyVar.g(d);
        uqgVar.getClass();
        this.j = uqgVar;
        xsm xsmVar = new xsm();
        this.f = xsmVar;
        xsmVar.g((xsm) vvdVar.b);
        return utv.b;
    }

    @Override // defpackage.utj
    public final void i(upo upoVar) {
        if (this.k == -1 || this.p) {
            return;
        }
        this.n.execute(new ukm(this, upoVar, 11));
    }

    @Override // defpackage.utj
    public final /* synthetic */ void d(upo upoVar) {
    }
}
