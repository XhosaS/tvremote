package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aip {
    public final View a;
    private InputMethodManager b;

    public aip(View view) {
        this.a = view;
    }

    public final InputMethodManager a() {
        InputMethodManager inputMethodManager = this.b;
        if (inputMethodManager != null) {
            return inputMethodManager;
        }
        Object systemService = this.a.getContext().getSystemService("input_method");
        systemService.getClass();
        InputMethodManager inputMethodManager2 = (InputMethodManager) systemService;
        this.b = inputMethodManager2;
        return inputMethodManager2;
    }

    public final void c(CursorAnchorInfo cursorAnchorInfo) {
        a().updateCursorAnchorInfo(this.a, cursorAnchorInfo);
    }

    public void d(KeyEvent keyEvent) {
        throw null;
    }

    public void b() {
    }
}
