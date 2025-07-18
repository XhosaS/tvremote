package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zmj extends zix {
    final zjm a;
    public znb b;
    public zmd c;
    public zic d;

    private zmj(zjm zjmVar) {
        this.a = zjmVar;
        if (zjmVar.b() != 3) {
            throw new IllegalArgumentException("sequence wrong size for a certificate");
        }
        this.b = znb.a(zjmVar.h(0));
        this.c = zmd.a(zjmVar.h(1));
        this.d = zic.i(zjmVar.h(2));
    }

    public static zmj c(Object obj) {
        if (obj instanceof zmj) {
            return (zmj) obj;
        }
        if (obj != null) {
            return new zmj(zjm.j(obj));
        }
        return null;
    }

    public final zlw a() {
        return this.b.e;
    }

    public final zlw b() {
        return this.b.h;
    }

    public final znc d() {
        return this.b.g;
    }

    public final znc e() {
        return this.b.f;
    }

    @Override // defpackage.zix, defpackage.zih
    public final zjh p() {
        return this.a;
    }
}
