package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewDebug;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fd extends hp {

    @ViewDebug.ExportedProperty
    public boolean a;

    @ViewDebug.ExportedProperty
    public int b;

    @ViewDebug.ExportedProperty
    public int c;

    @ViewDebug.ExportedProperty
    public boolean d;

    @ViewDebug.ExportedProperty
    public boolean e;
    public boolean f;

    public fd() {
        super(-2);
        this.a = false;
    }

    public fd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public fd(fd fdVar) {
        super((ViewGroup.LayoutParams) fdVar);
        this.a = fdVar.a;
    }

    public fd(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }
}
