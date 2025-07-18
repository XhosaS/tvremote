package defpackage;

import android.view.MotionEvent;
import android.view.View;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class nzx {
    public static nzv p() {
        nyu nyuVar = new nyu();
        nyuVar.b(oal.A);
        return nyuVar;
    }

    public abstract MotionEvent a();

    public abstract View b();

    public abstract nzv c();

    public abstract oal d();

    public abstract obz e();

    public abstract ocj f();

    public abstract ofs g();

    public abstract yyr h();

    public abstract SenderStateOuterClass$SenderState i();

    public abstract WeakReference j();

    public abstract int k();

    public abstract void l();

    public abstract void m();

    public final View n() {
        WeakReference weakReferenceJ = j();
        if (weakReferenceJ == null) {
            return null;
        }
        return (View) weakReferenceJ.get();
    }

    public final View o() {
        View viewN = n();
        return viewN != null ? viewN : b();
    }

    public final nzv q() {
        nzv nzvVarC = c();
        nzvVarC.i.f(h());
        return nzvVarC;
    }
}
