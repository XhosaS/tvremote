package defpackage;

import android.content.Context;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kje extends AppCompatEditText {
    public kjf a;

    public kje(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.support.v7.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public final /* bridge */ /* synthetic */ InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        editorInfo.getClass();
        kjf kjfVar = this.a;
        if (kjfVar == null) {
            kjfVar = new kjf();
        }
        kjfVar.setTarget(super.onCreateInputConnection(editorInfo));
        this.a = kjfVar;
        return kjfVar;
    }
}
