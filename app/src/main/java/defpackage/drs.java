package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.facebook.litho.ComponentHost;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class drs extends alk {
    private static final Rect k = new Rect(0, 0, 1, 1);
    public final View i;
    public dww j;
    private final afn l;

    public drs(View view, dww dwwVar, boolean z, int i) {
        super(view);
        this.i = view;
        this.j = dwwVar;
        this.l = new drr(this);
        view.setFocusable(z);
        int[] iArr = ahj.a;
        view.setImportantForAccessibility(i);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [duv, java.lang.Object] */
    public static duv u(elv elvVar) {
        ?? r0 = ((dvj) elvVar.d.c).c;
        if (r0 == 0) {
            return null;
        }
        return r0;
    }

    public static elv v(View view) {
        if (!(view instanceof ComponentHost)) {
            return null;
        }
        ComponentHost componentHost = (ComponentHost) view;
        for (int i = 0; i < componentHost.getMountItemCount(); i++) {
            elv elvVarA = componentHost.a(i);
            if (elvVarA != null && ((dvu) elvVarA.d.b).b.a()) {
                return elvVarA;
            }
        }
        return null;
    }

    @Override // defpackage.alk, defpackage.afn
    public final aju a(View view) {
        elv elvVarV = v(this.i);
        if (elvVarV == null || !((dvu) elvVarV.d.b).b.c.W()) {
            return null;
        }
        return super.a(view);
    }

    @Override // defpackage.afn
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        this.d.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // defpackage.afn
    public final void c(View view, ajr ajrVar) {
        CharSequence charSequence;
        int i;
        String str;
        dtu dtuVar;
        elv elvVarV = v(this.i);
        dww dwwVar = this.j;
        if (dwwVar != null && (dtuVar = dwwVar.z) != null) {
            afn afnVar = this.l;
            dyd.a();
            if (dtt.h == null) {
                dtt.h = new dwy();
            }
            dwy dwyVar = dtt.h;
            dwyVar.a = view;
            dwyVar.b = ajrVar;
            dwyVar.c = afnVar;
            dtuVar.b.n().x(dtuVar, dtt.h);
            dwy dwyVar2 = dtt.h;
            dwyVar2.a = null;
            dwyVar2.b = null;
            dwyVar2.c = null;
        } else if (elvVarV != null) {
            super.c(view, ajrVar);
            dvu dvuVar = (dvu) elvVarV.d.b;
            duz duzVar = dvuVar.b;
            dru druVar = dvuVar.c;
            try {
                duzVar.c.ap(view, ajrVar);
            } catch (Exception e) {
                dsq.d(druVar, e);
            }
        } else {
            super.c(view, ajrVar);
        }
        dww dwwVar2 = this.j;
        if (dwwVar2 != null && (str = dwwVar2.y) != null) {
            ajrVar.a.setClassName(str);
        }
        dww dwwVar3 = this.j;
        if (dwwVar3 != null && (i = dwwVar3.G) != 0) {
            ajrVar.a.setHeading(i == 1);
        }
        dww dwwVar4 = this.j;
        if (dwwVar4 == null || (charSequence = dwwVar4.b) == null) {
            return;
        }
        ajrVar.a.setTooltipText(charSequence);
    }

    @Override // defpackage.afn
    public final void d(View view, AccessibilityEvent accessibilityEvent) {
        this.d.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // defpackage.afn
    public final void e(View view, int i) {
        this.d.sendAccessibilityEvent(view, i);
    }

    @Override // defpackage.afn
    public final void f(View view, AccessibilityEvent accessibilityEvent) {
        this.d.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    @Override // defpackage.afn
    public final boolean g(View view, AccessibilityEvent accessibilityEvent) {
        return this.d.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // defpackage.afn
    public final boolean h(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.d.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.afn
    public final boolean i(View view, int i, Bundle bundle) {
        dtu dtuVar;
        dww dwwVar = this.j;
        if (dwwVar == null || (dtuVar = dwwVar.A) == null) {
            return super.i(view, i, bundle);
        }
        afn afnVar = this.l;
        dyd.a();
        if (dtt.i == null) {
            dtt.i = new dxd();
        }
        dxd dxdVar = dtt.i;
        dxdVar.a = view;
        dxdVar.b = i;
        dxdVar.c = bundle;
        dxdVar.d = afnVar;
        Object objX = dtuVar.b.n().x(dtuVar, dtt.i);
        dxd dxdVar2 = dtt.i;
        dxdVar2.a = null;
        dxdVar2.b = 0;
        dxdVar2.c = null;
        dxdVar2.d = null;
        return objX != null && ((Boolean) objX).booleanValue();
    }

    @Override // defpackage.alk
    protected final void m(List list) {
        elv elvVarV = v(this.i);
        if (elvVarV == null) {
            return;
        }
        duz duzVar = ((dvu) elvVarV.d.b).b;
        dru druVarA = dvu.a(elvVarV);
        try {
            int iAl = duzVar.c.al(u(elvVarV));
            for (int i = 0; i < iAl; i++) {
                list.add(Integer.valueOf(i));
            }
        } catch (Exception e) {
            dsq.d(druVarA, e);
        }
    }

    @Override // defpackage.alk
    protected final void n(int i, AccessibilityEvent accessibilityEvent) {
        accessibilityEvent.setContentDescription("");
    }

    @Override // defpackage.alk
    protected final void o(int i, ajr ajrVar) {
        View view = this.i;
        elv elvVarV = v(view);
        if (elvVarV == null) {
            Log.e("ComponentAccessibility", "No accessible mount item found for view: ".concat(String.valueOf(String.valueOf(view))));
            AccessibilityNodeInfo accessibilityNodeInfo = ajrVar.a;
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(k);
            return;
        }
        Rect bounds = ((Drawable) elvVarV.a).getBounds();
        duz duzVar = ((dvu) elvVarV.d.b).b;
        dru druVarA = dvu.a(elvVarV);
        drq drqVar = duzVar.c;
        String name = drqVar.getClass().getName();
        AccessibilityNodeInfo accessibilityNodeInfo2 = ajrVar.a;
        accessibilityNodeInfo2.setClassName(name);
        try {
            if (i < drqVar.al(u(elvVarV))) {
                drqVar.aq(ajrVar, i, bounds.left, bounds.top, u(elvVarV));
                return;
            }
            Log.e("ComponentAccessibility", a.b(i, "Received unrecognized virtual view id: "));
            accessibilityNodeInfo2.setContentDescription("");
            accessibilityNodeInfo2.setBoundsInParent(k);
        } catch (Exception e) {
            dsq.d(druVarA, e);
        }
    }

    @Override // defpackage.alk
    protected final boolean s(int i, int i2) {
        return false;
    }
}
