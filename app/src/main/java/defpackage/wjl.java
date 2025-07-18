package defpackage;

import android.app.Activity;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wjl {
    private final bw a;
    private final Set b;
    private boolean c = false;

    public wjl(Activity activity, Set set) {
        this.a = (bw) activity;
        this.b = set;
    }

    public final void a() {
        if (this.c) {
            return;
        }
        zdm zdmVarListIterator = ((yxy) this.b).f().listIterator(0);
        while (zdmVarListIterator.hasNext()) {
            this.a.ek().b((bck) zdmVarListIterator.next());
        }
        this.c = true;
    }
}
