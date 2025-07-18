package defpackage;

import android.content.Context;
import android.text.method.KeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* compiled from: PG */
/* loaded from: classes.dex */
class ekv extends eku {
    private arp g;
    private boolean h;

    public ekv(Context context) {
        super(context);
    }

    final arp b() {
        if (this.g == null) {
            this.g = new arp(this);
        }
        return this.g;
    }

    final void c() {
        if (this.h) {
            return;
        }
        b();
        this.h = true;
        setKeyListener(super.getKeyListener());
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        return this.h ? b().b(inputConnectionOnCreateInputConnection, editorInfo) : inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView
    public final void setKeyListener(KeyListener keyListener) {
        if (this.h && keyListener != null) {
            keyListener = b().a(keyListener);
        }
        super.setKeyListener(keyListener);
    }
}
