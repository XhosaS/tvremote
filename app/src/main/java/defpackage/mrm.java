package defpackage;

import android.view.View;
import com.google.android.libraries.elements.interfaces.IntersectionObserver;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class mrm extends IntersectionObserver {
    final nzx d;
    public final AtomicReference e = new AtomicReference(null);

    public mrm(nzx nzxVar) {
        this.d = nzxVar;
    }

    public final nzx a() {
        View view = (View) this.e.get();
        if (view == null) {
            return this.d;
        }
        nzv nzvVarQ = this.d.q();
        nzvVarQ.f(view);
        return nzvVarQ.e();
    }
}
