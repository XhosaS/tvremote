package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewDebug;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kz extends ol {

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

    public kz() {
        super(-2);
        this.a = false;
    }

    public kz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public kz(kz kzVar) {
        super((ViewGroup.LayoutParams) kzVar);
        this.a = kzVar.a;
    }

    public kz(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }
}
