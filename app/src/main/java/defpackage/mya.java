package defpackage;

import android.graphics.Rect;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mya extends alk {
    private final TextView i;

    public mya(TextView textView) {
        super(textView);
        this.i = textView;
    }

    private final ClickableSpan u(int i) {
        CharSequence text = this.i.getText();
        if (!(text instanceof Spanned)) {
            return null;
        }
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(i, i, ClickableSpan.class);
        if (clickableSpanArr.length == 1) {
            return clickableSpanArr[0];
        }
        return null;
    }

    private final CharSequence v(ClickableSpan clickableSpan) {
        CharSequence text = this.i.getText();
        if (!(text instanceof Spanned)) {
            return text;
        }
        Spanned spanned = (Spanned) text;
        return spanned.subSequence(spanned.getSpanStart(clickableSpan), spanned.getSpanEnd(clickableSpan));
    }

    @Override // defpackage.alk
    protected final void m(List list) {
        CharSequence text = this.i.getText();
        if (text instanceof Spanned) {
            Spanned spanned = (Spanned) text;
            for (ClickableSpan clickableSpan : (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class)) {
                list.add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
            }
        }
    }

    @Override // defpackage.alk
    protected final void n(int i, AccessibilityEvent accessibilityEvent) {
        ClickableSpan clickableSpanU = u(i);
        if (clickableSpanU != null) {
            accessibilityEvent.setContentDescription(v(clickableSpanU));
        } else {
            accessibilityEvent.setContentDescription(this.i.getText());
        }
    }

    @Override // defpackage.alk
    protected final void o(int i, ajr ajrVar) {
        Layout layout;
        ClickableSpan clickableSpanU = u(i);
        if (clickableSpanU == null) {
            ajrVar.a.setContentDescription(this.i.getText());
        } else if (clickableSpanU instanceof mxm) {
            CharSequence charSequenceV = ((mxm) clickableSpanU).a;
            if (charSequenceV == null) {
                charSequenceV = v(clickableSpanU);
            }
            ajrVar.a.setContentDescription(charSequenceV);
        } else {
            ajrVar.a.setContentDescription(v(clickableSpanU));
        }
        ajrVar.h();
        ajrVar.f();
        Rect rect = new Rect();
        TextView textView = this.i;
        CharSequence text = textView.getText();
        rect.setEmpty();
        if ((text instanceof Spanned) && clickableSpanU != null && (layout = textView.getLayout()) != null) {
            Spanned spanned = (Spanned) text;
            int spanStart = spanned.getSpanStart(clickableSpanU);
            int spanEnd = spanned.getSpanEnd(clickableSpanU);
            float primaryHorizontal = layout.getPrimaryHorizontal(spanStart);
            float primaryHorizontal2 = layout.getPrimaryHorizontal(spanEnd);
            int lineForOffset = layout.getLineForOffset(spanStart);
            int lineForOffset2 = layout.getLineForOffset(spanEnd);
            layout.getLineBounds(lineForOffset, rect);
            if (lineForOffset2 == lineForOffset) {
                rect.left = (int) Math.min(primaryHorizontal, primaryHorizontal2);
                rect.right = (int) Math.max(primaryHorizontal, primaryHorizontal2);
            } else {
                int i2 = (int) primaryHorizontal;
                if (layout.getParagraphDirection(lineForOffset) == -1) {
                    rect.right = i2;
                } else {
                    rect.left = i2;
                }
            }
            rect.offset(textView.getTotalPaddingLeft(), textView.getTotalPaddingTop());
        }
        if (rect.isEmpty()) {
            rect.set(0, 0, 1, 1);
        }
        int[] iArr = new int[2];
        textView.getLocationOnScreen(iArr);
        Rect rect2 = new Rect(rect.left + iArr[0], rect.top + iArr[1], rect.right + iArr[0], rect.bottom + iArr[1]);
        AccessibilityNodeInfo accessibilityNodeInfo = ajrVar.a;
        accessibilityNodeInfo.setBoundsInScreen(rect2);
        accessibilityNodeInfo.addAction(16);
    }

    @Override // defpackage.alk
    protected final boolean s(int i, int i2) {
        ClickableSpan clickableSpanU;
        if (i2 != 16 || (clickableSpanU = u(i)) == null) {
            return false;
        }
        clickableSpanU.onClick(this.i);
        return true;
    }
}
