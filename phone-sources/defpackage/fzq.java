package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fzq implements fzh, yko {
    final /* synthetic */ fzr a;
    private final /* synthetic */ int b;

    public fzq(fzr fzrVar, int i) {
        this.b = i;
        this.a = fzrVar;
    }

    @Override // defpackage.fzh
    public final void a() {
        if (this.b != 0) {
            this.a.d();
        } else {
            this.a.d();
        }
    }

    @Override // defpackage.yko
    public final yfq b() {
        return this.b != 0 ? new ykq(0, this.a, fzr.class, "invalidate", "invalidate()V", 0) : new ykq(0, this.a, fzr.class, "invalidate", "invalidate()V", 0);
    }

    public final boolean equals(Object obj) {
        if (this.b != 0) {
            if ((obj instanceof fzh) && (obj instanceof yko)) {
                return yks.e(b(), ((yko) obj).b());
            }
            return false;
        }
        if ((obj instanceof fzh) && (obj instanceof yko)) {
            return yks.e(b(), ((yko) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.b != 0 ? b().hashCode() : b().hashCode();
    }
}
