package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class icr extends bqh implements bda {
    public final Drawable a;
    public final bcb b;
    public final bcb c;
    private final yft d;

    public icr(Drawable drawable) {
        this.a = drawable;
        bcz bczVar = bcz.c;
        this.b = new bci(0, bczVar);
        this.c = new bci(new bna(ics.a(drawable)), bczVar);
        this.d = new yga(new grq(this, 13));
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // defpackage.bqh
    public final long a() {
        return ((bna) this.c.a()).a;
    }

    @Override // defpackage.bqh
    protected final void b(bpq bpqVar) {
        bnp bnpVarB = bpqVar.p().b();
        g();
        int iV = yln.v(Float.intBitsToFloat((int) (bpqVar.n() >> 32)));
        int iV2 = yln.v(Float.intBitsToFloat((int) (bpqVar.n() & 4294967295L)));
        Drawable drawable = this.a;
        drawable.setBounds(0, 0, iV, iV2);
        try {
            bnpVarB.g();
            drawable.draw(bnc.a(bnpVarB));
        } finally {
            bnpVarB.e();
        }
    }

    @Override // defpackage.bqh
    protected final void c(float f) {
        this.a.setAlpha(ykn.l(yln.v(f * 255.0f), 0, 255));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bda
    public final void cb() {
        Drawable.Callback callback = (Drawable.Callback) this.d.a();
        Drawable drawable = this.a;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @Override // defpackage.bqh
    protected final void d(bnr bnrVar) {
        this.a.setColorFilter(bnrVar != null ? bnrVar.b : null);
    }

    @Override // defpackage.bda
    public final void dI() {
        dJ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bda
    public final void dJ() {
        Drawable drawable = this.a;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    @Override // defpackage.bqh
    protected final void f(cmi cmiVar) {
        int i;
        cmiVar.getClass();
        int iOrdinal = cmiVar.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                throw new yfu();
            }
        } else {
            i = 0;
        }
        this.a.setLayoutDirection(i);
    }

    public final int g() {
        return ((Number) this.b.a()).intValue();
    }
}
