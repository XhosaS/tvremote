package defpackage;

import io.grpc.Status;
import java.io.EOFException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
class agbr extends afrt implements agck {
    public static final /* synthetic */ int y = 0;
    private int A;
    private int B;
    public final Object a;
    public List b;
    public final ahwx c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final agbg g;
    public final agco h;
    public final agca i;
    public boolean t;
    public final agfe u;
    public agcl v;
    public int w;
    final /* synthetic */ agbs x;
    private final int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agbr(agbs agbsVar, int i, afzw afzwVar, Object obj, agbg agbgVar, agco agcoVar, agca agcaVar, int i2) {
        super(i, afzwVar, agbsVar.r);
        this.x = agbsVar;
        this.c = new ahwx();
        this.d = false;
        this.e = false;
        this.f = false;
        this.t = true;
        this.w = -1;
        this.a = obj;
        this.g = agbgVar;
        this.h = agcoVar;
        this.i = agcaVar;
        this.A = i2;
        this.B = i2;
        this.z = i2;
        int i3 = agfd.a;
        this.u = agfc.a;
    }

    @Override // defpackage.afvd
    public final void a(int i) {
        int i2 = this.B - i;
        this.B = i2;
        int i3 = this.z;
        if (i2 <= i3 * 0.5f) {
            int i4 = i3 - i2;
            this.A += i4;
            this.B = i2 + i4;
            this.g.h(this.w, i4);
        }
    }

    @Override // defpackage.afvd
    public final void b(Throwable th) throws EOFException {
        s(Status.b(th), true, new afih());
    }

    @Override // defpackage.afrt
    protected final void c(Status status, boolean z, afih afihVar) throws EOFException {
        s(status, false, afihVar);
    }

    @Override // defpackage.afmz
    protected final void d() {
        super.d();
        agae agaeVar = this.q;
        agaeVar.c++;
        agaeVar.b.a();
    }

    @Override // defpackage.afnc
    public final void e(Runnable runnable) {
        synchronized (this.a) {
            runnable.run();
        }
    }

    final agcl f() {
        agcl agclVar;
        synchronized (this.a) {
            agclVar = this.v;
        }
        return agclVar;
    }

    @Override // defpackage.afmv, defpackage.afvd
    public final void i(boolean z) {
        if (this.m) {
            this.i.k(this.w, null, afof.PROCESSED, false, null, null);
        } else {
            this.i.k(this.w, null, afof.PROCESSED, false, agdg.CANCEL, null);
        }
        super.i(z);
    }

    public final void s(Status status, boolean z, afih afihVar) throws EOFException {
        if (this.f) {
            return;
        }
        this.f = true;
        if (!this.t) {
            this.i.k(this.w, status, afof.PROCESSED, z, agdg.CANCEL, afihVar);
            return;
        }
        agca agcaVar = this.i;
        agbs agbsVar = this.x;
        agcaVar.y.remove(agbsVar);
        agcaVar.l(agbsVar);
        this.b = null;
        ahwx ahwxVar = this.c;
        ahwxVar.o(ahwxVar.b);
        this.t = false;
        if (afihVar == null) {
            afihVar = new afih();
        }
        j(status, afof.PROCESSED, true, afihVar);
    }

    public final void t(ahwx ahwxVar, boolean z, int i) {
        int i2 = this.A - (((int) ahwxVar.b) + i);
        this.A = i2;
        this.B -= i;
        if (i2 >= 0) {
            super.p(new agcg(ahwxVar), z);
        } else {
            this.g.f(this.w, agdg.FLOW_CONTROL_ERROR);
            this.i.k(this.w, Status.k.withDescription("Received data size exceeded our receiving window size"), afof.PROCESSED, false, null, null);
        }
    }
}
