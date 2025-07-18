package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahmu {
    public static final void a(agsw agswVar, agsw agswVar2) throws Throwable {
        try {
            ahle.a(agth.c(agswVar), agpu.a);
        } catch (Throwable th) {
            c(agswVar2, th);
        }
    }

    public static final void b(agvb agvbVar, Object obj, agsw agswVar) {
        try {
            ahle.a(agth.c(agth.b(agvbVar, obj, agswVar)), agpu.a);
        } catch (Throwable th) {
            c(agswVar, th);
        }
    }

    private static final void c(agsw agswVar, Throwable th) throws Throwable {
        if (th instanceof ahcg) {
            th = ((ahcg) th).a;
        }
        agswVar.e(agpl.a(th));
        throw th;
    }
}
