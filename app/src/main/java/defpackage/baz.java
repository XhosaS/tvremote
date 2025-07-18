package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.AttributeSet;
import android.util.Property;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.katniss.R;
import java.util.Random;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public class baz extends EditText {
    public static final Pattern b = Pattern.compile("\\S+");
    public static final Property c = new bax(Integer.class);
    final Random d;
    Bitmap e;
    Bitmap f;
    public int g;
    public ObjectAnimator h;

    public baz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new Random();
    }

    private final Bitmap b(int i) {
        return Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(), i), (int) (r4.getWidth() * 1.3f), (int) (r4.getHeight() * 1.3f), false);
    }

    public final void a() {
        ObjectAnimator objectAnimator = this.h;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.e = b(R.drawable.lb_text_dot_one);
        this.f = b(R.drawable.lb_text_dot_two);
        this.g = -1;
        a();
        setText("");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.leanback.widget.StreamingTextView");
    }

    public baz(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new Random();
    }
}
