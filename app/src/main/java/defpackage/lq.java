package defpackage;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lq {
    public final asj a;
    private final TextView b;

    public lq(TextView textView) {
        this.b = textView;
        this.a = new asj(textView);
    }

    public final void a(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.b.getContext().obtainStyledAttributes(attributeSet, hs.i, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            asj asjVar = this.a;
            arx arxVar = arx.b;
            ((asi) asjVar.a).a.a = z;
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
