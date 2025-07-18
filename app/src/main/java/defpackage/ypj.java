package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ypj implements Runnable {
    final /* synthetic */ ypk a;
    private final zye b;

    public ypj(ypk ypkVar, zye zyeVar) {
        this.a = ypkVar;
        this.b = zyeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zye zyeVar = this.b;
        ypk ypkVar = this.a;
        synchronized (ypkVar.e) {
            try {
                ypkVar.f = (ypg) zxn.o(zyeVar);
                throw null;
            } catch (Exception unused) {
                ypi ypiVar = ypkVar.g;
                if (ypiVar != null && ypiVar.a == zyeVar) {
                    ypkVar.g = null;
                }
            } catch (Throwable th) {
                ypi ypiVar2 = ypkVar.g;
                if (ypiVar2 != null && ypiVar2.a == zyeVar) {
                    ypkVar.g = null;
                }
                throw th;
            }
        }
    }
}
