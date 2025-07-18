package defpackage;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tbd {
    public int a;
    public boolean b;
    public final Object c;

    public tbd(FloatingActionButton floatingActionButton) {
        this.b = false;
        this.a = 0;
        this.c = floatingActionButton;
    }

    final boolean a(zft zftVar) {
        return zftVar != null && ((WeakReference) this.c).get() == zftVar;
    }

    public tbd(int i, zft zftVar) {
        this.c = new WeakReference(zftVar);
        this.a = i;
    }
}
