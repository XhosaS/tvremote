package defpackage;

import android.content.Context;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kfj implements dwx {
    private final /* synthetic */ int a;
    private final Object b;

    public kfj(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.dwx
    public final dwt a(Class cls) {
        int i = this.a;
        if (i == 0) {
            if (cls.isAssignableFrom(kfi.class)) {
                return new kfi(new kdh((List) this.b));
            }
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
        if (i != 1) {
            if (cls.isAssignableFrom(usj.class)) {
                return new usj((Context) this.b);
            }
            throw new IllegalStateException("Unknown ViewModel class");
        }
        if (!cls.isAssignableFrom(kcs.class)) {
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
        lkt lktVar = (lkt) this.b;
        Object objB = lktVar.d.b();
        ipa ipaVar = (ipa) lktVar.f.b();
        ipaVar.getClass();
        isi isiVar = (isi) lktVar.a.b();
        isiVar.getClass();
        iom iomVar = (iom) lktVar.e.b();
        iomVar.getClass();
        kpy kpyVar = (kpy) lktVar.b.b();
        kpyVar.getClass();
        return new kcs(new kcl((iom) objB, ipaVar, isiVar, iomVar, kpyVar, ((kqw) lktVar.c).b()));
    }

    @Override // defpackage.dwx
    public final /* synthetic */ dwt b(Class cls, dxj dxjVar) {
        int i = this.a;
        return i != 0 ? i != 1 ? dvz.e(this, cls) : dvz.e(this, cls) : dvz.e(this, cls);
    }

    @Override // defpackage.dwx
    public final /* synthetic */ dwt c(ymh ymhVar, dxj dxjVar) {
        int i = this.a;
        return i != 0 ? i != 1 ? dvz.c(this, ymhVar, dxjVar) : dvz.c(this, ymhVar, dxjVar) : dvz.c(this, ymhVar, dxjVar);
    }

    public kfj(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
