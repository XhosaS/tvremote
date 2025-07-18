package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
class rkv implements rkq {
    private static final rkq a = new rkq() { // from class: rku
        @Override // defpackage.rkq
        public final rkp a(rfr rfrVar, String str) {
            throw new IllegalStateException();
        }
    };
    private volatile rkq b;
    private rkp c;

    public rkv(rkq rkqVar) {
        this.b = rkqVar;
    }

    @Override // defpackage.rkq
    public final rkp a(rfr rfrVar, String str) {
        yqw.A(Objects.equals(str, ""));
        rkq rkqVar = this.b;
        rkq rkqVar2 = a;
        if (rkqVar != rkqVar2) {
            synchronized (this) {
                if (this.b != rkqVar2) {
                    this.c = this.b.a(rfrVar, "");
                    this.b = rkqVar2;
                }
            }
        }
        return this.c;
    }
}
