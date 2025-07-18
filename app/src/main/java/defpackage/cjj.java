package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cjj implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ cjl b;

    public cjj(cjl cjlVar, String str) {
        this.b = cjlVar;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cld cldVar;
        cdy cdyVar = this.b.b.g;
        Object obj = cdyVar.g;
        String str = this.a;
        synchronized (obj) {
            cgk cgkVarB = cdyVar.b(str);
            cldVar = cgkVarB != null ? cgkVarB.a : null;
        }
        if (cldVar == null || !cldVar.c()) {
            return;
        }
        cjl cjlVar = this.b;
        synchronized (cjlVar.c) {
            cjlVar.f.put(cmk.a(cldVar), cldVar);
            cjlVar.g.put(cmk.a(cldVar), cif.a(cjlVar.h, cldVar, cjlVar.j.b, cjlVar));
        }
    }
}
