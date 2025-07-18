package defpackage;

import android.os.Process;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mgt {
    private final Map a = new ConcurrentHashMap();

    public mgt() {
        a(new mgh("Main", 1, true, mgn.a)).d(Process.myPid());
    }

    public final mgr a(mgl mglVar) {
        mgs mgsVar = new mgs(mglVar);
        this.a.put(mglVar, mgsVar);
        return mgsVar;
    }
}
