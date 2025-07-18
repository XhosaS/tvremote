package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bmm extends btc {
    final /* synthetic */ bmn e;
    private boolean f = false;
    int a = 0;
    int b = 0;
    int c = 0;
    int d = 0;

    public bmm(bmn bmnVar) {
        this.e = bmnVar;
    }

    @Override // defpackage.btc
    public final int a() {
        return 512;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00d5  */
    @Override // defpackage.btc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(defpackage.bux r12) throws defpackage.btb {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmm.d(bux):boolean");
    }

    @Override // defpackage.btc
    public final boolean e(int i, bsw bswVar) {
        this.f = i(buy.APP_LINK, i);
        return true;
    }

    @Override // defpackage.btc
    public final void f(bxj bxjVar) {
        if (this.f) {
            bxjVar.c("App Link Message Handler: %d requests received, %d intents launched, %d Play Store redirects, %d activity launch failures%n", Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d));
        }
    }

    @Override // defpackage.btc
    protected final void b(int i) {
    }

    @Override // defpackage.btc
    public final void c(int i, int i2) {
    }
}
