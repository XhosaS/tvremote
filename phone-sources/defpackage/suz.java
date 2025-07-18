package defpackage;

import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class suz {
    public static final Comparator a = new bxy(19);

    public static ActionMenuView a(Toolbar toolbar) {
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    public static ImageButton b(Toolbar toolbar) {
        Drawable navigationIcon = toolbar.getNavigationIcon();
        if (navigationIcon != null) {
            for (int i = 0; i < toolbar.getChildCount(); i++) {
                View childAt = toolbar.getChildAt(i);
                if (childAt instanceof ImageButton) {
                    ImageButton imageButton = (ImageButton) childAt;
                    if (imageButton.getDrawable() == navigationIcon) {
                        return imageButton;
                    }
                }
            }
        }
        return null;
    }

    public static List c(Toolbar toolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }
}
