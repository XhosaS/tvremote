package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tkn extends tkq {
    final /* synthetic */ tko a;
    final /* synthetic */ tkp b;
    private int c;
    private int d = 0;
    private final ir e = new ir();
    private final ir f = new ir();
    private final ir g = new ir();

    public tkn(tkp tkpVar, tko tkoVar) {
        this.a = tkoVar;
        this.b = tkpVar;
        this.c = tkpVar.b.size();
    }

    @Override // defpackage.tkq
    public final synchronized void a(tkm tkmVar) {
        g(tkmVar, true);
    }

    @Override // defpackage.tkq
    public final synchronized void b(tkm tkmVar) {
        g(tkmVar, false);
    }

    @Override // defpackage.tkq
    public final synchronized void d() {
        int i = this.d + 1;
        this.d = i;
        if (i == 1) {
            tko tkoVar = this.a;
            ((Handler) ((ulo) tkoVar.a).a).post(new ehq(17));
        }
    }

    @Override // defpackage.tkq
    public final synchronized void e() {
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            ((Handler) ((ulo) this.a.a).a).post(new ehq(16));
        }
    }

    @Override // defpackage.tkq
    public final synchronized void f() {
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            ((Handler) ((ulo) this.a.a).a).post(new ehq(15));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d1, code lost:
    
        if (r13 != false) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void g(defpackage.tkm r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tkn.g(tkm, boolean):void");
    }
}
