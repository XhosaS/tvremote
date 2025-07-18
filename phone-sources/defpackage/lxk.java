package defpackage;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lxk extends Handler implements ids, ict, iej {
    public Locale c;
    private final idf e;
    private final Executor f;
    private final iea g;
    private final ids h;
    private Map l;
    private final lys m;
    private final lfx n;
    public final idt d = new idt(this);
    public final Collection a = new HashSet();
    private final iej j = new lll(this, 3);
    private final idy k = new jbj(new lgx(this, 7), 6);
    public SoftReference b = new SoftReference(null);
    private final int i = 155;

    public lxk(idf idfVar, Executor executor, iea ieaVar, lys lysVar, ids idsVar, lfx lfxVar) {
        this.e = idfVar;
        this.f = executor;
        this.g = ieaVar;
        this.m = lysVar;
        this.h = idsVar;
        this.n = lfxVar;
    }

    @Override // defpackage.iej
    public final void dM() {
        removeMessages(0);
        ieg iegVarA = ((ldy) this.g).a();
        if (iegVarA.k()) {
            return;
        }
        synchronized (this) {
            Collection collection = this.a;
            if (collection.isEmpty()) {
                return;
            }
            ArrayList arrayList = new ArrayList(collection);
            collection.clear();
            Iterator it = lxo.b(this.m.c(iegVarA), this.i, arrayList, this.n.a(iegVarA).c).iterator();
            while (it.hasNext()) {
                mjo.e(this.k, new iei(this.e, (lxo) it.next()), this.f);
            }
        }
    }

    @Override // defpackage.ids
    public final void ea(iej iejVar) {
        this.d.ea(iejVar);
    }

    @Override // defpackage.ids
    public final void ee(iej iejVar) {
        this.d.ee(iejVar);
    }

    @Override // defpackage.ict
    public final void eg(idt idtVar) {
        Map map = (Map) this.b.get();
        this.l = map;
        if (map == null || !Locale.getDefault().equals(this.c)) {
            this.l = new HashMap();
            this.b = new SoftReference(this.l);
        }
        this.c = Locale.getDefault();
        this.h.ea(this.j);
        this.g.ea(this);
        dM();
    }

    @Override // defpackage.ict
    public final void eh(idt idtVar) {
        this.g.ee(this);
        this.h.ee(this.j);
        this.l = null;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        dM();
    }
}
