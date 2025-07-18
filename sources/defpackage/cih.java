package defpackage;

import android.util.SparseIntArray;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import android.window.OnBackInvokedDispatcher;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cih {
    public final Object a;
    public Object b;

    public cih(TextView textView) {
        this.a = textView;
    }

    public final cja a(chs chsVar, Executor executor) {
        executor.getClass();
        final cif cifVar = new cif(executor, this);
        cid cidVar = new cid(cifVar, chsVar, 0);
        final cjl cjlVar = new cjl();
        final cja cjaVar = (cja) ((AtomicReference) this.a).getAndSet(cjlVar);
        final cjs cjsVar = new cjs(cidVar);
        cjaVar.m(cjsVar, cifVar);
        final cja cjaVarL = qm.L(cjsVar);
        Runnable runnable = new Runnable() { // from class: cic
            @Override // java.lang.Runnable
            public final void run() {
                cjs cjsVar2 = cjsVar;
                if (cjsVar2.isDone()) {
                    cjlVar.e(cjaVar);
                } else if (cjaVarL.isCancelled() && cifVar.compareAndSet(cie.NOT_RUN, cie.CANCELLED)) {
                    cjsVar2.cancel(false);
                }
            }
        };
        chz chzVar = chz.a;
        cjaVarL.m(runnable, chzVar);
        cjsVar.m(runnable, chzVar);
        return cjaVarL;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    public final bcn[] b(String str) {
        AtomicReference atomicReference = (AtomicReference) this.a.get(str);
        if (atomicReference == null) {
            return null;
        }
        return (bcn[]) atomicReference.get();
    }

    public final synchronized void c(bav bavVar) {
        if (this.b == null) {
            this.b = apr.d(bavVar.d, new ama(this, 14, null), bavVar.b());
        }
    }

    public final void d() {
        Object obj = this.a;
        synchronized (obj) {
            ((SparseIntArray) obj).clear();
        }
    }

    public final int e(int i) {
        int i2;
        Object obj = this.a;
        synchronized (obj) {
            i2 = ((SparseIntArray) obj).get(i, -1);
        }
        return i2;
    }

    public final void f(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        abf abfVar = new abf((aaz) this.b);
        abfVar.b = onBackInvokedDispatcher;
        abfVar.a();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.textclassifier.TextClassifier, java.lang.Object] */
    public final TextClassifier g() {
        ?? r0 = this.b;
        if (r0 != 0) {
            return r0;
        }
        TextClassificationManager textClassificationManagerM19m = k$$ExternalSyntheticApiModelOutline0.m19m(((TextView) this.a).getContext().getSystemService(k$$ExternalSyntheticApiModelOutline0.m$2()));
        return textClassificationManagerM19m != null ? textClassificationManagerM19m.getTextClassifier() : TextClassifier.NO_OP;
    }

    public cih(Runnable runnable) {
        this.a = runnable;
        this.b = new aaz(new kh(this, 2), new kw(1));
    }

    public cih(aev aevVar) {
        this.a = new SparseIntArray();
        qp.p(aevVar);
        this.b = aevVar;
    }

    public cih(byte[] bArr) {
        this.b = null;
        this.a = new ConcurrentHashMap();
    }

    public cih() {
        this.a = new AtomicReference(ciw.a);
        this.b = new cig();
    }
}
