package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mjz {
    public final aehf b;
    public final agfx c;
    public final agfx d;
    public final Map a = new HashMap();
    public final Object e = new Object();

    public mjz(aehf aehfVar, agfx agfxVar, agfx agfxVar2) {
        this.b = aehfVar;
        this.c = agfxVar;
        this.d = agfxVar2;
    }

    public final void a(String str) {
        Object obj;
        synchronized (this.e) {
            mjy mjyVar = (mjy) this.a.get(str);
            if (mjyVar != null && (obj = mjyVar.b) != null) {
                aghd.e((AtomicReference) obj);
                mjyVar.b = null;
            }
        }
    }
}
