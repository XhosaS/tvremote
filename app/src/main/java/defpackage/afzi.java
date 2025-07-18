package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afzi extends afjj {
    public static final Logger a = Logger.getLogger(afzi.class.getName());
    private static final afvo q = new afzv(afrq.m);
    private static final afgg r = new afzh();
    private static final affw s = affw.b;
    private static final affb t = affb.a;
    private static final long u = TimeUnit.SECONDS.toMillis(120);
    final afsa b = new afsa();
    final List c = new ArrayList();
    public final List d = new ArrayList();
    public final List e = new ArrayList();
    afgg f = r;
    public afvo g = q;
    affw h = s;
    long i = u;
    affs j = afft.a;
    public boolean k = true;
    public boolean l = true;
    public boolean m = true;
    public boolean n = true;
    afgm o = afgm.b;
    public final afkk p;

    public afzi(afkk afkkVar) {
        this.p = afkkVar;
        Iterator it = affd.a().b().iterator();
        while (it.hasNext()) {
            ((affc) it.next()).b();
        }
    }
}
