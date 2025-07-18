package defpackage;

import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
class jtc {
    public final UrlRequest a;
    public final zyd b;

    public jtc(jtd jtdVar) {
        this.a = jtdVar.a.build();
        zyd zydVar = jtdVar.b;
        this.b = zydVar;
        zydVar.d(new Runnable() { // from class: jtb
            @Override // java.lang.Runnable
            public final void run() {
                jtc jtcVar = this.a;
                if (((zuv) jtcVar.b).valueField instanceof zue) {
                    jtcVar.a.cancel();
                }
            }
        }, zwk.a);
    }
}
