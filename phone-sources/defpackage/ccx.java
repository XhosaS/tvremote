package defpackage;

import android.view.View;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ccx implements Comparator {
    public final ki a;
    public final kk b;
    public final ki c;
    public final jz d;

    public ccx() {
        long[] jArr = kj.a;
        this.a = new ki((byte[]) null);
        int i = kl.a;
        this.b = new kk((byte[]) null);
        this.c = new ki((byte[]) null);
        int i2 = ka.a;
        this.d = new jz((byte[]) null);
    }

    public final void a() {
        this.c.i();
        this.b.d();
        this.d.e();
        this.a.i();
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        View view = (View) obj;
        View view2 = (View) obj2;
        if (view == view2) {
            return 0;
        }
        if (view == null) {
            return -1;
        }
        if (view2 == null) {
            return 1;
        }
        ki kiVar = this.c;
        View view3 = (View) kiVar.a(view);
        View view4 = (View) kiVar.a(view2);
        if (view3 == view4 && view3 != null) {
            if (view == view3) {
                return -1;
            }
            return (view2 == view3 || this.a.a(view) == null) ? 1 : -1;
        }
        if (view3 != null) {
            view = view3;
        }
        if (view4 != null) {
            view2 = view4;
        }
        if (view3 == null && view4 == null) {
            return 0;
        }
        jz jzVar = this.d;
        return jzVar.b(view) < jzVar.b(view2) ? -1 : 1;
    }
}
