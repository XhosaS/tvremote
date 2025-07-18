package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class scn extends scb {
    private dvk a;
    private scb b;
    private final duv c;

    public scn() {
        this.c = new scm(this, 0);
    }

    @Override // defpackage.scb
    public final void a(Object obj) {
        scb scbVar = this.b;
        if (scbVar == null) {
            yks.c("rootViewBinder");
            scbVar = null;
        }
        scbVar.a(obj);
    }

    @Override // defpackage.scb
    public final void b() {
        scb scbVar = this.b;
        if (scbVar == null) {
            yks.c("rootViewBinder");
            scbVar = null;
        }
        scbVar.b();
    }

    public scn(bv bvVar, scb scbVar) {
        this();
        dvk viewLifecycleOwner = bvVar.getViewLifecycleOwner();
        this.a = viewLifecycleOwner;
        this.b = scbVar;
        if (viewLifecycleOwner == null) {
            yks.c("lifecycleOwner");
            viewLifecycleOwner = null;
        }
        viewLifecycleOwner.getLifecycle().c(this.c);
    }

    public scn(by byVar, scb scbVar) {
        this();
        this.a = byVar;
        this.b = scbVar;
        if (byVar == null) {
            yks.c("lifecycleOwner");
            byVar = null;
        }
        byVar.getLifecycle().c(this.c);
    }
}
