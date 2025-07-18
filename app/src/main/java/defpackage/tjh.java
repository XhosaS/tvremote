package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class tjh implements rog {
    private final agow a;
    private final tjc b;

    public tjh(agow agowVar, tjc tjcVar) {
        this.a = agowVar;
        this.b = tjcVar;
    }

    @Override // defpackage.rog
    public final void a() {
        if (this.b.a()) {
            ((rog) this.a.a()).a();
        }
    }
}
