package defpackage;

import android.support.v7.appcompat.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qn extends bko implements byc, bzt {
    public long a;
    public bnn b;
    public bol d;
    public boe e;
    private cmi g;
    private boe h;
    private bol i;
    public float c = 1.0f;
    private long f = 9205357640488583168L;

    public qn(long j, bnn bnnVar, bol bolVar) {
        this.a = j;
        this.b = bnnVar;
        this.d = bolVar;
    }

    @Override // defpackage.byc
    public final void bU(byu byuVar) {
        byu byuVar2;
        boe boeVar;
        bni bniVar;
        if (this.d == boh.a) {
            if (!a.s(this.a, bnq.g)) {
                brx.o(byuVar, this.a, 0L, 0L, 0.0f, null, R.styleable.AppCompatTheme_windowNoTitle);
            }
            bnn bnnVar = this.b;
            if (bnnVar != null) {
                brx.G(byuVar, bnnVar, 0L, 0L, this.c, null, 0, R.styleable.AppCompatTheme_windowActionBarOverlay);
            }
        } else {
            if (a.s(byuVar.n(), this.f) && byuVar.o() == this.g && yks.e(this.i, this.d)) {
                boeVar = this.h;
                boeVar.getClass();
                byuVar2 = byuVar;
            } else {
                byuVar2 = byuVar;
                cbp.Q(this, new qm(this, byuVar2, 0));
                boeVar = this.e;
                this.e = null;
            }
            boe boeVar2 = boeVar;
            this.h = boeVar2;
            this.f = byuVar2.n();
            this.g = byuVar2.o();
            this.i = this.d;
            boeVar2.getClass();
            if (!a.s(this.a, bnq.g)) {
                bnj.y(byuVar2, boeVar2, this.a, 0.0f, 60);
            }
            bnn bnnVar2 = this.b;
            if (bnnVar2 != null) {
                float f = this.c;
                boolean z = boeVar2 instanceof boc;
                bps bpsVar = bps.a;
                if (z) {
                    bmy bmyVar = ((boc) boeVar2).a;
                    byuVar.t(bnnVar2, bnj.w(bmyVar), bnj.u(bmyVar), f, bpsVar, 3);
                } else {
                    if (boeVar2 instanceof bod) {
                        bod bodVar = (bod) boeVar2;
                        bniVar = bodVar.b;
                        if (bniVar == null) {
                            bmz bmzVar = bodVar.a;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (bmzVar.h >> 32));
                            byuVar.y(bnnVar2, bnj.x(bmzVar), bnj.v(bmzVar), (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), f, bpsVar);
                        }
                    } else {
                        if (!(boeVar2 instanceof bob)) {
                            throw new yfu();
                        }
                        bniVar = ((bob) boeVar2).a;
                    }
                    byuVar.u(bniVar, bnnVar2, f, bpsVar, 3);
                }
            }
        }
        byuVar.r();
    }

    @Override // defpackage.bko
    public final boolean ce() {
        return false;
    }

    @Override // defpackage.bzt
    public final void l() {
        this.f = 9205357640488583168L;
        this.g = null;
        this.h = null;
        this.i = null;
        fh.D(this);
    }

    @Override // defpackage.byc
    public final /* synthetic */ void bW() {
    }
}
