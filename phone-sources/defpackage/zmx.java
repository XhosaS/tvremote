package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zmx extends zix {
    public zjm a;
    zmp b;

    private zmx(zjm zjmVar) {
        if (zjmVar.b() >= 2 && zjmVar.b() <= 3) {
            this.a = zjmVar;
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + zjmVar.b());
    }

    public static zmx c(Object obj) {
        if (obj instanceof zmx) {
            return (zmx) obj;
        }
        if (obj != null) {
            return new zmx(zjm.j(obj));
        }
        return null;
    }

    public final ziu a() {
        return ziu.m(this.a.h(0));
    }

    public final zmp b() {
        if (this.b == null && this.a.b() == 3) {
            this.b = zmp.c(this.a.h(2));
        }
        return this.b;
    }

    public final boolean d() {
        return this.a.b() == 3;
    }

    @Override // defpackage.zix, defpackage.zih
    public final zjh p() {
        return this.a;
    }
}
