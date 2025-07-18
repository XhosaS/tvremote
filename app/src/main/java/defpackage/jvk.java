package defpackage;

import com.google.android.flexbox.FlexboxLayoutManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jvk {
    public int a;
    public int b;
    public int c;
    public int d = 0;
    public boolean e;
    public boolean f;
    public boolean g;
    public final /* synthetic */ FlexboxLayoutManager h;

    public jvk(FlexboxLayoutManager flexboxLayoutManager) {
        this.h = flexboxLayoutManager;
    }

    public final void a() {
        FlexboxLayoutManager flexboxLayoutManager = this.h;
        this.c = (flexboxLayoutManager.q() || !flexboxLayoutManager.c) ? this.e ? flexboxLayoutManager.f.f() : flexboxLayoutManager.f.j() : this.e ? flexboxLayoutManager.f.f() : flexboxLayoutManager.H - flexboxLayoutManager.f.j();
    }

    public final void b() {
        this.a = -1;
        this.b = -1;
        this.c = Integer.MIN_VALUE;
        this.f = false;
        this.g = false;
        FlexboxLayoutManager flexboxLayoutManager = this.h;
        if (flexboxLayoutManager.q()) {
            if (flexboxLayoutManager.b == 0) {
                this.e = flexboxLayoutManager.a == 1;
                return;
            } else {
                this.e = false;
                return;
            }
        }
        if (flexboxLayoutManager.b == 0) {
            this.e = flexboxLayoutManager.a == 3;
        } else {
            this.e = false;
        }
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.a + ", mFlexLinePosition=" + this.b + ", mCoordinate=" + this.c + ", mPerpendicularCoordinate=" + this.d + ", mLayoutFromEnd=" + this.e + ", mValid=" + this.f + ", mAssignedFromSavedState=" + this.g + "}";
    }
}
