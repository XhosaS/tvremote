package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ajc {
    public static final ajc a;
    public final aiy b;

    static {
        if (Build.VERSION.SDK_INT >= 34) {
            a = aix.e;
        } else if (Build.VERSION.SDK_INT >= 30) {
            a = aiv.d;
        } else {
            a = aiy.f;
        }
    }

    private ajc(WindowInsets windowInsets) {
        if (Build.VERSION.SDK_INT >= 34) {
            this.b = new aix(this, windowInsets);
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            this.b = new aiw(this, windowInsets);
            return;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            this.b = new aiv(this, windowInsets);
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.b = new aiu(this, windowInsets);
        } else {
            this.b = new ait(this, windowInsets);
        }
    }

    static acs f(acs acsVar, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, acsVar.b - i);
        int iMax2 = Math.max(0, acsVar.c - i2);
        int iMax3 = Math.max(0, acsVar.d - i3);
        int iMax4 = Math.max(0, acsVar.e - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? acsVar : acs.d(iMax, iMax2, iMax3, iMax4);
    }

    public static ajc g(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        ajc ajcVar = new ajc(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            int[] iArr = ahj.a;
            ajc ajcVarA = ahd.a(view);
            aiy aiyVar = ajcVar.b;
            aiyVar.i(ajcVarA);
            aiyVar.f(view.getRootView());
            aiyVar.j(view.getWindowSystemUiVisibility());
        }
        return ajcVar;
    }

    @Deprecated
    public final int a() {
        return this.b.d().e;
    }

    @Deprecated
    public final int b() {
        return this.b.d().b;
    }

    @Deprecated
    public final int c() {
        return this.b.d().d;
    }

    @Deprecated
    public final int d() {
        return this.b.d().c;
    }

    public final WindowInsets e() {
        aiy aiyVar = this.b;
        if (aiyVar instanceof air) {
            return ((air) aiyVar).a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ajc) {
            return Objects.equals(this.b, ((ajc) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        aiy aiyVar = this.b;
        if (aiyVar == null) {
            return 0;
        }
        return aiyVar.hashCode();
    }

    public ajc() {
        this.b = new aiy(this);
    }
}
