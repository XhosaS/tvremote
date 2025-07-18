package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ebb implements eaz {
    private static eaz c = new ebb();
    public final Handler a;
    public Choreographer b;

    public ebb() {
        if (ene.a()) {
            this.b = Choreographer.getInstance();
            this.a = null;
        } else {
            Handler handler = new Handler(Looper.getMainLooper());
            this.a = handler;
            handler.post(new eba(this));
        }
    }

    public static eaz b() {
        if (c == null) {
            c = new ebb();
        }
        return c;
    }

    @Override // defpackage.eaz
    public final void a(eay eayVar) {
        AtomicReference atomicReference = eayVar.a;
        dzm dzmVar = dzn.a;
        atomicReference.set(null);
        if (this.b == null) {
            this.a.postDelayed(eayVar.b(), 0L);
        } else {
            this.b.postFrameCallback(eayVar.a());
        }
    }
}
