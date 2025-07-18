package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.common.collect.ImmutableList;
import j$.util.Objects;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eyg extends ehv implements Handler.Callback {
    public long f;
    private final ehk g;
    private eya h;
    private final eye i;
    private boolean j;
    private int k;
    private fiy l;
    private fjc m;
    private fjd n;
    private fjd o;
    private int p;
    private final Handler q;
    private final eyf r;
    private boolean s;
    private boolean t;
    private dze u;
    private long v;
    private IOException w;
    private final hig x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eyg(eyf eyfVar, Looper looper) {
        Handler handler;
        super(3);
        eye eyeVar = eye.b;
        eyfVar.getClass();
        this.r = eyfVar;
        if (looper == null) {
            handler = null;
        } else {
            String str = edt.a;
            handler = new Handler(looper, this);
        }
        this.q = handler;
        this.i = eyeVar;
        this.g = new ehk(1);
        this.x = new hig();
        this.f = -9223372036854775807L;
        this.v = -9223372036854775807L;
    }

    private final long W() {
        if (this.p == -1) {
            return Long.MAX_VALUE;
        }
        this.n.getClass();
        if (this.p < this.n.a()) {
            return this.n.c(this.p);
        }
        return Long.MAX_VALUE;
    }

    private final long X(long j) {
        a.ab(j != -9223372036854775807L);
        return j - this.b;
    }

    private final void Y() {
        boolean z = true;
        if (!Objects.equals(this.u.Y, "application/cea-608") && !Objects.equals(this.u.Y, "application/x-mp4-cea-608") && !Objects.equals(this.u.Y, "application/cea-708")) {
            z = false;
        }
        eci.b(z, "Legacy decoding is disabled, can't handle " + this.u.Y + " samples (expected application/x-media3-cues).");
    }

    private final void Z() {
        ag(new ecb(ImmutableList.of(), X(this.v)));
    }

    private final void aa(fiz fizVar) {
        edb.d("TextRenderer", "Subtitle decoding failed. streamFormat=".concat(String.valueOf(String.valueOf(this.u))), fizVar);
        Z();
        af();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void ab() {
        /*
            r4 = this;
            r0 = 1
            r4.j = r0
            dze r0 = r4.u
            defpackage.a.aq(r0)
            java.lang.String r1 = r0.Y
            if (r1 == 0) goto L4b
            int r2 = r1.hashCode()
            r3 = 930165504(0x37713300, float:1.4376594E-5)
            if (r2 == r3) goto L3b
            r3 = 1566015601(0x5d578071, float:9.705335E17)
            if (r2 == r3) goto L32
            r3 = 1566016562(0x5d578432, float:9.705995E17)
            if (r2 == r3) goto L20
            goto L4b
        L20:
            java.lang.String r2 = "application/cea-708"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L4b
            int r1 = r0.av
            java.util.List r0 = r0.ab
            fjs r2 = new fjs
            r2.<init>(r1, r0)
            goto L67
        L32:
            java.lang.String r2 = "application/cea-608"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L4b
            goto L43
        L3b:
            java.lang.String r2 = "application/x-mp4-cea-608"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L4b
        L43:
            int r0 = r0.av
            fjo r2 = new fjo
            r2.<init>(r1, r0)
            goto L67
        L4b:
            eye r2 = r4.i
            eyd r2 = (defpackage.eyd) r2
            fjf r2 = r2.a
            boolean r3 = r2.c(r0)
            if (r3 == 0) goto L6f
            fji r0 = r2.b(r0)
            fiw r2 = new fiw
            java.lang.Class r1 = r0.getClass()
            r1.getSimpleName()
            r2.<init>(r0)
        L67:
            r4.l = r2
            long r0 = r4.c
            r2.g(r0)
            return
        L6f:
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Attempted to create decoder for unsupported MIME type: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eyg.ab():void");
    }

    private final void ac(ecb ecbVar) {
        eyf eyfVar = this.r;
        eyfVar.cL(ecbVar.d);
        eyfVar.cK(ecbVar);
    }

    private final void ad() {
        this.m = null;
        this.p = -1;
        fjd fjdVar = this.n;
        if (fjdVar != null) {
            fjdVar.release();
            this.n = null;
        }
        fjd fjdVar2 = this.o;
        if (fjdVar2 != null) {
            fjdVar2.release();
            this.o = null;
        }
    }

    private final void ae() {
        ad();
        fiy fiyVar = this.l;
        fiyVar.getClass();
        fiyVar.f();
        this.l = null;
        this.k = 0;
    }

    private final void af() {
        ae();
        ab();
    }

    private final void ag(ecb ecbVar) {
        Handler handler = this.q;
        if (handler != null) {
            handler.obtainMessage(1, ecbVar).sendToTarget();
        } else {
            ac(ecbVar);
        }
    }

    private static boolean ah(fix fixVar, long j) {
        return fixVar == null || fixVar.c(fixVar.a() + (-1)) <= j;
    }

    private static boolean ai(dze dzeVar) {
        return Objects.equals(dzeVar.Y, "application/x-media3-cues");
    }

    @Override // defpackage.ehv
    protected final void D(dze[] dzeVarArr, long j, long j2, evz evzVar) {
        dze dzeVar = dzeVarArr[0];
        this.u = dzeVar;
        this.w = null;
        if (ai(dzeVar)) {
            this.h = this.u.aw == 1 ? new eyb() : new eyc();
            return;
        }
        Y();
        if (this.l != null) {
            this.k = 1;
        } else {
            ab();
        }
    }

    @Override // defpackage.ekc, defpackage.eke
    public final String U() {
        return "TextRenderer";
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018e  */
    @Override // defpackage.ekc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void V(long r10, long r12) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eyg.V(long, long):void");
    }

    @Override // defpackage.ekc
    public final boolean cH() {
        return this.t;
    }

    @Override // defpackage.ekc
    public final boolean cI() {
        if (this.u == null) {
            return true;
        }
        if (this.w == null) {
            try {
                u();
            } catch (IOException e) {
                this.w = e;
            }
        }
        if (this.w != null) {
            dze dzeVar = this.u;
            dzeVar.getClass();
            if (ai(dzeVar)) {
                eya eyaVar = this.h;
                eyaVar.getClass();
                return eyaVar.a(this.v) != Long.MIN_VALUE;
            }
            if (this.t || (this.s && ah(this.n, this.v) && ah(this.o, this.v) && this.m != null)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.eke
    public final int cJ(dze dzeVar) {
        if (!ai(dzeVar)) {
            eye eyeVar = this.i;
            String str = dzeVar.Y;
            if (!((eyd) eyeVar).a.c(dzeVar) && !Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                return clw.F(eae.o(str) ? 1 : 0);
            }
        }
        return clw.F(dzeVar.az == 0 ? 4 : 2);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        ac((ecb) message.obj);
        return true;
    }

    @Override // defpackage.ehv
    protected final void v() {
        this.u = null;
        this.w = null;
        this.f = -9223372036854775807L;
        Z();
        this.v = -9223372036854775807L;
        if (this.l != null) {
            ae();
        }
    }

    @Override // defpackage.ehv
    protected final void x(long j, boolean z) {
        this.v = j;
        eya eyaVar = this.h;
        if (eyaVar != null) {
            eyaVar.d();
        }
        Z();
        this.s = false;
        this.t = false;
        this.f = -9223372036854775807L;
        dze dzeVar = this.u;
        if (dzeVar == null || ai(dzeVar)) {
            return;
        }
        if (this.k != 0) {
            af();
            return;
        }
        ad();
        fiy fiyVar = this.l;
        fiyVar.getClass();
        fiyVar.d();
        fiyVar.g(this.c);
    }
}
