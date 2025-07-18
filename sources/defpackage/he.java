package defpackage;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* compiled from: PG */
/* loaded from: classes.dex */
final class he {
    public static final Field a;

    static {
        NoSuchFieldException e;
        Field declaredField;
        try {
            declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
        } catch (NoSuchFieldException e2) {
            e = e2;
            declaredField = null;
        }
        try {
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e3) {
            e = e3;
            e.printStackTrace();
            a = declaredField;
        }
        a = declaredField;
    }
}
