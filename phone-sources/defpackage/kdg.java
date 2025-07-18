package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kdg implements dwx {
    private final kdj a;
    private final String b;
    private final wll c;
    private final kds d;

    public kdg(kdj kdjVar, String str, wll wllVar, kds kdsVar) {
        this.a = kdjVar;
        this.b = str;
        this.c = wllVar;
        this.d = kdsVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, yfo] */
    @Override // defpackage.dwx
    public final dwt a(Class cls) {
        if (!cls.isAssignableFrom(kdf.class)) {
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
        kdj kdjVar = this.a;
        String str = this.b;
        wll wllVar = this.c;
        kds kdsVar = this.d;
        Context contextA = ((rgq) kdjVar.a).a();
        iof iofVar = (iof) kdjVar.b.b();
        iofVar.getClass();
        return new kdf(new kdi(contextA, iofVar, ((ihh) kdjVar.c).b(), str, wllVar, kdsVar));
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
