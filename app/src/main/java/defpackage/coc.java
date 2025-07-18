package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class coc {
    public static final String a = cbx.d("WorkTimer");
    public final ccm b;
    public final Map c = new HashMap();
    public final Map d = new HashMap();
    public final Object e = new Object();

    public coc(ccm ccmVar) {
        this.b = ccmVar;
    }

    public final void a(ckp ckpVar) {
        synchronized (this.e) {
            if (((cob) this.c.remove(ckpVar)) != null) {
                cbx.c().a(a, "Stopping timer for " + ckpVar);
                this.d.remove(ckpVar);
            }
        }
    }
}
