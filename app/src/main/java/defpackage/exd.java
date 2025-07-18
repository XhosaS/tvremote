package defpackage;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.google.android.apps.tvsearch.app.hover.HoverWindow$HoverLayoutParams;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class exd implements jpk, jpl {
    private static final zdy d = zdy.h("com/google/android/apps/tvsearch/app/hover/HoverDisplaySystem");
    final jpi a = new jpi();
    protected final WindowManager b;
    protected final exe c;

    public exd(Context context, WindowManager windowManager) {
        this.b = windowManager;
        this.c = new exe(context, this, this);
    }

    @Override // defpackage.jpl
    public final HoverWindow$HoverLayoutParams a() {
        HoverWindow$HoverLayoutParams hoverWindow$HoverLayoutParams = new HoverWindow$HoverLayoutParams();
        hoverWindow$HoverLayoutParams.setTitle(getClass().getName());
        hoverWindow$HoverLayoutParams.flags |= 8;
        return hoverWindow$HoverLayoutParams;
    }

    @Override // defpackage.jpk
    public final jph b(jpg jpgVar) {
        return new jph(jpgVar);
    }

    @Override // defpackage.jpl
    public final void d(ViewGroup viewGroup) {
        this.b.removeView(viewGroup);
    }

    @Override // defpackage.jpl
    public final void f(View view, ViewGroup.LayoutParams layoutParams) {
        try {
            this.b.updateViewLayout(view, layoutParams);
        } catch (IllegalArgumentException e) {
            ((zdv) ((zdv) ((zdv) d.d()).p(e)).q("com/google/android/apps/tvsearch/app/hover/HoverDisplaySystem", "updateViewLayout", 's', "HoverDisplaySystem.java")).u("#updateViewLayout failed with cause");
        }
    }

    @Override // defpackage.jpl
    public final boolean g(ViewGroup viewGroup, WindowManager.LayoutParams layoutParams) {
        if (viewGroup.getParent() != null) {
            ((zdv) ((zdv) d.d()).q("com/google/android/apps/tvsearch/app/hover/HoverDisplaySystem", "addView", 92, "HoverDisplaySystem.java")).u("Window already in window manager");
            return false;
        }
        if (layoutParams == null) {
            layoutParams = a();
        }
        try {
            this.b.addView(viewGroup, layoutParams);
            return false;
        } catch (WindowManager.BadTokenException e) {
            ((zdv) ((zdv) ((zdv) d.c()).p(e)).q("com/google/android/apps/tvsearch/app/hover/HoverDisplaySystem", "addView", 103, "HoverDisplaySystem.java")).F("hoverSystemService#addView failed with token=%s; message=%s", layoutParams.token, e.getMessage());
            return true;
        }
    }

    @Override // defpackage.jpk
    public final jph h() {
        return this.a.a(getClass());
    }

    @Override // defpackage.jpk
    public final void i(jph jphVar) {
        Class<?> cls = getClass();
        cls.getClass();
        Map map = this.a.a;
        Object sparseArray = map.get(cls);
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            map.put(cls, sparseArray);
        }
        ((SparseArray) sparseArray).put(0, jphVar);
    }

    @Override // defpackage.jpk
    public final void o() {
        jpi jpiVar = this.a;
        if (jpiVar.a(getClass()) == null) {
            ((zdv) ((zdv) d.d()).q("com/google/android/apps/tvsearch/app/hover/HoverDisplaySystem", "removeHoverActivityRecord", 70, "HoverDisplaySystem.java")).v("#removeHoverActivityRecord no record for=%s", 0);
        }
        Class<?> cls = getClass();
        cls.getClass();
        Map map = jpiVar.a;
        SparseArray sparseArray = (SparseArray) map.get(cls);
        if (sparseArray == null || ((jph) sparseArray.get(0)) == null) {
            return;
        }
        sparseArray.remove(0);
        if (sparseArray.size() == 0) {
            map.remove(cls);
        }
    }
}
