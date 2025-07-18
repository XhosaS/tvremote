package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.net.InlineExecutionProhibitedException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ia implements Executor {
    private final /* synthetic */ int a;
    private final Object b;

    public ia(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.a;
        if (i == 0) {
            ((Handler) this.b).post(runnable);
            return;
        }
        if (i == 1) {
            ((Handler) this.b).post(runnable);
            return;
        }
        if (i == 2) {
            runnable.getClass();
            Object obj = this.b;
            if (((Handler) obj).post(runnable)) {
                return;
            }
            Objects.toString(obj);
            throw new RejectedExecutionException(obj.toString().concat(" is shutting down"));
        }
        if (i == 3) {
            runnable.getClass();
            Object obj2 = this.b;
            if (((Handler) obj2).post(runnable)) {
                return;
            }
            Objects.toString(obj2);
            throw new RejectedExecutionException(obj2.toString().concat(" is shutting down"));
        }
        if (i == 4) {
            ((Handler) this.b).post(runnable);
            return;
        }
        aaau aaauVar = new aaau(runnable, Thread.currentThread());
        this.b.execute(aaauVar);
        InlineExecutionProhibitedException inlineExecutionProhibitedException = aaauVar.b;
        if (inlineExecutionProhibitedException != null) {
            throw inlineExecutionProhibitedException;
        }
        aaauVar.a = null;
    }

    public ia(int i, byte[] bArr) {
        this.a = i;
        this.b = new Handler(Looper.getMainLooper());
    }

    public ia(Handler handler, int i, byte[] bArr) {
        this.a = i;
        handler.getClass();
        this.b = handler;
    }

    public ia(int i) {
        this.a = i;
        this.b = new Handler(Looper.getMainLooper());
    }
}
