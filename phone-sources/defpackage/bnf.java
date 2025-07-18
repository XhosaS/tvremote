package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Build;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bnf {
    private static boolean c = true;
    public boolean a;
    private final ViewGroup d;
    private bqd f;
    private final Object e = new Object();
    public final ComponentCallbacks2 b = new bnd();

    public bnf(ViewGroup viewGroup) {
        this.d = viewGroup;
        if (viewGroup.isAttachedToWindow()) {
            b(viewGroup.getContext());
        }
        viewGroup.addOnAttachStateChangeListener(new bne(this, 0));
    }

    private final bqd d(ViewGroup viewGroup) {
        bqd bqdVar = this.f;
        if (bqdVar != null) {
            return bqdVar;
        }
        bqe bqeVar = new bqe(viewGroup.getContext());
        viewGroup.addView(bqeVar);
        this.f = bqeVar;
        return bqeVar;
    }

    public final bpu a() {
        bpw bqaVar;
        bpu bpuVar;
        synchronized (this.e) {
            ViewGroup viewGroup = this.d;
            if (Build.VERSION.SDK_INT >= 29) {
                viewGroup.getUniqueDrawingId();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                bqaVar = new bpy(new kw((byte[]) null, (char[]) null), new bpo());
            } else if (c) {
                try {
                    bqaVar = new bpx(viewGroup, new kw((byte[]) null, (char[]) null), new bpo());
                } catch (Throwable unused) {
                    c = false;
                    bqaVar = new bqa(d(this.d));
                }
            } else {
                bqaVar = new bqa(d(this.d));
            }
            bpuVar = new bpu(bqaVar);
        }
        return bpuVar;
    }

    public final void b(Context context) {
        if (this.a) {
            return;
        }
        context.getApplicationContext().registerComponentCallbacks(this.b);
        this.a = true;
    }

    public final void c(bpu bpuVar) {
        synchronized (this.e) {
            if (!bpuVar.j) {
                bpuVar.j = true;
                bpuVar.e();
            }
        }
    }
}
