package defpackage;

import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class trc {
    public static final /* synthetic */ int a = 0;

    static {
        Math.abs(new Random().nextInt());
        new HashMap();
    }

    public static final tsl a(tsl tslVar) {
        return new tra(tqg.b(), tslVar);
    }

    public static final ufv b(ufv ufvVar) {
        return new ugq(tqg.b(), ufvVar, 1);
    }

    public static final ufw c(ufw ufwVar) {
        return new ufz(tqg.b(), ufwVar, 1);
    }

    public static final uga d(final uga ugaVar) {
        final tqt tqtVarB = tqg.b();
        return new uga() { // from class: tqy
            @Override // defpackage.uga
            public final uge a(ulp ulpVar, Object obj) {
                int i = trc.a;
                ulpVar.getClass();
                tqt tqtVarE = tqg.e(tqg.d(), tqtVarB);
                try {
                    return ugaVar.a(ulpVar, obj);
                } finally {
                }
            }
        };
    }

    public static final uha e(uha uhaVar) {
        return new trb(tqg.b(), uhaVar);
    }

    public static final Runnable f(Runnable runnable) {
        return new xto(new ylf(), tqg.b(), runnable, 1);
    }

    public static final Callable g(Callable callable) {
        return new ufy(tqg.b(), callable, 1);
    }
}
