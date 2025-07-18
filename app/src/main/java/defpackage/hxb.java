package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hxb implements iyd {
    public final /* synthetic */ hxr a;

    public hxb(hxr hxrVar) {
        this.a = hxrVar;
    }

    public final void a() {
        final hxr hxrVar = this.a;
        hxrVar.E().post(new Runnable() { // from class: hxa
            @Override // java.lang.Runnable
            public final void run() {
                hxr hxrVar2 = hxrVar;
                hxrVar2.P();
                hyq hyqVar = hxrVar2.ag;
                if (hyqVar != null) {
                    hyqVar.b();
                }
            }
        });
    }
}
