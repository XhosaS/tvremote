package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rsb {
    public static final zdy a = zdy.h("com/google/android/libraries/search/appflows/transport/clearcut/ClearcutResultConverter");

    public static zyd a(lvf lvfVar) {
        return wzx.g(otn.a(lvfVar)).c(Throwable.class, new yqi() { // from class: rsa
            @Override // defpackage.yqi
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                if (!(th instanceof kej) || ((kej) th).a.f != 31003) {
                    throw new IllegalStateException("Clearcut logging failed.", th);
                }
                ((zdv) ((zdv) ((zdv) rsb.a.c()).p(th)).q("com/google/android/libraries/search/appflows/transport/clearcut/ClearcutResultConverter", "handleClearcutException", '!', "ClearcutResultConverter.java")).u("Clearcut dropped log because log cap is exceeded. Ignoring.");
                return null;
            }
        }, zwk.a);
    }
}
