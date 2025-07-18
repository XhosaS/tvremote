package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bcc {
    public static final bcc a = new bcc();

    private bcc() {
    }

    public static final void a(beb bebVar, bqo bqoVar, bcg bcgVar) throws NoSuchMethodException, SecurityException {
        AutoCloseable autoCloseable;
        bcgVar.getClass();
        bez bezVar = bebVar.h;
        synchronized (bezVar.a) {
            autoCloseable = (AutoCloseable) bezVar.b.get("androidx.lifecycle.savedstate.vm.tag");
        }
        bdn bdnVar = (bdn) autoCloseable;
        if (bdnVar == null || bdnVar.b) {
            return;
        }
        bdnVar.b(bqoVar, bcgVar);
        a.b(bqoVar, bcgVar);
    }

    public final void b(bqo bqoVar, bcg bcgVar) throws NoSuchMethodException, SecurityException {
        bcf bcfVarA = bcgVar.a();
        if (bcfVarA == bcf.b || bcfVarA.a(bcf.d)) {
            bqoVar.b(bca.class);
        } else {
            bcgVar.b(new bcb(bcgVar, bqoVar));
        }
    }
}
