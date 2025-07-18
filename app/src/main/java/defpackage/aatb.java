package defpackage;

import android.os.IBinder;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aatb implements yrp {
    private final afji a;
    private final afkm b;
    private boolean c;

    public aatb(afji afjiVar, afkm afkmVar, bcl bclVar) {
        this.a = afjiVar;
        this.b = afkmVar;
        bcg bcgVarEk = bclVar.ek();
        if (bcgVarEk.a() == bcf.a) {
            afjiVar.a();
        } else {
            bcgVarEk.b(new afko(afjiVar));
        }
    }

    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.yrp
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized IBinder eV() {
        if (!this.c) {
            try {
                this.c = true;
                afji afjiVar = this.a;
                synchronized (((afzg) afjiVar).n) {
                    yqw.M(!((afzg) afjiVar).i, "Already started");
                    yqw.M(!((afzg) afjiVar).j, "Shutting down");
                    ((afzg) afjiVar).m.d(new afyz((afzg) afjiVar));
                    ?? A = ((afzg) afjiVar).d.a();
                    A.getClass();
                    ((afzg) afjiVar).e = A;
                    ((afzg) afjiVar).i = true;
                }
            } catch (IOException e) {
                ((zdv) ((zdv) ((zdv) aatc.a.c()).p(e)).q("com/google/frameworks/client/data/android/binder/IoGrpcInterop$ServerLifecycle", "get", 76, "IoGrpcInterop.java")).x("Unable to start server %s", this.a);
            }
        }
        return this.b.a;
    }
}
