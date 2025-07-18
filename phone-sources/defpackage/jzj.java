package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jzj implements dwx {
    private final wll a;
    private final hfw b;

    public jzj(hfw hfwVar, wll wllVar) {
        this.b = hfwVar;
        this.a = wllVar;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, yfo] */
    @Override // defpackage.dwx
    public final dwt a(Class cls) {
        if (!cls.isAssignableFrom(jzi.class)) {
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
        hfw hfwVar = this.b;
        return new jzi(new jzg((iom) hfwVar.a.b(), this.a));
    }

    @Override // defpackage.dwx
    public final /* synthetic */ dwt b(Class cls, dxj dxjVar) {
        return dvz.e(this, cls);
    }

    @Override // defpackage.dwx
    public final /* synthetic */ dwt c(ymh ymhVar, dxj dxjVar) {
        return dvz.c(this, ymhVar, dxjVar);
    }
}
