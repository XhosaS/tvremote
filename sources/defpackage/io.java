package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public class io extends ViewGroup.MarginLayoutParams {
    public ja c;
    public final Rect d;
    public boolean e;
    boolean f;

    public io(int i, int i2) {
        super(i, i2);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }

    public final int a() {
        return this.c.a();
    }

    public final int b() {
        return this.c.b();
    }

    public final boolean c() {
        return this.c.v();
    }

    public final boolean d() {
        return this.c.s();
    }

    public io(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }

    public io(io ioVar) {
        super((ViewGroup.LayoutParams) ioVar);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }

    public io(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }

    public io(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }
}
