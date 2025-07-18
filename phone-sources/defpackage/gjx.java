package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gjx implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    final gju a;
    final ViewGroup b;

    public gjx(gju gjuVar, ViewGroup viewGroup) {
        this.a = gjuVar;
        this.b = viewGroup;
    }

    private final void a() {
        ViewGroup viewGroup = this.b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01db A[EDGE_INSN: B:158:0x01db->B:87:0x01db BREAK  A[LOOP:1: B:18:0x007f->B:86:0x01d2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02b1 A[EDGE_INSN: B:200:0x02b1->B:134:0x02b1 BREAK  A[LOOP:8: B:103:0x022e->B:214:0x022e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0201  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onPreDraw() {
        /*
            Method dump skipped, instructions count: 805
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gjx.onPreDraw():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
        ArrayList arrayList = gjy.a;
        ViewGroup viewGroup = this.b;
        arrayList.remove(viewGroup);
        ArrayList arrayList2 = (ArrayList) gjy.a().get(viewGroup);
        if (arrayList2 != null && arrayList2.size() > 0) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                ((gju) arrayList2.get(i)).v(viewGroup);
            }
        }
        this.a.q(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
