package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class efd extends dxv {

    @eau(a = eav.DIMEN_OFFSET)
    @eat(a = 0)
    public float a;

    @eau(a = eav.DIMEN_OFFSET)
    @eat(a = 0)
    public float b;

    @eau(a = eav.DIMEN_OFFSET)
    @eat(a = 0)
    public float c;

    @eau(a = eav.COLOR)
    @eat(a = 3)
    public int d;

    @eau(a = eav.DIMEN_SIZE)
    @eat(a = 0)
    public float e;

    @eau(a = eav.COLOR)
    @eat(a = 3)
    public int f;

    public efd() {
        super("CardShadow");
        this.b = -1.0f;
        this.c = -1.0f;
    }

    @Override // defpackage.drq
    protected final Object A(Context context) {
        return new efe();
    }

    @Override // defpackage.drq
    protected final void L(dru druVar, Object obj, duv duvVar) {
        efe efeVar = (efe) obj;
        int i = this.f;
        int i2 = this.d;
        float f = this.a;
        float f2 = this.e;
        float f3 = this.b;
        float f4 = this.c;
        if (efeVar.a != i) {
            efeVar.a = i;
            efeVar.i = true;
            efeVar.invalidateSelf();
        }
        if (efeVar.b != i2) {
            efeVar.b = i2;
            efeVar.i = true;
            efeVar.invalidateSelf();
        }
        float f5 = (int) (f + 0.5f);
        if (efeVar.c != f5) {
            efeVar.c = f5;
            efeVar.i = true;
            efeVar.invalidateSelf();
        }
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        float fE = efe.e(f2);
        if (efeVar.d != fE) {
            efeVar.d = fE;
            efeVar.i = true;
            efeVar.invalidateSelf();
        }
        efeVar.e = -1.0f;
        efeVar.f = -1.0f;
        if (f3 != efeVar.g) {
            efeVar.g = f3;
            efeVar.i = true;
            efeVar.invalidateSelf();
        }
        if (f4 == efeVar.h) {
            return;
        }
        efeVar.h = f4;
        efeVar.i = true;
        efeVar.invalidateSelf();
    }

    @Override // defpackage.drq
    public final boolean ad() {
        return true;
    }

    @Override // defpackage.drq
    public final int ah() {
        return 2;
    }

    @Override // defpackage.drq
    public final boolean g(drq drqVar) {
        if (this == drqVar) {
            return true;
        }
        if (drqVar == null || getClass() != drqVar.getClass()) {
            return false;
        }
        efd efdVar = (efd) drqVar;
        return Float.compare(this.a, efdVar.a) == 0 && Float.compare(this.b, efdVar.b) == 0 && Float.compare(this.c, efdVar.c) == 0 && this.d == efdVar.d && Float.compare(-1.0f, -1.0f) == 0 && Float.compare(-1.0f, -1.0f) == 0 && Float.compare(this.e, efdVar.e) == 0 && this.f == efdVar.f;
    }

    @Override // defpackage.drq
    protected final int h() {
        return 3;
    }
}
