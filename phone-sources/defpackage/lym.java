package defpackage;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class lym extends Handler implements ids, ict, iej, idf {
    public Locale b;
    private final idf e;
    private final Executor f;
    private final ids g;
    private final iej h;
    private final idy i;
    private final iea j;
    private Map k;
    public final idt c = new idt(this);
    private final Collection d = new HashSet();
    public SoftReference a = new SoftReference(null);
    private ieg l = ieg.a;

    public lym(idf idfVar, Executor executor, ids idsVar, iea ieaVar) {
        this.j = ieaVar;
        this.e = idfVar;
        this.f = executor;
        this.g = idsVar;
        int i = 4;
        this.h = new lll(this, i, null);
        this.i = new lnt(this, i);
    }

    private final void e() {
        ldy ldyVar = (ldy) this.j;
        ieg iegVarG = ldyVar.a();
        if (this.l.m() && iegVarG.m() && ((ksn) this.l.g()).equals(iegVarG.g())) {
            return;
        }
        if (this.k != null) {
            this.k = new HashMap();
        }
        this.a = new SoftReference(this.k);
        this.l = ldyVar.a();
    }

    @Override // defpackage.idf
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ieg b(ksy ksyVar) {
        e();
        Map map = (Map) this.a.get();
        if (map != null) {
            ieg iegVarA = ieg.a((kst) map.get(ksyVar));
            if (iegVarA.m()) {
                return iegVarA;
            }
        }
        synchronized (this) {
            this.d.add(ksyVar);
        }
        removeMessages(0);
        sendEmptyMessage(0);
        return ieg.a;
    }

    @Override // defpackage.iej
    public final void dM() {
        e();
        removeMessages(0);
        synchronized (this) {
            Collection collection = this.d;
            if (collection.isEmpty()) {
                return;
            }
            ArrayList arrayList = new ArrayList(collection);
            collection.clear();
            if (arrayList.isEmpty()) {
                return;
            }
            mjo.e(this.i, new iei(this.e, arrayList), this.f);
        }
    }

    @Override // defpackage.ids
    public final void ea(iej iejVar) {
        this.c.ea(iejVar);
    }

    @Override // defpackage.ids
    public final void ee(iej iejVar) {
        this.c.ee(iejVar);
    }

    @Override // defpackage.ict
    public final void eg(idt idtVar) {
        Map map = (Map) this.a.get();
        this.k = map;
        if (map == null || !Locale.getDefault().equals(this.b)) {
            this.k = new HashMap();
            this.a = new SoftReference(this.k);
        }
        this.b = Locale.getDefault();
        this.g.ea(this.h);
        dM();
    }

    @Override // defpackage.ict
    public final void eh(idt idtVar) {
        this.g.ee(this.h);
        this.k = null;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        dM();
    }
}
