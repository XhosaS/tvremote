package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rcy {
    private final boolean a;
    private final mcw b;

    public rcy(mcw mcwVar, yqt yqtVar) {
        this.b = mcwVar;
        this.a = yqtVar.g();
    }

    public final rcv a(agow agowVar) {
        if (this.a) {
            agowVar = new agow() { // from class: rcx
                @Override // defpackage.agow
                public final Object a() {
                    return Integer.MAX_VALUE;
                }
            };
        }
        return new rcv(agowVar);
    }

    public final rcv b(final int i) {
        return a(new agow() { // from class: rcw
            @Override // defpackage.agow
            public final Object a() {
                return Integer.valueOf(i);
            }
        });
    }
}
