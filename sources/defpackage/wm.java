package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.tv.remote.service.R;
import java.util.Random;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public class wm extends EditText {
    int b;

    static {
        Pattern.compile("\\S+");
        new wl(Integer.class);
    }

    public wm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Random();
    }

    private final void a(int i) {
        Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getResources(), i), (int) (r4.getWidth() * 1.3f), (int) (r4.getHeight() * 1.3f), false);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        a(R.drawable.lb_text_dot_one);
        a(R.drawable.lb_text_dot_two);
        this.b = -1;
        setText("");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.leanback.widget.StreamingTextView");
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(se.c(this, callback));
    }

    public wm(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new Random();
    }
}
